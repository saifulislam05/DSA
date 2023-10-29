let search = function (nums, target) {
  let binarySearch = (nums, target, left, right) => {
    // if not found return -1
    if (left > right) return -1;

    let mid = Math.floor(left + (right - left) / 2);
    // if found return index
    if (target == nums[mid]) return mid;

    // if left half is sorted
    if (nums[mid] >= nums[left]) {
      // if target is in left half
      if (nums[left] <= target && target <= nums[mid]) {
        return binarySearch(nums, target, left, mid - 1);
      } else {
        // if target is in right half
        return binarySearch(nums, target, mid + 1, right);
      }
    } else {
      // if right half is sorted
      if (nums[mid] <= target && target <= nums[right]) {
        return binarySearch(nums, target, mid + 1, right);
      } else {
        // if target is in right half
        return binarySearch(nums, target, left, mid - 1);
      }
    }
  };
  return binarySearch(nums, target, 0, nums.length - 1);
};

console.log(search([4, 5, 6, 7, 0, 1, 2], 0));
console.log(search([4, 5, 6, 7, 0, 1, 2], 3));