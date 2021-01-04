package com.qy25.sm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupperExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSupperNameIsNull() {
            addCriterion("supper_name is null");
            return (Criteria) this;
        }

        public Criteria andSupperNameIsNotNull() {
            addCriterion("supper_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupperNameEqualTo(String value) {
            addCriterion("supper_name =", value, "supperName");
            return (Criteria) this;
        }

        public Criteria andSupperNameNotEqualTo(String value) {
            addCriterion("supper_name <>", value, "supperName");
            return (Criteria) this;
        }

        public Criteria andSupperNameGreaterThan(String value) {
            addCriterion("supper_name >", value, "supperName");
            return (Criteria) this;
        }

        public Criteria andSupperNameGreaterThanOrEqualTo(String value) {
            addCriterion("supper_name >=", value, "supperName");
            return (Criteria) this;
        }

        public Criteria andSupperNameLessThan(String value) {
            addCriterion("supper_name <", value, "supperName");
            return (Criteria) this;
        }

        public Criteria andSupperNameLessThanOrEqualTo(String value) {
            addCriterion("supper_name <=", value, "supperName");
            return (Criteria) this;
        }

        public Criteria andSupperNameLike(String value) {
            addCriterion("supper_name like", value, "supperName");
            return (Criteria) this;
        }

        public Criteria andSupperNameNotLike(String value) {
            addCriterion("supper_name not like", value, "supperName");
            return (Criteria) this;
        }

        public Criteria andSupperNameIn(List<String> values) {
            addCriterion("supper_name in", values, "supperName");
            return (Criteria) this;
        }

        public Criteria andSupperNameNotIn(List<String> values) {
            addCriterion("supper_name not in", values, "supperName");
            return (Criteria) this;
        }

        public Criteria andSupperNameBetween(String value1, String value2) {
            addCriterion("supper_name between", value1, value2, "supperName");
            return (Criteria) this;
        }

        public Criteria andSupperNameNotBetween(String value1, String value2) {
            addCriterion("supper_name not between", value1, value2, "supperName");
            return (Criteria) this;
        }

        public Criteria andSupperContactIsNull() {
            addCriterion("supper_contact is null");
            return (Criteria) this;
        }

        public Criteria andSupperContactIsNotNull() {
            addCriterion("supper_contact is not null");
            return (Criteria) this;
        }

        public Criteria andSupperContactEqualTo(String value) {
            addCriterion("supper_contact =", value, "supperContact");
            return (Criteria) this;
        }

        public Criteria andSupperContactNotEqualTo(String value) {
            addCriterion("supper_contact <>", value, "supperContact");
            return (Criteria) this;
        }

        public Criteria andSupperContactGreaterThan(String value) {
            addCriterion("supper_contact >", value, "supperContact");
            return (Criteria) this;
        }

        public Criteria andSupperContactGreaterThanOrEqualTo(String value) {
            addCriterion("supper_contact >=", value, "supperContact");
            return (Criteria) this;
        }

        public Criteria andSupperContactLessThan(String value) {
            addCriterion("supper_contact <", value, "supperContact");
            return (Criteria) this;
        }

        public Criteria andSupperContactLessThanOrEqualTo(String value) {
            addCriterion("supper_contact <=", value, "supperContact");
            return (Criteria) this;
        }

        public Criteria andSupperContactLike(String value) {
            addCriterion("supper_contact like", value, "supperContact");
            return (Criteria) this;
        }

        public Criteria andSupperContactNotLike(String value) {
            addCriterion("supper_contact not like", value, "supperContact");
            return (Criteria) this;
        }

        public Criteria andSupperContactIn(List<String> values) {
            addCriterion("supper_contact in", values, "supperContact");
            return (Criteria) this;
        }

        public Criteria andSupperContactNotIn(List<String> values) {
            addCriterion("supper_contact not in", values, "supperContact");
            return (Criteria) this;
        }

        public Criteria andSupperContactBetween(String value1, String value2) {
            addCriterion("supper_contact between", value1, value2, "supperContact");
            return (Criteria) this;
        }

        public Criteria andSupperContactNotBetween(String value1, String value2) {
            addCriterion("supper_contact not between", value1, value2, "supperContact");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneIsNull() {
            addCriterion("supper_phone is null");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneIsNotNull() {
            addCriterion("supper_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneEqualTo(String value) {
            addCriterion("supper_phone =", value, "supperPhone");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneNotEqualTo(String value) {
            addCriterion("supper_phone <>", value, "supperPhone");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneGreaterThan(String value) {
            addCriterion("supper_phone >", value, "supperPhone");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("supper_phone >=", value, "supperPhone");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneLessThan(String value) {
            addCriterion("supper_phone <", value, "supperPhone");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneLessThanOrEqualTo(String value) {
            addCriterion("supper_phone <=", value, "supperPhone");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneLike(String value) {
            addCriterion("supper_phone like", value, "supperPhone");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneNotLike(String value) {
            addCriterion("supper_phone not like", value, "supperPhone");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneIn(List<String> values) {
            addCriterion("supper_phone in", values, "supperPhone");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneNotIn(List<String> values) {
            addCriterion("supper_phone not in", values, "supperPhone");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneBetween(String value1, String value2) {
            addCriterion("supper_phone between", value1, value2, "supperPhone");
            return (Criteria) this;
        }

        public Criteria andSupperPhoneNotBetween(String value1, String value2) {
            addCriterion("supper_phone not between", value1, value2, "supperPhone");
            return (Criteria) this;
        }

        public Criteria andSupperEmailIsNull() {
            addCriterion("supper_email is null");
            return (Criteria) this;
        }

        public Criteria andSupperEmailIsNotNull() {
            addCriterion("supper_email is not null");
            return (Criteria) this;
        }

        public Criteria andSupperEmailEqualTo(String value) {
            addCriterion("supper_email =", value, "supperEmail");
            return (Criteria) this;
        }

        public Criteria andSupperEmailNotEqualTo(String value) {
            addCriterion("supper_email <>", value, "supperEmail");
            return (Criteria) this;
        }

        public Criteria andSupperEmailGreaterThan(String value) {
            addCriterion("supper_email >", value, "supperEmail");
            return (Criteria) this;
        }

        public Criteria andSupperEmailGreaterThanOrEqualTo(String value) {
            addCriterion("supper_email >=", value, "supperEmail");
            return (Criteria) this;
        }

        public Criteria andSupperEmailLessThan(String value) {
            addCriterion("supper_email <", value, "supperEmail");
            return (Criteria) this;
        }

        public Criteria andSupperEmailLessThanOrEqualTo(String value) {
            addCriterion("supper_email <=", value, "supperEmail");
            return (Criteria) this;
        }

        public Criteria andSupperEmailLike(String value) {
            addCriterion("supper_email like", value, "supperEmail");
            return (Criteria) this;
        }

        public Criteria andSupperEmailNotLike(String value) {
            addCriterion("supper_email not like", value, "supperEmail");
            return (Criteria) this;
        }

        public Criteria andSupperEmailIn(List<String> values) {
            addCriterion("supper_email in", values, "supperEmail");
            return (Criteria) this;
        }

        public Criteria andSupperEmailNotIn(List<String> values) {
            addCriterion("supper_email not in", values, "supperEmail");
            return (Criteria) this;
        }

        public Criteria andSupperEmailBetween(String value1, String value2) {
            addCriterion("supper_email between", value1, value2, "supperEmail");
            return (Criteria) this;
        }

        public Criteria andSupperEmailNotBetween(String value1, String value2) {
            addCriterion("supper_email not between", value1, value2, "supperEmail");
            return (Criteria) this;
        }

        public Criteria andSupperAddressIsNull() {
            addCriterion("supper_address is null");
            return (Criteria) this;
        }

        public Criteria andSupperAddressIsNotNull() {
            addCriterion("supper_address is not null");
            return (Criteria) this;
        }

        public Criteria andSupperAddressEqualTo(String value) {
            addCriterion("supper_address =", value, "supperAddress");
            return (Criteria) this;
        }

        public Criteria andSupperAddressNotEqualTo(String value) {
            addCriterion("supper_address <>", value, "supperAddress");
            return (Criteria) this;
        }

        public Criteria andSupperAddressGreaterThan(String value) {
            addCriterion("supper_address >", value, "supperAddress");
            return (Criteria) this;
        }

        public Criteria andSupperAddressGreaterThanOrEqualTo(String value) {
            addCriterion("supper_address >=", value, "supperAddress");
            return (Criteria) this;
        }

        public Criteria andSupperAddressLessThan(String value) {
            addCriterion("supper_address <", value, "supperAddress");
            return (Criteria) this;
        }

        public Criteria andSupperAddressLessThanOrEqualTo(String value) {
            addCriterion("supper_address <=", value, "supperAddress");
            return (Criteria) this;
        }

        public Criteria andSupperAddressLike(String value) {
            addCriterion("supper_address like", value, "supperAddress");
            return (Criteria) this;
        }

        public Criteria andSupperAddressNotLike(String value) {
            addCriterion("supper_address not like", value, "supperAddress");
            return (Criteria) this;
        }

        public Criteria andSupperAddressIn(List<String> values) {
            addCriterion("supper_address in", values, "supperAddress");
            return (Criteria) this;
        }

        public Criteria andSupperAddressNotIn(List<String> values) {
            addCriterion("supper_address not in", values, "supperAddress");
            return (Criteria) this;
        }

        public Criteria andSupperAddressBetween(String value1, String value2) {
            addCriterion("supper_address between", value1, value2, "supperAddress");
            return (Criteria) this;
        }

        public Criteria andSupperAddressNotBetween(String value1, String value2) {
            addCriterion("supper_address not between", value1, value2, "supperAddress");
            return (Criteria) this;
        }

        public Criteria andSupperBankIsNull() {
            addCriterion("supper_bank is null");
            return (Criteria) this;
        }

        public Criteria andSupperBankIsNotNull() {
            addCriterion("supper_bank is not null");
            return (Criteria) this;
        }

        public Criteria andSupperBankEqualTo(String value) {
            addCriterion("supper_bank =", value, "supperBank");
            return (Criteria) this;
        }

        public Criteria andSupperBankNotEqualTo(String value) {
            addCriterion("supper_bank <>", value, "supperBank");
            return (Criteria) this;
        }

        public Criteria andSupperBankGreaterThan(String value) {
            addCriterion("supper_bank >", value, "supperBank");
            return (Criteria) this;
        }

        public Criteria andSupperBankGreaterThanOrEqualTo(String value) {
            addCriterion("supper_bank >=", value, "supperBank");
            return (Criteria) this;
        }

        public Criteria andSupperBankLessThan(String value) {
            addCriterion("supper_bank <", value, "supperBank");
            return (Criteria) this;
        }

        public Criteria andSupperBankLessThanOrEqualTo(String value) {
            addCriterion("supper_bank <=", value, "supperBank");
            return (Criteria) this;
        }

        public Criteria andSupperBankLike(String value) {
            addCriterion("supper_bank like", value, "supperBank");
            return (Criteria) this;
        }

        public Criteria andSupperBankNotLike(String value) {
            addCriterion("supper_bank not like", value, "supperBank");
            return (Criteria) this;
        }

        public Criteria andSupperBankIn(List<String> values) {
            addCriterion("supper_bank in", values, "supperBank");
            return (Criteria) this;
        }

        public Criteria andSupperBankNotIn(List<String> values) {
            addCriterion("supper_bank not in", values, "supperBank");
            return (Criteria) this;
        }

        public Criteria andSupperBankBetween(String value1, String value2) {
            addCriterion("supper_bank between", value1, value2, "supperBank");
            return (Criteria) this;
        }

        public Criteria andSupperBankNotBetween(String value1, String value2) {
            addCriterion("supper_bank not between", value1, value2, "supperBank");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeIsNull() {
            addCriterion("supper_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeIsNotNull() {
            addCriterion("supper_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeEqualTo(String value) {
            addCriterion("supper_bank_code =", value, "supperBankCode");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeNotEqualTo(String value) {
            addCriterion("supper_bank_code <>", value, "supperBankCode");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeGreaterThan(String value) {
            addCriterion("supper_bank_code >", value, "supperBankCode");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("supper_bank_code >=", value, "supperBankCode");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeLessThan(String value) {
            addCriterion("supper_bank_code <", value, "supperBankCode");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeLessThanOrEqualTo(String value) {
            addCriterion("supper_bank_code <=", value, "supperBankCode");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeLike(String value) {
            addCriterion("supper_bank_code like", value, "supperBankCode");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeNotLike(String value) {
            addCriterion("supper_bank_code not like", value, "supperBankCode");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeIn(List<String> values) {
            addCriterion("supper_bank_code in", values, "supperBankCode");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeNotIn(List<String> values) {
            addCriterion("supper_bank_code not in", values, "supperBankCode");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeBetween(String value1, String value2) {
            addCriterion("supper_bank_code between", value1, value2, "supperBankCode");
            return (Criteria) this;
        }

        public Criteria andSupperBankCodeNotBetween(String value1, String value2) {
            addCriterion("supper_bank_code not between", value1, value2, "supperBankCode");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNull() {
            addCriterion("creater_id is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNotNull() {
            addCriterion("creater_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdEqualTo(Long value) {
            addCriterion("creater_id =", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotEqualTo(Long value) {
            addCriterion("creater_id <>", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThan(Long value) {
            addCriterion("creater_id >", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creater_id >=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThan(Long value) {
            addCriterion("creater_id <", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThanOrEqualTo(Long value) {
            addCriterion("creater_id <=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIn(List<Long> values) {
            addCriterion("creater_id in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotIn(List<Long> values) {
            addCriterion("creater_id not in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdBetween(Long value1, Long value2) {
            addCriterion("creater_id between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotBetween(Long value1, Long value2) {
            addCriterion("creater_id not between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
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