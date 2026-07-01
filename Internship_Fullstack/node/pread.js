let fs = require('fs/promises');
let path = require('path');

fs.readFile(path.join(__dirname,"write.txt"))
.then((data)=>{
    console.log(data.toString());
    
})
.catch((err)=>{
    console.log(err);
    
})