package com.scsj.haos.mapper;

import com.scsj.haos.common.domain.Cus;
import com.scsj.haos.common.domain.CusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CusMapper {
    long countByExample(CusExample example);

    int deleteByExample(CusExample example);

    int deleteByPrimaryKey(String id);

    int insert(Cus record);

    int insertSelective(Cus record);

    List<Cus> selectByExample(CusExample example);

    Cus selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Cus record, @Param("example") CusExample example);

    int updateByExample(@Param("record") Cus record, @Param("example") CusExample example);

    int updateByPrimaryKeySelective(Cus record);

    int updateByPrimaryKey(Cus record);
}