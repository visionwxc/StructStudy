package FirstAttempt;

/**
 * Created by Richard on 2017/6/12.
 */
public class UserAction {
    private String username;
    private String password;
    private String address;
    private String telephone;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public  String execute()throws Exception{
        if(username.length()>0&&address.equals("成都")){
            return "success";
        }
        return "error";
    }

}
