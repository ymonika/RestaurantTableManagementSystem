app.factory('OrderService',['OrderResource',function(OrderResource){

    return {
        getOrderBy : function(tableId){
            console.log("Fetching order by TAble ID : "+tableId);
            OrderResource.getBy({"tableId":tableId},function(data,headerGetter,status){
                console.log("ORDER FOUND : "+JSON.stringify(data));
            },function(data,headerGetter,status){
                console.log("Error occured ... "+data);
            });
        }
    }

}]);
