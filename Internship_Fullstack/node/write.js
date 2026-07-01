let fs = require('fs');
let path = require('path');
let p =path.join(__dirname, "write.txt");
fs.writeFile(p, "I am learning node Js fs module writefile",(err)=>{
    if(err){
        console.log(err);
        
    }else{
        console.log("done successfully...");
        
    }
})