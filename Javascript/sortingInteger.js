/*
[프로그래머스] 정수 내림차순으로 배치하기
문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
입출력 예
n	return
118372	873211
*/

function solution(n) {
    let num = n
    let tempArr = []
    let result = 0

    while (num >= 1) {
        let i = 0
        for (i = 0; i < tempArr.length; i++) {
            if (tempArr[i] <= num % 10) {
                break
            }
        }
        tempArr.splice(i, 0, num % 10)
        num = Math.floor(num / 10)
    }
    let pow = 1
    for (let i = tempArr.length - 1; i >= 0; i--) {
        result += tempArr[i] * pow
        pow *= 10
    }
    return result
}