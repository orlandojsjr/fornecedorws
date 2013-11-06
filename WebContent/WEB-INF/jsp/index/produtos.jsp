<%-- 
    Document   : produtos
    Created on : 03/11/2013, 13:40:51
    Author     : Orlando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<link rel="icon" href="<c:url value="images/favicon.ico"/>">
<link rel="shortcut icon" href="<c:url value="images/favicon.ico"/>" />
<link rel="stylesheet" href="<c:url value="css/style.css"/>">
<link rel="stylesheet" href="<c:url value="css/font-awesome.css"/>">
<link rel="stylesheet" href="<c:url value="css/touchTouch.css"/>">
<script src="<c:url value="js/jquery.js"/>"></script>
<script src="<c:url value="js/jquery-migrate-1.1.1.js"/>"></script>
<script src="<c:url value="js/superfish.js"/>"></script>
<script src="<c:url value="js/jquery.equalheights.js"/>"></script>
<script src="<c:url value="js/jquery.easing.1.3.js"/>"></script>
<script src="<c:url value="js/jquery.ui.totop.js"/>"></script>
<script src="<c:url value="js/touchTouch.jquery.js"/>"></script>

<script>


    $(document).ready(function() {
        $().UItoTop({easingType: 'easeOutQuart'});
    });

    $(function() {
        // Initialize the gallery
        $('.prod a.gal').touchTouch();
    });

</script>
<!--[if lt IE 8]>
  <div style=' clear: both; text-align:center; position: relative;'>
    <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
      <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
    </a>
 </div>
<![endif]-->
<!--[if lt IE 9]>
  <script src="js/html5shiv.js"></script>
  <link rel="stylesheet" media="screen" href="css/ie.css">

<![endif]-->

<div class="content"><div class="ic"></div>
    <div class="container_12"><br/>     
        <div class="grid_12">
            <h3 class="mb0">Produtos</h3>
        </div>
        <div class="clear"></div>
        <div class="prod">
            <c:forEach items="${produtos}" var="produto">
                <div class="grid_3">
                    <div class="box">
                        <div class="maxheight"><a href="<c:url value="${produto.imagem}"/>" class="gal"><img src="<c:url value="${produto.imagem2}"/>" alt=""></a><a href="#">${produto.nome}<br/>${produto.preco}</a></div>
                    </div>
                </div>  
            </c:forEach>
        </div>
    </div>
</div>
