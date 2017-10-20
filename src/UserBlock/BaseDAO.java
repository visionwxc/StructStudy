package UserBlock;

import java.util.ArrayList;
import java.util.Collection;

/**
 * DAO(Data Access Oject)接口
 * Created by Richard on 2017/6/16.
 */
public interface BaseDAO {

    public boolean insert(String username,String password) throws  Exception;

    public Collection select() throws  Exception;

    public boolean delete(String username) throws  Exception;

    public ArrayList up_select(String username) throws  Exception;

    public boolean update(String username,String password) throws  Exception;
}
