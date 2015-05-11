'use strict';

/**
 * @ngdoc function
 * @name tripApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the tripApp
 */
angular.module('tripApp')
  .controller('AboutCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
