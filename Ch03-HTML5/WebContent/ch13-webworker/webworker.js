/**
 * 
 */
//포그라운드에서 데이터가 도착하면 onmessage가 동작
onmessage = function(event){
	
	var result = "";
	
	var dan = event.data;
	
	for(var i=1; i<100000;i++){
		result += dan + '*' + i + '=' + dan*i + '<br>';
		
		postMessage(result);
	}
	
};