(function (){
    'use strict';

    angular
        .module('app', [])
        .controller('CodeController', CodeController);

    CodeController.$inject = ['$http'];

    function CodeController($http) {
        var vm = this;

        vm.usedcodes = [];
        vm.getUsed = getUsed;

        init();

        function init(){
            getUsed();
        }

        function getUsed() {
            var url = "/codes/used";
            var usedcodesPromise = $http.get(url);
            usedcodesPromise.then(function (response) {
                vm.usedcodes = response.data;
            })
        }
    }
})();
