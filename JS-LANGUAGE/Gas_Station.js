let canCompleteCircuit = function (gas, cost) {
  let totalDiff = 0;
  let fuel = 0;
  let index = 0;
  for (let i = 0; i < gas.length; i++) {
    let diff = gas[i] - cost[i];
    totalDiff += diff;
    fuel += diff;
    if (fuel < 0) {
      index = i + 1;
      diff = 0;
      fuel = 0;
    }
  }
  return totalDiff < 0 ? -1 : index;
};

let gas = [1, 2, 3, 4, 5];
let cost = [3, 4, 5, 1, 2];
let ans = canCompleteCircuit(gas, cost);
console.log(ans);
