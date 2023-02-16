/*
대문자로 통일
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자로 모두 통일하여 문자열을 출력 하는 프로그램을 작성하세요.
- 입력설명
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다. 
- 출력설명
첫 줄에 대문자로 통일된 문자열이 출력된다. 
- 입력예제 1
ItisTimeToStudy 
- 출력예제 1
ITISTIMETOSTUDY
*/

const solution = (str) => {
  let result = "";
  if (str.length > 100) throw new Error("문자열의 길이는 100을 넘지 않습니다.");
  for (s of str) {
    let asciiCode = s.charCodeAt();

    if (s >= "a" && s <= "z") {
      result += String.fromCharCode(
        asciiCode - (asciiCode - s.toUpperCase().charCodeAt())
      );
    } else result += s;
  }
  return result;
};

console.log(solution("ItisTimeToStudy"));
console.log(solution("KoreaTimeGood"));
console.log(solution("javascript"));
