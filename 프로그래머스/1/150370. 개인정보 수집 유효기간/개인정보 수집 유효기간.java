import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class Solution {
   public int[] solution(String today, String[] terms, String[] privacies) {
         List<Integer> answer=new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<terms.length;i++){
            String s=terms[i];
            map.put(s.split(" ")[0],Integer.parseInt(s.split(" ")[1]));
        }

        for(int i=0;i<privacies.length;i++){
            String a[]= privacies[i].split(" ");

            int checkedDay=getDate(a[0])+(28*map.get(a[1]));
            int todays=getDate(today);

            if(checkedDay<=todays){
                answer.add(i+1);
            }
            //난 날짜 계산을 못하겟다,,
            //날짜를 하나의 단위로 변경하는 게 필요!!
            //시간도 동일함=>시간은 분으로
            //날짜는 일로 다 바꾸기!!작은 단위로 변경!!




        }

        return answer.stream().mapToInt(i->i).toArray();
    }

    public static int getDate(String date){
        System.out.println("date = " + date);
        int year=Integer.parseInt(date.split("\\.")[0]);
        int month=Integer.parseInt(date.split("\\.")[1]);
        int day=Integer.parseInt(date.split("\\.")[2]);

        int answer=year*12*28+month*28+day;

        return answer;
    }

}