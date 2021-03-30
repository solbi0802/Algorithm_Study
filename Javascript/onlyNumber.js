/*
[프로그래머스] 문자열 다루기 기본
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
입출력 예
    s	        return
"a234"	        false
"1234"          true
*/

// 정규 표현식 사용 
const onlyNumber = s => {
    // s의 길이와 숫자외에 다른 문자가 있는 지 확인
    return  /^([0-9]{4}|[0-9]{6})$/.test(s)
}

// 입력 받은 문자열을 자른 후 배열에 저장 후 문자열마다 타입 확인
// 테스트 실패하는 케이스 존재(87.5점)
const isNaN = str => {    
    for (const letter of str) {
      if (isNaN(parseInt(letter))) {
          return false
      }
    }
      return true
}

// 아스키 코드로 문자,숫자 판별 (100점)
const asciiDiff = str => {    
    if (str.length === 4 || str.length === 6) { 
        for (const letter of str) { 
            if (letter < "0" || letter > "9") { 
                return false 
            } 
        } return true 
    }else { 
        return false 
    } 
}