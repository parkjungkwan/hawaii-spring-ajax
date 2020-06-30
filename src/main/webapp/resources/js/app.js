"use strict"
var app = app || {}
app = (()=>{
	return {init}
})();
function init(x){
	$.getScript(x+'/resources/js/session.js', ()=>{
		$.extend(new Session(x))
	})
}
