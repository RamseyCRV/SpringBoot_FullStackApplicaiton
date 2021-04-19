$('document').ready(function(){

    $('table #deleteDesktopButton').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr("href");
        $("#confirmDeleteDesktopButton").attr('href', href);
        $('#deleteDesktopModal').modal();
    });


    $('table #detailsDesktopButton').on('click', function(event){
    event.preventDefault();
    var href = $(this).attr("href");

    $.get(href, function(desktop, status){
        $('#imageDesktopDetails').attr("src","/Products/Desktops/" + desktop.image);
        $('#idDesktopDetails').val(desktop.id);
        $('#nameDesktopDetails').val(desktop.name);
        $('#priceDesktopDetails').val(desktop.price);
        $('#inStockDesktopDetails').val(desktop.inStock);
        $('#unitsSoldDesktopDetails').val(desktop.unitsSold);
        $('#descriptionDesktopDetails').val(desktop.description);
    });
    $('#detailsDesktopModal').modal();

    });

    $('table #editDesktopButton').on('click', function(event){

            //event.preventDefault nu deschide pagina cu json
            event.preventDefault();

            // URL /countries/findById/?id=1
            var href = $(this).attr("href");

            $.get(href, function(desktop, status){
              $('#imageDesktopEdit').attr("src","/Products/Desktops/" + desktop.image);
              $('#imageDesktop').val(desktop.image);
              $('#idDesktopEdit').val(desktop.id);
              $('#nameDesktopEdit').val(desktop.name);
              $('#priceDesktopEdit').val(desktop.price);
              $('#inStockDesktopEdit').val(desktop.inStock);
              $('#unitsSoldDesktopEdit').val(desktop.unitsSold);
              $('#descriptionDesktopEdit').val(desktop.description);
            });

            $('#editDesktopModal').modal();
        });

});