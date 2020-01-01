package hash.bestalbum;

import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, List<int[]>> songMap = new HashMap<>();
        HashMap<String, Integer> genresMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            int[] song = new int[2];
            song[0] = plays[i];
            song[1] = i;

            List<int[]> songList = new LinkedList<>();
            if (songMap.containsKey(genres[i])) {
                songList = songMap.get(genres[i]);
            }
            songList.add(song);

            songMap.put(genres[i], songList);
            genresMap.put(genres[i], genresMap.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<Map.Entry<String, Integer>> genresList = new LinkedList<>(genresMap.entrySet());
        genresList.sort((o1, o2) -> (o1.getValue() - o2.getValue()) * -1);

        for (Map.Entry<String, Integer> genre : genresList) {
            List<int[]> songList = songMap.get(genre.getKey());
            songList.sort((o1, o2) -> {
                int comparision = (o1[0] - o2[0]) * -1;
                return comparision == 0 ? o1[1] - o2[1] : comparision;
            });

            for (int i = 0; i < songList.size(); i++) {
                if (i == 2) {
                    break;
                }
                answer.add(songList.get(i)[1]);
            }

        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}