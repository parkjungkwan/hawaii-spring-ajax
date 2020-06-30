"use strict";
function Session(x){
	sessionStorage.setItem('context', x)
	sessionStorage.setItem('javascript', x+'/resources/js')
	sessionStorage.setItem('css', x+'/resources/css')
	sessionStorage.setItem('image', x+'/resources/img')
}