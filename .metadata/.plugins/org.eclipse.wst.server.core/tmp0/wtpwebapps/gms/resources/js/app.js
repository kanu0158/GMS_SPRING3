"use strict";
/*만약 app이 있다면 있는걸로 대체하고 없으면 새로 만들어라*/
var app = app || {};
app = {
		init : x =>{//화면과 기능을 만듬
			alert('step 1');
			app.session.context(x);
			app.onCreate();
			/*
			let a = x;
			$('#loginBtn').on('click',function(){
				alert('컨텍스트는... :'+a);
			});*/
		},
		onCreate : ()=>{//기능담당
			alert('step 3');
			app.setContentView();
		},
		setContentView : ()=>{//화면담당
			alert('step 4 app.session.path(js) :'+app.session.path('js'));
		}
};
app.session = {
		context : x=>{
			alert('step 2 x:'+x);
			sessionStorage.setItem('context',x);//내장된 객체와 메소드들
			sessionStorage.setItem('js',x+'/resources/js');
			sessionStorage.setItem('css',x+'/resources/css');
			sessionStorage.setItem('img',x+'/resources/img');
		},
		path : x=>{
			return sessionStorage.getItem(x);
		}
};
