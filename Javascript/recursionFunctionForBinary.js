/*
재귀함수를 이용한 이진수 출력
10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단 재귀함수를 이용 
해서 출력해야 합니다.
- 입력설명
첫 번째 줄에 10진수 N(1<=N<=1,000)이 주어집니다. 
- 출력설명
첫 번째 줄에 이진수를 출력하세요. 
- 입력예제 1
11
- 출력예제 1
1011
*/

const solution = (num) => {
  let result = '';
  const recursion = (level) => {
    if (level === 0) return;
    else {
      recursion(Math.floor(level / 2));
      result += (level % 2).toString();
    }
  };
  recursion(num);
  return result;
};

console.log(solution(11));
console.log(solution(2));
