
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
                    <h1>Pagamento registrado: </h1>
                    
                    <h3>Cliente: ${cliente}</h3>
                    <p>
                        Tipo de veículo: ${tipoDeVeiculo} <br />
                        Tipo de cliente: ${tipoDeCliente} <br />
                        Forma de pagamento: ${formaDePgto} <br />
                        Valor pago: R$ ${valorPago}
                    </p>
                </div>
            </div>
        </div>
    </center>
    </body>
</html>
