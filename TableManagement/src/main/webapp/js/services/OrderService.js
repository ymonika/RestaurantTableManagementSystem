app.factory('OrderService',['OrderResource',function(OrderResource){

    return {
        getOrderBy : function(tableId){
            console.log("Fetching order by TAble ID : "+tableId);
        }
    }

}]);