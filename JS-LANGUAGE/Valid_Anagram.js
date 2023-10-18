function validAnagram(s, t) {
  if (s.length != t.length) {
    return false;
  }
  let sObj = {};
  let tObj = {};

  for (let i = 0; i < s.length; i++) {
    // for s object
    if (sObj[s[i]] == undefined) sObj[s[i]] = 1;
    else {
      sObj[s[i]] = sObj[s[i]] += 1;
    }
    // for t object
    if (tObj[t[i]] == undefined) tObj[t[i]] = 1;
    else {
      tObj[t[i]] = tObj[t[i]] += 1;
    }
  }
  for (elem in sObj) {
    if (sObj[elem] !== tObj[elem]) {
      return false;
    }
  }
  return true;
};

console.log(validAnagram("anagram", "nagaram"));
console.log(validAnagram("rat", "car"));