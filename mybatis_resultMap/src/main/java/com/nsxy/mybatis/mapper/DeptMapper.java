package com.nsxy.mybatis.mapper;

import com.nsxy.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    /**
     * 通过分步查询查询员工以及所对应的部门信息的第二步
     *
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

}
