var myApp = angular.module("myModule",[]);
var myController = function($scope,$routeParams) {
var employee = {
firstName: "Rakesh",
lastName : "Pawar",
gender: "Male"};
$scope.employee = employee;
}
myApp.controller("myController",['$scope',myController]);