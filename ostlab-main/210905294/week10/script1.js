var myApp = angular.module("myModule",[]);
var myController=function($scope,$routeParams) {
$scope.message="AngularJS";
}
myApp.controller("myController", ['$scope',myController]);