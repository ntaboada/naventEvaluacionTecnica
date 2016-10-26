    const CAMPO_VACIO = "";
    const REGEXP_ONLY_LETTERS = /^[a-zA-Z ]*$/;
    const REGEXP_ONLY_NUMBERS = /^\d+$/
    
    function validate(){
       
        $('.error_msgs').html('');
        
        val = true;

        if($("#nombre").val()==CAMPO_VACIO){
           $('.error_msgs:eq(0)').html('El nombre no puede estar vacio');
           val = false;
        }

        if(!$("#nombre").val().match(REGEXP_ONLY_LETTERS)){
          $('.error_msgs:eq(0)').html('Nombre incorrecto');
          val = false;
        }

       if(!$("#monto").val().match(REGEXP_ONLY_NUMBERS)){
          $('.error_msgs:eq(1)').html('Monto incorrecto');
          val = false;
        }

       if(!$("#descuento").val().match(REGEXP_ONLY_NUMBERS)){
          $('.error_msgs:eq(2)').html('Descuento incorrecto');
          val = false;
        }

        if(val==false){
          return false;
        }
    }

    function savePedido() {

    if(validate()==false){
      return;
    }

    var pedido =  new Pedido();
    pedido.nombre= $("#nombre").val();
    pedido.monto=parseInt($("#monto").val());
    pedido.descuento=parseInt($("#descuento").val());

    $.ajax({
      cache:false,
      type: 'post',
      url: 'http://localhost:8080/api/pedidos/guardar',
      data:  JSON.stringify(pedido),
      success: function(data) { alert("Pedido realizado");},
      error: function(data) { alert(data.statusText); $('#spinner').css('opacity', 0);},
      contentType: "application/json",
      dataType: 'json'
    });
  }


  function Pedido () {
    var self = this;

    self.nombre;
    self.monto;
    self.descuento;
  }


