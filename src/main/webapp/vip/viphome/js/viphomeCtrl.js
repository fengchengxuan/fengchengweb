define(["app"], function(app) {
    return app.controller('viphomeCtrl', function($rootScope, $scope,$location) {
        $location.url('/home');
    });
});