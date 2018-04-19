app.controller('AvailableController',['$scope','TableResource',function($scope,Table){

    $scope.availableTables = Table.query({tableId:"available"});

}]);