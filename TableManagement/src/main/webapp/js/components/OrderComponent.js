function OrderController(){

  var self = this;

  self.data = [
    {
      id:"101",
      name : "Curry",
      price : 100
    },
    {
      id:"102",
      name : "Bread",
      price : 10
    }
  ];

  self.totalCost = 0;

  self.calculateTotal = function(){
    self.data.forEach(function(item){
      self.totalCost += item.price;
    });
  }

  self.calculateTotal();

}

app.component('order',{
    templateUrl : 'views/components/Order.html',
    controller : OrderController,
    bindings : {
        items : '<'
    }
});
