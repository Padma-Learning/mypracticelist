import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindMostFrequentCharacter {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();//Programming
        //Create Hash map to store key, value pair
        Map<Character,Integer> map=new HashMap<>();
        //Convert the string into individual characters
        for(char ch:text.toCharArray()) //P r o g r a m m i n g
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char result=text.charAt(0);
        int max=map.get(result);
        for (char ch:text.toCharArray()){
            if(map.get(ch)>max){
                max=map.get(ch);
                result=ch;
            }
        }
        System.out.println(result);
    }
}
