app.factory('OrderService',['OrderResource',function(OrderResource){

    return {
        getOrderBy : function(tableId,responseMapper){
            OrderResource.getBy({"tableId":tableId},function(data,headerGetter,status){
                console.log("ORDER FOUND : "+JSON.stringify(data));
                responseMapper(data);
            },function(data,headerGetter,status){
                console.log("Error occured ... "+data);
            });
        }
    }

}]);
