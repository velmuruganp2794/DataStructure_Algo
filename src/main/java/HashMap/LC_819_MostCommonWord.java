package HashMap;

import java.util.*;


import org.junit.Test;

public class LC_819_MostCommonWord {

	@Test
	public void learning(){

		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		String output = mostCommonWord(paragraph,banned);
		System.out.println(output);

	}
	 /*
    Pseudo code:
    1. Remove other than letters from paragraph and toLowerCase/convert it to string[] of words using split
    2. add the String[] words to map as key and default value as 1. if the key already present, increment the value.
    3. sort the map in descending order based on values. Clear the map and store the ordered values.
    4. convert banned[] into set;
    5. loop over the map elements return the key which is not present in the banned hashset

    */

	public String mostCommonWord(String paragraph, String[] banned) {
		// String[] words = paragraph.replaceAll("[^a-zA-Z ,]","").toLowerCase().split("[\\s,]+");
		String[] words = paragraph.toLowerCase().split("\\W+");
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		HashSet<String> set = new HashSet<String>();
		int max=0;
		String key = null;

		// HashSet for bannedWords
		for(String banword:banned){
			set.add(banword);
		}
		//HashMap for words in paragraph
		for(String word:words){
			if(!set.contains(word)) {
				map.put(word,map.getOrDefault(word,0)+1);
				if(max<map.get(word)){
					max = map.get(word);
					key = word;

				}
			}
		}

		// Sort map by values
		/*List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		entries.sort(Map.Entry.<String,Integer>comparingByValue().reversed());


		if(!map.isEmpty()) return entries.get(0).getKey();
		else return "";*/
		return key;




	}

}
