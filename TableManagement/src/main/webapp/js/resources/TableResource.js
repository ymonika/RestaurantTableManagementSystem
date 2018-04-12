app.factory('Table',['$resource',function($resource) {
  return $resource("tables",{},{
    query: {method:'GET',params:{},isArray:true}
  });
}]);
