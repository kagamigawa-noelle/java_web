import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class jsontest {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setName("123");
        User user1=new User();
        user1.setName("lisi");
        user1.setAge(19);
        userList.add(user);
        userList.add(user1);
        System.out.println("data"+":"+JSON.toJSONString(userList));
    }
    public static class User{
        private String name;
        private int age;
        public boolean health;
        public Date time;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
