

function arrayRotation(nums, pos) {
    pos =pos % nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, pos - 1);
    reverse(nums, pos, nums.length - 1);
    return nums;
}

function reverse(nums, start, end) { 
    while (start < end) {
        let temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let rotatedArray = arrayRotation(arr, 2);
console.log(rotatedArray);


