package com.xy.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.xy.common.annotation.Excel;
import com.xy.common.core.domain.BaseEntity;

/**
 * 客户的拜访记录对象 t_customer_contact
 * 
 * @author lusifer
 * @date 2021-08-02
 */
public class TCustomerContact extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 拜访记录ID */
    private Long contactId;

    /** 销售ID */
    @Excel(name = "销售ID")
    private Long userId;

    /** 计划项 */
    @Excel(name = "计划项")
    private String plan;

    /** 计划时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "计划时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planTime;

    /** 执行效果 */
    @Excel(name = "执行效果")
    private String result;

    /** 我的解决方案 */
    @Excel(name = "我的解决方案")
    private String solution;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 点评(经理的评价) */
    @Excel(name = "点评(经理的评价)")
    private String evaluation;

    /** 点评人的姓名 */
    @Excel(name = "点评人的姓名")
    private String evaluationBy;

    /** 点评时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "点评时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date evaluationTime;

    public void setContactId(Long contactId) 
    {
        this.contactId = contactId;
    }

    public Long getContactId() 
    {
        return contactId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setPlan(String plan) 
    {
        this.plan = plan;
    }

    public String getPlan() 
    {
        return plan;
    }
    public void setPlanTime(Date planTime) 
    {
        this.planTime = planTime;
    }

    public Date getPlanTime() 
    {
        return planTime;
    }
    public void setResult(String result) 
    {
        this.result = result;
    }

    public String getResult() 
    {
        return result;
    }
    public void setSolution(String solution) 
    {
        this.solution = solution;
    }

    public String getSolution() 
    {
        return solution;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setEvaluation(String evaluation) 
    {
        this.evaluation = evaluation;
    }

    public String getEvaluation() 
    {
        return evaluation;
    }
    public void setEvaluationBy(String evaluationBy) 
    {
        this.evaluationBy = evaluationBy;
    }

    public String getEvaluationBy() 
    {
        return evaluationBy;
    }
    public void setEvaluationTime(Date evaluationTime) 
    {
        this.evaluationTime = evaluationTime;
    }

    public Date getEvaluationTime() 
    {
        return evaluationTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("contactId", getContactId())
            .append("userId", getUserId())
            .append("plan", getPlan())
            .append("planTime", getPlanTime())
            .append("result", getResult())
            .append("solution", getSolution())
            .append("delFlag", getDelFlag())
            .append("evaluation", getEvaluation())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("evaluationBy", getEvaluationBy())
            .append("evaluationTime", getEvaluationTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
