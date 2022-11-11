package AlgorithmRabinaKarpa;

import java.util.Arrays;

public class Main {

    public static int[] search (String source, String pattern){
        if (source.length() < pattern.length()){
            return null;
        }
        int[] found = new int[3];
        int index = 0;
        int pattern_hash = 0;
        int asterik_position = 0;
        for (int i = 0; i < pattern.length(); i++){
            if (pattern.charAt(i) != '*'){
                pattern_hash += pattern.charAt(i);
            } else {
                asterik_position = i;
            }
        }
        int windowHash = 0;
        for (int start = 0; start < source.length() - pattern.length() + 1; start++){

            if (start == 0){
                for (int j = 0; j < pattern.length(); j++){
                    windowHash += source.charAt(j);
                }
                windowHash -= source.charAt(asterik_position);
            } else {
                windowHash -= source.charAt(start-1);
                windowHash += source.charAt(start + pattern.length() - 1);
                windowHash -= source.charAt(start + asterik_position);
            }
            if (windowHash == pattern_hash){
                for (int p = 0; p < pattern.length(); p++){
                    if (pattern.charAt(p) != '*' && source.charAt(start + p) != pattern.charAt(p)){
                        return null;
                    } else {
                        found[index] = start;
                    }
                }
                index++;
            }
            windowHash += source.charAt(start + asterik_position);
        }
        return found;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(search("Alibaba or Alibubab? I do not know!", "b*b")));
    }
}
