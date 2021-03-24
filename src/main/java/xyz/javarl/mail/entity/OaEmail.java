package xyz.javarl.mail.entity;

import xyz.javarl.mail.common.model.Email;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

/**
 * @Date 2021/3/24 20:30
 * @Created by RyanLoong
 * @Classname OaEmail
 * @Description 邮件的信息的实体类,将会被持久化到数据中
 */
public class OaEmail implements Serializable {
    private final long serialVersionUID = 1L;  // 序列化的ID

    // 自增的主键id
    private long id;

    // 接受者邮箱，通过逗号分割
    private String receiveEmail;

    // 邮件主题
    private String subject;

    // 非空的邮件文本
    private String content;

    // 邮件的主题
    private String template;

    //sql 封装的时间戳对象表示发送邮件的时间
    private Timestamp sendTime;

    public OaEmail() {
    }

    public OaEmail(Email email) {
        this.receiveEmail = Arrays.toString(email.getEmail());
        this.subject = email.getSubject();
        this.content = email.getContent();
        this.template = email.getContent();
        this.sendTime = new Timestamp(new Date().getTime());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReceiveEmail() {
        return receiveEmail;
    }

    public void setReceiveEmail(String receiveEmail) {
        this.receiveEmail = receiveEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }
}
