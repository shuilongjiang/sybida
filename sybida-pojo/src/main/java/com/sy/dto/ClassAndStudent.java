package com.sy.dto;

import org.springframework.stereotype.Component;

@Component
public class ClassAndStudent {
    private  String id;
    private String title;
    private boolean check=false;
    private boolean spread=true;
    private String href;
    private ClassAndStudent children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public boolean isSpread() {
        return spread;
    }

    public void setSpread(boolean spread) {
        this.spread = spread;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ClassAndStudent getChildren() {
        return children;
    }

    public void setChildren(ClassAndStudent children) {
        this.children = children;
    }
}
