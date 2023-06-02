/*Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
ans[i] is the number of 1's in the binary representation of i.*/

public class CountingBits {
    public int[] countBits(int n){
        int [] ans = new int [n + 1];

        for(int i = 0; i <= n; i++){
            ans[i] = countOnes(i);
        }

        return ans;
    }

    private int countOnes(int num){
        int count = 0;
        String binary = Integer.toBinaryString(num);

        for (int i = 0; i < binary.length(); i ++){
            if (binary.charAt(i) == '1'){
                count ++;
            }
        }

        return count;
    }
}
