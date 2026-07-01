let str = "My name is Praveen";
let vowels = str.match(/[aeiou]/gi);

console.log(vowels);
console.log("Count =", vowels.length);

let str1 = "web development";

let words = str1.split(" ");
console.log(words[words.length - 1]);



let str2 = "my name is Pravven";

let result = str2
  .split(" ")
  .map(word => word.charAt(0).toUpperCase() + word.slice(1))
  .join(" ");

console.log(result);