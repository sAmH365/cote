import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList();

        Map<String, List<Music>> genreMap = new HashMap();
        for (int i = 0; i < genres.length; i++) {
            String key = genres[i];
            List<Music> genreList = genreMap.get(key);
            if (genreList == null) genreList = new ArrayList();
            
            genreList.add(new Music(key, i, plays[i]));
            genreMap.put(key, genreList);
        }
        
        // 장르별 재생횟수총합 구하기
        Map<String, Integer> totalCountMap = new HashMap();
        for (String key : genreMap.keySet()) {
            List<Music> musics = genreMap.get(key);
            int count = 0;
            for (Music m : musics) {
                count += m.getPlayCount();
            }
            totalCountMap.put(key, count);
        }
        
        // 많이 재생된 장르 구하기
        List<String> keySet = new ArrayList(totalCountMap.keySet());
        keySet.sort((o1, o2) -> totalCountMap.get(o2).compareTo(totalCountMap.get(o1)));
        
        // 해당 장르 내에서 플레이 횟수 내림차순 정렬
        // 두곡 수록 (한곡 만 있을경우 한개만 수록)
        for (String k : keySet) {
            List<Music> musics = genreMap.get(k);
            
            musics.sort((o1, o2) -> o2.getPlayCount() - o1.getPlayCount());
            
            if (musics.size() == 1) {
                answer.add(musics.get(0).getIdx());
            } else {
                answer.add(musics.get(0).getIdx());
                answer.add(musics.get(1).getIdx());
            }
        }
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
    
    class Music {
        private String genre;
        private int idx;
        private int playCount;
        
        public Music(String genre, int idx, int playCount) {
            this.genre = genre;
            this.idx = idx;
            this.playCount = playCount;
        }
        
        public String toString() {
            return String.format("genre: %s, idx: %d, cnt: %d", genre, idx, playCount);
        }
        
        public String getGenre() {
            return genre;
        }
        
        public int getIdx() {
            return idx;
        }
        
        public int getPlayCount() {
            return playCount;
        }
    }
}