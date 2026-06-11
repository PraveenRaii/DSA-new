//Natural num sum
function Naturalnum(num){
    return num*(num+1)/2;
}
console.log(Naturalnum(5));
//factorial 
function factorial(num){
    let fact=1;
    for(let i=1; i<=num; i++){
        fact = fact*i
    }
    return fact;
}

console.log(factorial(8));

//ncr
function nCr(n, r) {
    return factorial(n) / (factorial(r) * factorial(n - r));
}

console.log(nCr(5, 2));

 

