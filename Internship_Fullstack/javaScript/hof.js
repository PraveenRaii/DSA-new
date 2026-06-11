function a(d){ // highest order of function
    console.log("inside a");
    d();//call back function
    
}

function b(){
    console.log("inside b");
    
}
a(b);

//hof: when we pass a function as an argument inside a function is known as highest order function.

//hof: when an outer function return a complete inner function is known as hof.