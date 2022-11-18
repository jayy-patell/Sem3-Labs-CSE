var myApp = angular.module("myModule",[]);
var myController=function($scope,$routeParams) {
$scope.message="CSE Branch, MIT MANIPAL";
}
myApp.controller("myController", ['$scope',myController]);