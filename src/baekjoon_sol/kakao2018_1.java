package baekjoon_sol;

import java.util.ArrayList;
import java.util.HashMap;

public class kakao2018_1 {

	public static void main(String[] args) {

		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
		
		String[] answer = {};
		ArrayList<String> answerList = new ArrayList<>();
		HashMap<String, String> id_map = new HashMap<>();
		
		// 처음부터 끝까지 먼저 Map에 전부 담고 다시 돌려야함 -> change때문에
		for(int i = 0; i<record.length; i++) {
			String[] info = record[i].split(" ");
			
			if(info.length > 2) {
				String id = info[1];
				String name = info[2];

				id_map.put(id, name);
			}
		}
		
		// 출력을 리스트에 넣기
		for(int i = 0; i<record.length; i++) {
			String[] r_sp = record[i].split(" ");
			
			if(r_sp[0].equals("Enter")) {
				answerList.add(id_map.get(r_sp[1]) + "님이 들어왔습니다.");
			} else if (r_sp[0].equals("Leave")) {
				answerList.add(id_map.get(r_sp[1]) + "님이 나갔습니다.");
			}
		}
		
		answer = answerList.toArray(new String[answerList.size()]);
		        
        for(String a : answer) {
        	System.out.println(a);
    	}
	}
}
