define(["angular", "angularAMD", "ui-router"], function(angular, angularAMD) {
    // module
    var app = angular.module("app", ["ui.router"]);
    // routes
    app.config(function($stateProvider, $urlRouterProvider) {
        // default
        $urlRouterProvider.otherwise("/viphome");
        // route
        $stateProvider
            .state("viphome", angularAMD.route({
                url: "/viphome",
                params: {
                    param1: null
                },
                templateUrl: "./viphome/html/viphome.html",
                controller: "viphomeCtrl",
                controllerUrl: "./viphome/js/viphomeCtrl.js",
            }))
            .state("updateUserInfo", angularAMD.route({
                url: "/updateUserInfo",
                templateUrl: "./vipuser/html/updateUserInfo.html",
                controller: "baseCtrl",
                controllerUrl: "./vipuser/js/baseCtrl.js",
            }))
            .state("vipmima", angularAMD.route({
                url: "/vipmima",
                templateUrl: "./vipuser/html/vipmima.html",
                controller: "vipmimaCtrl",
                controllerUrl: "./vipuser/js/vipmimaCtrl.js",
            }))
            .state("vipmibao", angularAMD.route({
                url: "/vipmibao",
                templateUrl: "./vipuser/html/vipmibao.html",
                controller: "vipmibaoCtrl",
                controllerUrl: "./vipuser/js/vipmibaoCtrl.js",
            }))
            .state("login", angularAMD.route({
                url: "/login",
                templateUrl: "./vipuser/html/login.html",
                controller: "viplrCtrl",
                controllerUrl: "./vipuser/js/viplrCtrl.js",
            }))
            .state("register", angularAMD.route({
                url: "/register",
                templateUrl: "./vipuser/html/register.html",
               /* controller: "viplrCtrl",
                controllerUrl: "./vipuser/js/viplrCtrl.js",*/
            }))
    });
    return angularAMD.bootstrap(app);
});