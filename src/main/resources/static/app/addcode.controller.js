var app = angular.module('app', []);

app.controller('postcontroller', function($scope, $http, $location) {
    $scope.submitForm = function(){
        var url = "/codes/add/" + $scope.codeLength;

        var config = {
            headers : {
                'Accept': 'text/plain'
            }
        }
        var data = {
            codeLength: $scope.codeLength,
            numberOfCodes: $scope.numberOfCodes,
        };

        for(var i = 0; i < $scope.numberOfCodes; i++) {
            $http.post(url, data, config).then(function (response) {
                $scope.postResultMessage = response.data;
            }, function error(response) {
                $scope.postResultMessage = "Error with status: " +  response.statusText;
            });
        }

        $scope.codeLength = "";
        $scope.numberOfCodes = "";
    }
});