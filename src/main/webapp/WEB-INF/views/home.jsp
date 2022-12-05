<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<head>
    <title>Home</title>
</head>
<body>

<div>
        <input name="name" type="text">
        <button id="searchBtn" type="button">213</button>
</div>

<div id="info">
    <p class="infoTitle"></p>
    <p class="job"></p>
    <p class="level"></p>
    <p class="name"></p>
    <p class="server"></p>
</div>

</body>
<script>
    $("#searchBtn").click(function() {

        const searchInput = $("input[name = name]").val();

        console.log(searchInput);

        $.ajax({
            method : 'GET',
            url : 'char/'+ searchInput,
            dataType : 'JSON',

            success : function (character) {
                console.log(character)

                $(".infoTitle").text(character.infoTitle);
                $(".job").text(character.job);
                $(".level").text(character.level);
                $(".name").text(character.name);
                $(".server").text(character.server);

            }

        });
    });

</script>
</html>
