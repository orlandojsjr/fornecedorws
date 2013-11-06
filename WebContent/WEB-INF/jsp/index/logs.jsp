<%-- 
    Document   : logs
    Created on : 03/11/2013, 14:07:57
    Author     : Orlando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="content">
    <div class="container_12"><br/>     
        <div class="grid_12">
            <h3 class="mb0">Log de Transações</h3>
        </div>
        <div class="clear"></div>
        <br/>
        <table class="tabela">
            <thead>
                <tr>
                    <th>Cód</th>
                    <th>Descrição</th>                    
                    <th>Data</th>
                </tr>        
            </thead>
            <tbody>
                <c:forEach items="${logs}" var="log">
                    <tr>
                        <td>${log.id}</td>
                        <td>${log.descricao}</td>
                        <td>${log.data}</td>                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>