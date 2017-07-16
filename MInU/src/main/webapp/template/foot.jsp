	<!-- /.container -->
    <div class="container">
        <hr>

        <!-- Footer -->
		<footer> 
			<% String v = (String) session.getAttribute("versao");
				String ver = v.equals("1.0.${build.number}") ? "homologação"  : v;
			%>	
			<p class="footer" >&copy; Copyright Uversa 2017 - Todos os direitos reservados | <%=ver %></p>
		</footer>
			
   	 </div>
     <!-- /.container -->  
       
</body>	
</html>
