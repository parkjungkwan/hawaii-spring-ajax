"use strict"
/** 파일명: 
 * EgovCommon.js
 * 설 명  전자정부 공통:JavaScript
 * 수정일 최초 생성2009.01.01
 * 작성자명: 홍길동
 * Version
 * Function
 */
var app = app || {}
app = (()=>{
	return {init}
})();
function init(x){
	$.getScript(x+'/resources/js/session.js', ()=>{
		new Session(x)
	})
}
