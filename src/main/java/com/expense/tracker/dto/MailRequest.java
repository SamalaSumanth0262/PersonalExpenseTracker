package com.expense.tracker.dto;

public class MailRequest {
  private String to;
  private String subject;
  private String body;
  private boolean isHtml = false;
  private boolean isAttachment = false;

  public MailRequest(String to, String subject, String body, boolean isHtml, boolean isAttachment) {
    this.to = to;
    this.subject = subject;
    this.body = body;
    this.isHtml = isHtml;
    this.isAttachment = isAttachment;
  }

  public MailRequest(String to, String subject, String body) {
    this.to = to;
    this.subject = subject;
    this.body = body;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public boolean isHtml() {
    return isHtml;
  }

  public void setHtml(boolean isHtml) {
    this.isHtml = isHtml;
  }

  public boolean isAttachment() {
    return isAttachment;
  }

  public void setAttachment(boolean isAttachment) {
    this.isAttachment = isAttachment;
  }

}