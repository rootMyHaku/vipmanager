package cn.zh.pojo;

import java.util.ArrayList;
import java.util.List;

public class UploadtempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UploadtempExample() {
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

        public Criteria andUploaderIsNull() {
            addCriterion("uploader is null");
            return (Criteria) this;
        }

        public Criteria andUploaderIsNotNull() {
            addCriterion("uploader is not null");
            return (Criteria) this;
        }

        public Criteria andUploaderEqualTo(String value) {
            addCriterion("uploader =", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotEqualTo(String value) {
            addCriterion("uploader <>", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderGreaterThan(String value) {
            addCriterion("uploader >", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderGreaterThanOrEqualTo(String value) {
            addCriterion("uploader >=", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderLessThan(String value) {
            addCriterion("uploader <", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderLessThanOrEqualTo(String value) {
            addCriterion("uploader <=", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderLike(String value) {
            addCriterion("uploader like", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotLike(String value) {
            addCriterion("uploader not like", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderIn(List<String> values) {
            addCriterion("uploader in", values, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotIn(List<String> values) {
            addCriterion("uploader not in", values, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderBetween(String value1, String value2) {
            addCriterion("uploader between", value1, value2, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotBetween(String value1, String value2) {
            addCriterion("uploader not between", value1, value2, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploadTypeIsNull() {
            addCriterion("upload_type is null");
            return (Criteria) this;
        }

        public Criteria andUploadTypeIsNotNull() {
            addCriterion("upload_type is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTypeEqualTo(String value) {
            addCriterion("upload_type =", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeNotEqualTo(String value) {
            addCriterion("upload_type <>", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeGreaterThan(String value) {
            addCriterion("upload_type >", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeGreaterThanOrEqualTo(String value) {
            addCriterion("upload_type >=", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeLessThan(String value) {
            addCriterion("upload_type <", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeLessThanOrEqualTo(String value) {
            addCriterion("upload_type <=", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeLike(String value) {
            addCriterion("upload_type like", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeNotLike(String value) {
            addCriterion("upload_type not like", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeIn(List<String> values) {
            addCriterion("upload_type in", values, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeNotIn(List<String> values) {
            addCriterion("upload_type not in", values, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeBetween(String value1, String value2) {
            addCriterion("upload_type between", value1, value2, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeNotBetween(String value1, String value2) {
            addCriterion("upload_type not between", value1, value2, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathIsNull() {
            addCriterion("upload_file_path is null");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathIsNotNull() {
            addCriterion("upload_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathEqualTo(String value) {
            addCriterion("upload_file_path =", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathNotEqualTo(String value) {
            addCriterion("upload_file_path <>", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathGreaterThan(String value) {
            addCriterion("upload_file_path >", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("upload_file_path >=", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathLessThan(String value) {
            addCriterion("upload_file_path <", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathLessThanOrEqualTo(String value) {
            addCriterion("upload_file_path <=", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathLike(String value) {
            addCriterion("upload_file_path like", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathNotLike(String value) {
            addCriterion("upload_file_path not like", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathIn(List<String> values) {
            addCriterion("upload_file_path in", values, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathNotIn(List<String> values) {
            addCriterion("upload_file_path not in", values, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathBetween(String value1, String value2) {
            addCriterion("upload_file_path between", value1, value2, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathNotBetween(String value1, String value2) {
            addCriterion("upload_file_path not between", value1, value2, "uploadFilePath");
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