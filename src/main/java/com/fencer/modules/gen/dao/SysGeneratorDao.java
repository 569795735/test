package com.fencer.modules.gen.dao;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 * 
 * @author Fencer
 * @email 
 * @date 2017年11月19日 下午3:32:04
 */
public interface SysGeneratorDao {
	
	List<Map<String, Object>> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	Map<String, String> queryTable(String tableName);
	
	List<Map<String, String>> queryColumns(String tableName);
}
