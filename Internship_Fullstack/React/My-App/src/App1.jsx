import React from 'react'
import { useRef } from 'react';

function App1()  {
    let inputRef = useRef(null)
    function upd(){
        inputRef.current.focus();
    }
  return (
    <>
    <br />
    <label htmlFor="">Focus input</label>
    <input type="text"  ref={inputRef} />
    <br />
    <label htmlFor="">Normal input</label>
    <input type="text" name="" id="" />
    <br />
    <button onClick={upd}>Focus the input</button>
    </>
  )
}

export default App1
