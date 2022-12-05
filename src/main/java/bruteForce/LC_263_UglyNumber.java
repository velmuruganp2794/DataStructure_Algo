package bruteForce;

import org.junit.Test;

public class LC_263_UglyNumber {

    @Test
    public void testdata1(){
        int n=9;
        boolean output = isUgly(9);
        System.out.println(output);
    }

    public boolean isUgly(int n) {
        if(n<0) return false;
        if(n==0) return false;
        for(int i=2;i<=n;i++){  //14
            if(n%i==0) {
                System.out.println("Factor is "+i);
                if(isPrime(i) && !(i==2 || i==3 || i==5)) return false;
            }
        }

        return true;
    }

    public boolean isPrime(int n){

        for(int j=2;j<=n/2;j++){
            if(n%j==0) return false;
        }
        return true;

    }
}
