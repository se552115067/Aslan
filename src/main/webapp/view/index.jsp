<!DOCTYPE html>

<html lang="en" ng-app="labApp">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Wat phar singh</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="bower_components/html5-boilerplate/css/normalize.css">
    <link rel="stylesheet" href="bower_components/html5-boilerplate/css/main.css">
    <link rel="stylesheet" href="app.css">
    <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.css">
    <script src="bower_components/html5-boilerplate/js/vendor/modernizr-2.6.2.min.js"></script>
    <script src="bower_components/angular/angular.js"></script>
    <script src="bower_components/angular-route/angular-route.js"></script>
    <script src="bower_components/angular-resource/angular-resource.js"></script>
    <script src="bower_components/jquery/dist/jquery.min.js"></script>
    <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <script src="app.js"></script>


    <!-- add il8n script -->
    <script src="bower_components/angular-translate/angular-translate.js"></script>
    <script src="bower_components/angular-translate-loader-url/angular-translate-loader-url.js"></script>


</head>
<body>
<div class="page-header">
    <h1>CAMT <small>Software Component Based Software Development</small></h1>
</div>
<ul class="menu">
    <li><a href="#/home">Home</a></li>
    <li><a href="#/history">History</a></li>
    <li><a href="#/activity">Activity</a></li>
    <li><a href="#/gallery">Gallery</a></li>
    <li><a href="#/map">Map</a></li>
    <li><a href="#/contact">Contact</a></li>
</ul>

<div ng-view></div>



<!-- In production use:
<script src="//ajax.googleapis.com/ajax/libs/angularjs/x.x.x/angular.min.js"></script>
-->
<script src="components/version/version.js"></script>
<script src="components/version/version-directive.js"></script>
<script src="components/version/interpolate-filter.js"></script>
</body>
</html>
