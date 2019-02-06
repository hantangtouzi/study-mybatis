package com.hantangtouzi.mybatis.helloworld.entity;

/**
 * @author WilliamChang.
 * Created on 2019-02-06 07:34:14
 */

public class Role {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
