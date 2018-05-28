package it.fivano.damusic.backend.model;

import java.util.ArrayList;
import java.util.List;

public class ReleaseRatingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public ReleaseRatingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_rating
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
     * This method corresponds to the database table release_rating
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
     * This method corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_rating
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
     * This class corresponds to the database table release_rating
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

        public Criteria andIdUserIsNull() {
            addCriterion("id_user is null");
            return (Criteria) this;
        }

        public Criteria andIdUserIsNotNull() {
            addCriterion("id_user is not null");
            return (Criteria) this;
        }

        public Criteria andIdUserEqualTo(Long value) {
            addCriterion("id_user =", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotEqualTo(Long value) {
            addCriterion("id_user <>", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserGreaterThan(Long value) {
            addCriterion("id_user >", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserGreaterThanOrEqualTo(Long value) {
            addCriterion("id_user >=", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserLessThan(Long value) {
            addCriterion("id_user <", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserLessThanOrEqualTo(Long value) {
            addCriterion("id_user <=", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserIn(List<Long> values) {
            addCriterion("id_user in", values, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotIn(List<Long> values) {
            addCriterion("id_user not in", values, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserBetween(Long value1, Long value2) {
            addCriterion("id_user between", value1, value2, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotBetween(Long value1, Long value2) {
            addCriterion("id_user not between", value1, value2, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdReleaseIsNull() {
            addCriterion("id_release is null");
            return (Criteria) this;
        }

        public Criteria andIdReleaseIsNotNull() {
            addCriterion("id_release is not null");
            return (Criteria) this;
        }

        public Criteria andIdReleaseEqualTo(Long value) {
            addCriterion("id_release =", value, "idRelease");
            return (Criteria) this;
        }

        public Criteria andIdReleaseNotEqualTo(Long value) {
            addCriterion("id_release <>", value, "idRelease");
            return (Criteria) this;
        }

        public Criteria andIdReleaseGreaterThan(Long value) {
            addCriterion("id_release >", value, "idRelease");
            return (Criteria) this;
        }

        public Criteria andIdReleaseGreaterThanOrEqualTo(Long value) {
            addCriterion("id_release >=", value, "idRelease");
            return (Criteria) this;
        }

        public Criteria andIdReleaseLessThan(Long value) {
            addCriterion("id_release <", value, "idRelease");
            return (Criteria) this;
        }

        public Criteria andIdReleaseLessThanOrEqualTo(Long value) {
            addCriterion("id_release <=", value, "idRelease");
            return (Criteria) this;
        }

        public Criteria andIdReleaseIn(List<Long> values) {
            addCriterion("id_release in", values, "idRelease");
            return (Criteria) this;
        }

        public Criteria andIdReleaseNotIn(List<Long> values) {
            addCriterion("id_release not in", values, "idRelease");
            return (Criteria) this;
        }

        public Criteria andIdReleaseBetween(Long value1, Long value2) {
            addCriterion("id_release between", value1, value2, "idRelease");
            return (Criteria) this;
        }

        public Criteria andIdReleaseNotBetween(Long value1, Long value2) {
            addCriterion("id_release not between", value1, value2, "idRelease");
            return (Criteria) this;
        }

        public Criteria andStarIsNull() {
            addCriterion("star is null");
            return (Criteria) this;
        }

        public Criteria andStarIsNotNull() {
            addCriterion("star is not null");
            return (Criteria) this;
        }

        public Criteria andStarEqualTo(Integer value) {
            addCriterion("star =", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotEqualTo(Integer value) {
            addCriterion("star <>", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThan(Integer value) {
            addCriterion("star >", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("star >=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThan(Integer value) {
            addCriterion("star <", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThanOrEqualTo(Integer value) {
            addCriterion("star <=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarIn(List<Integer> values) {
            addCriterion("star in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotIn(List<Integer> values) {
            addCriterion("star not in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarBetween(Integer value1, Integer value2) {
            addCriterion("star between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotBetween(Integer value1, Integer value2) {
            addCriterion("star not between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andNumberOfChangeIsNull() {
            addCriterion("number_of_change is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfChangeIsNotNull() {
            addCriterion("number_of_change is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfChangeEqualTo(Integer value) {
            addCriterion("number_of_change =", value, "numberOfChange");
            return (Criteria) this;
        }

        public Criteria andNumberOfChangeNotEqualTo(Integer value) {
            addCriterion("number_of_change <>", value, "numberOfChange");
            return (Criteria) this;
        }

        public Criteria andNumberOfChangeGreaterThan(Integer value) {
            addCriterion("number_of_change >", value, "numberOfChange");
            return (Criteria) this;
        }

        public Criteria andNumberOfChangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_of_change >=", value, "numberOfChange");
            return (Criteria) this;
        }

        public Criteria andNumberOfChangeLessThan(Integer value) {
            addCriterion("number_of_change <", value, "numberOfChange");
            return (Criteria) this;
        }

        public Criteria andNumberOfChangeLessThanOrEqualTo(Integer value) {
            addCriterion("number_of_change <=", value, "numberOfChange");
            return (Criteria) this;
        }

        public Criteria andNumberOfChangeIn(List<Integer> values) {
            addCriterion("number_of_change in", values, "numberOfChange");
            return (Criteria) this;
        }

        public Criteria andNumberOfChangeNotIn(List<Integer> values) {
            addCriterion("number_of_change not in", values, "numberOfChange");
            return (Criteria) this;
        }

        public Criteria andNumberOfChangeBetween(Integer value1, Integer value2) {
            addCriterion("number_of_change between", value1, value2, "numberOfChange");
            return (Criteria) this;
        }

        public Criteria andNumberOfChangeNotBetween(Integer value1, Integer value2) {
            addCriterion("number_of_change not between", value1, value2, "numberOfChange");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table release_rating
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
     * This class corresponds to the database table release_rating
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