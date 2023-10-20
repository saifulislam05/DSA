function string_Compression(s) {
    if (s === '') return '';
    let prevChar = s[0];
    let frequency = 1;
    let compressedString = "";
    for (let i = 1; i < s.length; i++) {
        if (prevChar === s[i]) frequency += 1;
        else {
            compressedString += prevChar + frequency;
            prevChar = s[i];
            frequency = 1;
        }
    }
    // Compress the last characters of the string
    compressedString += prevChar + frequency;
    return compressedString;
}

console.log(string_Compression("aaaabbccddeffggghhhhhh"));
console.log(string_Compression(""));