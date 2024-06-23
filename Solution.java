import java.math.BigInteger;

class Solution {
    public int mySqrt(int x) {
        long start = 1;
        long end = x;
        int out = 0;
        if(x==1) return 1;

        while(start <= end){
            long mid = (start+end)/2;
            BigInteger square = new BigInteger(String.valueOf(mid));
            square = square.multiply(square);
            BigInteger inp = new BigInteger(String.valueOf(x));
            if(square.equals(inp)){
                return (int) mid;
            }else if(square.compareTo(inp) > 0){
                end = mid-1;
            }else{
                start = mid+1;
                out = (int) mid;
            }
        }
        return out;
    }
}
