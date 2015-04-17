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
          templateUrl: 'template/home.html'
      }).
      when('/history',{
          templateUrl: 'template/history.html'
      }). when('/activity',{
          templateUrl: 'template/activity.html'
      }).
      when('/gallery',{
          templateUrl: 'template/gallery.html'
      }).
      when('/map',{
          templateUrl: 'template/map.html'
      }).
      when('/contact',{
          templateUrl: 'template/contact.html'
      }).

      otherwise({redirectTo: '/listCourse'});
}]);

labApp.config(function($translateProvider){
    $translateProvider.useUrlLoader('/messageBundle');
    $translateProvider.useStorage('UrlLanguageStorage');
    $translateProvider.preferredLanguage('en');
    $translateProvider.fallbackLanguage('en');
})
