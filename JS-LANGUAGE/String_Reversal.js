function string_Reversal(s) {
    let ansString = Array.from({ length: s.length });
    let left = 0;
    let right = s.length-1;
    while (left <= right) { 
        ansString[left] = s[right];
        ansString[right] = s[left];
        left++;
        right--;
    }
    return ansString.join("");
}

console.log(string_Reversal("hello"));