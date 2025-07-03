class Solution {
    public char kthCharacter(int k) {
        StringBuilder word=new StringBuilder("a");
        while(word.length()<k){
            int len=word.length();
            for(int i=0;i<len;i++){
                word.append(word.charAt(i)=='z'?'a':(char)(word.charAt(i)+1));
            }
        }
        return word.charAt(k-1);
    }
}