package c_spring_aop;

public class UserServiceImpl implements UserService {
    /**
     * Constructs a new object.
     */


    @Override
    public void addUser() {
        System.out.println("add");
    }

    @Override
    public void updateUser() {
        System.out.println("updateuser");
    }

    @Override
    public void deleteUser() {
        System.out.println("deleteUser");
    }
}
