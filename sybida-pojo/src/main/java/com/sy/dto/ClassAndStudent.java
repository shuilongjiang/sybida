package com.sy.dto;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassAndStudent {
    private  Integer id;
    private String title;
    private boolean checked=false;
    private boolean spread=false;
    private String href;
    private List<ClassAndStudent> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
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

    public List<ClassAndStudent> getChildren() {
        return children;
    }

    public void setChildren(List<ClassAndStudent> children) {
        this.children = children;
    }
}
