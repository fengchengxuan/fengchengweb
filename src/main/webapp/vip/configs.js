require.config({
    paths: {
        // angular
        "angular": "./common/js/angular-1.5.7",
        // angular-ui
        "ui-router": "./common/js/ui-router",
        // angularAMD
        "angularAMD": "./common/js/angularAMD",
        "ngload": "./common/js/ngload",
        'app':'./app',
    },
    shim: {
        // angular
        "angular": { exports: "angular" },
        // ui-router
        "ui-router": ["angular"],
        //// angularAMD
        "angularAMD": ["angular"],
        "ngload": ["angularAMD"]
    },
    deps: ['app'],
});
