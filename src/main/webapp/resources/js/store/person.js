var person = person || {}
person = (function(){
	let _, javascript, session
	let init = function(){
		 _ = sessionStorage.getItem('context'),
		 javascript = sessionStorage.getItem('javascript'),
		 session = sessionStorage.getItem('session')
	}
	let join = function(payload){
		$.ajax({
			url : _+`/person/users`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				location.href = _+`/location/person/LoginForm`
			},
			error: function(err){
				location.href = _+`/location/person/JoinForm`
			}
		})
	}
	let login = function(payload){
		$.ajax({
			url : _+`/person/users/${payload.userid}`,
			type: 'POST',
			data: JSON.stringify(payload),
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
	let logout = function(){
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('context')
		sessionStroage.removeItem('javascript')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('image')
		location.href = _+`/`
	}
	let remove = function(){
		$.ajax()
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('context')
		sessionStroage.removeItem('javascript')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('image')
		location.href = _+`/`
	}
	return {init, join, login, logout, remove}
})()

