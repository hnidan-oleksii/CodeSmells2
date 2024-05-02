package Part3.Task1;

public class Class {
    public void checkAccess(User user, Resource resource) {
        if (user != null && user.isLoggedIn() && resource != null) {
            if (user.hasPermission(resource)) {
                // Доступ дозволено
                System.out.println("Access granted");
            } else {
                // Доступ заборонено
                System.out.println("Access denied");
            }
        } else {
            // Доступ заборонено
            System.out.println("Access denied");
        }
    }

}
