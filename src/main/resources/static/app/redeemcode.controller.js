var app = angular.module('app', []);

app.controller('putcontroller', function($scope, $http, $location) {
    $scope.submitForm = function(){
        var url = "/codes/redeem/" + $scope.code + "/" + $scope.winning;

        var config = {
            headers : {
                'Accept': 'text/plain'
            }
        };
        var data = {
            code: $scope.code,
        };

        $http.put(url, data, config).then(function (response) {
            alert("Thank you for participating! " +
                "If the code is valid you can check if it was winning or not by clicking the \"See redeemed codes\" button!");
            $scope.postResultMessage = response.data;
        }, function error(response) {
            alert("Thank you for participating! " +
                "If the code is valid you can check if it was winning or not by clicking the \"See redeemed codes\" button!");
            $scope.postResultMessage = "Error with status: " +  response.statusText;
        });

        $scope.code = "";

    }
});