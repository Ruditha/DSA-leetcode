class Solution {
    public char kthCharacter(int k) {
        String word="a";
        while(word.length()<k){
            String r="";
            for(int i=0;i<word.length();i++){
                r+=(word.charAt(i)=='z')?'a':(char)(word.charAt(i)+1);
            }
            word+=r;
        }
        return word.charAt(k-1);
    }
}