var input = parseInt("91");
var primelist = "";

for(var i = 0; i < input; i++){
    if(isPrime(i)){
       primelist=primelist+i+",";
    }
    if(i==input-1){
      console.log(primelist);
    }
}

function isPrime(num) {
    if(num < 2){
        return false;
    }else{
	    for(var i = 2; i < num; i++) {
	        if(num%i==0)
	            return false;
	    }
	    return true;
    } 
}