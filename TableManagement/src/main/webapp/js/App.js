const app = angular.module('RestaurantApp',['ngResource','ngRoute']);

app.config(['$routeProvider',function($routeProvider){

  $routeProvider.when('/',{
    templateUrl : 'views/Home.html',
    controller : 'HomeController'
  });

}]);
