package cn.name.ssh.action;

import cn.name.ssh.entity.User;
import cn.name.ssh.server.CommonService;
import cn.name.ssh.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Nominal on 2017/12/29 0029.
 * 微博：@李明易DY
 */
@Component("userAction")
public class LoginAction extends CommonAction<User> {
    @Autowired
    UserService userService;
    User user;
    /**
    *登录
    */
    public String login(){

        return "login";
    }

    /**
     * 指定注入那个服务
     *
     * @param server
     */
    @Override
    public void setServer(CommonService<User> server) {
        super.commonService=commonService;
    }

    /**
     * 查看所有
     *
     * @return
     */
    @Override
    public String list() {
        super.objects = super.commonService.query(super.object, User.class);
        return "list";
    }

    /**
     * 根据编号查看一个
     *
     * @return
     */
    @Override
    public String to_edit() {
        super.object = super.commonService.queryObjectById(object.getId(),User.class);
        return "to_edit";
    }
}
