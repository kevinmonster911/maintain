package online.zhaopei.myproject.mapper.para;

import java.io.Serializable;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import online.zhaopei.myproject.domain.para.Para;
import online.zhaopei.myproject.sqlprovide.para.UnitSqlProvide;

public interface UnitMapper extends Serializable {

	@Results(id = "unitResult", value = {
		@Result(property = "code", column = "unit_code", id = true),
		@Result(property = "name", column = "unit_name")
	})
	@SelectProvider(type = UnitSqlProvide.class, method = "getUnitByCodeSql")
	Para getUnitByCode(String unitCode);
}
