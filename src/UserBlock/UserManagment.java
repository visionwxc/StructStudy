package UserBlock;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import javafx.application.Application;
import org.apache.struts2.views.util.ContextUtil;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.util.ArrayList;
import java.util.Map;

/**
 * Servlet监听器，控制记录用户的登陆注销信息
 * Created by Richard on 2017/6/16.
 */
public class UserManagment {
    class Userlistener implements HttpSessionBindingListener{
        private  String username;


        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }


        @Override
        public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
                ActionContext context = ActionContext.getContext();
                Map application = context.getApplication();
                ArrayList online= (ArrayList) application.get("online");
            if(online==null){
                    online=new ArrayList();
                }
            online.add(username);
            application.put("online",online);
        }

        @Override
        public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
            ActionContext context = ActionContext.getContext();
            Map application = context.getApplication();
            ArrayList online= (ArrayList) application.get("online");
            online.remove(username);
        }


    }

    /*
            登陆
                首先判别是否登陆
                已经登陆---->return
                没有登陆---->获取对应的Session，存入对应用户名的listener
     */

    public void login(String username){
        if(islogin(username)){
            return;
        }else{
            Userlistener newUser=new Userlistener();
            newUser.setUsername(username);
            ActionContext actionContext=ActionContext.getContext();
            Map session=actionContext.getSession();
            session.put("username",newUser);
        }

    }

    /*
            判断是否登陆：
                判别条件Session中是否有对应的该用户名的Listener
                有--->已经登陆，未注销
                无--->没有登陆
     */
    public  boolean islogin(String username){
        ActionContext actionContext=ActionContext.getContext();
        Map session=actionContext.getSession();
        Userlistener judge= (Userlistener) session.get("username");
        if(judge!=null){
            return true;
        }else {
            return false;
        }
    }

    /*
              注销
                    首先判断是否登陆
                    已经登陆--->移除Listener--->true
                    没有登陆--->false

     */

    public boolean logoff(String username){
        if(islogin(username)){
            ActionContext actionContext=ActionContext.getContext();
            Map session=actionContext.getSession();
            session.remove(username);
            session.clear();
            return true;
        }else {
            return false;
        }
    }
    /*
            人数统计
                 返回Session中List的Size。
     */

    public int returnNum(){
        ActionContext actionContext=ActionContext.getContext();
        Map session=actionContext.getSession();
        ArrayList online= (ArrayList) session.get("online");
        if(online==null){
            online=new ArrayList();
        }
        return online.size();
    }

    /*
            list返回
     */
    public ArrayList  returnlist(){
        ActionContext actionContext=ActionContext.getContext();
        Map session=actionContext.getSession();
        ArrayList online= (ArrayList) session.get("online");
        if(online==null){
            online=new ArrayList();
        }
        return online;
    }
}
