const app = angular.module('RestaurantApp',['ngResource','ngRoute']);

app.config(['$routeProvider','$resourceProvider',
  function($routeProvider,$resourceProvider){

//  $resourceProvider.defaults.stripTrailingSlashes = false;

  $routeProvider.when('/',{
    templateUrl : 'views/Home.html',
    controller : 'HomeController'
  });

}]);
