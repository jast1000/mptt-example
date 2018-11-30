package com.servehttp.janiserver.mttp.model;

import java.util.Objects;

/**
 *
 * @author Jesus Sanchez
 */
public class Category extends MTTPModel {

    private String name;
    private Integer level;

    public Category() {
    }

    public Category(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

}
