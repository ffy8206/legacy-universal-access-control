package com.harry.uac.dao;

import com.harry.uac.persistence.SysParameter;
import com.harry.uac.persistence.SysParameterExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyBatisRepository
public interface SysParameterMapper {
	int countByExample(SysParameterExample example);

	int deleteByExample(SysParameterExample example);

	int insert(SysParameter record);

	int insertSelective(SysParameter record);

	List<SysParameter> selectByExample(SysParameterExample example);

	List<SysParameter> selectAll();

	int updateByExampleSelective(@Param("record") SysParameter record,
			@Param("example") SysParameterExample example);

	int updateByExample(@Param("record") SysParameter record,
			@Param("example") SysParameterExample example);
}