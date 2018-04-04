app.controller('HomeController',['$scope','Table',function($scope,Table) {

  $scope.table = new Table();

  function loadTables(){
    $scope.existingTables = Table.query();
  }

  loadTables()

  $scope.save = function(){
    $scope.table.$save(function(){
      $scope.message = "Table added";
      $scope.table = new Table();
      loadTables();
    });
  }

}]);
