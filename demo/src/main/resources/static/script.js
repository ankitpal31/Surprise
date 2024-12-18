function showClue() {
    const clueContainer = document.getElementById('clue-container');
    if (clueContainer.style.display === 'none') {
        clueContainer.style.display = 'block';
    } else {
        clueContainer.style.display = 'none';
    }
}
