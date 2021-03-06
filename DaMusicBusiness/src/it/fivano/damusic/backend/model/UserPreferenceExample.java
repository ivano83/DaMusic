package it.fivano.damusic.backend.model;

import java.util.ArrayList;
import java.util.List;

public class UserPreferenceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public UserPreferenceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
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

        public Criteria andIdUserPreferenceIsNull() {
            addCriterion("id_user_preference is null");
            return (Criteria) this;
        }

        public Criteria andIdUserPreferenceIsNotNull() {
            addCriterion("id_user_preference is not null");
            return (Criteria) this;
        }

        public Criteria andIdUserPreferenceEqualTo(Long value) {
            addCriterion("id_user_preference =", value, "idUserPreference");
            return (Criteria) this;
        }

        public Criteria andIdUserPreferenceNotEqualTo(Long value) {
            addCriterion("id_user_preference <>", value, "idUserPreference");
            return (Criteria) this;
        }

        public Criteria andIdUserPreferenceGreaterThan(Long value) {
            addCriterion("id_user_preference >", value, "idUserPreference");
            return (Criteria) this;
        }

        public Criteria andIdUserPreferenceGreaterThanOrEqualTo(Long value) {
            addCriterion("id_user_preference >=", value, "idUserPreference");
            return (Criteria) this;
        }

        public Criteria andIdUserPreferenceLessThan(Long value) {
            addCriterion("id_user_preference <", value, "idUserPreference");
            return (Criteria) this;
        }

        public Criteria andIdUserPreferenceLessThanOrEqualTo(Long value) {
            addCriterion("id_user_preference <=", value, "idUserPreference");
            return (Criteria) this;
        }

        public Criteria andIdUserPreferenceIn(List<Long> values) {
            addCriterion("id_user_preference in", values, "idUserPreference");
            return (Criteria) this;
        }

        public Criteria andIdUserPreferenceNotIn(List<Long> values) {
            addCriterion("id_user_preference not in", values, "idUserPreference");
            return (Criteria) this;
        }

        public Criteria andIdUserPreferenceBetween(Long value1, Long value2) {
            addCriterion("id_user_preference between", value1, value2, "idUserPreference");
            return (Criteria) this;
        }

        public Criteria andIdUserPreferenceNotBetween(Long value1, Long value2) {
            addCriterion("id_user_preference not between", value1, value2, "idUserPreference");
            return (Criteria) this;
        }

        public Criteria andEnableBeatportIsNull() {
            addCriterion("enable_beatport is null");
            return (Criteria) this;
        }

        public Criteria andEnableBeatportIsNotNull() {
            addCriterion("enable_beatport is not null");
            return (Criteria) this;
        }

        public Criteria andEnableBeatportEqualTo(Boolean value) {
            addCriterion("enable_beatport =", value, "enableBeatport");
            return (Criteria) this;
        }

        public Criteria andEnableBeatportNotEqualTo(Boolean value) {
            addCriterion("enable_beatport <>", value, "enableBeatport");
            return (Criteria) this;
        }

        public Criteria andEnableBeatportGreaterThan(Boolean value) {
            addCriterion("enable_beatport >", value, "enableBeatport");
            return (Criteria) this;
        }

        public Criteria andEnableBeatportGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enable_beatport >=", value, "enableBeatport");
            return (Criteria) this;
        }

        public Criteria andEnableBeatportLessThan(Boolean value) {
            addCriterion("enable_beatport <", value, "enableBeatport");
            return (Criteria) this;
        }

        public Criteria andEnableBeatportLessThanOrEqualTo(Boolean value) {
            addCriterion("enable_beatport <=", value, "enableBeatport");
            return (Criteria) this;
        }

        public Criteria andEnableBeatportIn(List<Boolean> values) {
            addCriterion("enable_beatport in", values, "enableBeatport");
            return (Criteria) this;
        }

        public Criteria andEnableBeatportNotIn(List<Boolean> values) {
            addCriterion("enable_beatport not in", values, "enableBeatport");
            return (Criteria) this;
        }

        public Criteria andEnableBeatportBetween(Boolean value1, Boolean value2) {
            addCriterion("enable_beatport between", value1, value2, "enableBeatport");
            return (Criteria) this;
        }

        public Criteria andEnableBeatportNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enable_beatport not between", value1, value2, "enableBeatport");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_preference
     *
     * @mbggenerated do_not_delete_during_merge Sun Sep 01 01:31:17 CEST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_preference
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
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