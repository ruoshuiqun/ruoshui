package cn.lq.chapter4.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.lq.chapter4.model.UserModel;

/**
 *  用户服务类, 简单实现
 * @author   lq 
 *
 */
public class UserService {

	//实际应该存数据库
	private Map<String,UserModel> userDB = new HashMap<String , UserModel>();
	
    public void create(UserModel user){
      if(userDB.containsKey(user.getUsername())){
    	  throw new RuntimeException(String.format("%s用户已经存在", user.getUsername()));
      }
       //直接重定向到列表页面
       userDB.put(user.getUsername(), user);
    }
    
    public void update(UserModel user){
    	if(!userDB.containsKey(user.getUsername())){
			throw new RuntimeException(String.format("%s用户不存在", user.getUsername()));
    	}
		userDB.put(user.getUsername(), user);
    }
    
    public void delete(UserModel user){
		if(!userDB.containsKey(user.getUsername())) {
			throw new RuntimeException(String.format("%s用户不存在", user.getUsername()));
		}
		userDB.remove(user.getUsername());
    }
	
	public UserModel get(String username) {
		return userDB.get(username);
	}
	
	public List<UserModel> list() {
		return new ArrayList(userDB.values());
	}
}
