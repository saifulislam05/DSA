const plusOne = (nums) => {
  for (let i = nums.length - 1; i >= 0; i--) {
    if (nums[i] < 9) {
      nums[i] = nums[i] + 1;
      return nums;
      }
      nums[i] = 0;
    }
    nums.unshift(1);
    return nums;
};

const nums = [9, 9, 9];

console.log(plusOne(nums));
