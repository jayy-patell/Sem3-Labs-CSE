// const rainContainer = document.getElementById("#canvas1");



// const amount = 100; // amount of raindops
// let i = 0;

// // Looping and creating the raindrop then adding to the rainContainer
// while (i < amount) {
//   //  Creating and Element
//   const drop = document.createElement("i");

//   //   CSS Properties for raindrop
//   const raindropProperties = {
//     width: Math.random() * 5 + "px",
//     positionX: Math.floor(Math.random() * window.innerWidth) + "px",
//     delay: Math.random() * -20 + "s",
//     duration: Math.random() * 5 + "s",
//     bg: background[Math.floor(Math.random() * background.length)],
//     opacity: Math.random() + 0.2
//   };

//   //   Setting Styles for raindrop
//   drop.style.width = raindropProperties.width;
//   drop.style.left = raindropProperties.positionX;
//   drop.style.animationDelay = raindropProperties.delay;
//   drop.style.animationDuration = raindropProperties.duration;
//   drop.style.background = raindropProperties.bg;
//   drop.style.opacity = raindropProperties.opacity;

//   //   Appending the raindrop in the raindrop container
//   rainContainer.appendChild(drop);
//   i++;
// }

//NOTES
// context.fillRect(x,y,width,height);


// background Colors for the raindrop
const background = [
    "linear-gradient(transparent, aqua)",
    "linear-gradient(transparent, red)",
    "linear-gradient(transparent, limegreen)",
    "linear-gradient(transparent, white)",
    "linear-gradient(transparent, yellow)"
  ];

const canvas = document.getElementById("canvas1");
const context = canvas.getContext('2d');
const canvasHeight = canvas.height;
const canvasWidth = canvas.width;

function render() {
    context.fillStyle = "black";
    context.fillRect(0,0,canvasWidth,canvasHeight);
    context.fillStyle="rgb(121, 250, 250)";
    for(var i = 1; i < 50; i++) {
        var x = Math.round(Math.random()*canvasWidth);
        var y = Math.round(Math.random() * canvasHeight)% canvasHeight;
        context.fillRect(x,y,2,8);
    }

    const t = setTimeout(function() {
        requestAnimationFrame(render);
    },35);
}

requestAnimationFrame(render);