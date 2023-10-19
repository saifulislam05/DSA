function decodeString(s) {
    let stack = [];
    for (let i = 0; i < s.length; i++) {
        let ch = s[i];
        if (ch === "]") {
            // for getting string to decode
            let str = "";
            while (stack[stack.length - 1] !== "[") str = stack.pop() + str;
            // remove '[' from stack
            stack.pop();
            // for getting number
            let num = "";
            while (!isNaN(parseInt(stack[stack.length - 1])))
                num = stack.pop() + num;
            parseInt(num);
            // Repeating string as per number
            let repeatingString = "";
            while (num--) repeatingString += str;
            // Pushing repeated String to the stack
            stack.push(repeatingString);
        } else {
            stack.push(ch);
        }
    }
    return stack.join("");
}
console.log(decodeString("3[a2[c]]"));
console.log(decodeString("2[abc]3[cd]ef"));