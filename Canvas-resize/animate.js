var canvas = document.querySelector('canvas');
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

var c = canvas.getContext('2d');

var mouse={ //declare object
    x: undefined,
    y: undefined
}
window.addEventListener('mousemove',function(event){
    mouse.x=event.x;
    mouse.y=event.y; //set mouse position
});



function Circle(x,y,dx,dy,radius,color){
    this.x=x;
    this.y=y;
    this.dx=dx;
    this.dy=dy;
    this.radius=radius;

    this.draw=  function(){

        c.beginPath();
        c.arc(this.x,this.y,this.radius,0,Math.PI*2,false); //draw circle


        c.strokeStyle = color; //given color outside
        c.stroke(); //stroke circle

    }
    this.update= function(){
        if(this.x+this.radius>innerWidth||this.x-this.radius<0){
            this.dx=-this.dx;
        }
        if(this.y+this.radius>innerHeight||this.y-this.radius<0){ //bound circle
            this.dy=-this.dy;
        }
        this.x+=this.dx;
        this.y+=this.dy;
        var distance =50; //if mouse closer than this distance
        if(Math.abs(this.x-mouse.x)<distance&&Math.abs(this.y-mouse.y)<distance&&this.radius<50){
            //if mouse closer enough, and circle and bigger than certain size
            this.radius++; //circle get bigger
        }else if(this.radius>radius){ //else make the circle back to original size
            this.radius--;
        }
        this.draw();
    }
}
var circleArray=[];
for(var i=0;i<100;i++){ //we have 100 circle flying
    radius=10;
    var x =Math.random()*(innerWidth-radius*2)+radius; //make sure the circle dont get caught on the side of the screen
    var dx=(Math.random()-0.5)*4;
    var y =Math.random()*(innerHeight-radius*2)+radius;
    var dy=(Math.random()-0.5)*4;
    var red =Math.random()*255; //random color
    var yellow =Math.random()*255;
    var blue =Math.random()*255;
    var dark =Math.random()+0.3;
    var color = 'rgba('+red+','+blue+','+yellow+','+dark+')';
    circleArray.push(new Circle(x,y,dx,dy,radius,color)) ; //first two parameter is spwan location
}
function animate(){ //this function make color bigger when mouse closer, detail in circle.update
    requestAnimationFrame(animate);
    c.clearRect(0,0,innerWidth,innerHeight);
    for(var j=0;j<circleArray.length;j++){
        circleArray[j].update();
    }
}
function drawing(){ //this function draw circle when the mouse here,
    requestAnimationFrame(drawing);
    c.clearRect(0,0,innerWidth,innerHeight);
    var drawArray=[];
    for(var i=0;i<10;i++){
        radius=1.5;
        var x =mouse.x; //make sure the circle dont get caught on the side of the screen
        var dx=(Math.random()-0.5);
        var y =mouse.y;
        var dy=(Math.random()-0.5);
        var red =Math.random()*255;
        var yellow =Math.random()*255;
        var blue =Math.random()*255;
        var dark =Math.random()+0.3;
        var color = 'rgba('+red+','+blue+','+yellow+','+dark+')';
        drawArray.push(new Circle(x,y,dx,dy,radius,color)) ; //first two parameter is spwan location
    }
    for(var j=0;j<10;j++){
        for(var k=0;k<10;k++)
        drawArray[j].update();
        //drawArray[j].draw();
    }
}
animate();
// drawing();