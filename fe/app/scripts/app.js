'use strict';

/**
 * @ngdoc overview
 * @name tripApp
 * @description
 * # tripApp
 *
 * Main module of the application.
 */
angular
  .module('tripApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  })
  .controller("tripCtrl", function($scope) {
      $scope.name='iTrip';
  })
;
