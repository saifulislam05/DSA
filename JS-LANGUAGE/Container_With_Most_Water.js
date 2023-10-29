let maxArea = function (height) {
  let left = 0;
  let right = height.length - 1;
  let maximumArea = 0;
  while (left < right) {
    let area = Math.min(height[left], height[right]) * (right - left);
    maximumArea = Math.max(maximumArea, area);
    if (height[left] < height[right]) {
      left++;
    } else {
      right--;
    }
  }
  return maximumArea;
};
let height = [1, 8, 6, 2, 5, 4, 8, 3, 7];
console.log(maxArea(height)); //49
console.log(maxArea([1,1])); //1
