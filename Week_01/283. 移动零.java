class Solution {
    public void moveZeroes(int[] nums) {

        // 查找第一个为0的位置
        int startIndex=0;
        for(startIndex=0; startIndex<nums.length && nums[startIndex] != 0; startIndex++);

        // 开始查找非零进行替换
        for(int tmpIndex=startIndex+1; tmpIndex<nums.length; tmpIndex++){

            if(nums[tmpIndex] != 0){
                nums[startIndex++] = nums[tmpIndex];
                nums[tmpIndex] = 0;
            }

        }

    }
}