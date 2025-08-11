const x = Math.floor(Math.random() * 50) + 1;
const y = Math.floor(Math.random() * 50) + 1;
let tentativas = 10;

console.log("Valores sorteados:", x, y);

function evento() {
    const inputx = Number(document.getElementById("inputX").value);
    const inputy = Number(document.getElementById("inputY").value);
    const mensagem = document.getElementById("mensagem");
    const tentativasRestantes = document.getElementById("tentativasRestantes");

    if (!inputx || !inputy) {
        alert("Digite valores válidos nos dois campos.");
        return;
    }

    if (inputx < 1 || inputx > 50 || inputy < 1 || inputy > 50) {
        alert("Os valores devem estar entre 1 e 50.");
        return;
    }

    const diferencax = Math.abs(x - inputx);
    const diferencay = Math.abs(y - inputy);

    let mensagemx = "";
    let mensagemy = "";

    if (diferencax > 15) mensagemx = "🔴 linha está longe";
    else if (diferencax >= 6) mensagemx = "🟠 linha está chegando";
    else if (diferencax >= 1) mensagemx = "🟡 linha está próximo";
    else mensagemx = "✅ linha correta!";

    if (diferencay > 15) mensagemy = "🔴 coluna está longe";
    else if (diferencay >= 6) mensagemy = "🟠 coluna está chegando";
    else if (diferencay >= 1) mensagemy = "🟡 coluna está próximo";
    else mensagemy = "✅ coluna correta!";

    if (diferencax === 0 && diferencay === 0) {
        mensagem.innerHTML = `🎉 Parabéns! Você acertou os dois valores! X=${x}, Y=${y}`;
        tentativasRestantes.innerHTML = "";
        document.getElementById("tentar").disabled = true;
        return;
    }

    tentativas--;

    mensagem.innerHTML = `<div>${mensagemx}</div><div>${messagemy}</div>`;
    tentativasRestantes.innerHTML = `Tentativas restantes: <strong>${tentativas}</strong>`;

    if (tentativas === 0) {
        mensagem.innerHTML += `<br><span class="error">😢 Suas tentativas acabaram. Os valores eram X=${x} e Y=${y}.</span>`;
        document.getElementById("tentar").disabled = true;
    }
}



