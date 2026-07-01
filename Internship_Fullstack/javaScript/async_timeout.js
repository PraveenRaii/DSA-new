setTimeout(() => {
    console.log("execute after 2 sec");
    
}, 2000);

console.log("hello");

let a= true;
setTimeout(() => {
    let count=1;
    while(a){
        console.log(count);
        count++;
        
    }
}, 0);

a=!a;//toggle

//no output
