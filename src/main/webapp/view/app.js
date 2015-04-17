'use strict';

// Declare app level module which depends on views, and components
var labApp = angular.module('labApp', [
    'ngRoute',
    'CourseMainController',
    'languageControllers',
    'languageServices',
    'pascalprecht.translate'
])
labApp.config(['$routeProvider',
  function($routeProvider) {
  $routeProvider.

      when('/home',{
          templateUrl: 'template/CourseList.html',
          controller: 'listCourseController'
      }).

      otherwise({redirectTo: '/home'});
}]);

labApp.config(function($translateProvider){
    $translateProvider.useUrlLoader('/messageBundle');
    $translateProvider.useStorage('UrlLanguageStorage');
    $translateProvider.preferredLanguage('en');
    $translateProvider.fallbackLanguage('en');
})
