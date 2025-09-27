package twoPointers;

//link: https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] smallStrArr = s.toCharArray();
        char[] bigStrArr = t.toCharArray();
        if (smallStrArr.length > bigStrArr.length) {
            return false;
        } else {
            int checkPointIndex = -1;
            int sequenceFound =0;
            for (char c : smallStrArr) {
                for (int largeIndex = checkPointIndex+1; largeIndex < bigStrArr.length; largeIndex++) {
                    if (c == bigStrArr[largeIndex]) {
                        sequenceFound++;
                        checkPointIndex =  largeIndex;
                        break;
                    }
                }
            }
            return sequenceFound == smallStrArr.length;
        }
    }
    public static void main(String[] args) {

        System.out.println(new IsSubsequence().isSubsequence("aaaaaa", "bbaaaa"));
    }
}
