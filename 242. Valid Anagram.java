class Solution {
    static boolean compare(char s1[],char s2[]){
        boolean ans=false;
        if(s1.length!=s2.length){
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i=0;i<s1.length;i++){
            if(s1[i]==s2[i]){
                ans=true;
            }else{
                return false;
            }
        }
        return ans;
    }
    public boolean isAnagram(String s, String t) {
        char s1[]=s.toCharArray();
        char s2[]=t.toCharArray();
        return compare(s1,s2);
    }
}
