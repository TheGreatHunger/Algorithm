package brute_force;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=java
 */
public class MinRectangle {
	public static void main(String[] args) {
		System.out.print(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
	}

	public static int solution(int[][] sizes) {
		int width = 0;
		int height = 0;
		int len = sizes.length;
		for (int i = 0; i < len; i++) {
			width = Integer.max(width, Integer.max(sizes[i][0], sizes[i][1]));
			height = Integer.max(height, Integer.min(sizes[i][0], sizes[i][1]));
		}

		return width * height;
	}
}
