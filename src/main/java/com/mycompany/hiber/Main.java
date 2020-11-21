import com.mycompany.hiber.models.Auto;
import com.mycompany.hiber.models.User;
import com.mycompany.hiber.service.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        User user = new User("Lena",19);
        userService.saveUser(user);
        Auto nissan = new Auto("Nissan", "black");
        nissan.setUser(user);
        user.addAuto(nissan);
        userService.updateUser(user);
    }
}