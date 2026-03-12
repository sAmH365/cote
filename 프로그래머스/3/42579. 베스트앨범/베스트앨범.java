import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        List<Integer> result = new ArrayList<>();
        
        Map<String, List<Song>> songMap = new HashMap();
        Map<String, Integer> totalSongCountMap = new HashMap();
        for (int i = 0; i < genres.length; i++) {
            String key = genres[i];
            Song song = new Song(i, plays[i]);
            
            List<Song> songs = songMap.get(key);
            if (songs == null) {
                songs = new ArrayList();
            }
            songs.add(song);
            
            totalSongCountMap.put(
                key,
                totalSongCountMap.getOrDefault(key, 0) + plays[i]
            );
            songMap.put(key, songs);
        }
        
        List<String> genreKeys = new ArrayList<>(totalSongCountMap.keySet());
        for (String g : genreKeys) {
            System.out.print(g + " ");
        }
        System.out.println();
        
        genreKeys.sort((g1, g2) -> {
         return totalSongCountMap.get(g2) - totalSongCountMap.get(g1);   
        });
        
        int tmpCount = 0;
        for(String g : genreKeys) {
            List<Song> songs = songMap.get(g);
            songs.sort((s1, s2) -> {
                return s2.getCount() - s1.getCount();
            });
            
            if (songs.size() >= 2) {
                result.add(songs.get(0).getId());
                result.add(songs.get(1).getId());    
            } else {
                result.add(songs.get(0).getId());
            }
            
        }
        
        int[] answer = new int[result.size()];
        
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
    
 class Song {
     private int id;
     private int count;
     
     public Song(int id, int count) {
         this.id = id;
         this.count = count;
     }
     
     public String toString() {
         return String.format("id : %d, count : %d", id, count);
     }
     
     public int getId() {
         return this.id;
     }
     public int getCount() {
         return this.count;
     }
 }
}