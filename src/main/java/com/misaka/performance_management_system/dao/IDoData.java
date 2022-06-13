package com.misaka.performance_management_system.dao;

import java.util.List;
import java.util.Map;

public interface IDoData {
    int save(Object obj);

    int batchSave(List objs);

    int update(Object obj);

    int batchUpdate(List objs);

    int delete(Object obj);

    int batchDelete(List objs);

    int updateField(Map<String,Object> values);

    Object getMe(Object obj);

    List<Map<String,Object>> findForMap(Map values);

    List<Map<String,Object>> fastFind(Map values);

    List<?> find(Map values);

    List<Map<String,Object>> findByPage(Map conValues);

    int getRowsCount(Map values);

}
