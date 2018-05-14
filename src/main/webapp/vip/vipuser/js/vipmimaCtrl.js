define(["app"], function(app) {
    return app.controller('vipmimaCtrl', function($rootScope, $scope) {
        $scope.pick = function() {

        };
        function pick(v) {
            document.getElementById('am').value=v;
            hide('HMF-1');
        }
        function pick1(v) {
            document.getElementById('bm').value=v;
            hide('HMF-2');
        }
        function pick2(v) {
            document.getElementById('cm').value=v;
            hide('HMF-3');
        }
    });
});