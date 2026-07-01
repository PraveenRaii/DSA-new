let newgame = {
    titel :"cricket",
    players:11
}

let game = {
    fulldetal: function(greet){
        //  console.log(`${this.titel} and ${this.players}`);
        console.log(`${greet}  ${this.titel} and ${this.players}`);
    }
}
//game.fulldetal.call(newgame);
let r = game.fulldetal.bind(newgame, "hello");
r();
game.fulldetal.apply(newgame, ["Welcome"]);


// function details(){
//     console.log(`${this.titel} and ${this.players}`);
    
// }

// details();