app.factory('OrderResource',['$resource',function($resource){
    return $resource(":tableId/orders/",{tableId:"@id"},{
        query : {method:"GET",params:{},isArray:true},
        getBy : {method:"GET",params:{},isArray:false}
    });
}]);