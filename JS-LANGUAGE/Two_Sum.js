function two_sum(nums, target) {
    let numMap = {};
    for (let i = 0; i < nums.length; i++) {
        const rem = target - nums[i];
        if (numMap[rem] !== undefined) {
            return [i, numMap[rem]];
        }
        numMap[nums[i]] = i;
    }
    return []
}

let result = two_sum([3, 2, 4], 6);
for (let ele in result) {
    console.log(ele+" ");
}