let str = "The sky is blue";

let result = str
  .split(" ")
  .map(word => word.split("").reverse().join(""))
  .join(" ");

console.log(result);