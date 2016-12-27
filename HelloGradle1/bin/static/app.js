var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope,$http) {
	
	$scope.message="";
	submit=function (){
		var url1 = "http://localhost:8080/hello/"+$scope.name;
		$http({
		    method: 'GET',
		    url: url1,
		  }).then(function (response) {
		   $scope.msg = response.data;
		    });
	}
});