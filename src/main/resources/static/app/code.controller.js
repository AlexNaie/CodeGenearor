(function (){
    'use strict';

    angular
        .module('app', [])
        .controller('CodeController', CodeController);

    CodeController.$inject = ['$http'];

    function CodeController($http) {
        var vm = this;

        vm.codes = [];
        vm.getAll = getAll;

        init();

        function init(){
            getAll();
        }

        function getAll() {
            var url = "/codes/all";
            var codesPromise = $http.get(url);
            codesPromise.then(function (response) {
                vm.codes = response.data;
            })
        }
    }
})();
