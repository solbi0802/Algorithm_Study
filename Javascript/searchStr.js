/*
문자 찾기
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
문자열의 길이는 100을 넘지 않습니다. 

- 입력설명
첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다. 
- 출력설명
첫 줄에 해당 문자의 개수를 출력한다. 
-  입력예제 1
COMPUTERPROGRAMMING 
R
- 출력예제 1 
3
*/
const solution = (str, chracter) => {
  let count = 0;
  if (str.length > 100) return "최대 길이를 초과했습니다.";
  for (let s of str) {
    // 대소문자 구분해야하는 지 명확하지 않아서 따로 변환하지 않았음.
    if (s === chracter) count++;
  }
  return count;
};

console.log(solution("COMPUTERPROGRAMMING", "R"));
console.log(solution("APPLE_BANANA", "A"));
console.log(solution("TYPESCRIPT", "y"));
