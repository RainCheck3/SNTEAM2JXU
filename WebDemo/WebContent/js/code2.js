var app = angular.module('sapientApp', []);
app.controller('sapientController', function($scope) {
	$scope.fname="Jiaju";
	$scope.lname="Xu";
	$scope.fullName = function() {
		return $scope.fname + ' ' + $scope.lname;
	};
});