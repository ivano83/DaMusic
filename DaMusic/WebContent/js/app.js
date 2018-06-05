'use strict';

var app = angular.module('daMusicApp', ['ngRoute','daMusicApp.controllers','daMusicApp.services']);

app.config(function($routeProvider) {
		$routeProvider.when('/', {templateUrl: 'partial/search_form.html', controller: 'DaMusicDetailCtrl'});
		$routeProvider.when('/search', {templateUrl: 'partial/result.html', controller: 'DaMusicDetailCtrl'});
		$routeProvider.otherwise({redirectTo: '/'});
	});

app.config(function ($provide,serverLogServiceProvider) {
	//setting the loglevel to error, hence only error logs are written to server
	serverLogServiceProvider.setLogLevel('info');
	//optionally we can hide the logs on the console
	serverLogServiceProvider.hideConsoleLogs(true);
	$provide.decorator('$log', ['$delegate', 'serverLogService','$window', function ($delegate, serverLogService,$window) {

		//having a method on window so that we can force show console
		//logs even after the initial setting was to not show the console logs
		$window.forceShowConsoleLogs = function(){
			serverLogService.forceShowConsoleLogs();
		}                 
		//saving the original methods into variables
		var log = $delegate.log;
		var info = $delegate.info;
		var warn = $delegate.warn;
		var error = $delegate.error;
		var debug = $delegate.debug;

		function customLog(level, message,callback) {
			serverLogService.log(level, message.stack ? message.stack : message,callback);
		}

		//decorating the original method with our new functionality
		$delegate.log = function (message) {
			customLog('log', message,log);
		};

		//decorating the original method with our new functionality
		$delegate.warn = function (message) {
			customLog('warn', message,warn);
		};

		//decorating the original method with our new functionality
		$delegate.error = function (message) {
			customLog('error', message,error);
		};

		//decorating the original method with our new functionality
		$delegate.debug = function (message) {
			customLog('debug', message,debug);
		};

		//decorating the original method with our new functionality
		$delegate.info= function (message) {
			customLog('info', message,info);
		};

		return $delegate;
	}]);
});

app.provider('serverLogService', function () {
    this.loglevel = 'log';
    this.hideLogs = false;
    this.$get = function () {
        var configLevel = this.loglevel;
        var hideLogs = this.hideLogs;
        return {
            log: function (logLevel, message,callback) {
                var logLevelArr = ['log', 'debug', 'info', 'warn', 'error'];
                if (logLevelArr.indexOf(configLevel) <= logLevelArr.indexOf(logLevel)) {
                    //this is where a RESTful server log endpoint should go
                    alert(logLevel + ':' + message);
                    if(!hideLogs){
                        callback(message);
                    }
                }
            },
            forceShowConsoleLogs:function(){
            	hideLogs=false;
            }
        }
    };
    this.setLogLevel = function (value) {
        this.loglevel = value;
    }
    this.hideConsoleLogs = function (value) {
        this.hideLogs = value;
    };
});

