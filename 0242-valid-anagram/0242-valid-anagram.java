class Solution {
    public boolean isAnagram(String s, String t) {
        // Map<Character,Integer>map1=new HashMap<>();
        // Map<Character,Integer>map2=new HashMap<>();
        // for(char ch:s.toCharArray()){
        //     map1.put(ch,map1.getOrDefault(ch,0)+1);
        // }
        // for(char ch:t.toCharArray()){
        //     map2.put(ch,map2.getOrDefault(ch,0)+1);
        // }
        // if(map1.equals(map2)){
        //     return true;
        // }
        // return false;

        if(s.length()!=t.length()){
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;

        }
        for(int c:count){
            if(c!=0)return false;
        }
        return true;
    }
}