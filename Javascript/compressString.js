/*
문자열 압축
알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 
문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시
오. 단 반복횟수가 1인 경우 생략합니다.
- 입력설명
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
- 출력설명
첫 줄에 압축된 문자열을 출력한다.
- 입력예제 1 
KKHSSSSSSSE
- 출력예제 1
K2HS7
*/

const solution = (str) => {
    let result = ''
    let counter = 1
    str = str + ' ' // 문자열 끝에 빈 문자열 추가 (마지막 인덱스 비교용)

    for (let i = 0; i < str.length - 1; i++) {
        if (str[i] === str[i + 1]) {
            counter++
        } else {
            result += str[i]
            if (counter > 1) {
                result += counter.toString()
                counter = 1
            }
        }
    }
    return result;
}

const str = 'KKHSSSSSSSE'
console.log(solution(str))