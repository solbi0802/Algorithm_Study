/*
재귀함수
자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요. 

- 입력설명
첫 번째 줄은 정수 N(3<=N<=10)이 입력된다. 
- 출력설명
첫째 줄에 출력한다. 

- 입력예제 1
3
- 출력예제 1
1 2 3
*/

const solution = (num) => {
  const result = [];
  const recursion = (level) => {
    if (level === 0) return;
    else {
      recursion(level - 1);
      result.push(level);
    }
  };
  recursion(num);
  return result.join(' ');
};

console.log(solution(3));
