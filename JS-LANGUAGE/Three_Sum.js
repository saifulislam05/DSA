let threeSum = (nums)=> {
    let target=0;
    let ansArr=[];
    nums.sort((a,b)=>a-b);
    for (let i = 0; i < nums.length; i++){
        if (i != 0 && nums[i] == nums[i - 1]) {
            continue;
        }
        let left = i + 1;
        let right = nums.length - 1;
        let newTarget = target - nums[i];
        while (left < right) {
            let sum = nums[left] + nums[right];
            if (sum < newTarget) {
                left++;
            }
            else if (sum > newTarget) {
                right--;
            }
            else {
                ansArr.push([nums[i], nums[left], nums[right]])
                left++;
                right--;

                while (left < right && nums[left]==nums[left-1]) {
                    left++;
                }
                while (left < right && nums[right]==nums[right+1]) {
                    right--;
                }
            }
        }
    }
    return ansArr;
};

// let arr = [-1, 0, 1, 2, -1, -4];
// let arr = [0,1,1];
let arr = [0,0,0];
console.log(threeSum(arr));