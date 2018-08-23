"use strict";
/*만약 app이 있다면 있는걸로 대체하고 없으면 새로 만들어라*/
var app = app || {};
app = {
		init : x =>{//화면과 기능을 만듬
			console.log('step 1');
			app.session.context(x);
			app.onCreate();
			/*let a = x;
			$('#loginBtn').on('click',function(){
				alert('컨텍스트는... :'+a);
			});*/
		},
		onCreate : ()=>{//기능담당
			console.log('step 3');
			app.setContentView();
			//뷰가만들어진 다음에
			/*$('#loginBtn').on('click',()=>{
				console.log('');
			});*/
			$('#loginBtn').click(()=>{
				location.href =app.x()+'/move/auth/member/login';
			});
			
			$('#addBtn').click(()=>{
				location.href =app.x()+'/move/auth/member/add';
			});
			$('#addFormBtn').click(()=>{
				location.href =app.x()+'/member/add';
			});
			$('#loginFormBtn').click(()=>{
				location.href =app.x()+'/member/login';
			});
			$('#logOutBtn').click(()=>{
				location.href =app.x()+'/member/logout';
			});
			
			
			
		},
		setContentView : ()=>{//화면담당
			console.log('step 4 app.session.path(js) :'+app.j());
		}
};
app.session = {
		context : x=>{
			console.log('step 2 x:'+x);
			sessionStorage.setItem('context',x);//내장된 객체와 메소드들
			sessionStorage.setItem('js',x+'/resources/js');
			sessionStorage.setItem('css',x+'/resources/css');
			sessionStorage.setItem('img',x+'/resources/img');
		},
		path : x=>{
			return sessionStorage.getItem(x);
		}
};
app.x = ()=>{
	return app.session.path('context');
};
app.j = ()=>{
	return app.session.path('js');
};
app.c = ()=>{
	return app.session.path('css');
};
app.i = ()=>{
	return app.session.path('img');
};