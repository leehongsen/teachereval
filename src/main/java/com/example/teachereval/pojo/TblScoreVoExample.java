package com.example.teachereval.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblScoreVoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblScoreVoExample() {
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

        public Criteria andScoidIsNull() {
            addCriterion("scoid is null");
            return (Criteria) this;
        }

        public Criteria andScoidIsNotNull() {
            addCriterion("scoid is not null");
            return (Criteria) this;
        }

        public Criteria andScoidEqualTo(Integer value) {
            addCriterion("scoid =", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidNotEqualTo(Integer value) {
            addCriterion("scoid <>", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidGreaterThan(Integer value) {
            addCriterion("scoid >", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scoid >=", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidLessThan(Integer value) {
            addCriterion("scoid <", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidLessThanOrEqualTo(Integer value) {
            addCriterion("scoid <=", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidIn(List<Integer> values) {
            addCriterion("scoid in", values, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidNotIn(List<Integer> values) {
            addCriterion("scoid not in", values, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidBetween(Integer value1, Integer value2) {
            addCriterion("scoid between", value1, value2, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidNotBetween(Integer value1, Integer value2) {
            addCriterion("scoid not between", value1, value2, "scoid");
            return (Criteria) this;
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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