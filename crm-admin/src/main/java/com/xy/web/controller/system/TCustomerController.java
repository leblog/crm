package com.xy.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xy.common.annotation.Log;
import com.xy.common.enums.BusinessType;
import com.xy.system.domain.TCustomer;
import com.xy.system.service.ITCustomerService;
import com.xy.common.core.controller.BaseController;
import com.xy.common.core.domain.AjaxResult;
import com.xy.common.utils.poi.ExcelUtil;
import com.xy.common.core.page.TableDataInfo;

/**
 * 客户Controller
 *
 * @author lusifer
 * @date 2021-08-02
 */
@Controller
@RequestMapping("/system/t_customer")
public class TCustomerController extends BaseController
{
    private String prefix = "system/t_customer";

    @Autowired
    private ITCustomerService tCustomerService;

    @RequiresPermissions("system:t_customer:view")
    @GetMapping()
    public String t_customer()
    {
        return prefix + "/t_customer";
    }

    /**
     * 查询客户列表
     */
    @RequiresPermissions("system:t_customer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TCustomer tCustomer)
    {
        startPage();
        List<TCustomer> list = tCustomerService.selectTCustomerList(tCustomer);
        return getDataTable(list);
    }

    /**
     * 导出客户列表
     */
    @RequiresPermissions("system:t_customer:export")
    @Log(title = "客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TCustomer tCustomer)
    {
        List<TCustomer> list = tCustomerService.selectTCustomerList(tCustomer);
        ExcelUtil<TCustomer> util = new ExcelUtil<TCustomer>(TCustomer.class);
        return util.exportExcel(list, "客户数据");
    }

    /**
     * 新增客户
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户
     */
    @RequiresPermissions("system:t_customer:add")
    @Log(title = "客户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TCustomer tCustomer)
    {
        return toAjax(tCustomerService.insertTCustomer(tCustomer));
    }

    /**
     * 修改客户
     */
    @GetMapping("/edit/{customerId}")
    public String edit(@PathVariable("customerId") Long customerId, ModelMap mmap)
    {
        TCustomer tCustomer = tCustomerService.selectTCustomerById(customerId);
        mmap.put("tCustomer", tCustomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户
     */
    @RequiresPermissions("system:t_customer:edit")
    @Log(title = "客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TCustomer tCustomer)
    {
        return toAjax(tCustomerService.updateTCustomer(tCustomer));
    }

    /**
     * 删除客户
     */
    @RequiresPermissions("system:t_customer:remove")
    @Log(title = "客户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tCustomerService.deleteTCustomerByIds(ids));
    }
}
