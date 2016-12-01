
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
                    <form action="PagamentoServlet" method="post">
                        <table>
                            <tr>
                                <td>Cliente: </td>
                                <td>
                                    <select name="cliente">
                                        <option value="Maria">Maria</option>
                                        <option value="Joao">João</option>
                                        <option value="Jose">José</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>Forma de Pgto:</td>
                                <td>
                                    <select name="formaPgto">
                                        <option value="1">A Vista</option>
                                        <option value="2">Cartão de Crédito</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>Tipo de cliente:</td>
                                <td>
                                    <select name="tipoCliente">
                                        <option value="1">Mensalista</option>
                                        <option value="2">Horista</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>Quantidade de Horas Estacionadas: </td>
                                <td><input type="text" name="qtdeHoras" placeholder="0" /></td>
                            </tr>
                            <tr>
                                <td>Tipo de veículo:</td>
                                <td>
                                    <select name="tipoVeiculo">
                                        <option value="1">Carro</option>
                                        <option value="2">Moto</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <button type="submit">Pagar</button>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div>
        </div>
    </center>
    </body>
</html>
