class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),res);
        return res;
    }
    public void backtrack(String s,int start,List<String> current,List<List<String>> res){
        if(start==s.length()){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int end=start+1;end<=s.length();end++){
            String substring=s.substring(start,end);
            if(isPalindrome(substring)){
                current.add(substring);
                backtrack(s,end,current,res);
                current.remove(current.size()-1);
            }
        }
    }
    public boolean isPalindrome(String sub){
        int left=0;
        int right=sub.length()-1;
        while(left<right){
            if(sub.charAt(left)!=sub.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
