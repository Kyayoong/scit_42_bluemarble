window.addEventListener('load', function() {
    let locationA = 2;
    let locationB = 7;

    function movePlayer(a, b) {
        console.log("currentLocation: ", a);
        console.log("newLocation: ", b);
        let tiles = document.getElementsByClassName('tile');
        console.log("tiles: ", tiles);
        console.log(a - 1);
        let currentTile = tiles[a - 1];
        let newTile = tiles[b - 2];
        console.log("currentTile: ", currentTile);
        console.log("newTile: ", newTile);
        let currentLocation = a - 1;
        let newLocation = b - 1;
        let interval = setInterval(function() {
            tiles[currentLocation].style.border = "5px solid blue";
            currentLocation++;
            if (currentLocation >= newLocation) {
                currentLocation = newLocation;
                clearInterval(interval);
            }
        },1000);
    }

    movePlayer(locationA, locationB);
});


