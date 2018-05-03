app.factory('OrderResource',['$resource',function($resource){
    return $resource("orders/:orderId",{orderId:"@id"},{
        query : {method:"GET",params:{},isArray:true}
    });
}]);