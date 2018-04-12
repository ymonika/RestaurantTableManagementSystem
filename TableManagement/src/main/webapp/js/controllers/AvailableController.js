app.controller('AvailableController',['$scope','Table',function($scope,Table){

    $scope.availableTables = Table.query({tableId:"available"});

}]);