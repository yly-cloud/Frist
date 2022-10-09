package com.nsxy.mybatis.mapper;

import com.nsxy.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    /**
     * 根据ID查询员工信息
     *
     * @param empId
     * @return
     */
    Emp getEmpByEmpId(@Param("empId") Integer empId);


    /**
     * 获取员工以及所对应的部门信息
     *
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
     * 通过分步查询查询员工以及所对应的部门信息的第一步
     *
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 通过分步查询查询部门以及部门中的员工信息的第二步
     *
     * @param deptId
     * @return
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
