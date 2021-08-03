package com.xy.system.service.impl;

import java.util.List;
import com.xy.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.xy.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.xy.system.domain.TCustomerContact;
import com.xy.system.mapper.TCustomerMapper;
import com.xy.system.domain.TCustomer;
import com.xy.system.service.ITCustomerService;
import com.xy.common.core.text.Convert;

/**
 * 客户Service业务层处理
 * 
 * @author lusifer
 * @date 2021-08-02
 */
@Service
public class TCustomerServiceImpl implements ITCustomerService 
{
    @Autowired
    private TCustomerMapper tCustomerMapper;

    /**
     * 查询客户
     * 
     * @param customerId 客户ID
     * @return 客户
     */
    @Override
    public TCustomer selectTCustomerById(Long customerId)
    {
        return tCustomerMapper.selectTCustomerById(customerId);
    }

    /**
     * 查询客户列表
     * 
     * @param tCustomer 客户
     * @return 客户
     */
    @Override
    public List<TCustomer> selectTCustomerList(TCustomer tCustomer)
    {
        return tCustomerMapper.selectTCustomerList(tCustomer);
    }

    /**
     * 新增客户
     * 
     * @param tCustomer 客户
     * @return 结果
     */
    @Transactional
    @Override
    public int insertTCustomer(TCustomer tCustomer)
    {
        tCustomer.setCreateTime(DateUtils.getNowDate());
        int rows = tCustomerMapper.insertTCustomer(tCustomer);
        insertTCustomerContact(tCustomer);
        return rows;
    }

    /**
     * 修改客户
     * 
     * @param tCustomer 客户
     * @return 结果
     */
    @Transactional
    @Override
    public int updateTCustomer(TCustomer tCustomer)
    {
        tCustomer.setUpdateTime(DateUtils.getNowDate());
        tCustomerMapper.deleteTCustomerContactByContactId(tCustomer.getCustomerId());
        insertTCustomerContact(tCustomer);
        return tCustomerMapper.updateTCustomer(tCustomer);
    }

    /**
     * 删除客户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteTCustomerByIds(String ids)
    {
        tCustomerMapper.deleteTCustomerContactByContactIds(Convert.toStrArray(ids));
        return tCustomerMapper.deleteTCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息
     * 
     * @param customerId 客户ID
     * @return 结果
     */
    @Override
    public int deleteTCustomerById(Long customerId)
    {
        tCustomerMapper.deleteTCustomerContactByContactId(customerId);
        return tCustomerMapper.deleteTCustomerById(customerId);
    }

    /**
     * 新增客户的拜访记录信息
     * 
     * @param tCustomer 客户对象
     */
    public void insertTCustomerContact(TCustomer tCustomer)
    {
        List<TCustomerContact> tCustomerContactList = tCustomer.getTCustomerContactList();
        Long customerId = tCustomer.getCustomerId();
        if (StringUtils.isNotNull(tCustomerContactList))
        {
            List<TCustomerContact> list = new ArrayList<TCustomerContact>();
            for (TCustomerContact tCustomerContact : tCustomerContactList)
            {
                tCustomerContact.setContactId(customerId);
                list.add(tCustomerContact);
            }
            if (list.size() > 0)
            {
                tCustomerMapper.batchTCustomerContact(list);
            }
        }
    }
}
