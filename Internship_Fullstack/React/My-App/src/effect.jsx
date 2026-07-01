import { useEffect, useState } from "react";

function Effect(){
    let [count,setcount]  = useState(0);
    useEffect(()=>{
        console.log("inside useeffect hook");
        
    },[]);
    function update(){
        console.log("inside use state");
        
        setcount(count+1);
    }
    return(
        <>
        <h1>count:{count}</h1>
        <button type="submit" onClick={update}>Click Me</button>
        </>
    );
}
export default Effect;