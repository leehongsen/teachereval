package com.example.teachereval.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblCourseExample() {
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

        public Criteria andCouidIsNull() {
            addCriterion("couid is null");
            return (Criteria) this;
        }

        public Criteria andCouidIsNotNull() {
            addCriterion("couid is not null");
            return (Criteria) this;
        }

        public Criteria andCouidEqualTo(Integer value) {
            addCriterion("couid =", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotEqualTo(Integer value) {
            addCriterion("couid <>", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidGreaterThan(Integer value) {
            addCriterion("couid >", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidGreaterThanOrEqualTo(Integer value) {
            addCriterion("couid >=", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidLessThan(Integer value) {
            addCriterion("couid <", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidLessThanOrEqualTo(Integer value) {
            addCriterion("couid <=", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidIn(List<Integer> values) {
            addCriterion("couid in", values, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotIn(List<Integer> values) {
            addCriterion("couid not in", values, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidBetween(Integer value1, Integer value2) {
            addCriterion("couid between", value1, value2, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotBetween(Integer value1, Integer value2) {
            addCriterion("couid not between", value1, value2, "couid");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Integer value) {
            addCriterion("groupid =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Integer value) {
            addCriterion("groupid <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Integer value) {
            addCriterion("groupid >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupid >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Integer value) {
            addCriterion("groupid <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("groupid <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Integer> values) {
            addCriterion("groupid in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Integer> values) {
            addCriterion("groupid not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Integer value1, Integer value2) {
            addCriterion("groupid between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupid not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andCouNameIsNull() {
            addCriterion("couName is null");
            return (Criteria) this;
        }

        public Criteria andCouNameIsNotNull() {
            addCriterion("couName is not null");
            return (Criteria) this;
        }

        public Criteria andCouNameEqualTo(String value) {
            addCriterion("couName =", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotEqualTo(String value) {
            addCriterion("couName <>", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameGreaterThan(String value) {
            addCriterion("couName >", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameGreaterThanOrEqualTo(String value) {
            addCriterion("couName >=", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameLessThan(String value) {
            addCriterion("couName <", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameLessThanOrEqualTo(String value) {
            addCriterion("couName <=", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameLike(String value) {
            addCriterion("couName like", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotLike(String value) {
            addCriterion("couName not like", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameIn(List<String> values) {
            addCriterion("couName in", values, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotIn(List<String> values) {
            addCriterion("couName not in", values, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameBetween(String value1, String value2) {
            addCriterion("couName between", value1, value2, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotBetween(String value1, String value2) {
            addCriterion("couName not between", value1, value2, "couName");
            return (Criteria) this;
        }

        public Criteria andCouSemIsNull() {
            addCriterion("couSem is null");
            return (Criteria) this;
        }

        public Criteria andCouSemIsNotNull() {
            addCriterion("couSem is not null");
            return (Criteria) this;
        }

        public Criteria andCouSemEqualTo(String value) {
            addCriterion("couSem =", value, "couSem");
            return (Criteria) this;
        }

        public Criteria andCouSemNotEqualTo(String value) {
            addCriterion("couSem <>", value, "couSem");
            return (Criteria) this;
        }

        public Criteria andCouSemGreaterThan(String value) {
            addCriterion("couSem >", value, "couSem");
            return (Criteria) this;
        }

        public Criteria andCouSemGreaterThanOrEqualTo(String value) {
            addCriterion("couSem >=", value, "couSem");
            return (Criteria) this;
        }

        public Criteria andCouSemLessThan(String value) {
            addCriterion("couSem <", value, "couSem");
            return (Criteria) this;
        }

        public Criteria andCouSemLessThanOrEqualTo(String value) {
            addCriterion("couSem <=", value, "couSem");
            return (Criteria) this;
        }

        public Criteria andCouSemLike(String value) {
            addCriterion("couSem like", value, "couSem");
            return (Criteria) this;
        }

        public Criteria andCouSemNotLike(String value) {
            addCriterion("couSem not like", value, "couSem");
            return (Criteria) this;
        }

        public Criteria andCouSemIn(List<String> values) {
            addCriterion("couSem in", values, "couSem");
            return (Criteria) this;
        }

        public Criteria andCouSemNotIn(List<String> values) {
            addCriterion("couSem not in", values, "couSem");
            return (Criteria) this;
        }

        public Criteria andCouSemBetween(String value1, String value2) {
            addCriterion("couSem between", value1, value2, "couSem");
            return (Criteria) this;
        }

        public Criteria andCouSemNotBetween(String value1, String value2) {
            addCriterion("couSem not between", value1, value2, "couSem");
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