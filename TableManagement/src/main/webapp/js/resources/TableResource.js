app.factory('TableResource',['$resource',function($resource) {
  return $resource("rest/tables/:tableId",{tableId:"@id"},{
    query: {method:'GET',params:{},isArray:true}
  });
}]);
