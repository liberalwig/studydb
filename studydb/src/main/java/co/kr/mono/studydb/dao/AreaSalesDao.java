package co.kr.mono.studydb.dao;

import co.kr.mono.studydb.model.AreaSalesDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper //구현체를 자동으로 만들어줌
public interface AreaSalesDao {
    public AreaSalesDTO findAreaSales(String areaCd);
    public Map<String, Object> findAresaSalesMap(String areacd);
    public Map<String, Object> findMsaleByMultiParm(HashMap<String, Object> condmap);
    public List<HashMap<String, Object>> findMsaleByMultiReturn(Map<String, Object> condmap);

    public AreaSalesDTO testid(String name);
}
