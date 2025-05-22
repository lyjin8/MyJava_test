package ly.map.hashMap;

import java.util.HashMap;

/**
 * 遍历集合
 */
public class HashMapDEmo02 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("秦始皇","嬴政");
        hashMap.put("汉高祖","刘邦");
        hashMap.put("汉武帝","刘彻");
        hashMap.put("隋文帝","刘彻");
        //根据key获取value
        for (String key : hashMap.keySet()){
            System.out.println(key+"-->"+hashMap.get(key));
        }
    }
}
