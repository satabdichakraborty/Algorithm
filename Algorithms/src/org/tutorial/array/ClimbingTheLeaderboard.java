package org.tutorial.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ClimbingTheLeaderboard {

	public static void main(String[] args) {
		// [6, 5, 4, 2, 1]
		int[] scores = { 100, 90, 90, 80, 75, 60 };
		int[] alice = { 50, 65, 77, 90, 102 };
        // [6, 4, 2, 1]
		int[] scores1 = { 100, 100, 50, 40, 40, 20, 10 };
		int[] alice1 = { 5, 25, 50, 120 };
		
		int[] scores2 = {999997617, 999994997, 999990955, 999985183, 999977480, 999974636, 999969250, 999963747, 999961024, 999960782, 999960569, 999958677, 999956429, 999947978, 999945192, 999938459, 999935546, 999929600, 999928261, 999924219, 999923103, 999922438, 999918822, 999905400, 999905227, 999904718, 999904666, 999899263, 999895907, 999876013, 999872842, 999867457, 999867305, 999867204, 999863632, 999853718, 999853639, 999846913, 999845603, 999842881};
		int[] alice2 = { 5, 25, 50, 120 };

		int[] result = climbingLeaderboard(scores, alice);

	}

	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		List<Integer> result = new ArrayList<>();
		List<Integer> alScore = new ArrayList<>();
		Map<Integer, Integer> leaderBoard = new TreeMap();
		Set<Integer> s = new TreeSet<>();

		for (int i = 0; i < scores.length; i++) {
			s.add(scores[i]);
		}

		int rank = s.size();

		for (Integer i : s) {
			leaderBoard.put(i, rank--);
		}

		for (int i = 0; i < alice.length; i++) {
			alScore.add(alice[i]);
		}
		System.out.println("leaderBoard = " + leaderBoard);
		System.out.println("Alice Scores = " + alScore);

		int prevScore = 0;
		for (int score : leaderBoard.keySet()) {
			for (int j = 0; j < alScore.size(); j++) {
				int aScore = alScore.get(j);
				int r = leaderBoard.get(score);
				// Only if the score if less than the least Leader board score :// Rank = max leader board + 1
				if (aScore < score) {					
					result.add(r + 1);
					alScore.remove(j);
					prevScore = score;
					break;
					// Only if the score if equals to a least Leader board score // : Rank = Leader board rank
				} else if (score == aScore) {					
					result.add(r);
					alScore.remove(j);
					prevScore = score;
					break;
				} else {
					prevScore = score;
					if(r==1){
						result.add(r);
					}
					break;
				}
				//prevScore = score;
			}
		}

		System.out.println("Alice's status : " + result);

		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}
