let inc = document.querySelector('#inc');
let decr = document.querySelector('#decr');
let span = document.querySelector('span');

let count =0;
span.innerText = count;

console.log(inc);
console.log(decr);
console.log(span);

inc.addEventListener('click', (e) =>{
        count++;
        span.innerText= count;
        console.log(count);
        
})

decr.addEventListener('click', (e) =>{
        count--;
        span.innerText= count;
        console.log(count);
        
})

