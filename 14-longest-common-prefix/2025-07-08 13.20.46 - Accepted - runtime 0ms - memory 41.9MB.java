class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String min=strs[0];
        for(int i=1;i<n;i++){
            if(strs[i].length()<min.length())
            min=strs[i];
        }
        while(!min.equals("")){
            int c=0;
            for(int i=0;i<n;i++){
                if(strs[i].startsWith(min))
                c++;
            }
            if(c==n)
            return min;

            min=min.substring(0,min.length()-1);
        }return min;
    }
}