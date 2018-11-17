package com.hundsun.ta.datacenter.daointerface;

import com.hundsun.ta.datacenter.dataobject.ETFSaleStatDO;

import java.util.List;

public interface ETFSaleStatDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TSALESTAT
     *
     * @mbggenerated
     */
    int insert(ETFSaleStatDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TSALESTAT
     *
     * @mbggenerated
     */
    int insertSelective(ETFSaleStatDO record);

    /**
     * 选择全部数据
     * @return
     */
    List<ETFSaleStatDO> selectAllData();
}