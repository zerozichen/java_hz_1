package com.xl.ssm.pojo;

import java.math.BigDecimal;

public class Customer {
    private String customerId;

    private String companyName;

    private Short customerLevel;

    private String linkmanId;

    private String customerAddress;

    private BigDecimal customerTelNo;

    private BigDecimal customerFax;

    private String customerEmail;

    private String customerWebsite;

    private String customerBan;

    private BigDecimal customerBankAccount;

    private Short customerSatisfy;

    private Short customerCredit;

    private Short customerStatus;

    private Short customerType;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Short getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(Short customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getLinkmanId() {
        return linkmanId;
    }

    public void setLinkmanId(String linkmanId) {
        this.linkmanId = linkmanId == null ? null : linkmanId.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public BigDecimal getCustomerTelNo() {
        return customerTelNo;
    }

    public void setCustomerTelNo(BigDecimal customerTelNo) {
        this.customerTelNo = customerTelNo;
    }

    public BigDecimal getCustomerFax() {
        return customerFax;
    }

    public void setCustomerFax(BigDecimal customerFax) {
        this.customerFax = customerFax;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail == null ? null : customerEmail.trim();
    }

    public String getCustomerWebsite() {
        return customerWebsite;
    }

    public void setCustomerWebsite(String customerWebsite) {
        this.customerWebsite = customerWebsite == null ? null : customerWebsite.trim();
    }

    public String getCustomerBan() {
        return customerBan;
    }

    public void setCustomerBan(String customerBan) {
        this.customerBan = customerBan == null ? null : customerBan.trim();
    }

    public BigDecimal getCustomerBankAccount() {
        return customerBankAccount;
    }

    public void setCustomerBankAccount(BigDecimal customerBankAccount) {
        this.customerBankAccount = customerBankAccount;
    }

    public Short getCustomerSatisfy() {
        return customerSatisfy;
    }

    public void setCustomerSatisfy(Short customerSatisfy) {
        this.customerSatisfy = customerSatisfy;
    }

    public Short getCustomerCredit() {
        return customerCredit;
    }

    public void setCustomerCredit(Short customerCredit) {
        this.customerCredit = customerCredit;
    }

    public Short getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(Short customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Short getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Short customerType) {
        this.customerType = customerType;
    }
}