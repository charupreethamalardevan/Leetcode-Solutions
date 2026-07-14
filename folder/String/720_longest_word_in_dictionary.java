class Solution {
    public String longestWord(String[] words) {
        Set<String> set=new HashSet<>(Arrays.asList(words));
        List<String> list=new ArrayList<>(Arrays.asList(words));
        list.sort((a,b)->{
            int la=a.length();
            int lb=b.length();
            if(la!=lb){
                return lb-la;
            }
            return a.compareTo(b);
        });
        for(String word:list){
            boolean res=true;
            for(int i=1;i<word.length();i++){
                if(!set.contains(word.substring(0,i))){
                    res=false;
                }

            }
            if(res){
                return word;
            }
        }

        return "";
        
    }
}
