let isPalindrome =  (x) => {
  let reversedNumber = 0;
  let originalNumber = x;
  while (x > 0) {
    let lastDigit = x % 10;
    reversedNumber = reversedNumber * 10 + lastDigit;
    x = Math.floor(x / 10);
  }
  return reversedNumber == originalNumber;
};

console.log(isPalindrome(121));// true
console.log(isPalindrome(-121));//false
