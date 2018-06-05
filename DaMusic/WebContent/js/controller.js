'use strict';

var ctrl = angular.module("daMusicApp.controllers", ["daMusicApp.services"]);

ctrl.controller("DaMusicDetailCtrl", ['releaseService','$scope','$location', function(releaseService, $scope, $location){

	$scope.myArray = [{}];
	
	$scope.retrieveRelease = function (relName) {
		console.log('into retrieveRelease...'); 
	    releaseService.getRelease(relName).then(function(data) {
	    	console.log(data);
	        $scope.result = angular.toJson(data);
	        $scope.result2 = data;
	        console.log('data retrieveRelease: '+$scope.result); 
	        //$location.path('/search');
	        $scope.showResult();
	        $scope.myArray = [{"FullName": "Lucy Ann Johnson",
	            "WentMissing": "1961",
	            "Age:": "20",
	            "Description": "Short brunette, was last seen wearing a green dress."}];
	        
	    }).catch(function (data) {
			console.log("error: "+ data);  
			//console.log('error...');                      
			//$log.info('info failed');
		});
	    console.log('end retrieveRelease...'); 
	}
	
	$scope.showResult = function () {
		console.log('into showResult...');
		return $scope.result
	}
	
	$scope.showResult2 = function () {
		console.log('into showResult2...');
		return $scope.result2
	}
	
	$scope.reloadData = function() {
       console.log("reloading");
       $scope.retrieveRelease();
     };

     
	
	/*$scope.getRelease = function(relName, $scope) {
		console.log('success...');  
		
		$http.get("http://localhost:8080/DaMusicWs/damusic/release/"+relName) 
		.then(function (response) {
			console.log(response);  
			console.log(response.data);  
			$scope.result.content = angular.toJson(response.data); 
		})
		.catch(function (response) {
			console.log("error: "+ response);  
			//console.log('error...');                      
			//$log.info('info failed');
		});
	};
	*/
	
//	$scope.result = {name: "ciaooo"};
//	this.utente = {nome: "Mario", cognome: "Rossi"}; 
//    this.saluta = function() {
//        return $scope.result.name + " " + this.utente.nome
//    };   
}])
;