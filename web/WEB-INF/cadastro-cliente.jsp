
<html>
    <head>
        <title>Cadastro de clientes</title>
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
                        <li><a href="index.html">P&aacute;gina Principal</a></li>
                        <li><a href="ClienteServlet">Cadastro cliente</a></li>
                        <li><a href="index.html">Registrar ocorrência</a></li>
                        <li><a href="index.html">Consultar Pagamento</a></li>
                    </ul>
                    <small>
                        Grupo: Jéssica Maria Barbosa Antônio, Jhonata Adams Lopes Saques, 
                        José Fl&aacute;vio de Assis Júnior, Luiz Cl&aacute;udio Afonso dos Santos
                    </small>
                </div>
                <div id="texto">
                    <h1>Cadastro de cliente</h1>
                    <form action="ClienteServlet" method="post">
                        <table>
                            <tr>
                                <td>Cliente: </td>
                                <td><input type="text" name="nome" text="55" /></td>
                            </tr>
                            <tr>
                                <td>Tipo: </td>
                                <td>
                                    <select name="tipo">
                                        <option value="1">Horista</option>
                                        <option value="1">Mensalista</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2"><button type="submit">Cadastrar</button></td>
                            </tr>
                        </table>
                    </form> 
                </div>
            </div>
        </div>
    </center>
    </body>
</html>
