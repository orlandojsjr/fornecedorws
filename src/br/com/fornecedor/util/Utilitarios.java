/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fornecedor.util;

import br.com.fornecedor.entidade.Log;
import br.com.fornecedor.entidade.Pedido;
import br.com.fornecedor.entidade.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Orlando
 */
public class Utilitarios {

    private static final List<Produto> produtoList;
    private static final List<Pedido> pedidoList;
    private static final List<Log> logList;
    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static final XStream xStream = new XStream(new DomDriver("ISO-8859-1"));
        

    static {
        produtoList = new ArrayList<Produto>();
        pedidoList = new ArrayList<Pedido>();
        logList = new ArrayList<Log>();
        xStream.autodetectAnnotations(true);
        xStream.processAnnotations(Produto.class);
    }

    public static List<Produto> getProdutoList() {
        if (produtoList.isEmpty()) {
            produtoList.add(new Produto(1, "Maçã", "images/big1.jpg", "images/page2_img1.jpg", "R$ 5,00 KG"));
            produtoList.add(new Produto(2, "Cesta Frutas", "images/big2.jpg", "images/page2_img2.jpg", "R$ 15,00 Unit."));
            produtoList.add(new Produto(3, "Laranja", "images/big3.jpg", "images/page2_img3.jpg", "R$ 15,00 saco"));
            produtoList.add(new Produto(4, "Morango", "images/big4.jpg", "images/page2_img4.jpg", "R$ 9,00 "));
            produtoList.add(new Produto(5, "Caqui", "images/big5.jpg", "images/page2_img5.jpg", "R$ 3,99 "));
            produtoList.add(new Produto(6, "Pimentao", "images/big6.jpg", "images/page2_img6.jpg", "R$ 8,00 "));
            produtoList.add(new Produto(7, "Milho", "images/big7.jpg", "images/page2_img7.jpg", "R$ 15,00 "));
            produtoList.add(new Produto(8, "Cenoura", "images/big8.jpg", "images/page2_img8.jpg", "R$ 4,00 "));
            produtoList.add(new Produto(9, "Pepino", "images/big9.jpg", "images/page2_img9.jpg", "R$ 3,00 "));
            produtoList.add(new Produto(10, "Acerola", "images/big10.jpg", "images/page2_img10.jpg", "R$ 1,00 "));
        }
        return produtoList;
    }

    public static List<Pedido> getPedidoList() {        
        return pedidoList;
    }
   
    public static void addPedido(Pedido pedido){
        pedidoList.add(pedido);
    }
    
    public static void addLog(String descricao) {
        logList.add(new Log(descricao));
    }

    public static List<Log> getLogList() {        
        return logList;
    }
    
    public static String getXmlCatalogoProdutos(){        
        return xStream.toXML(Utilitarios.getProdutoList());
    }
}
