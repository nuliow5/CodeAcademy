package org.OOO.LikeApp;

public class LikeCounterApp {
    public static final String USER_INFO_MSG = "Vartotojas \"%s\" turi like'u: %d";  //%s - String type; %d - Integer
    public void run() {
        User u1 = new User("user1");
        User u2 = new User("user2");
        User u3 = new User("user3");

        u1.addLike(u2);
        u1.addLike(u2);

        u2.addLike(u3);

        getUserInfo(u1);
        getUserInfo(u2);
        getUserInfo(u3);

        u2.printLikesGivers();
    }

    private void getUserInfo(User user) {
        System.out.printf(USER_INFO_MSG, user.getNickname(), user.getLikeCount());
    }
}
