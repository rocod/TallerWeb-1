<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Listado de Turnos</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">

  </head>

  <body role="document">

    <!-- Fixed navbar -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Inicio</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Turnos</a></li>
            <li><a href="">Contacto</a></li>
            
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container theme-showcase" role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h1>Solicitar turno</h1>
        <p>	${clave_especialidad}
			${clave_fecha} 
        	${clave_horario} 
        </p>
      </div>

      <div class="row">
       
        <div class="col-md-12">
        
        	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	
			<form:form action="ej2_recibe" method="POST" modelAttribute="persona">
				<form:label path="nombre">Nombre</form:label>
				<form:input path="nombre"/> <br>
				<form:label path="apellido">Apellido</form:label>
				<form:input path="apellido"/> <br>
				<form:label path="telefono">Telefono</form:label>
				<form:input path="telefono"/> <br>
				<form:label path="email">Email</form:label>
				<form:input path="email"/> <br>
				
				<input type="submit" value="Enviar">
			</form:form>
        
        <!--  
          <form class="form-horizontal">
          
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="nombre">Nombre:</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="nombre" placeholder="Ingrese su nombre">
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="apellido">Apellido:</label>
			    <div class="col-sm-10"> 
			      <input type="text" class="form-control" id="apellido" placeholder="Ingrese su nombre">
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="telefono">Teléfono:</label>
			    <div class="col-sm-10"> 
			      <input type="text" class="form-control" id="telefono" placeholder="Ingrese su teléfono">
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="email">E-mail:</label>
			    <div class="col-sm-10"> 
			      <input type="text" class="form-control" id="email" placeholder="Ingrese su e-mail">
			    </div>
			  </div>
			  
			  <div class="form-group"> 
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-default">Confirmar turno</button>
			    </div>
			  </div>
			  
			</form>
			-->
        </div>
      </div>



    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
  </body>
</html>
