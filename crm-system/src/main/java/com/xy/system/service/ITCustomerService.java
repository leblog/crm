package com.xy.system.service;

import java.util.List;
import com.xy.system.domain.TCustomer;

/**
 * 客户Service接口
 * 
 * @author lusifer
 * @date 2021-08-02
 */
public interface ITCustomerService 
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
     * 批量删除客户
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTCustomerByIds(String ids);

    /**
     * 删除客户信息
     * 
     * @param customerId 客户ID
     * @return 结果
     */
    public int deleteTCustomerById(Long customerId);
}
