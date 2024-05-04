package Part3.Task1;

import Part4.Task9.User;

public class Class {
    public void checkAccess(User user, Resource resource) {
        if (isLoggedIn(user) && resource != null) {
            if (user.hasPermission(resource)) {
                onPermissionGranted(user, resource);
            } else {
                onPermissionDenied(user, resource);
            }
        } else {
            onAccessDenied(user, resource);
        }
    }

    private boolean isLoggedIn(User user) {
        return user != null && user.isLoggedIn();
    }

    private void onPermissionGranted(User user, Resource resource) {
        // Доступ дозволено
        System.out.println("Access granted");
    }

    private void onPermissionDenied(User user, Resource resource) {
        // Доступ заборонено
        System.out.println("Access denied");
    }

    private void onAccessDenied(User user, Resource resource) {
        // Доступ заборонено
        System.out.println("Access denied");
    }
}
