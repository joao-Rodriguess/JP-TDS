// script.js
document.addEventListener('DOMContentLoaded', () => {
    const penguin = document.getElementById('penguin');
    const gameArea = document.getElementById('gameArea');

    let penguinX = gameArea.offsetWidth / 2 - penguin.offsetWidth / 2;
    let penguinY = gameArea.offsetHeight - penguin.offsetHeight;

    penguin.style.left = `${penguinX}px`;
    penguin.style.bottom = `${penguinY}px`;

    penguin.addEventListener('click', () => {
        alert('Você clicou no pinguim!');
    });

    function movePenguin(event) {
        const gameRect = gameArea.getBoundingClientRect();
        const mouseX = event.clientX - gameRect.left;
        const mouseY = event.clientY - gameRect.top;

        penguinX = mouseX - penguin.offsetWidth / 2;
        penguinY = mouseY - penguin.offsetHeight / 2;

        if (penguinX < 0) penguinX = 0;
        if (penguinY < 0) penguinY = 0;
        if (penguinX > gameArea.offsetWidth - penguin.offsetWidth) {
            penguinX = gameArea.offsetWidth - penguin.offsetWidth;
        }
        if (penguinY > gameArea.offsetHeight - penguin.offsetHeight) {
            penguinY = gameArea.offsetHeight - penguin.offsetHeight;
        }

        penguin.style.left = `${penguinX}px`;
        penguin.style.bottom = `${penguinY}px`;
    }

    gameArea.addEventListener('mousemove', movePenguin);
});
