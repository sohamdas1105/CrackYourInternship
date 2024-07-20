class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty())
        return 0;

        int hlength= haystack.length();
        int nlength = needle.length();

        for(int i=0;i<=hlength-nlength;i++){
            if(haystack.substring(i,nlength +i).equals(needle)){
                return i;
            }
        
        }

        return -1;

    }
}
