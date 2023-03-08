/*
가장 긴 문자열
N개의 문자열이 입력되면 그 중 가장 긴 문자열을 출력하는 프로그램을 작성하세요. 
- 입력설명
첫 줄에 자연수 N이 주어진다.(3<=N<=30)
두 번째 줄부터 N개의 문자열이 주어진다. 문자열의 길이는 100을 넘지 않습니다. 
각 문자열의 길이는 서로 다릅니다.

- 출력설명
첫 줄에 가장 긴 문자열을 출력한다. 

- 입력예제 1
5
teacher 
time 
student 
beautiful 
good
- 출력예제 1 
beautiful
*/

const solution = (arr) => {
  let result = "";
  if (arr.length < 3 || arr.length > 30)
    throw new Error("배열의 길이는 3보다 크고 30을 넘지 않아야 합니다.");
  for (let i = 0; i < arr.length; i++) {
    let maxLength = arr[0].length;
    if (arr[i].length > 100)
      throw new Error("문자열의 길이는 100을 넘지 않아야 합니다.");
    if (arr[i].length > maxLength) {
      result = arr[i];
      maxLength = arr[i].length;
    }
  }
  return result;
};

const arr = ["teacher", "time", "student", "beautiful", "good"];
console.log(solution(arr));
const arr2 = [
  "city",
  "fin",
  "sayhelloworld",
  "wonderland",
  "goodpeoplegoodtime",
];
console.log(solution(arr2));
