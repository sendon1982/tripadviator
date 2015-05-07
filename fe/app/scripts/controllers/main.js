'use strict';

/**
 * @ngdoc function
 * @name tripApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the tripApp
 */
angular.module('tripApp')
  .controller('MainCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
