package com.qy25.sm.entity;

import java.util.Date;

public class Supper {
    private Long id;

    private String supperName;

    private String supperContact;

    private String supperPhone;

    private String supperEmail;

    private String supperAddress;

    private String supperBank;

    private String supperBankCode;

    private Date addTime;

    private Long createrId;

    private Date updateTime;

    private Long updateId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupperName() {
        return supperName;
    }

    public void setSupperName(String supperName) {
        this.supperName = supperName == null ? null : supperName.trim();
    }

    public String getSupperContact() {
        return supperContact;
    }

    public void setSupperContact(String supperContact) {
        this.supperContact = supperContact == null ? null : supperContact.trim();
    }

    public String getSupperPhone() {
        return supperPhone;
    }

    public void setSupperPhone(String supperPhone) {
        this.supperPhone = supperPhone == null ? null : supperPhone.trim();
    }

    public String getSupperEmail() {
        return supperEmail;
    }

    public void setSupperEmail(String supperEmail) {
        this.supperEmail = supperEmail == null ? null : supperEmail.trim();
    }

    public String getSupperAddress() {
        return supperAddress;
    }

    public void setSupperAddress(String supperAddress) {
        this.supperAddress = supperAddress == null ? null : supperAddress.trim();
    }

    public String getSupperBank() {
        return supperBank;
    }

    public void setSupperBank(String supperBank) {
        this.supperBank = supperBank == null ? null : supperBank.trim();
    }

    public String getSupperBankCode() {
        return supperBankCode;
    }

    public void setSupperBankCode(String supperBankCode) {
        this.supperBankCode = supperBankCode == null ? null : supperBankCode.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Long getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
}