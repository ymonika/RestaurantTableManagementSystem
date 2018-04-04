app.factory('Table',['$resource',function($resource) {
  return $resource("table/",{},{
    query: {method:'GET',params:{},isArray:true}
  });
}]);
