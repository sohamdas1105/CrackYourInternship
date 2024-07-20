// we go through each element for example 1 ; when we see 4 we know that the length of the array atleast is 4, so we mark the element in index 4 which is 7 as visited by giving making it negative , and if when iterating through every element we have to mark the index again as visited that meeans it exists 2 times so we add it in the list

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list= new ArrayList<>();
        for(int i =0;i<nums.length;++i){
            int index= Math.abs(nums[i])-1;

            if(nums[index]<0){
                list.add(Math.abs(nums[i]));
              
            }
              nums[index] = -nums[index];
        }
        return list;
    }
}
