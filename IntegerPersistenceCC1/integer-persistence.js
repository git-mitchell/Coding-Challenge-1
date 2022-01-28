function additivePersistence(n) {
    if (!Number.isInteger(n) || n < 0) {
        console.log("input must be a positive integer");
        return -1;
    }

    else {
        let m = n;
        let i = 0;
        while (m > 9) {
            let digits = m.toString().split('').map(t => parseInt(t));
            let sum = 0;
            for (let d in digits) {
                sum += d;
            }
            m = sum;
            i ++;
        }
        return i;
    }
}

function multiplicativePersistence(n) {
    if (!Number.isInteger(n) || n < 0) {
        console.log("input must be a positive integer");
        return -1;
    }

    else {
        let m = n;
        let i = 0;
        while (m > 9) {
            let digits = m.toString().split('').map(t => parseInt(t));
            let product = 0;
            for (let d in digits) {
                product *= d;
            }
            m = product;
            i ++;
        }
        return i;
    }
}

console.log(additivePersistence(1679583));
console.log(additivePersistence(123456));
console.log(additivePersistence(8));

console.log(multiplicativePersistence(77));
console.log(multiplicativePersistence(123456));
console.log(multiplicativePersistence(4));