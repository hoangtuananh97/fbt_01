$(function() {
	SyntaxHighlighter.all();
});
$(window).on("load", function() {
	$('.flexslider').flexslider({
		animation : "slide",
		start : function(slider) {
			$('body').removeClass('loading');
		}
	});
});