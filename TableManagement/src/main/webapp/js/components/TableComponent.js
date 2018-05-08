function TableController(OrderService){
  var ctrl = this;
  ctrl.order = undefined;

  ctrl.$onInit = function(){
    OrderService.getOrderBy(ctrl.table.tableId,function(data){
      ctrl.order = data;
    });
  }

  ctrl.viewDetails = function(){
    console.log("Viewing details of : "+JSON.stringify(ctrl.table));
  }

}

app.component('restroTable',{
  templateUrl : 'views/components/Table.html',
  controller : TableController,
  bindings : {
    table : '<'
  }
});
