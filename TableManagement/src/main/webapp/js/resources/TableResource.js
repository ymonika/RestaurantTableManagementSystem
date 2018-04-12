app.factory('Table',['$resource',function($resource) {
  return $resource("tables/:tableId",{tableId:"@id"},{
    query: {method:'GET',params:{},isArray:true}
  });
}]);
