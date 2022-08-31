function newGame(){
   let name = document.getElementById("name").value; 
    if (name != ""){
       let url = "http://localhost:8080/zaidimas/game/new/"+name;   
       $.getJSON(url,function(data){
           let json = JSON.parse(JSON.stringify(data));
           document.getElementById("wins").innerHTML = "WINS: "+json.wins;
           document.getElementById("lose").innerHTML = "LOSE: "+json.loses;
           document.getElementById("draw").innerHTML = "DRAW: "+json.draw;
           document.getElementById("score").innerHTML = json.playerChoose+"  "+json.lastGame+"  "+json.computerChoose;
           document.getElementById("name").value = json.playerName; 
           console.log(json);  
       });
    }
}


function gameRock(){
    let name = document.getElementById("name").value; 
    if (name != ""){
       let url = "http://localhost:8080/zaidimas/game/"+name+"/ROCK";   
       $.getJSON(url,function(data){
           let json = JSON.parse(JSON.stringify(data));
           document.getElementById("wins").innerHTML = "WINS: "+json.wins;
           document.getElementById("lose").innerHTML = "LOSE: "+json.loses;
           document.getElementById("draw").innerHTML = "DRAW: "+json.draw;
           document.getElementById("score").innerHTML = json.playerChoose+" --- "+json.lastGame+" --- "+json.computerChoose;
           document.getElementById("name").value = json.playerName; 
           console.log(json);  
       });
    }  
}

function gamePapper(){
    let name = document.getElementById("name").value; 
    if (name != ""){
       let url = "http://localhost:8080/zaidimas/game/"+name+"/PAPPER";   
       $.getJSON(url,function(data){
           let json = JSON.parse(JSON.stringify(data));
           document.getElementById("wins").innerHTML = "WINS: "+json.wins;
           document.getElementById("lose").innerHTML = "LOSE: "+json.loses;
           document.getElementById("draw").innerHTML = "DRAW: "+json.draw;
           document.getElementById("score").innerHTML = json.playerChoose+" --- "+json.lastGame+" --- "+json.computerChoose;
           document.getElementById("name").value = json.playerName; 
           console.log(json);  
       });
    }  
}

function gameSissors(){
    let name = document.getElementById("name").value; 
    if (name != ""){
       let url = "http://localhost:8080/zaidimas/game/"+name+"/SISSORS";   
       $.getJSON(url,function(data){
           let json = JSON.parse(JSON.stringify(data));
           document.getElementById("wins").innerHTML = "WINS: "+json.wins;
           document.getElementById("lose").innerHTML = "LOSE: "+json.loses;
           document.getElementById("draw").innerHTML = "DRAW: "+json.draw;
           document.getElementById("score").innerHTML = json.playerChoose+" --- "+json.lastGame+" --- "+json.computerChoose;
           document.getElementById("name").value = json.playerName; 
           console.log(json);  
       });
    }  
}  