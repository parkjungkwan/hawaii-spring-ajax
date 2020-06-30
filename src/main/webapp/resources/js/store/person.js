var person = person || {}
person = (function(){
	let _
	let init = function(){
		 _ = sessionStorage.getItem('context')
	}
	let join = function(x){
		alert(`Context >>`+x.userid)
		
		$.ajax({
			url : _+`/person/users`,
			type: 'POST',
			data: JSON.stringify(x),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				alert(res)
			},
			error: function(err){
				alert(err)
			}
		})
	}
	let login = function(){}
	let logout = function(){
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('context')
		sessionStroage.removeItem('javascript')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('image')
	}
	return {init, join, login, logout}
})()

