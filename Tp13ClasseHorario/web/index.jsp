<%-- 
    Document   : index
    Created on : 17 de mai. de 2021, 03:33:41
    Author     : andersons
--%>

<!IMPORTAR AS CLASSES PARA FORMATAÇÃO DE DATA>

<!IMPORTAR A CLASSE util.date>
<%@page import="java.util.Date"%>
<!IMPORTAR A CLASSE HORARIO>
<%@page import="horario.Horario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 
   
     
    Date d = new Date();
    Horario hora_atual = new Horario(04,54,49);
       
    Horario hora_intervalo = new Horario(20,50,00);
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INDEX - TP 13 ANDERSON SOARES - ClasseHorario</title>
    </head>
    <body>
       
        <h2> TP 13 - ClasseHorario</h2>
        <P> <b> ANDERSON SOARES DOS SANTOS</b></P>
        <P> <b> Matricula: RA 1290481923017</b></P>
        <h3>Link do Perfil(Nome , Matricula , Semestre ingressante e perfil GitHub): </h3>
        <h4><a href="AndersonSoaresDosSantos.html">ANDERSON SOARES DOS SANTOS </a> </h4>
           
        
        <h3>Horário sistema:<%=d %> </h3>
        <h3>Horário atual: <%= hora_atual.getHorario()%></h3>
        <h3>Horário intervalo: <%= hora_intervalo.getHorario()%></h3>
        <%@include file="WEB-INF/jspf/footer.jspf"  %>
    </body>
</html>
