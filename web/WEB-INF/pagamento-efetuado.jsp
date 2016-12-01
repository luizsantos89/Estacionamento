
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
                                J�ssica Maria Barbosa Ant�nio<br />
                                Jhonata Adams Lopes Saques <br/>
                                Jos� Fl&aacute;vio de Assis J�nior<br />
                                Luiz Cl&aacute;udio Afonso dos Santos
                    </small>
                </div>
                <div id="texto">
                    <h1>Pagamento registrado: </h1>
                    
                    <h3>Cliente: ${cliente}</h3>
                    <p>
                        Tipo de ve�culo: ${tipoDeVeiculo} <br />
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
