package com.example.teachereval.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblMenuExample() {
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

        public Criteria andMenidIsNull() {
            addCriterion("menid is null");
            return (Criteria) this;
        }

        public Criteria andMenidIsNotNull() {
            addCriterion("menid is not null");
            return (Criteria) this;
        }

        public Criteria andMenidEqualTo(Integer value) {
            addCriterion("menid =", value, "menid");
            return (Criteria) this;
        }

        public Criteria andMenidNotEqualTo(Integer value) {
            addCriterion("menid <>", value, "menid");
            return (Criteria) this;
        }

        public Criteria andMenidGreaterThan(Integer value) {
            addCriterion("menid >", value, "menid");
            return (Criteria) this;
        }

        public Criteria andMenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menid >=", value, "menid");
            return (Criteria) this;
        }

        public Criteria andMenidLessThan(Integer value) {
            addCriterion("menid <", value, "menid");
            return (Criteria) this;
        }

        public Criteria andMenidLessThanOrEqualTo(Integer value) {
            addCriterion("menid <=", value, "menid");
            return (Criteria) this;
        }

        public Criteria andMenidIn(List<Integer> values) {
            addCriterion("menid in", values, "menid");
            return (Criteria) this;
        }

        public Criteria andMenidNotIn(List<Integer> values) {
            addCriterion("menid not in", values, "menid");
            return (Criteria) this;
        }

        public Criteria andMenidBetween(Integer value1, Integer value2) {
            addCriterion("menid between", value1, value2, "menid");
            return (Criteria) this;
        }

        public Criteria andMenidNotBetween(Integer value1, Integer value2) {
            addCriterion("menid not between", value1, value2, "menid");
            return (Criteria) this;
        }

        public Criteria andMenNameIsNull() {
            addCriterion("menName is null");
            return (Criteria) this;
        }

        public Criteria andMenNameIsNotNull() {
            addCriterion("menName is not null");
            return (Criteria) this;
        }

        public Criteria andMenNameEqualTo(String value) {
            addCriterion("menName =", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameNotEqualTo(String value) {
            addCriterion("menName <>", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameGreaterThan(String value) {
            addCriterion("menName >", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameGreaterThanOrEqualTo(String value) {
            addCriterion("menName >=", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameLessThan(String value) {
            addCriterion("menName <", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameLessThanOrEqualTo(String value) {
            addCriterion("menName <=", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameLike(String value) {
            addCriterion("menName like", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameNotLike(String value) {
            addCriterion("menName not like", value, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameIn(List<String> values) {
            addCriterion("menName in", values, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameNotIn(List<String> values) {
            addCriterion("menName not in", values, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameBetween(String value1, String value2) {
            addCriterion("menName between", value1, value2, "menName");
            return (Criteria) this;
        }

        public Criteria andMenNameNotBetween(String value1, String value2) {
            addCriterion("menName not between", value1, value2, "menName");
            return (Criteria) this;
        }

        public Criteria andMenDesIsNull() {
            addCriterion("menDes is null");
            return (Criteria) this;
        }

        public Criteria andMenDesIsNotNull() {
            addCriterion("menDes is not null");
            return (Criteria) this;
        }

        public Criteria andMenDesEqualTo(String value) {
            addCriterion("menDes =", value, "menDes");
            return (Criteria) this;
        }

        public Criteria andMenDesNotEqualTo(String value) {
            addCriterion("menDes <>", value, "menDes");
            return (Criteria) this;
        }

        public Criteria andMenDesGreaterThan(String value) {
            addCriterion("menDes >", value, "menDes");
            return (Criteria) this;
        }

        public Criteria andMenDesGreaterThanOrEqualTo(String value) {
            addCriterion("menDes >=", value, "menDes");
            return (Criteria) this;
        }

        public Criteria andMenDesLessThan(String value) {
            addCriterion("menDes <", value, "menDes");
            return (Criteria) this;
        }

        public Criteria andMenDesLessThanOrEqualTo(String value) {
            addCriterion("menDes <=", value, "menDes");
            return (Criteria) this;
        }

        public Criteria andMenDesLike(String value) {
            addCriterion("menDes like", value, "menDes");
            return (Criteria) this;
        }

        public Criteria andMenDesNotLike(String value) {
            addCriterion("menDes not like", value, "menDes");
            return (Criteria) this;
        }

        public Criteria andMenDesIn(List<String> values) {
            addCriterion("menDes in", values, "menDes");
            return (Criteria) this;
        }

        public Criteria andMenDesNotIn(List<String> values) {
            addCriterion("menDes not in", values, "menDes");
            return (Criteria) this;
        }

        public Criteria andMenDesBetween(String value1, String value2) {
            addCriterion("menDes between", value1, value2, "menDes");
            return (Criteria) this;
        }

        public Criteria andMenDesNotBetween(String value1, String value2) {
            addCriterion("menDes not between", value1, value2, "menDes");
            return (Criteria) this;
        }

        public Criteria andParMenIsNull() {
            addCriterion("parMen is null");
            return (Criteria) this;
        }

        public Criteria andParMenIsNotNull() {
            addCriterion("parMen is not null");
            return (Criteria) this;
        }

        public Criteria andParMenEqualTo(Integer value) {
            addCriterion("parMen =", value, "parMen");
            return (Criteria) this;
        }

        public Criteria andParMenNotEqualTo(Integer value) {
            addCriterion("parMen <>", value, "parMen");
            return (Criteria) this;
        }

        public Criteria andParMenGreaterThan(Integer value) {
            addCriterion("parMen >", value, "parMen");
            return (Criteria) this;
        }

        public Criteria andParMenGreaterThanOrEqualTo(Integer value) {
            addCriterion("parMen >=", value, "parMen");
            return (Criteria) this;
        }

        public Criteria andParMenLessThan(Integer value) {
            addCriterion("parMen <", value, "parMen");
            return (Criteria) this;
        }

        public Criteria andParMenLessThanOrEqualTo(Integer value) {
            addCriterion("parMen <=", value, "parMen");
            return (Criteria) this;
        }

        public Criteria andParMenIn(List<Integer> values) {
            addCriterion("parMen in", values, "parMen");
            return (Criteria) this;
        }

        public Criteria andParMenNotIn(List<Integer> values) {
            addCriterion("parMen not in", values, "parMen");
            return (Criteria) this;
        }

        public Criteria andParMenBetween(Integer value1, Integer value2) {
            addCriterion("parMen between", value1, value2, "parMen");
            return (Criteria) this;
        }

        public Criteria andParMenNotBetween(Integer value1, Integer value2) {
            addCriterion("parMen not between", value1, value2, "parMen");
            return (Criteria) this;
        }

        public Criteria andMenCDIsNull() {
            addCriterion("menCD is null");
            return (Criteria) this;
        }

        public Criteria andMenCDIsNotNull() {
            addCriterion("menCD is not null");
            return (Criteria) this;
        }

        public Criteria andMenCDEqualTo(String value) {
            addCriterion("menCD =", value, "menCD");
            return (Criteria) this;
        }

        public Criteria andMenCDNotEqualTo(String value) {
            addCriterion("menCD <>", value, "menCD");
            return (Criteria) this;
        }

        public Criteria andMenCDGreaterThan(String value) {
            addCriterion("menCD >", value, "menCD");
            return (Criteria) this;
        }

        public Criteria andMenCDGreaterThanOrEqualTo(String value) {
            addCriterion("menCD >=", value, "menCD");
            return (Criteria) this;
        }

        public Criteria andMenCDLessThan(String value) {
            addCriterion("menCD <", value, "menCD");
            return (Criteria) this;
        }

        public Criteria andMenCDLessThanOrEqualTo(String value) {
            addCriterion("menCD <=", value, "menCD");
            return (Criteria) this;
        }

        public Criteria andMenCDLike(String value) {
            addCriterion("menCD like", value, "menCD");
            return (Criteria) this;
        }

        public Criteria andMenCDNotLike(String value) {
            addCriterion("menCD not like", value, "menCD");
            return (Criteria) this;
        }

        public Criteria andMenCDIn(List<String> values) {
            addCriterion("menCD in", values, "menCD");
            return (Criteria) this;
        }

        public Criteria andMenCDNotIn(List<String> values) {
            addCriterion("menCD not in", values, "menCD");
            return (Criteria) this;
        }

        public Criteria andMenCDBetween(String value1, String value2) {
            addCriterion("menCD between", value1, value2, "menCD");
            return (Criteria) this;
        }

        public Criteria andMenCDNotBetween(String value1, String value2) {
            addCriterion("menCD not between", value1, value2, "menCD");
            return (Criteria) this;
        }

        public Criteria andMenUrlIsNull() {
            addCriterion("menUrl is null");
            return (Criteria) this;
        }

        public Criteria andMenUrlIsNotNull() {
            addCriterion("menUrl is not null");
            return (Criteria) this;
        }

        public Criteria andMenUrlEqualTo(String value) {
            addCriterion("menUrl =", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlNotEqualTo(String value) {
            addCriterion("menUrl <>", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlGreaterThan(String value) {
            addCriterion("menUrl >", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlGreaterThanOrEqualTo(String value) {
            addCriterion("menUrl >=", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlLessThan(String value) {
            addCriterion("menUrl <", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlLessThanOrEqualTo(String value) {
            addCriterion("menUrl <=", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlLike(String value) {
            addCriterion("menUrl like", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlNotLike(String value) {
            addCriterion("menUrl not like", value, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlIn(List<String> values) {
            addCriterion("menUrl in", values, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlNotIn(List<String> values) {
            addCriterion("menUrl not in", values, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlBetween(String value1, String value2) {
            addCriterion("menUrl between", value1, value2, "menUrl");
            return (Criteria) this;
        }

        public Criteria andMenUrlNotBetween(String value1, String value2) {
            addCriterion("menUrl not between", value1, value2, "menUrl");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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