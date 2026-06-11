//js--> java script is a syncronous, single thread weakly typed scripting language.

let a =10;
let b = 10.23;
let c= 10.0001;
let d = 0.3345;
console.log(a);
console.log(typeof(a));
console.log(b);
console.log(typeof(b));
console.log(c);
console.log(typeof(c));
console.log(d);
console.log(typeof(d));

let str= 'aa';
console.log(str);
console.log(typeof(str));

let arr = [1, 2, true, 'a'];
console.log(arr);
console.log(typeof(arr));

let obj={
    name: "bcd",
    id: '001',
    key: 'hlo'

}
console.log(obj);
console.log(obj.name);

//scope of var -> block scope
let k;
console.log(k)
{
    let b = 20;
    console.log(b);
    
}
console.log(b);

//scope of var -> functional scope
function fun(){
    var a = true;
    console.log(a);
    
}
fun();
console.log(a);








