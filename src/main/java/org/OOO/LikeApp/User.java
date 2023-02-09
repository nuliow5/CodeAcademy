package org.OOO.LikeApp;

public class User {
    private int likeCount;
    private final String nickname;
    private User[] givers = new User[3];

    public User(String nickname) {
        this.nickname = nickname;
    }

    public void addLike(User giver) {
        for (int i = 0; i < givers.length; i++) {
            if (givers[i] == null) {
                givers[i] = giver;
                this.likeCount++;
                break;
            }
        }
    }

    public int getLikeCount() {
        return likeCount;
    }
    public String getNickname() {
        return nickname;
    }
    void printLikesGivers(){
        for (int i = 0; i < givers.length; i++) {
            if (givers[i] != null){
                System.out.println(givers[i].getNickname());
            }

        }
    }

}
