function removeDuplicates(s) {
         let stackArr=[];
    for(let i=0;i<s.length;i++){
        let ch=s[i];
        let top=stackArr[stackArr.length-1];
        if(ch==top){
            stackArr.pop();
        }else{
            stackArr.push(ch);
        }
    }
    return stackArr.join('');
}

console.log(removeDuplicates("abbacdccd"));
console.log(removeDuplicates("abaacdccd"));
   
    
