/* 
[프로그래머스] 없는 숫자 더하기
문제 설명
0부터 9까지의 숫자 중 일부가 들어있는 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 수 ≤ 9
numbers의 모든 수는 서로 다릅니다.
입출력 예
numbers	result
[1,2,3,4,6,7,8,0]	14
[5,8,4,0,6,7,9]	6
입출력 예 설명
입출력 예 #1

5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.
입출력 예 #2

1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.
*/

const solution = (numbers) => {
    const answer = [];
    // 0 ~9 까지의 숫자 배열 저장
    const numberList = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
    // 입력 받은 숫자 오름차순 정렬
    numbers.sort((a, b) => a - b);
    // 없는 숫자 찾고 더하기 
    const numberListSize = numberList.length;

    let nIndex = 0;
    for (let i = 0; i < numberListSize; i++) {
        if (numbers[nIndex] !== numberList[i]) {
            answer.push(numberList[i]);
        } else {
            nIndex++;
        }
    }

    return answer.reduce((acc, n) => {
        return acc + n;
    })
}