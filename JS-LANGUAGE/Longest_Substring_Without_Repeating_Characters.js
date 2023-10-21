function longest_Substring(s) {
    let hs = [];
    let ans = 0;
    let i = 0;
    let j = 0;
    while (i < s.length) {
      let ch = s[i];
      let chIndex = hs.indexOf(ch);
      if (chIndex !== -1) {
        hs.shift();
        j++;
      } else {
        hs.push(ch);
        ans = Math.max(ans, hs.length);
        i++;
      }
    }
    return ans;
}
console.log(longest_Substring("abcabcbb"));
console.log(longest_Substring("bbbbb"));
console.log(longest_Substring("pwwkew"));