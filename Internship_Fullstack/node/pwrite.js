let fs = require('fs/promises');
let path = require('path');
let p = path.join(__dirname,"wp.txt")

fs.writeFile(p, "learning file system writefile using promises ")
.then(()=>{
    console.log("done successfully..");
    
})
.catch((err)=>{
    console.log(err);
    
})