package com.servehttp.janiserver.mttp.model;

/**
 *
 * @author 
 */
public class MTTPModel {
    
    private Integer id;
    private Integer leftIndex;
    private Integer rightIndex;

    public MTTPModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLeftIndex() {
        return leftIndex;
    }

    public void setLeftIndex(Integer leftIndex) {
        this.leftIndex = leftIndex;
    }

    public Integer getRightIndex() {
        return rightIndex;
    }

    public void setRightIndex(Integer rightIndex) {
        this.rightIndex = rightIndex;
    }
    
}
