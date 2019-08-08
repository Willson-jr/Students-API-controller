

    $("#link").click(function () {
        $("#more").toggle();
    });


    $.ajax({
        url: "http://localhost:8080/api/students/3"
    }).then(function (data) {
        $('.greeting-id').append(data.id);
        $('.greeting-content').append(data.name+" "+data.surname);
    });

