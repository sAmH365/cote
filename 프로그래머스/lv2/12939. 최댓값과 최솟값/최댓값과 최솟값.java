import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] inputs = s.split(" ");
        List<Integer> collect = Arrays.stream(inputs)
                .map(i -> Integer.parseInt(i)).collect(Collectors.toList());

        int i1 = collect.stream().mapToInt(i -> i).max().orElseThrow(NoSuchElementException::new);
        
        int i2 = collect.stream().mapToInt(i -> i).min().orElseThrow(NoSuchElementException::new);
        
        sb.append(i2+" ");
        sb.append(i1);
        
        
        return sb.toString();
    }
}