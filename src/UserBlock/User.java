package UserBlock;

import javax.sound.sampled.Line;
import java.io.Serializable;

/**
 * Created by Richard on 2017/6/16.
 */
public class User implements Serializable{
    String username;
    String password;
    Boolean isOnline;
    DetailInfo infomation;

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DetailInfo getInfomation() {
        return infomation;
    }

    public void setInfomation(DetailInfo infomation) {
        this.infomation = infomation;
    }

    class DetailInfo{
        String Email;
        String Phone;
        String nickname;

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getPhone() {
            return Phone;
        }

        public void setPhone(String phone) {
            Phone = phone;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }
    }
}
