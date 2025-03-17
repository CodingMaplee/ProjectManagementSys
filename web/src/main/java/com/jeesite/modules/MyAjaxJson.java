package com.jeesite.modules;

public class MyAjaxJson {
    private boolean success;
    private String msg;
    private String id;

    // Getter and Setter
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    // Convenient method to easily create a success response
    public static MyAjaxJson success(String msg) {
        MyAjaxJson json = new MyAjaxJson();
        json.setSuccess(true);
        json.setMsg(msg);
        return json;
    }

    // Convenient method to easily create a failure response
    public static MyAjaxJson fail(String msg) {
        MyAjaxJson json = new MyAjaxJson();
        json.setSuccess(false);
        json.setMsg(msg);
        return json;
    }
}
