let app = angular.module("ITSIWeb", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "/pages/publica.html",
        controller : "publicCtrl"
    }) 
});

app.controller("publicCtrl", publicCtrl);

function publicCtrl(){
    new App();

    $(function () {
        $('.tlt').textillate();
    // $('#description h3').textillate();
    })
}