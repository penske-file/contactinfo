$.ajax({
  url: "/service/address",
  data: {
    address: $address
  },
  success: function( result ) {
    $( "#address" ).html( result );
  }
});