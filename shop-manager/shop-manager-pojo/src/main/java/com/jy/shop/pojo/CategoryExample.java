package com.jy.shop.pojo;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSortOrderEqualTo(Integer value) {
            addCriterion("sort_order =", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotEqualTo(Integer value) {
            addCriterion("sort_order <>", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThan(Integer value) {
            addCriterion("sort_order >", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_order >=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThan(Integer value) {
            addCriterion("sort_order <", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sort_order <=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderIn(List<Integer> values) {
            addCriterion("sort_order in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotIn(List<Integer> values) {
            addCriterion("sort_order not in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("sort_order between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_order not between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andShowInNavIsNull() {
            addCriterion("show_in_nav is null");
            return (Criteria) this;
        }

        public Criteria andShowInNavIsNotNull() {
            addCriterion("show_in_nav is not null");
            return (Criteria) this;
        }

        public Criteria andShowInNavEqualTo(Integer value) {
            addCriterion("show_in_nav =", value, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavNotEqualTo(Integer value) {
            addCriterion("show_in_nav <>", value, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavGreaterThan(Integer value) {
            addCriterion("show_in_nav >", value, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_in_nav >=", value, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavLessThan(Integer value) {
            addCriterion("show_in_nav <", value, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavLessThanOrEqualTo(Integer value) {
            addCriterion("show_in_nav <=", value, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavIn(List<Integer> values) {
            addCriterion("show_in_nav in", values, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavNotIn(List<Integer> values) {
            addCriterion("show_in_nav not in", values, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavBetween(Integer value1, Integer value2) {
            addCriterion("show_in_nav between", value1, value2, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavNotBetween(Integer value1, Integer value2) {
            addCriterion("show_in_nav not between", value1, value2, "showInNav");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIsNull() {
            addCriterion("filter_attr is null");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIsNotNull() {
            addCriterion("filter_attr is not null");
            return (Criteria) this;
        }

        public Criteria andFilterAttrEqualTo(String value) {
            addCriterion("filter_attr =", value, "filterAttr");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNotEqualTo(String value) {
            addCriterion("filter_attr <>", value, "filterAttr");
            return (Criteria) this;
        }

        public Criteria andFilterAttrGreaterThan(String value) {
            addCriterion("filter_attr >", value, "filterAttr");
            return (Criteria) this;
        }

        public Criteria andFilterAttrGreaterThanOrEqualTo(String value) {
            addCriterion("filter_attr >=", value, "filterAttr");
            return (Criteria) this;
        }

        public Criteria andFilterAttrLessThan(String value) {
            addCriterion("filter_attr <", value, "filterAttr");
            return (Criteria) this;
        }

        public Criteria andFilterAttrLessThanOrEqualTo(String value) {
            addCriterion("filter_attr <=", value, "filterAttr");
            return (Criteria) this;
        }

        public Criteria andFilterAttrLike(String value) {
            addCriterion("filter_attr like", value, "filterAttr");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNotLike(String value) {
            addCriterion("filter_attr not like", value, "filterAttr");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIn(List<String> values) {
            addCriterion("filter_attr in", values, "filterAttr");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNotIn(List<String> values) {
            addCriterion("filter_attr not in", values, "filterAttr");
            return (Criteria) this;
        }

        public Criteria andFilterAttrBetween(String value1, String value2) {
            addCriterion("filter_attr between", value1, value2, "filterAttr");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNotBetween(String value1, String value2) {
            addCriterion("filter_attr not between", value1, value2, "filterAttr");
            return (Criteria) this;
        }

        public Criteria andIsTopStyleIsNull() {
            addCriterion("is_top_style is null");
            return (Criteria) this;
        }

        public Criteria andIsTopStyleIsNotNull() {
            addCriterion("is_top_style is not null");
            return (Criteria) this;
        }

        public Criteria andIsTopStyleEqualTo(Integer value) {
            addCriterion("is_top_style =", value, "isTopStyle");
            return (Criteria) this;
        }

        public Criteria andIsTopStyleNotEqualTo(Integer value) {
            addCriterion("is_top_style <>", value, "isTopStyle");
            return (Criteria) this;
        }

        public Criteria andIsTopStyleGreaterThan(Integer value) {
            addCriterion("is_top_style >", value, "isTopStyle");
            return (Criteria) this;
        }

        public Criteria andIsTopStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_top_style >=", value, "isTopStyle");
            return (Criteria) this;
        }

        public Criteria andIsTopStyleLessThan(Integer value) {
            addCriterion("is_top_style <", value, "isTopStyle");
            return (Criteria) this;
        }

        public Criteria andIsTopStyleLessThanOrEqualTo(Integer value) {
            addCriterion("is_top_style <=", value, "isTopStyle");
            return (Criteria) this;
        }

        public Criteria andIsTopStyleIn(List<Integer> values) {
            addCriterion("is_top_style in", values, "isTopStyle");
            return (Criteria) this;
        }

        public Criteria andIsTopStyleNotIn(List<Integer> values) {
            addCriterion("is_top_style not in", values, "isTopStyle");
            return (Criteria) this;
        }

        public Criteria andIsTopStyleBetween(Integer value1, Integer value2) {
            addCriterion("is_top_style between", value1, value2, "isTopStyle");
            return (Criteria) this;
        }

        public Criteria andIsTopStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("is_top_style not between", value1, value2, "isTopStyle");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplIsNull() {
            addCriterion("top_style_tpl is null");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplIsNotNull() {
            addCriterion("top_style_tpl is not null");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplEqualTo(String value) {
            addCriterion("top_style_tpl =", value, "topStyleTpl");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplNotEqualTo(String value) {
            addCriterion("top_style_tpl <>", value, "topStyleTpl");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplGreaterThan(String value) {
            addCriterion("top_style_tpl >", value, "topStyleTpl");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplGreaterThanOrEqualTo(String value) {
            addCriterion("top_style_tpl >=", value, "topStyleTpl");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplLessThan(String value) {
            addCriterion("top_style_tpl <", value, "topStyleTpl");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplLessThanOrEqualTo(String value) {
            addCriterion("top_style_tpl <=", value, "topStyleTpl");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplLike(String value) {
            addCriterion("top_style_tpl like", value, "topStyleTpl");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplNotLike(String value) {
            addCriterion("top_style_tpl not like", value, "topStyleTpl");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplIn(List<String> values) {
            addCriterion("top_style_tpl in", values, "topStyleTpl");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplNotIn(List<String> values) {
            addCriterion("top_style_tpl not in", values, "topStyleTpl");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplBetween(String value1, String value2) {
            addCriterion("top_style_tpl between", value1, value2, "topStyleTpl");
            return (Criteria) this;
        }

        public Criteria andTopStyleTplNotBetween(String value1, String value2) {
            addCriterion("top_style_tpl not between", value1, value2, "topStyleTpl");
            return (Criteria) this;
        }

        public Criteria andStyleIconIsNull() {
            addCriterion("style_icon is null");
            return (Criteria) this;
        }

        public Criteria andStyleIconIsNotNull() {
            addCriterion("style_icon is not null");
            return (Criteria) this;
        }

        public Criteria andStyleIconEqualTo(String value) {
            addCriterion("style_icon =", value, "styleIcon");
            return (Criteria) this;
        }

        public Criteria andStyleIconNotEqualTo(String value) {
            addCriterion("style_icon <>", value, "styleIcon");
            return (Criteria) this;
        }

        public Criteria andStyleIconGreaterThan(String value) {
            addCriterion("style_icon >", value, "styleIcon");
            return (Criteria) this;
        }

        public Criteria andStyleIconGreaterThanOrEqualTo(String value) {
            addCriterion("style_icon >=", value, "styleIcon");
            return (Criteria) this;
        }

        public Criteria andStyleIconLessThan(String value) {
            addCriterion("style_icon <", value, "styleIcon");
            return (Criteria) this;
        }

        public Criteria andStyleIconLessThanOrEqualTo(String value) {
            addCriterion("style_icon <=", value, "styleIcon");
            return (Criteria) this;
        }

        public Criteria andStyleIconLike(String value) {
            addCriterion("style_icon like", value, "styleIcon");
            return (Criteria) this;
        }

        public Criteria andStyleIconNotLike(String value) {
            addCriterion("style_icon not like", value, "styleIcon");
            return (Criteria) this;
        }

        public Criteria andStyleIconIn(List<String> values) {
            addCriterion("style_icon in", values, "styleIcon");
            return (Criteria) this;
        }

        public Criteria andStyleIconNotIn(List<String> values) {
            addCriterion("style_icon not in", values, "styleIcon");
            return (Criteria) this;
        }

        public Criteria andStyleIconBetween(String value1, String value2) {
            addCriterion("style_icon between", value1, value2, "styleIcon");
            return (Criteria) this;
        }

        public Criteria andStyleIconNotBetween(String value1, String value2) {
            addCriterion("style_icon not between", value1, value2, "styleIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconIsNull() {
            addCriterion("cat_icon is null");
            return (Criteria) this;
        }

        public Criteria andCatIconIsNotNull() {
            addCriterion("cat_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCatIconEqualTo(String value) {
            addCriterion("cat_icon =", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconNotEqualTo(String value) {
            addCriterion("cat_icon <>", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconGreaterThan(String value) {
            addCriterion("cat_icon >", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconGreaterThanOrEqualTo(String value) {
            addCriterion("cat_icon >=", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconLessThan(String value) {
            addCriterion("cat_icon <", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconLessThanOrEqualTo(String value) {
            addCriterion("cat_icon <=", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconLike(String value) {
            addCriterion("cat_icon like", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconNotLike(String value) {
            addCriterion("cat_icon not like", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconIn(List<String> values) {
            addCriterion("cat_icon in", values, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconNotIn(List<String> values) {
            addCriterion("cat_icon not in", values, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconBetween(String value1, String value2) {
            addCriterion("cat_icon between", value1, value2, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconNotBetween(String value1, String value2) {
            addCriterion("cat_icon not between", value1, value2, "catIcon");
            return (Criteria) this;
        }

        public Criteria andIsTopShowIsNull() {
            addCriterion("is_top_show is null");
            return (Criteria) this;
        }

        public Criteria andIsTopShowIsNotNull() {
            addCriterion("is_top_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsTopShowEqualTo(Integer value) {
            addCriterion("is_top_show =", value, "isTopShow");
            return (Criteria) this;
        }

        public Criteria andIsTopShowNotEqualTo(Integer value) {
            addCriterion("is_top_show <>", value, "isTopShow");
            return (Criteria) this;
        }

        public Criteria andIsTopShowGreaterThan(Integer value) {
            addCriterion("is_top_show >", value, "isTopShow");
            return (Criteria) this;
        }

        public Criteria andIsTopShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_top_show >=", value, "isTopShow");
            return (Criteria) this;
        }

        public Criteria andIsTopShowLessThan(Integer value) {
            addCriterion("is_top_show <", value, "isTopShow");
            return (Criteria) this;
        }

        public Criteria andIsTopShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_top_show <=", value, "isTopShow");
            return (Criteria) this;
        }

        public Criteria andIsTopShowIn(List<Integer> values) {
            addCriterion("is_top_show in", values, "isTopShow");
            return (Criteria) this;
        }

        public Criteria andIsTopShowNotIn(List<Integer> values) {
            addCriterion("is_top_show not in", values, "isTopShow");
            return (Criteria) this;
        }

        public Criteria andIsTopShowBetween(Integer value1, Integer value2) {
            addCriterion("is_top_show between", value1, value2, "isTopShow");
            return (Criteria) this;
        }

        public Criteria andIsTopShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_top_show not between", value1, value2, "isTopShow");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameIsNull() {
            addCriterion("cat_alias_name is null");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameIsNotNull() {
            addCriterion("cat_alias_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameEqualTo(String value) {
            addCriterion("cat_alias_name =", value, "catAliasName");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameNotEqualTo(String value) {
            addCriterion("cat_alias_name <>", value, "catAliasName");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameGreaterThan(String value) {
            addCriterion("cat_alias_name >", value, "catAliasName");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameGreaterThanOrEqualTo(String value) {
            addCriterion("cat_alias_name >=", value, "catAliasName");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameLessThan(String value) {
            addCriterion("cat_alias_name <", value, "catAliasName");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameLessThanOrEqualTo(String value) {
            addCriterion("cat_alias_name <=", value, "catAliasName");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameLike(String value) {
            addCriterion("cat_alias_name like", value, "catAliasName");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameNotLike(String value) {
            addCriterion("cat_alias_name not like", value, "catAliasName");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameIn(List<String> values) {
            addCriterion("cat_alias_name in", values, "catAliasName");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameNotIn(List<String> values) {
            addCriterion("cat_alias_name not in", values, "catAliasName");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameBetween(String value1, String value2) {
            addCriterion("cat_alias_name between", value1, value2, "catAliasName");
            return (Criteria) this;
        }

        public Criteria andCatAliasNameNotBetween(String value1, String value2) {
            addCriterion("cat_alias_name not between", value1, value2, "catAliasName");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNull() {
            addCriterion("commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNotNull() {
            addCriterion("commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(Short value) {
            addCriterion("commission_rate =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(Short value) {
            addCriterion("commission_rate <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(Short value) {
            addCriterion("commission_rate >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(Short value) {
            addCriterion("commission_rate >=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(Short value) {
            addCriterion("commission_rate <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(Short value) {
            addCriterion("commission_rate <=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIn(List<Short> values) {
            addCriterion("commission_rate in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<Short> values) {
            addCriterion("commission_rate not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(Short value1, Short value2) {
            addCriterion("commission_rate between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(Short value1, Short value2) {
            addCriterion("commission_rate not between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andTouchIconIsNull() {
            addCriterion("touch_icon is null");
            return (Criteria) this;
        }

        public Criteria andTouchIconIsNotNull() {
            addCriterion("touch_icon is not null");
            return (Criteria) this;
        }

        public Criteria andTouchIconEqualTo(String value) {
            addCriterion("touch_icon =", value, "touchIcon");
            return (Criteria) this;
        }

        public Criteria andTouchIconNotEqualTo(String value) {
            addCriterion("touch_icon <>", value, "touchIcon");
            return (Criteria) this;
        }

        public Criteria andTouchIconGreaterThan(String value) {
            addCriterion("touch_icon >", value, "touchIcon");
            return (Criteria) this;
        }

        public Criteria andTouchIconGreaterThanOrEqualTo(String value) {
            addCriterion("touch_icon >=", value, "touchIcon");
            return (Criteria) this;
        }

        public Criteria andTouchIconLessThan(String value) {
            addCriterion("touch_icon <", value, "touchIcon");
            return (Criteria) this;
        }

        public Criteria andTouchIconLessThanOrEqualTo(String value) {
            addCriterion("touch_icon <=", value, "touchIcon");
            return (Criteria) this;
        }

        public Criteria andTouchIconLike(String value) {
            addCriterion("touch_icon like", value, "touchIcon");
            return (Criteria) this;
        }

        public Criteria andTouchIconNotLike(String value) {
            addCriterion("touch_icon not like", value, "touchIcon");
            return (Criteria) this;
        }

        public Criteria andTouchIconIn(List<String> values) {
            addCriterion("touch_icon in", values, "touchIcon");
            return (Criteria) this;
        }

        public Criteria andTouchIconNotIn(List<String> values) {
            addCriterion("touch_icon not in", values, "touchIcon");
            return (Criteria) this;
        }

        public Criteria andTouchIconBetween(String value1, String value2) {
            addCriterion("touch_icon between", value1, value2, "touchIcon");
            return (Criteria) this;
        }

        public Criteria andTouchIconNotBetween(String value1, String value2) {
            addCriterion("touch_icon not between", value1, value2, "touchIcon");
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