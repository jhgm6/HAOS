package com.scsj.haos.mapper;

import com.scsj.haos.common.domain.Mat;
import com.scsj.haos.common.domain.MatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MatMapper {
    long countByExample(MatExample example);

    int deleteByExample(MatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mat record);

    int insertSelective(Mat record);

    List<Mat> selectByExample(MatExample example);

    Mat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mat record, @Param("example") MatExample example);

    int updateByExample(@Param("record") Mat record, @Param("example") MatExample example);

    int updateByPrimaryKeySelective(Mat record);

    int updateByPrimaryKey(Mat record);
}