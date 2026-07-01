let http = require('http');
let sever = http.createServer((req, res)=>{
    res.write("hello form server");
    res.end();
})

sever.listen(3000,()=>{
    console.log("server is runnig port 3000");
    
})