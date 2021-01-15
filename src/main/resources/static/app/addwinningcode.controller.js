var app = angular.module('app', []);

app.controller('postcontroller', function($scope, $http, $location) {
    $scope.submitForm = function(){
        var url = "/codes/addwinner/" + $scope.codeLength;

        var config = {
            headers : {
                'Accept': 'text/plain'
            }
        }
        var data = {
            codeLength: $scope.codeLength,
            numberOfWinningCodes: $scope.numberOfWinningCodes
        };

        for(var i = 0; i < $scope.numberOfWinningCodes; i++) {
            $http.post(url, data, config).then(function (response) {
                $scope.postResultMessage = response.data;
            }, function error(response) {
                $scope.postResultMessage = "Error with status: " +  response.statusText;
            });
        }

        $scope.codeLength = "";
        $scope.numberOfWinningCodes = "";
    }
});