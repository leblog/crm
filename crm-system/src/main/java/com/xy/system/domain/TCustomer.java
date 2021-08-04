package com.xy.system.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.xy.common.annotation.Excel;
import com.xy.common.core.domain.BaseEntity;

/**
 * 客户对象 t_customer
 *
 * @author lusifer
 * @date 2021-08-02
 */

public class TCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户ID */
    private Long customerId;

    /** 商拓用户ID */
    @Excel(name = "商拓用户ID")
    private Long userId;

    /** 拜访时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "拜访时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date visitTime;

    /** 门头照片 */
    @Excel(name = "门头照片")
    private String visitPhoto;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String customerName;

    /** 门店类型(0综合店 1连锁店 ) */
    @Excel(name = "门店类型")
    private String storesType;

    /** 门店大小(单位平方) */
    @Excel(name = "门店大小")
    private String storesSize;

    /** 门店员工数量(0:1-10, 1:11-20, 2:21-30,4:31-50, 5:51-100, 6:100以上) */
    @Excel(name = "门店员工数量",readConverterExp="10=1-10人, 1=11-20人, 2=21-30人,4=31-50人, 5=51-100人, 6=100人以上", prompt="请填对应的数字")
    private String employeesNums;

    /** 地区 */
    @Excel(name = "地区")
    private String location;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String addressDesc;

    /** 是否签署邀约函 (0:未签约, 1:已签约) */
    @Excel(name = "是否签署邀约函")
    private String isSigned;

    /** 数据创建人 */
    @Excel(name = "数据创建人")
    private String founder;

    /** 现阶段跟进人 */
    @Excel(name = "现阶段跟进人")
    private String follower;

    /** 法人/店长 */
    @Excel(name = "法人/店长")
    private String keyPerson;

    /** 法人店长的联系方式 */
    @Excel(name = "法人店长的联系方式")
    private Long keyPersonTel;

    /** 客户满意度1-5个等级 */
    @Excel(name = "客户满意度")
    private String customerSatisfaction;

    /** 客户级别(0:普通客户1:战略合作伙伴2:大客户3:重点开发客户) */
    @Excel(name = "客户级别")
    private String customerLevel;

    /** 信用度 */
    @Excel(name = "信用度")
    private String credit;

    /** 进度 */
    @Excel(name = "进度")
    private String progress;

    /** 小记 */
    @Excel(name = "小记")
    private String reporter;

    /** 机会来源(同事介绍\官网\广告) */
    @Excel(name = "机会来源")
    private String customerSource;

    /** 删除标志 */
    private String delFlag;

    /** 客户的拜访记录信息 */
    private List<TCustomerContact> tCustomerContactList;

    public void setCustomerId(Long customerId)
    {
        this.customerId = customerId;
    }

    public Long getCustomerId()
    {
        return customerId;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }
    public void setVisitTime(Date visitTime)
    {
        this.visitTime = visitTime;
    }

    public Date getVisitTime()
    {
        return visitTime;
    }
    public void setVisitPhoto(String visitPhoto)
    {
        this.visitPhoto = visitPhoto;
    }

    public String getVisitPhoto()
    {
        return visitPhoto;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerName()
    {
        return customerName;
    }
    public void setStoresType(String storesType)
    {
        this.storesType = storesType;
    }

    public String getStoresType()
    {
        return storesType;
    }
    public void setStoresSize(String storesSize)
    {
        this.storesSize = storesSize;
    }

    public String getStoresSize()
    {
        return storesSize;
    }
    public void setEmployeesNums(String employeesNums)
    {
        this.employeesNums = employeesNums;
    }

    public String getEmployeesNums()
    {
        return employeesNums;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getLocation()
    {
        return location;
    }
    public void setAddressDesc(String addressDesc)
    {
        this.addressDesc = addressDesc;
    }

    public String getAddressDesc()
    {
        return addressDesc;
    }
    public void setIsSigned(String isSigned)
    {
        this.isSigned = isSigned;
    }

    public String getIsSigned()
    {
        return isSigned;
    }
    public void setFounder(String founder)
    {
        this.founder = founder;
    }

    public String getFounder()
    {
        return founder;
    }
    public void setFollower(String follower)
    {
        this.follower = follower;
    }

    public String getFollower()
    {
        return follower;
    }
    public void setKeyPerson(String keyPerson)
    {
        this.keyPerson = keyPerson;
    }

    public String getKeyPerson()
    {
        return keyPerson;
    }
    public void setKeyPersonTel(Long keyPersonTel)
    {
        this.keyPersonTel = keyPersonTel;
    }

    public Long getKeyPersonTel()
    {
        return keyPersonTel;
    }
    public void setCustomerSatisfaction(String customerSatisfaction)
    {
        this.customerSatisfaction = customerSatisfaction;
    }

    public String getCustomerSatisfaction()
    {
        return customerSatisfaction;
    }
    public void setCustomerLevel(String customerLevel)
    {
        this.customerLevel = customerLevel;
    }

    public String getCustomerLevel()
    {
        return customerLevel;
    }
    public void setCredit(String credit)
    {
        this.credit = credit;
    }

    public String getCredit()
    {
        return credit;
    }
    public void setProgress(String progress)
    {
        this.progress = progress;
    }

    public String getProgress()
    {
        return progress;
    }
    public void setReporter(String reporter)
    {
        this.reporter = reporter;
    }

    public String getReporter()
    {
        return reporter;
    }
    public void setCustomerSource(String customerSource)
    {
        this.customerSource = customerSource;
    }

    public String getCustomerSource()
    {
        return customerSource;
    }
    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag()
    {
        return delFlag;
    }

    public List<TCustomerContact> getTCustomerContactList()
    {
        return tCustomerContactList;
    }

    public void setTCustomerContactList(List<TCustomerContact> tCustomerContactList)
    {
        this.tCustomerContactList = tCustomerContactList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("customerId", getCustomerId())
            .append("userId", getUserId())
            .append("visitTime", getVisitTime())
            .append("visitPhoto", getVisitPhoto())
            .append("customerName", getCustomerName())
            .append("storesType", getStoresType())
            .append("storesSize", getStoresSize())
            .append("employeesNums", getEmployeesNums())
            .append("location", getLocation())
            .append("addressDesc", getAddressDesc())
            .append("isSigned", getIsSigned())
            .append("founder", getFounder())
            .append("follower", getFollower())
            .append("keyPerson", getKeyPerson())
            .append("keyPersonTel", getKeyPersonTel())
            .append("customerSatisfaction", getCustomerSatisfaction())
            .append("customerLevel", getCustomerLevel())
            .append("credit", getCredit())
            .append("progress", getProgress())
            .append("reporter", getReporter())
            .append("customerSource", getCustomerSource())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("tCustomerContactList", getTCustomerContactList())
            .toString();
    }
}
