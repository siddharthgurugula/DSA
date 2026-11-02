class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        String vowels="aeiouAEIOU";
        char arr[] = s.toCharArray();

        while(i<j) {
            if(vowels.indexOf(s.charAt(i))!=-1 && vowels.indexOf(s.charAt(j))!=-1) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                i++;
                j--;
            } else if(vowels.indexOf(s.charAt(i))==-1) {
                i++;
            } else {
                j--;
            }
        }
        return new String(arr);   
    }
}