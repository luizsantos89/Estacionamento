
<html>
    <head>
        <title>Estacionamento</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="estilo.css" />
    </head>
    <body>
    <center>
        <div id="pagina">
            <div id="header">
                <a href="index.html"><img src="imagens/logo.png" alt="Principal" /></a>
            </div>
            <div id="conteudo">
                <div id="barraLateral">
                    <ul>
                        <li><a href="index.html">Principal</a></li>
                        <li><a href="ClienteServlet">Clientes</a></li>
                        <li><a href="VagaServlet">Vagas</a></li>
                        <li><a href="PagamentoServlet">Pagamento</a></li>
                    </ul>
                    <small>
                        <b>Grupo:</b><br />
                                Jéssica Maria Barbosa Antônio<br />
                                Jhonata Adams Lopes Saques <br/>
                                José Fl&aacute;vio de Assis Júnior<br />
                                Luiz Cl&aacute;udio Afonso dos Santos
                    </small>
                </div>
                <div id="texto">
                    <h1>Vaga: ${vaga.descricao}</h1>
                    <h3>Carro: ${vaga.vagaCarro}</h3>
                    <h3>Moto: ${vaga.vagaMoto}</h3>
                </div>
            </div>
        </div>
    </center>
    </body>
</html>
