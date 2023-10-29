let maxSubArray =  (nums)=> {
  let max = Number.MIN_SAFE_INTEGER;
  let sum = 0;
  for (let num of nums) {
    sum += num;
    max = Math.max(sum, max);
    if (sum < 0) sum = 0;
  }
  return max;
};

let arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4];
console.log(maxSubArray(arr));