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
        <h1>Listado de Turnos</h1>
        <p>Haga click sobre el turno elegido para continuar con la solicitud</p>
      </div>

      <div class="row">
       
        <div class="col-md-12">
          <table class="table table-striped">
            <thead>
               <tr>
                <th></th>
                <th>Especialidad</th>
                <th>Día</th>
                <th>Horario</th>
              </tr>
            </thead>
            <tbody>
            
              <tr>
                <td><a href="solicitar_turno.jsp?id=1">Solicitar</a></td>
                <td>Cardiología</td>
                <td>15/10/2016</td>
                <td>14.00 hs</td>
              </tr>
              
              <tr>
                <td><a href="solicitar_turno.jsp?id=2">Solicitar</a></td>
                <td>Cardiología</td>
                <td>15/10/2016</td>
                <td>14.30 hs</td>
                
              </tr>
             
              <tr>
                <td><a href="solicitar_turno.jsp?id=3">Solicitar</a></td>
                <td>Cardiología</td>
                <td>15/10/2016</td>
                <td>15.00 hs</td>
              </tr>
            
              <tr>
                <td><a href="solicitar_turno.jsp?id=4">Solicitar</a></td>
                <td>Dermatólogo</td>
                <td>15/10/2016</td>
                <td>12.00 hs</td>
              </tr>
              
               <tr>
                <td><a href="solicitar_turno.jsp?id=5">Solicitar</a></td>
                <td>Dermatólogo</td>
                <td>15/10/2016</td>
                <td>12.30 hs</td>
              </tr>
              
            </tbody>
          </table>
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
