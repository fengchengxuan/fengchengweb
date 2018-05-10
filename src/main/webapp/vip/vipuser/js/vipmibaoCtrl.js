define(["app"], function(app) {
    return app.controller('vipmibaoCtrl', function($rootScope, $scope) {
        $scope.amshow = false;
        $scope.bmshow = false;
        $scope.amv = "广西峰程璇网络科技有限公司的网址是多少？";
        $scope.pick = function (n) {
            $scope.amv = n;
            $scope.amshow = false;
        };
        $scope.bmv = "您的出生日期是多少？";
        $scope.pick1 = function (n) {
            $scope.bmv = n;
            $scope.bmshow = false;
        };
    });
});