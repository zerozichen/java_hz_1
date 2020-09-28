package com.xl.ssm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("CUSTOMER_ID like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("CUSTOMER_ID not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNull() {
            addCriterion("CUSTOMER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNotNull() {
            addCriterion("CUSTOMER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelEqualTo(Short value) {
            addCriterion("CUSTOMER_LEVEL =", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotEqualTo(Short value) {
            addCriterion("CUSTOMER_LEVEL <>", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThan(Short value) {
            addCriterion("CUSTOMER_LEVEL >", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("CUSTOMER_LEVEL >=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThan(Short value) {
            addCriterion("CUSTOMER_LEVEL <", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThanOrEqualTo(Short value) {
            addCriterion("CUSTOMER_LEVEL <=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIn(List<Short> values) {
            addCriterion("CUSTOMER_LEVEL in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotIn(List<Short> values) {
            addCriterion("CUSTOMER_LEVEL not in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelBetween(Short value1, Short value2) {
            addCriterion("CUSTOMER_LEVEL between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotBetween(Short value1, Short value2) {
            addCriterion("CUSTOMER_LEVEL not between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdIsNull() {
            addCriterion("LINKMAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdIsNotNull() {
            addCriterion("LINKMAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdEqualTo(String value) {
            addCriterion("LINKMAN_ID =", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotEqualTo(String value) {
            addCriterion("LINKMAN_ID <>", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdGreaterThan(String value) {
            addCriterion("LINKMAN_ID >", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_ID >=", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdLessThan(String value) {
            addCriterion("LINKMAN_ID <", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_ID <=", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdLike(String value) {
            addCriterion("LINKMAN_ID like", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotLike(String value) {
            addCriterion("LINKMAN_ID not like", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdIn(List<String> values) {
            addCriterion("LINKMAN_ID in", values, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotIn(List<String> values) {
            addCriterion("LINKMAN_ID not in", values, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdBetween(String value1, String value2) {
            addCriterion("LINKMAN_ID between", value1, value2, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_ID not between", value1, value2, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNull() {
            addCriterion("CUSTOMER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNotNull() {
            addCriterion("CUSTOMER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS =", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS <>", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThan(String value) {
            addCriterion("CUSTOMER_ADDRESS >", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS >=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThan(String value) {
            addCriterion("CUSTOMER_ADDRESS <", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS <=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLike(String value) {
            addCriterion("CUSTOMER_ADDRESS like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotLike(String value) {
            addCriterion("CUSTOMER_ADDRESS not like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIn(List<String> values) {
            addCriterion("CUSTOMER_ADDRESS in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotIn(List<String> values) {
            addCriterion("CUSTOMER_ADDRESS not in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ADDRESS between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ADDRESS not between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNoIsNull() {
            addCriterion("CUSTOMER_TEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNoIsNotNull() {
            addCriterion("CUSTOMER_TEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNoEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_TEL_NO =", value, "customerTelNo");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNoNotEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_TEL_NO <>", value, "customerTelNo");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNoGreaterThan(BigDecimal value) {
            addCriterion("CUSTOMER_TEL_NO >", value, "customerTelNo");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_TEL_NO >=", value, "customerTelNo");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNoLessThan(BigDecimal value) {
            addCriterion("CUSTOMER_TEL_NO <", value, "customerTelNo");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_TEL_NO <=", value, "customerTelNo");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNoIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_TEL_NO in", values, "customerTelNo");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNoNotIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_TEL_NO not in", values, "customerTelNo");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_TEL_NO between", value1, value2, "customerTelNo");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_TEL_NO not between", value1, value2, "customerTelNo");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxIsNull() {
            addCriterion("CUSTOMER_FAX is null");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxIsNotNull() {
            addCriterion("CUSTOMER_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_FAX =", value, "customerFax");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxNotEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_FAX <>", value, "customerFax");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxGreaterThan(BigDecimal value) {
            addCriterion("CUSTOMER_FAX >", value, "customerFax");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_FAX >=", value, "customerFax");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxLessThan(BigDecimal value) {
            addCriterion("CUSTOMER_FAX <", value, "customerFax");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_FAX <=", value, "customerFax");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_FAX in", values, "customerFax");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxNotIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_FAX not in", values, "customerFax");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_FAX between", value1, value2, "customerFax");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_FAX not between", value1, value2, "customerFax");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNull() {
            addCriterion("CUSTOMER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNotNull() {
            addCriterion("CUSTOMER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailEqualTo(String value) {
            addCriterion("CUSTOMER_EMAIL =", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotEqualTo(String value) {
            addCriterion("CUSTOMER_EMAIL <>", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThan(String value) {
            addCriterion("CUSTOMER_EMAIL >", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_EMAIL >=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThan(String value) {
            addCriterion("CUSTOMER_EMAIL <", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_EMAIL <=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLike(String value) {
            addCriterion("CUSTOMER_EMAIL like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotLike(String value) {
            addCriterion("CUSTOMER_EMAIL not like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIn(List<String> values) {
            addCriterion("CUSTOMER_EMAIL in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotIn(List<String> values) {
            addCriterion("CUSTOMER_EMAIL not in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailBetween(String value1, String value2) {
            addCriterion("CUSTOMER_EMAIL between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_EMAIL not between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteIsNull() {
            addCriterion("CUSTOMER_WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteIsNotNull() {
            addCriterion("CUSTOMER_WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteEqualTo(String value) {
            addCriterion("CUSTOMER_WEBSITE =", value, "customerWebsite");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteNotEqualTo(String value) {
            addCriterion("CUSTOMER_WEBSITE <>", value, "customerWebsite");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteGreaterThan(String value) {
            addCriterion("CUSTOMER_WEBSITE >", value, "customerWebsite");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_WEBSITE >=", value, "customerWebsite");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteLessThan(String value) {
            addCriterion("CUSTOMER_WEBSITE <", value, "customerWebsite");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_WEBSITE <=", value, "customerWebsite");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteLike(String value) {
            addCriterion("CUSTOMER_WEBSITE like", value, "customerWebsite");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteNotLike(String value) {
            addCriterion("CUSTOMER_WEBSITE not like", value, "customerWebsite");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteIn(List<String> values) {
            addCriterion("CUSTOMER_WEBSITE in", values, "customerWebsite");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteNotIn(List<String> values) {
            addCriterion("CUSTOMER_WEBSITE not in", values, "customerWebsite");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteBetween(String value1, String value2) {
            addCriterion("CUSTOMER_WEBSITE between", value1, value2, "customerWebsite");
            return (Criteria) this;
        }

        public Criteria andCustomerWebsiteNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_WEBSITE not between", value1, value2, "customerWebsite");
            return (Criteria) this;
        }

        public Criteria andCustomerBanIsNull() {
            addCriterion("CUSTOMER_BAN is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBanIsNotNull() {
            addCriterion("CUSTOMER_BAN is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBanEqualTo(String value) {
            addCriterion("CUSTOMER_BAN =", value, "customerBan");
            return (Criteria) this;
        }

        public Criteria andCustomerBanNotEqualTo(String value) {
            addCriterion("CUSTOMER_BAN <>", value, "customerBan");
            return (Criteria) this;
        }

        public Criteria andCustomerBanGreaterThan(String value) {
            addCriterion("CUSTOMER_BAN >", value, "customerBan");
            return (Criteria) this;
        }

        public Criteria andCustomerBanGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_BAN >=", value, "customerBan");
            return (Criteria) this;
        }

        public Criteria andCustomerBanLessThan(String value) {
            addCriterion("CUSTOMER_BAN <", value, "customerBan");
            return (Criteria) this;
        }

        public Criteria andCustomerBanLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_BAN <=", value, "customerBan");
            return (Criteria) this;
        }

        public Criteria andCustomerBanLike(String value) {
            addCriterion("CUSTOMER_BAN like", value, "customerBan");
            return (Criteria) this;
        }

        public Criteria andCustomerBanNotLike(String value) {
            addCriterion("CUSTOMER_BAN not like", value, "customerBan");
            return (Criteria) this;
        }

        public Criteria andCustomerBanIn(List<String> values) {
            addCriterion("CUSTOMER_BAN in", values, "customerBan");
            return (Criteria) this;
        }

        public Criteria andCustomerBanNotIn(List<String> values) {
            addCriterion("CUSTOMER_BAN not in", values, "customerBan");
            return (Criteria) this;
        }

        public Criteria andCustomerBanBetween(String value1, String value2) {
            addCriterion("CUSTOMER_BAN between", value1, value2, "customerBan");
            return (Criteria) this;
        }

        public Criteria andCustomerBanNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_BAN not between", value1, value2, "customerBan");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountIsNull() {
            addCriterion("CUSTOMER_BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountIsNotNull() {
            addCriterion("CUSTOMER_BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_BANK_ACCOUNT =", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountNotEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_BANK_ACCOUNT <>", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountGreaterThan(BigDecimal value) {
            addCriterion("CUSTOMER_BANK_ACCOUNT >", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_BANK_ACCOUNT >=", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountLessThan(BigDecimal value) {
            addCriterion("CUSTOMER_BANK_ACCOUNT <", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_BANK_ACCOUNT <=", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_BANK_ACCOUNT in", values, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountNotIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_BANK_ACCOUNT not in", values, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_BANK_ACCOUNT between", value1, value2, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_BANK_ACCOUNT not between", value1, value2, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerSatisfyIsNull() {
            addCriterion("CUSTOMER_SATISFY is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSatisfyIsNotNull() {
            addCriterion("CUSTOMER_SATISFY is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSatisfyEqualTo(Short value) {
            addCriterion("CUSTOMER_SATISFY =", value, "customerSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustomerSatisfyNotEqualTo(Short value) {
            addCriterion("CUSTOMER_SATISFY <>", value, "customerSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustomerSatisfyGreaterThan(Short value) {
            addCriterion("CUSTOMER_SATISFY >", value, "customerSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustomerSatisfyGreaterThanOrEqualTo(Short value) {
            addCriterion("CUSTOMER_SATISFY >=", value, "customerSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustomerSatisfyLessThan(Short value) {
            addCriterion("CUSTOMER_SATISFY <", value, "customerSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustomerSatisfyLessThanOrEqualTo(Short value) {
            addCriterion("CUSTOMER_SATISFY <=", value, "customerSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustomerSatisfyIn(List<Short> values) {
            addCriterion("CUSTOMER_SATISFY in", values, "customerSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustomerSatisfyNotIn(List<Short> values) {
            addCriterion("CUSTOMER_SATISFY not in", values, "customerSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustomerSatisfyBetween(Short value1, Short value2) {
            addCriterion("CUSTOMER_SATISFY between", value1, value2, "customerSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustomerSatisfyNotBetween(Short value1, Short value2) {
            addCriterion("CUSTOMER_SATISFY not between", value1, value2, "customerSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIsNull() {
            addCriterion("CUSTOMER_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIsNotNull() {
            addCriterion("CUSTOMER_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditEqualTo(Short value) {
            addCriterion("CUSTOMER_CREDIT =", value, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditNotEqualTo(Short value) {
            addCriterion("CUSTOMER_CREDIT <>", value, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditGreaterThan(Short value) {
            addCriterion("CUSTOMER_CREDIT >", value, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditGreaterThanOrEqualTo(Short value) {
            addCriterion("CUSTOMER_CREDIT >=", value, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditLessThan(Short value) {
            addCriterion("CUSTOMER_CREDIT <", value, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditLessThanOrEqualTo(Short value) {
            addCriterion("CUSTOMER_CREDIT <=", value, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIn(List<Short> values) {
            addCriterion("CUSTOMER_CREDIT in", values, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditNotIn(List<Short> values) {
            addCriterion("CUSTOMER_CREDIT not in", values, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditBetween(Short value1, Short value2) {
            addCriterion("CUSTOMER_CREDIT between", value1, value2, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditNotBetween(Short value1, Short value2) {
            addCriterion("CUSTOMER_CREDIT not between", value1, value2, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNull() {
            addCriterion("CUSTOMER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNotNull() {
            addCriterion("CUSTOMER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusEqualTo(Short value) {
            addCriterion("CUSTOMER_STATUS =", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotEqualTo(Short value) {
            addCriterion("CUSTOMER_STATUS <>", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThan(Short value) {
            addCriterion("CUSTOMER_STATUS >", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("CUSTOMER_STATUS >=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThan(Short value) {
            addCriterion("CUSTOMER_STATUS <", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThanOrEqualTo(Short value) {
            addCriterion("CUSTOMER_STATUS <=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIn(List<Short> values) {
            addCriterion("CUSTOMER_STATUS in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotIn(List<Short> values) {
            addCriterion("CUSTOMER_STATUS not in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusBetween(Short value1, Short value2) {
            addCriterion("CUSTOMER_STATUS between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotBetween(Short value1, Short value2) {
            addCriterion("CUSTOMER_STATUS not between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("CUSTOMER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("CUSTOMER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(Short value) {
            addCriterion("CUSTOMER_TYPE =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(Short value) {
            addCriterion("CUSTOMER_TYPE <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(Short value) {
            addCriterion("CUSTOMER_TYPE >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CUSTOMER_TYPE >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(Short value) {
            addCriterion("CUSTOMER_TYPE <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(Short value) {
            addCriterion("CUSTOMER_TYPE <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<Short> values) {
            addCriterion("CUSTOMER_TYPE in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<Short> values) {
            addCriterion("CUSTOMER_TYPE not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(Short value1, Short value2) {
            addCriterion("CUSTOMER_TYPE between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(Short value1, Short value2) {
            addCriterion("CUSTOMER_TYPE not between", value1, value2, "customerType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}