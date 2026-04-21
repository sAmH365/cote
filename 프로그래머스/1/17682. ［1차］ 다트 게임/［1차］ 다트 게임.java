class Solution {
    static String dr;
    public int solution(String dartResult) {
        int answer = 0;
        dr = dartResult;

        int[] score = new int[3];
        int i = 0;
        int p = 0;
        
        
        while (true) {
            char c = get(p);
            if (c == '1' && get(p + 1) == '0') {
                score[i] = 10;
                p++;
            } else {
                score[i] = Integer.parseInt(String.valueOf(c));
            }
            p++;
            
            char bouns = get(p);
            score[i] = resolveBouns(score[i], bouns);
            p++;
            
            if (p < dartResult.length() && !Character.isDigit(get(p)) && !isBonus(get(p))) {
                char option = get(p);
                
                if (option == '*') {
                    score[i] *= 2;
                    if (i != 0) {
                      score[i - 1] *= 2;    
                    }
                } else {
                    score[i] = -score[i];
                }
                p++;
            }
            i++;
            
            if (i == 3) {
                break;
            }
        }
        
        
        for (int s : score) {
            answer += s;
        }
        
        return answer;
    }
    
    public char get(int idx) {
        return dr.charAt(idx);
        // System.out.println("idx : " + idx);
        // return 'a';
    }
    
    public boolean isBonus(char bonus) {
        return bonus == 'S' || bonus == 'D' || bonus == 'T';
    }
    
    public int resolveBouns(int score, char bonus) {
        if (bonus == 'S') {
            return score;
        } else if (bonus == 'D') {
            return score * score;
        } else {
            return score * score * score;
        }
    }
}