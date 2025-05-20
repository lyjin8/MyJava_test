package ly.JDK8.Stream.test;

import java.util.stream.Stream;

/**
 *    1. 第一个队伍只要名字为3个字的成员姓名；//filter
 *    2. 第一个队伍筛选之后只要前3个人；//limit
 *    3. 第二个队伍只要姓张的成员姓名；//filter
 *    4. 第二个队伍筛选之后不要前2个人；//skip
 *    5. 将两个队伍合并为一个队伍；//concat
 *    6. 打印整个队伍的姓名信息。//forEach
 */

public class StreamExam {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三", "李四", "王五", "张翼德", "孙悟空", "关云长", "孙仲谋", "周公瑾");
        Stream<String> stream2 = Stream.of("张三", "李四", "王五", "马六","张小明","张小红");
        Stream<String> firstTeam = stream1.filter(s -> s.length() == 3).limit(3);
        Stream<String> secondTeam = stream2.filter(s -> s.startsWith("张")).skip(2);
        Stream.concat(firstTeam,secondTeam).forEach(System.out::println);
    }
}
