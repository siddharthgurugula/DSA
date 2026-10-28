class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int n=s.length();
        String rev="";

        for(int i=n-1;i>=0;i--) {
            rev=rev+s.charAt(i);    
        }

        if(s.equalsIgnoreCase(rev)) {
            return true;
        } else {
            return false;
        }   
    }
}