class Solution {
    public boolean isPalindrome(String s) {
        
        String o=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev=new StringBuffer(o).reverse().toString();
        
        return o.equals(rev);

    }
}