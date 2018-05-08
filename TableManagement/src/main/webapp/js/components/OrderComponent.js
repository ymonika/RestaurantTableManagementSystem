function OrderController(){

  var self = this;

}

app.component('order',{
    templateUrl : 'views/components/Order.html',
    controller : OrderController,
    bindings : {
        data : '<'
    }
});
