class Solution {
    public String frequencySort(String s) {
        StringBuilder res=new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> unilist=new ArrayList<>(map.keySet());
        unilist.sort((a,b)->map.get(b)-map.get(a));
        for(char ch:unilist){
            int c=map.get(ch);
            for(int i=0;i<c;i++){
                res.append(ch);
            }
        }
        return res.toString();
    }
}
