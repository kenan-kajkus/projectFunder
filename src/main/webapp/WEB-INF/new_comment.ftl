<html>
<head><title>ProjectFunder</title></head>
<link rel="stylesheet" type="text/css" href="/css/new_comment.css">
<body>
<div id="wrapper">
		<div id="header">
			<h1>Projekt kommentieren</h1>
		</div>

		<div id="new_comment_divid">
			<div id="ul_divid">
				<form method="post">
			        <ul>
			            <li>
  				            <h2>${project.getTitel()}</h2>
			            </li>
			
			            <li>
				            <h2>Kommentieren:</h2> <input type="text" name="komment"><br>
			            </li>
			            <li>
				            <a href=new_comment?kennung=${project.getKennung()}><input style="padding:1em 1em 1em 1em;" type="submit" value="Kommentar hinzufügen"></a>
			            </li>
			        </ul>	
			    </form>
			</div>
		</div>
</div>
</body>
</html>