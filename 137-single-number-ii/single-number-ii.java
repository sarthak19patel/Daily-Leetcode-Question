class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> hs=new HashMap<>();
        for(int i:nums)
        {
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
       
        for (int num : hs.keySet()) {

                 if (hs.get(num) == 1) {
                     return num;
                 }
            }return -1;
        
    }
}