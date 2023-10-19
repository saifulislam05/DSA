function string_Palindrome(s) {
    let start = 0; 
    let end = s.length - 1;
    while (start < end) { 
        if (s[start] !== s[end]) return false;
        start++;
        end--;
    }
    return true;
}

console.log(string_Palindrome("abba"));
console.log(string_Palindrome("hello"));