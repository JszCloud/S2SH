package cn.name.ssh.action;

import cn.name.ssh.server.CommonService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by Nominal on 2017/12/31 0031.
 * 微博：@李明易DY
 */
public abstract class CommonAction<T> extends ActionSupport {

    /**
     * 模块对象
     */
    protected T object;

    /**
     * 模块对象集合
     */
    protected List<T> objects;

    /**
     * 模块服务
     */
    protected CommonService<T> commonService;

    /**
     * 指定注入那个服务
     * @param server
     */
    public abstract void setServer(CommonService<T> server);

    /**
     * 查看所有
     * @return
     */
    public abstract String list();

    /**
     * 去添加界面
     * @return
     */
    public  String to_save(){
        return "to_save";
    }

    /**
     * 执行添加
     * @return
     */
    public  String do_save(){
        commonService.save(object);
        return "do_save";
    }

    /**
     * 根据编号查看一个
     * @return
     */
    public abstract String to_edit();

    /**
     * 执行修改
     * @return
     */
    public  String do_edit(){
        commonService.edit(object);
        return "do_edit";
    }

    /**
     * 执行删除
     * @return
     */
    public  String do_delete(){
        commonService.delete(object);
        return "do_delete";
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public List<T> getObjects() {
        return objects;
    }

    public void setObjects(List<T> objects) {
        this.objects = objects;
    }
}
