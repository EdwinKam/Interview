var canvas = document.querySelector('canvas');
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

var c = canvas.getContext('2d');
c.fillStyle = 'rgba(255,0,0,0.7)';
c.fillRect(100,100,100,100);
c.fillStyle = 'rgba(255,230,0,0.7)';
c.fillRect(100,250,100,100);
c.fillStyle = 'rgba(255,0,120,0.7)';
c.fillRect(300,100,100,100);

console.log(canvas);

//line
c.beginPath();
c.moveTo(50,300); //start point
c.lineTo(300,100); //end point
c.lineTo(400,300);
c.strokeStyle = "#fb44a3";
c.stroke();

//arc /circle
c.beginPath(); //begin new path otherwise, it will connect to prev stroke
c.strokeStyle = 'rgba(200,200,200,1)';
c.arc(300,300,30,0,Math.PI,false);
c.stroke();
c.beginPath();
c.strokeStyle = 'rgba(3,200,200,1)';
c.arc(100,300,50,0,0.000001,true);
c.stroke();
c.beginPath();
c.strokeStyle = 'rgba(200,4,200,1)';
c.arc(300,100,80,0,Math.PI*2,false);
c.stroke(); //print again