class Solution {
    public int maxVowels(String s, int k) {
    int n=s.length();
    int maxvow=0,currentvow=0;
    for(int i=0;i<k;i++){
        if(isvowel(s.charAt(i)))
        currentvow++;
    }
    maxvow=currentvow;
    for(int i=k;i<n;i++){
        if(isvowel(s.charAt(i))){
            currentvow++;
        }
        if(isvowel(s.charAt(i-k)))
        currentvow--;
        maxvow=Math.max(maxvow,currentvow);
    }
   
    return maxvow;
    }
    public boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
