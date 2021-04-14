/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=0;
        int h=n;
        while(l<=h){
            int m=l+(h-l)/2;
            int val=guess(m);
            if(val==0)
                return m;
            if(val==-1)
                h=m-1;
            if(val==1)
                l=m+1;
        }
        return 0;
    }
}