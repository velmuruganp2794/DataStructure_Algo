package Queue_problems;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class LC_1700_NumberOfStudentsUnabletoEat {

    /*Pseudo-code
    1. Traverse students array and put it in the queue
    2. declare index as 0 for sandwiches, notableeat count =0;
    3. loop till notabletoEat count not equal to queue size
    4. if queue peek matches, sandwiches in the index, remove student from queue and increase index, reassign notabletoEat
    5. else increment notableEat count and remove fist student and add it to end of the queue
    6. if queue is empty return as zero
    7. outside the loop return notableEat count
     */

    /* Time Complexity = O(N), Space Complexity = O(N) */
    @Test
    public void testdata1(){
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};
        int output = countStudents(students,sandwiches);
        //output = 0
        System.out.println(output);
    }

    @Test
    public void testdata2(){
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        //output = 3
        int output = countStudents(students,sandwiches);
        System.out.println(output);
    }

    public int countStudents(int[] students, int[] sandwiches) {
        int index=0;
        int noteatStudent=0;
        Queue<Integer> student = new ArrayDeque<>();




        for(int eachStudent:students){
            student.add(eachStudent);
        }


        while(noteatStudent!=student.size()){

                if(student.peek()==sandwiches[index]){
                    student.poll();
                    index++;
                    noteatStudent = 0;
                } else {
                    student.add(student.poll());
                    noteatStudent++;

                }
                if(student.isEmpty()) return 0;

        }

        return student.size();

    }
}
