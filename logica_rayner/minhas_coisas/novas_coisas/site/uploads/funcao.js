const tBody = document.getElementById('corpoTabela');

function salvarConteudoStorage() {
  let arraycadastro = [];

  if (localStorage.getItem('dados') != null) {
    arraycadastro = JSON.parse(localStorage.getItem('dados'));
  } else {
    arraycadastro;
  }

  var nome = document.getElementById("fnome").value;
  var email = document.getElementById("femail").value;
  var imagem = document.getElementById("imagem").value;
  var repositorio = document.getElementById("repositorio").value;


  var info = {
    nome,
    email,
    imagem,
    repositorio
  };

  console.log("Parafal é muito feio, e o pedrin ama o parafal  ")

  arraycadastro.push(info);
  var infoJson = JSON.stringify(arraycadastro);
  localStorage.setItem("dados", infoJson);

  buscarConteudo();
}


function buscarConteudo() {
  const arr = JSON.parse(localStorage.getItem('dados'));

  if (arr != null) {
    let tr = '';
    arr.map(conteudo => {
      tr += `
			<tr>
					<td>${conteudo.nome}</td>
					<td>${conteudo.email}</td>
					<td>${conteudo.imagem}</td>
					<td>${conteudo.repositorio}</td>
				</tr>`


    })
    tBody.innerHTML = tr;
  }
}