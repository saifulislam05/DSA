function reorganizeString(s) {
  let freqObj = {};
  for (let i = 0; i < s.length; i++) {
    if (freqObj[s[i]] == undefined) freqObj[s[i]] = 1;
    else {
      freqObj[s[i]] = freqObj[s[i]] + 1;
    }
  }
  let max = 0;
  let letter;
  for (char in freqObj) {
    if (freqObj[char] > max) {
      max = freqObj[char];
      letter = char;
    }
  }
  if (max > Math.floor((s.length + 1) / 2)) {
    return "";
  }
  let resArr = Array.from({ length: s.length });
  // fill the majority element first to the resArr
  let idx = 0;
  for (let i = 0; i < max; i++) {
    resArr[idx] = letter;
    idx += 2;
  }
  // fill the remainig character into resArr
  for (char in freqObj) {
    if (char != letter) {
      while (freqObj[char] > 0) {
        if (idx >= resArr.length) {
          idx = 1;
        }
        resArr[idx] = char;
        freqObj[char] = freqObj[char] - 1;
        idx += 2;
      }
    }
  }
  return resArr.join("");
};

console.log(reorganizeString("aab"));
console.log(reorganizeString("aaab"));