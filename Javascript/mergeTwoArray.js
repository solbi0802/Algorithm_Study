/*
두 배열 합치기
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램
을 작성하세요.
- 입력설명
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
- 출력설명
오름차순으로 정렬된 배열을 출력합니다.
- 입력예제 1
3
1 3 5
5
2 3 6 7 9
- 출력예제 1
1 2 3 3 5 6 7 9
*/

// 시간 복잡도 nlogn
const solution = (arr1, arr2) => {
    let result = []
    result = [...arr1, ...arr2]
    return result.sort((a, b) => a - b)
}

// Two Pointers Algorithm 방식(시간 복잡도 n+m)
const solution2 = (arr1, arr2) => {
    const result = []
    const len1 = arr1.length
    const len2 = arr2.length
    let p1 = 0
    let p2 = 0
    while (p1 < len1 && p2 < len2) {
        if (arr1[p1] <= arr2[p2]) {
            result.push(arr1[p1++])
        } else {
            result.push(arr2[p2++])
        }
    }

    while (p1 < len1) {
        result.push(arr1[p1++])
    }
    while (p2 < len2) {
        result.push(arr2[p2++])
    }
    return result
}

const a = [1, 3, 5]
const b = [2, 3, 6, 7, 9]
const a2 = [0, 3, 8]
const b2 = [0, 1, 5, 6, 9]

console.log('solution1:', solution(a, b))
console.log('solution2:', solution2(a, b))
console.log('solution1-1:', solution(a2, b2))
console.log('solution2-2:', solution2(a2, b2))