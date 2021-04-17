/*
A를 #으로
대문자로 이루어진 영어단어가 입력되면 단어에 포함된 'A'를 모두 '#'으로 바꾸어 출력하는
프로그램을 작성하세요.
- 입력설명
첫 번째 줄에 문자열이 입력된다.
- 출력설명
첫 번째 줄에 바뀐 단어를 출력한다.
- 입력예제 1
BANANA
- 출력예제 1
B#N#N#
*/

//정규 표현식 사용
const aToHash = (str) => {
    return str.replace(/A/g, '#')
}

console.log(aToHash('BANANA'))
console.log(aToHash('AIRPLAIN'))
console.log(aToHash('APPLE'))

//반복문 사용
const aToHash2 = (str) => {
    let result = ''
    for (let subStr of str) {
        if (subStr === 'A') {
            result += '#'
        } else {
            result += subStr
        }
    }
    return result
}

console.log(aToHash2('BANANA'))
console.log(aToHash2('AIRPLAIN'))
console.log(aToHash2('APPLE'))
