function 로그인() {
	id2 = 'root';
	id = prompt('아이디 입력')
	if (id == id2) { //==
		alert('로그인 성공')
	} else {
		alert('로그인 실패')
	}
}

function 비교() {
	n1 = 100
	n2 = 200
	//두 숫자가 동일한지/동일한지 않은지 판별하여 프린트
	if (n1 == n2) {
		alert('n1과 n2가 동일합니다.')
	} else {
		alert('n1과 n2가 다릅니다.')
	}
	
	//친구의 기분 (굿, 별로, 나빠) 입력
	//나의 기분 (굿, 별로, 나빠) 입력
	//기분이 동일한지/ 동일하지 않은지 판별하여 프린트
	f1 = prompt('친구의 기분 입력 (굿/별로/나빠)');
	f2 = prompt('나의 기분 입력 (굿/별로/나빠)')
	if (f1 == f2) {
		alert('친구와 나의 기분이 동일합니다.')
	} else {
		alert('친구와 나의 기분은 다릅니다.')
	}
	
}