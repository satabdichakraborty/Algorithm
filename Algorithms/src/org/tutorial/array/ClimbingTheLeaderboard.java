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
