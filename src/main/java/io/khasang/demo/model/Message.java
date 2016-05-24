package io.khasang.demo.model;

/**
 * Created by Alexander-PC on 25.05.2016.
 */
public class Message {
    public Message(String mesageInfo) {
        this.mesageInfo = mesageInfo;
    }

    private String mesageInfo;

    public Message() {
    }

    public String getMesageInfo() {
        return mesageInfo;
    }

    public void setMesageInfo(String mesageInfo) {
        this.mesageInfo = mesageInfo;
    }
}
