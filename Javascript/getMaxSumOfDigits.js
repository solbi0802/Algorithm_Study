/*
자릿수의 합
N개의 자연수가 입력되면 각 자연수의 자릿수의 합을 구하고, 그 합이 최대인 자연수를 출력 
하는 프로그램을 작성하세요. 자릿수의 합이 같은 경우 원래 숫자가 큰 숫자를 답으로 합니다. 
만약 235 와 1234가 동시에 답이 될 수 있다면 1234를 답으로 출력해야 합니다.
- 입력설명
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다. 
각 자연수의 크기는 10,000,000를 넘지 않는다.
- 출력설명
자릿수의 합이 최대인 자연수를 출력한다. 
- 입력예제 1
128 460 603 40 521 137 123 
- 출력예제 1
137
*/

const solution = (arr) => {
    let answer = 0;
    let max = Number.MIN_SAFE_INTEGER;


    for (const num of arr) {
        let sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp = Math.floor(temp / 10);
        }
        if (sum > max) {
            max = sum;
            answer = num;
        } else if (sum === max && num > answer){
            answer = num;
        }
    }
    return answer;
}

const arr = [128, 460, 603, 40, 521, 137, 123];
console.log(solution(arr));
const arr2 = [908, 482, 305, 899, 5461, 927, 998];
console.log(solution(arr2));