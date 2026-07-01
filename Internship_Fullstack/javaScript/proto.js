let a = 10;
console.log(a);

console.log(typeof(a));
 

 console.log(a.__proto__==Number.prototype);

 let str = "Praveen";
 console.log(str);
 
console.log(typeof(str));

console.log(str.__proto__===String.prototype);


let israinny = true;
console.log(israinny);


console.log(typeof(israinny));
console.log(israinny.__proto__===Boolean.prototype);

//exceptitanol case

let arr = [1,2, "Abhi", 5];
console.log(arr);

console.log(typeof(arr));
console.log(arr.__proto__ ===Object.prototype);
console.log(arr.__proto__ ===Array.prototype);
console.log(Array.prototype.__proto__===Object.prototype);
console.log(Boolean.prototype.__proto__==Boolean.prototype);






