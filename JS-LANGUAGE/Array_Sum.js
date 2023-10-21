function findPairs(arr,target) {
    let pairs = [];
    let freq = {};
    for (let value of arr) {
      freq[value] = freq[value]? freq[value] + 1 : 1;
    }
    for (let value of arr) {
      if (freq[target - value] !== undefined) {
        for (let i = 1; i <= Math.min(freq[value], freq[target - value]); i++) {
          pairs.push([value, target - value]);
        }
      }
      freq[value] = 0;
      freq[target - value] = 0;
    }
    return pairs;
}

let arr = [1, 1, 3, 3, 5, 2, 2, 5, 7, 4, 0, 1, 6];
console.log(findPairs(arr, 7));