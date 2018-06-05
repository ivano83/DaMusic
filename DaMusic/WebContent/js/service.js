'use strict';


var services = angular.module("daMusicApp.services", ["ngResource"])
    
services.service("releaseService", function($http){
	
	this.getRelease = function(relName) {

	    var url = "http://localhost:8080/DaMusicWs/damusic/release/"+relName;

	    return $http({
	        method: 'GET',
	        url: url
	    }).then(function successCallback(response) {
	        // this callback will be called asynchronously
	        // when the response is available
	    	console.log(response);
	        return response.data;
	    }, function errorCallback(response) {
	        // called asynchronously if an error occurs
	        // or server returns response with an error status.
	    	console.log("errorCallback: "+ response);  
	        return response;
	    });
	};
});

