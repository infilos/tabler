require.config({
    paths: {
        // assets => /static
        'prismjs': '/static/plugins/prismjs/js/prism.pack',
    },
	shim: {
		prism: {
			exports: "Prism"
		}
	}
});

require(['prismjs', 'jquery'], function(prismjs, $){
    $(document).ready(function(){
        // $('[class^="language-"]').each(function(i, block) {
	     //    Prism.highlightElement(block);
        // });
    });
});
