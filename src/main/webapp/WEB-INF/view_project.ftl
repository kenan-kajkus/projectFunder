<html>
<head><title>ProjectFunder</title>
<link rel="stylesheet" type="text/css" href="/css/view_project.css">
<body>
<div id="wrapper">
		<div id="header">
			<h1>Informationen</h1>
		</div>

		<div id="view_project_divid">
            <div id="titel_id">
                <h1>${project.getTitel()}</h1>
                <h4><a href="https://google.de">von ${project.getErsteller()}</a></h4>
                <p>${project.getBeschreibung()}</p>
                <div id="sub_information_id">
                    <ul>
                        <li>
                            <p>Finanzierungslimit: ${project.getFinanzierungsLimit()}€</p>
                        </li>

                        <li>
                            <p>Aktuelle Spendensumme: ${project.getSpendenbetrag()}€</p>
                        </li>

                        <li>
                            <p>Status: ${project.getStatus()}</p>
                        </li>

                        <li>
                            <p>Vorgänger-Projekt: <a href="https://google.de/"> Ubuntu Touch</a></p>
                        </li>
                    </ul>
                </div>
            </div>
            <div id="action_bar_id">
               <h3>Aktionsleiste</h3>
               <a href="new_project_fund?kennung=${project.getKennung()}"><input style="padding:1em 1em 1em 1em; background-color:green; color:white;" type="submit" name=value="Spenden"></a>
               <a href="new_comment?kennung=${project.getKennung()}"><input style="padding:1em 1em 1em 1em; background-color:red; color:white;" type="submit" value="Projekt Löschen"></a>
               <a href="new_comment?kennung=${project.getKennung()}"><input style="padding:1em 1em 1em 1em; background-color:blue; color:white;" type="submit" value="Projekt Editieren"></a>
            </div>

            <div id="fund_list_id">
               <h3>Liste der Spender</h3>
               	<#list spenderList as spender>
                <p>${spender.getSpender()}: ${spender.getSpende()}</p>
                </#list>
            </div>
             <a href="new_comment?kennung=${project.getKennung()}"><input style="padding:1em 1em 1em 1em;" type="submit" value="Kommentieren"></a>
            <div id="comments_id">
                <ul>
                    <li id="comments_li_id">
                    <#list kommentare as kommentar>
                    <p>${kommentar.getBenutzer()}: ${kommentar.getText()}<p>
                    </#list>
                    </li>
                </ul>
            </div>   

        </div>
</div>
</body>
</html>