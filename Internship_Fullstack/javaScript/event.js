let btn = document.querySelector('button');
let inp = document.querySelector('input');
console.log(inp);

console.log(btn);

btn.addEventListener('click',(e)=>{
    console.log(e.type, e.target);
    console.log("clicked");
    
    
})

inp.addEventListener('keydown',(e)=>{
    console.log(e.type, e.key);
    
})

inp.addEventListener('keyup',(e)=>{
    console.log(e.type, e.key);
    
})