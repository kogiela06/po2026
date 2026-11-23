package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public String firstHalf(String str){
        if(str==null){
            return null;

        }
        return str.substring(0,str.length()/2);
    }
    public int[] fizzArray(int n) {
        int[] result=new int[n];
        if (n == 0){
            return new int[0];
        }
        for (int i = 0; i < n; i++){
            result[i]=i;
        }
        return result;
    }
    public int diff21(int n) {
        if (n>21){
            return 2*(n-21);
        }
        return 21 - n;

    }
    public Map<String, String> mapAB(Map<String, String> map) {
        Map<String, String> AB = new HashMap<>();

        if (map.containsKey("a") && map.containsKey("b")){
            map.put("ab",map.get("a")+map.get("b"));
        }
        return map;
    }
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

}
