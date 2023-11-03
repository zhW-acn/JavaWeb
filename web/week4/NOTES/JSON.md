JSON是存储数组或对象的字符串


```java
public class jsonTest {
    public static void main(String[] args) {
        // JSON格式字符串转对象
        String jsonString = "{'name':'acane'}";
        User jsonString2User = JSONObject.parseObject(jsonString, User.class);
        System.out.println(jsonString2User);

        
        
        User user = new User("acane");
        // 对象转JSON
        String user2Json = JSONObject.toJSONString(user);
        System.out.println(user2Json);
        // JSON转对象
        User json2User = JSONObject.parseObject(user2Json, User.class);
        System.out.println(json2User);
        
        // 在前端，使用JSON.stringify()把对象转成JSON
        // 用eval把JSON转对象
    }
}
```