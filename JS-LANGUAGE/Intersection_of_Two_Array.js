function interSection(arr1, arr2) {
    let frequency = {};
    let ansArray = [];
    for (let value of arr1) {
        frequency[value] = true;
    }
    for (let value of arr2) { 
        if (frequency[value]) { 
            if (!ansArray.includes(value)) {
                ansArray.push(value);
            }
        }
    }
    return ansArray;
}

let arr1 = [1, 2, 3, 4, 5];
let arr2= [1, 2, 2, 2, 2]

console.log(interSection(arr1, arr2));