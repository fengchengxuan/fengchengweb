define(["app"], function(app) {
    return app.controller('viplrCtrl', function($rootScope, $scope,$http) {
        $rootScope.login = function(name, password) {
            $scope.user ={
                USER_NAME:name,
                PASSWORD:password
            };
            // console.log(user);
            $http.post('login/' ,{'user':JSON.stringify($scope.user)}).success(function(data) {

            });

        };
    });
});
