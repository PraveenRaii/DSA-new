// console.log(this);

// function fun() {
//     console.log(this);
    
// }

// fun();


// let person ={
//     name : "Praveen",
//     gender:"M",
//     details(){
//         return`Name: ${this.name} gender: ${this.gender}`
//     }
// }

// let p=person.details();
//  console.log(p);



function person(name,age){
    this.name=name,
    this.age = age,
    this.info=function(){
        console.log(`name:${this.name} age: ${this.age}`);
        
    }

    
}

let p1 = new person("PraveenR",21);
let p2 =  new person("Abhisek",22);
console.log(p1.name);
console.log(p1.age);
console.log(p1.info());

console.log(p2.name);
console.log(p2.age);
console.log(p2.info());


 
