/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fornecedor.webservices;

import br.com.fornecedor.entidade.Pedido;
import br.com.fornecedor.entidade.Produto;
import br.com.fornecedor.util.Utilitarios;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Orlando
 */
@WebService(serviceName = "Pedido")
public class PedidoWS {

    /**
     * This is a sample web service operation
     *
     * @param idCliente
     * @return 
     */
    @WebMethod(operationName = "consultarCatalogoProdutos")
    public String consultarCatalogoProdutos(@WebParam(name = "idCliente") String idCliente) {
        Utilitarios.addLog("Consulta de Catalogo. Cliente: " + idCliente);        
        return Utilitarios.getXmlCatalogoProdutos();
    }

    /**
     * This is a sample web service operation
     * @param idCliente
     * @param idProduto
     * @param qtde
     * @return 
     */
    @WebMethod(operationName = "realizarPedido")
    public String realizarPedido(@WebParam(name = "idCliente") String idCliente, @WebParam(name = "idProduto") String idProduto, @WebParam(name = "qtde") String qtde) {
        try {
            Pedido pedido = new Pedido(idCliente, Utilitarios.getProdutoList().get(Integer.parseInt(idProduto)), Integer.parseInt(qtde));
            Utilitarios.addPedido(pedido);
            Utilitarios.addLog("Novo Pedido. " + pedido.toString());
            return "Pedido Realizado.";
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        return "Erro";
    }
}
