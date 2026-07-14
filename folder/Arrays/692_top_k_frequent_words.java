class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> res=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<String> unistr=new ArrayList<>(map.keySet());
        unistr.sort((a,b)->{
            int fa=map.get(a);
            int fb=map.get(b);
            if(fa==fb){
                return a.compareTo(b);
            }
            
            return fb-fa;
            
        });
        for(int i=0;i<k;i++){
            res.add(unistr.get(i));
        }
        return res;
    }
}
