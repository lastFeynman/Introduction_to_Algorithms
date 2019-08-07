package part1.chapter5.section5_1;

import java.util.ArrayList;
import java.util.List;

public class HireAssistant {
    static List<Integer> hireAssistant(int[] candidates){
        List<Integer> hired = new ArrayList<>();
        int standard = 0;
        for(int i=0;i<candidates.length;i++){
            if(candidates[i] > standard){
                standard = candidates[i];
                hired.add(i);
            }
        }
        return hired;
    }

    public static void main(String[] args) {
        int[] candidates = new int[100];
        for(int i=0;i<candidates.length;i++){
            candidates[i] = (int)(Math.random()*100);
            System.out.print(candidates[i]+" ");
        }
        System.out.println();
        System.out.println(hireAssistant(candidates));
    }
}
