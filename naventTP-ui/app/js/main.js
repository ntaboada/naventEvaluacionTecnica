function test() {
  var pedidoNombre=document.getElementById( "nombre" );
  var pedidoMonto=document.getElementById( "monto" );
  var pedidoDescuento=document.getElementById( "descuento" );

  var pedido = {
    nombre:name,
    monto:pedidoMonto,
    descuento:pedidoDescuento
  }

  $.ajax({
    type: 'POST',
    url: 'localhost:8080/api/pedidos',
    data: pedido,
    success: function(data) { alert('data: ' + data); },
    contentType: "application/json",
    dataType: 'json'
  });}
