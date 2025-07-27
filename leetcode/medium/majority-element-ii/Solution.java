class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0, ele1=0, ele2= 0;
        for(int i = 0; i<nums.length; i++){

            if(c1==0 && ele2!=nums[i]){
                c1=1;
                ele1=nums[i];
            }
            else if(c2==0 && ele1!=nums[i]){
                c2=1;
                ele2= nums[i];
            }
            else if(ele1==nums[i]){
                c1++;
            }
            else if(ele2 == nums[i]){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }

        c1=0;c2=0;
        for(int i = 0; i<nums.length;i++){
            if(ele1== nums[i]){
                c1++;
            }
            if(ele2== nums[i]){
                c2++;
            }
        }
        int min = (nums.length/3);
        List<Integer> list = new ArrayList<>();
        if(c1> min)
            list.add(ele1);
        if(c2> min && ele1!=ele2){
            list.add(ele2);
        }

        return list;

    }
}
