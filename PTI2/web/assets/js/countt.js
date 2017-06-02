$(document).ready(function () {
    refresh();
});

function refresh() {
    $.get('count.jsp', function (result) {
        $('#count').html(result);
    });
    setTimeout('refresh()', 5000);
}

