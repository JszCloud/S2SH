package cn.name.ssh.dao.impl;

import cn.name.ssh.common.BaseDao;
import cn.name.ssh.dao.CommonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Nominal on 2017/12/29 0029.
 * 微博：@李明易DY
 *公共的CommonDao接口的实现类
 */

public class CommonDaoImpl<T> implements CommonDao<T> {
    @Autowired
    BaseDao baseDao;

    /**
     * 通用方法 查询列表
     *
     * @param t         查询条件对象
     * @param className 查询的目标类型
     * @return 集合
     */
    @Override
    public List<T> query(T t, Class className) {
        return (List<T>) baseDao.getHibernateTemplate().find("from " + className.getSimpleName());
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
        return (T) baseDao.getHibernateTemplate().get(className, id);
    }

    /**
     * 通用方法 添加
     *
     * @param t 添加的对象
     */
    @Override
    public void save(T t) {
        baseDao.getHibernateTemplate().save(t);
    }

    /**
     * 通用方法 删除
     *
     * @param t 删除的对象
     */
    @Override
    public void delete(T t) {
        baseDao.getHibernateTemplate().delete(t);
    }

    /**
     * 通用方法 修改
     *
     * @param t 修改的对象
     */
    @Override
    public void edit(T t) {
        baseDao.getHibernateTemplate().update(t);
    }
}
