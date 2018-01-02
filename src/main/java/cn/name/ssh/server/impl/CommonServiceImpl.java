package cn.name.ssh.server.impl;

import cn.name.ssh.dao.CommonDao;
import cn.name.ssh.dao.UserDao;
import cn.name.ssh.server.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Nominal on 2017/12/29 0029.
 * 微博：@李明易DY
 * 公共的CommonService接口的实现类
 */

public class CommonServiceImpl<T> implements CommonService<T> {
    @Autowired
    private CommonDao commonDao;

    /**
     * 通用方法 查询列表
     *
     * @param t         查询条件对象
     * @param className 查询的目标类型
     * @return 集合
     */
    @Override
    public List<T> query(T t, Class className) {
        return commonDao.query(t, className);
    }

    /**
     * 通用方法 查询对象
     *
     * @param id        对象的编号
     * @param className 查询的目标类型
     * @return 对象
     */
    @Override
    public T queryObjectById(Serializable id, Class className) {
        return (T) commonDao.queryObjectById(id, className);
    }

    /**
     * 通用方法 添加
     *
     * @param t 添加的对象
     */
    @Override
    public void save(T t) {
        commonDao.save(t);
    }

    /**
     * 通用方法 删除
     *
     * @param t 删除的对象
     */
    @Override
    public void delete(T t) {
        commonDao.delete(t);
    }

    /**
     * 通用方法 修改
     *
     * @param t 修改的对象
     */
    @Override
    public void edit(T t) {
        commonDao.edit(t);
    }
}
