package com.example.teachereval.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblClassExample() {
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

        public Criteria andClaidIsNull() {
            addCriterion("claid is null");
            return (Criteria) this;
        }

        public Criteria andClaidIsNotNull() {
            addCriterion("claid is not null");
            return (Criteria) this;
        }

        public Criteria andClaidEqualTo(Integer value) {
            addCriterion("claid =", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidNotEqualTo(Integer value) {
            addCriterion("claid <>", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidGreaterThan(Integer value) {
            addCriterion("claid >", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("claid >=", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidLessThan(Integer value) {
            addCriterion("claid <", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidLessThanOrEqualTo(Integer value) {
            addCriterion("claid <=", value, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidIn(List<Integer> values) {
            addCriterion("claid in", values, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidNotIn(List<Integer> values) {
            addCriterion("claid not in", values, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidBetween(Integer value1, Integer value2) {
            addCriterion("claid between", value1, value2, "claid");
            return (Criteria) this;
        }

        public Criteria andClaidNotBetween(Integer value1, Integer value2) {
            addCriterion("claid not between", value1, value2, "claid");
            return (Criteria) this;
        }

        public Criteria andClaNameIsNull() {
            addCriterion("claName is null");
            return (Criteria) this;
        }

        public Criteria andClaNameIsNotNull() {
            addCriterion("claName is not null");
            return (Criteria) this;
        }

        public Criteria andClaNameEqualTo(String value) {
            addCriterion("claName =", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameNotEqualTo(String value) {
            addCriterion("claName <>", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameGreaterThan(String value) {
            addCriterion("claName >", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameGreaterThanOrEqualTo(String value) {
            addCriterion("claName >=", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameLessThan(String value) {
            addCriterion("claName <", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameLessThanOrEqualTo(String value) {
            addCriterion("claName <=", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameLike(String value) {
            addCriterion("claName like", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameNotLike(String value) {
            addCriterion("claName not like", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameIn(List<String> values) {
            addCriterion("claName in", values, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameNotIn(List<String> values) {
            addCriterion("claName not in", values, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameBetween(String value1, String value2) {
            addCriterion("claName between", value1, value2, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameNotBetween(String value1, String value2) {
            addCriterion("claName not between", value1, value2, "claName");
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