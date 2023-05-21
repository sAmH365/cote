class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] strings1 = new String[arr1.length];
        String[] strings2 = new String[arr2.length];
        String[] answer = new String[n];
        String[][] tmp = new String[n][n];

        for (int i=0; i<arr1.length;i++) {
            strings1[i] = Integer.toBinaryString(arr1[i]);
            if (strings1[i].length() < n) {
                int count = strings1[i].length();
                while (count < n) {
                   strings1[i] = "0"+strings1[i];
                    count++;
                }
            }
        }
        
        for (int i=0; i<arr2.length;i++) {
            strings2[i] = Integer.toBinaryString(arr2[i]);
            if (strings2[i].length() < n) {
                int count = strings2[i].length();
                while (count < n) {
                   strings2[i] = "0"+strings2[i];
                    count++;
                }
            }
        }
        
        for (int i=0; i < strings1.length; i++) {
            for (int j=0; j<strings1[i].length(); j++) {
                if (strings1[i].charAt(j) == '1' 
                    || strings2[i].charAt(j) == '1') {
                    tmp[i][j] = "#";
                } else {
                    tmp[i][j] = " ";
                }
            }
        }
        
        for (int i=0; i<tmp.length;i++) {
            for (int j=0; j<tmp[i].length;j++) {
                System.out.print(tmp[i][j]);
            }
            System.out.println();
        }

        for (int i=0; i<tmp.length; i++) {
            for (int j=0; j<tmp[i].length;j++) {
                if (answer[i] == null) {
                    answer[i] = "";
                } 
                answer[i] += tmp[i][j];
            }
        }
        
        return answer;
    }
}