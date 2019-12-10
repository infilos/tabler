require.config({
    shim: {
        'fullcalendar': ['moment', 'jquery'],
    },
    paths: {
        // assets => /static
        'fullcalendar': '/static/plugins/fullcalendar/js/fullcalendar.min',
        'moment': '/static/plugins/fullcalendar/js/moment.min',
    }
});
