<%-- 
    Document   : pedidos
    Created on : 03/11/2013, 14:07:52
    Author     : Orlando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="content">
    <div class="container_12"><br/>     
        <div class="grid_12">
            <h3 class="mb0">Pedidos</h3>
        </div>
        <div class="clear"></div>
        <br/>
        <table class="tabela">
            <thead>
                <tr>
                    <th>Cód</th>
                    <th>Cliente</th>
                    <th>Produto</th>
                    <th>Qtd.</th>
                    <th>Data</th>
                </tr>        
            </thead>
            <tbody>
                <c:forEach items="${pedidos}" var="pedido">
                    <tr>
                        <td>${pedido.idPedido}</td>
                        <td>${pedido.cliente}</td>
                        <td>${pedido.produto.nome}</td>
                        <td>${pedido.qtde}</td>
                        <td>${pedido.data}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>