define(["app"], function(app) {
    return app.controller('baseCtrl', function($rootScope, $scope) {
        $scope.amshow = false;
        $scope.bmshow = false;
        $scope.cmshow = false;
        $scope.amv = "政府|非盈利机构";
        $scope.pick = function (n) {
            $scope.amv = n;
            $scope.amshow = false;
        };
        $scope.bmv = "国有企业";
        $scope.pick1 = function (n) {
            $scope.bmv = n;
            $scope.bmshow = false;
        };
        $scope.cmv = "法人";
        $scope.pick2 = function (n) {
            $scope.cmv = n;
            $scope.cmshow = false;
        }

    });
});