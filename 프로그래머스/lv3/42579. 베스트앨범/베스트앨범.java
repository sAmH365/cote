import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        ArrayList<String> keyRank = new ArrayList();
        
        // key: 장르 , value: 재생횟수
        HashMap<String, Integer> map = new HashMap();
        for (int i=0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        // for (String key : map.keySet()) {   
        //     System.out.println("key : " + key + "   value  : " + map.get(key));
        // }
        
        while(map.size() != 0) {
            int max = -1;
            String max_key = "";
            for (String key : map.keySet()) {
                int tmp = map.get(key);
                if (tmp > max) {
                    max = tmp;
                    max_key = key;
                }
            }
            keyRank.add(max_key);
            map.remove(max_key);
        }
        
        for (String key : keyRank) {   
            System.out.println("key : " + key);
        }
        
        ArrayList<Music> result = new ArrayList();
        for (String genre : keyRank) {
            ArrayList<Music> song = new ArrayList();
            for (int i=0; i< genres.length; i++) {
                if (genres[i].equals(genre)) {
                    song.add(new Music(i, genre, plays[i]));
                }
            }
            Collections.sort(song, (o1, o2) -> o2.play - o1.play);
            result.add(song.get(0));
            if (song.size() != 1) {
                result.add(song.get(1));
            }
        }
        
        for (Music music : result) {
            System.out.print(music.index + " ");
        }
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i).index;            

        }
        
        return answer;
    }
    
    static class Music {
        int index;
        String genre;
        int play;
        
        public Music(int index, String genre, int play) {
            this.index = index;
            this.genre = genre;
            this.play = play;
        }
    }
}