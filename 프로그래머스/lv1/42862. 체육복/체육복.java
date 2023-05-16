import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n + 1];
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int i=1; i<students.length;i++) students[i] = i;
        
        System.out.print("학생 초기화 : ");
        for (int student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
        
        // 도난 당한 학생들 지움
        for (int i=1; i< students.length; i++) {
            for (int j=0; j<lost.length; j++) {
                if (students[i]==lost[j]) {
                    students[i] = 0;
                }
            }
        }
        
        System.out.print("도난 당한 학생들 지움 : ");
        for (int student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
        
        // 도난 당했는데 여벌이 있으면 복구
        for (int i=1; i<students.length; i++) {
            for (int j=0; j<reserve.length; j++) {
                if (students[i] == 0 && i == reserve[j]) {
                    students[reserve[j]] = reserve[j];
                    reserve[j] = 0;
                    break;
                }
            }
        }
        System.out.print("도난 당했는데 여벌이 있으면 복구 : ");
        for (int student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
        
        System.out.print("남은 여벌옷 학생 : ");
        for (int re : reserve) {
            System.out.print(re + " ");
        }
        System.out.println();
        
        // 도난 학생 인덱스 기준 양옆이 여벌옷 있으면 복구
        for (int i=1; i<students.length; i++) {
            if ((i != 1 && i <= (students.length - 2)) && students[i] == 0) {
                for (int j=0; j < reserve.length; j++) {
                    if (reserve[j] != 0 && (students[i-1] == reserve[j] || students[i+1] == reserve[j])) {
                        students[i] = i;
                        reserve[j] = 0;
                        break;
                    }
                }
            } else if (i == 1) {
                for (int j=0; j < reserve.length; j++) {
                    if (reserve[j] != 0 && students[2] == reserve[j]) {
                        students[i] = i;
                        reserve[j] = 0;
                        break;
                    }
                }
            } else if ( i == (students.length - 1)) {
                for (int j=0; j < reserve.length; j++) {
                    if (reserve[j] != 0 && students[students.length - 2] == reserve[j]) {
                        students[i] = i;
                        reserve[j] = 0;
                        break;
                    }
                }
            }
        }
        
                
        System.out.print("도난 학생 인덱스 기준 양옆이 여벌옷 있으면 복구 : ");
        for (int student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
        
        
        for (int stu : students) {
            if (stu != 0) answer++;
        }
        
        return answer;
    }
}