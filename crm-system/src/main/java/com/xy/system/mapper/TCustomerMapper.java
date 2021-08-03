package com.xy.system.mapper;

import java.util.List;
import com.xy.system.domain.TCustomer;
import com.xy.system.domain.TCustomerContact;

/**
 * 客户Mapper接口
 * 
 * @author lusifer
 * @date 2021-08-02
 */
public interface TCustomerMapper 
{
    /**
     * 查询客户
     * 
     * @param customerId 客户ID
     * @return 客户
     */
    public TCustomer selectTCustomerById(Long customerId);

    /**
     * 查询客户列表
     * 
     * @param tCustomer 客户
     * @return 客户集合
     */
    public List<TCustomer> selectTCustomerList(TCustomer tCustomer);

    /**
     * 新增客户
     * 
     * @param tCustomer 客户
     * @return 结果
     */
    public int insertTCustomer(TCustomer tCustomer);

    /**
     * 修改客户
     * 
     * @param tCustomer 客户
     * @return 结果
     */
    public int updateTCustomer(TCustomer tCustomer);

    /**
     * 删除客户
     * 
     * @param customerId 客户ID
     * @return 结果
     */
    public int deleteTCustomerById(Long customerId);

    /**
     * 批量删除客户
     * 
     * @param customerIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTCustomerByIds(String[] customerIds);

    /**
     * 批量删除客户的拜访记录
     * 
     * @param customerIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTCustomerContactByContactIds(String[] customerIds);
    
    /**
     * 批量新增客户的拜访记录
     * 
     * @param tCustomerContactList 客户的拜访记录列表
     * @return 结果
     */
    public int batchTCustomerContact(List<TCustomerContact> tCustomerContactList);
    

    /**
     * 通过客户ID删除客户的拜访记录信息
     * 
     * @param customerId 客户ID
     * @return 结果
     */
    public int deleteTCustomerContactByContactId(Long customerId);
}
