class Solution {
    public List<Integer> majorityElement(int[] nums) {
         int n=nums.length/3;
         List<Integer> ls=new ArrayList<>();
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:nums)
        {
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        for(int i:hs.keySet())
        {
            if(hs.get(i)>n)
            ls.add(i);
        }
        return ls;
        
        
    }
}