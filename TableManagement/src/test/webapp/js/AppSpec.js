describe('App Test Suite',function(){

    var route, $rootScope, $location, $httpBackend;

      beforeEach(function(){
        module('RestaurantApp');
      });

    inject(function($injector,$route,$controller){
       $route = $injector.get('$route');
       $rootScope = $injector.get('$rootScope');
       $location = $injector.get('$location');
       $httpBackend = $injector.get('$httpBackend');
    });

    it('Should validate configs',function(){
        // App Name is defined
        expect(app.name).toBe('RestaurantApp');

        // Module dependencies are defined
        expect(app.requires.length).toBe(2);
        expect(app.requires.indexOf("ngRoute")).not.toBe(-1);
        expect(app.requires.indexOf("ngResource")).not.toBe(-1);

    });

    it('Should validate routes',function(){

//        expect(route.routes['/'].controller).toBe('');

    });

});
