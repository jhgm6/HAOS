package com.scsj.haos.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRoomnumIsNull() {
            addCriterion("roomNum is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNotNull() {
            addCriterion("roomNum is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumEqualTo(String value) {
            addCriterion("roomNum =", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotEqualTo(String value) {
            addCriterion("roomNum <>", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThan(String value) {
            addCriterion("roomNum >", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThanOrEqualTo(String value) {
            addCriterion("roomNum >=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThan(String value) {
            addCriterion("roomNum <", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThanOrEqualTo(String value) {
            addCriterion("roomNum <=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLike(String value) {
            addCriterion("roomNum like", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotLike(String value) {
            addCriterion("roomNum not like", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumIn(List<String> values) {
            addCriterion("roomNum in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotIn(List<String> values) {
            addCriterion("roomNum not in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumBetween(String value1, String value2) {
            addCriterion("roomNum between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotBetween(String value1, String value2) {
            addCriterion("roomNum not between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNull() {
            addCriterion("inTime is null");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNotNull() {
            addCriterion("inTime is not null");
            return (Criteria) this;
        }

        public Criteria andIntimeEqualTo(Date value) {
            addCriterionForJDBCDate("inTime =", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("inTime <>", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThan(Date value) {
            addCriterionForJDBCDate("inTime >", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inTime >=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThan(Date value) {
            addCriterionForJDBCDate("inTime <", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inTime <=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeIn(List<Date> values) {
            addCriterionForJDBCDate("inTime in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("inTime not in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inTime between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inTime not between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNull() {
            addCriterion("outTime is null");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNotNull() {
            addCriterion("outTime is not null");
            return (Criteria) this;
        }

        public Criteria andOuttimeEqualTo(Date value) {
            addCriterionForJDBCDate("outTime =", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("outTime <>", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("outTime >", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outTime >=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThan(Date value) {
            addCriterionForJDBCDate("outTime <", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outTime <=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeIn(List<Date> values) {
            addCriterionForJDBCDate("outTime in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("outTime not in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outTime between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outTime not between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNull() {
            addCriterion("isUsed is null");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNotNull() {
            addCriterion("isUsed is not null");
            return (Criteria) this;
        }

        public Criteria andIsusedEqualTo(Boolean value) {
            addCriterion("isUsed =", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotEqualTo(Boolean value) {
            addCriterion("isUsed <>", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThan(Boolean value) {
            addCriterion("isUsed >", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isUsed >=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThan(Boolean value) {
            addCriterion("isUsed <", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThanOrEqualTo(Boolean value) {
            addCriterion("isUsed <=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedIn(List<Boolean> values) {
            addCriterion("isUsed in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotIn(List<Boolean> values) {
            addCriterion("isUsed not in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedBetween(Boolean value1, Boolean value2) {
            addCriterion("isUsed between", value1, value2, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isUsed not between", value1, value2, "isused");
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