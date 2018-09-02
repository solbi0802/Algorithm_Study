package test;

public class Works {
	public int solution(int no, int[] works) {
		int result = 0;
		int i, j = 0;
		int max = 0;
		int index = 0;
		
		for(i=0; i < no; i++) {
			for(j=0; j <works.length; j++) {
				if(works[j] >= max) {
					max = works[j];
					index = j;
				}
			}
			max = 0;
			works[index] = works[index]-1;
		}
		
		for(i=0; i < works.length; i++) {
			System.out.println(works[i]);
			result += (works[i] * works[i]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Works w = new Works();
		int[] test = {4,3,3};
		System.out.println(w.solution(4, test));
	}
}
