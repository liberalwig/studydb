package co.kr.mono.studydb.service;

import co.kr.mono.studydb.dao.AreaSalesDao;
import co.kr.mono.studydb.model.AreaSalesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SalesService {
    @Autowired
    AreaSalesDao areaSalesDao;

    public AreaSalesDTO selectSales(String areaCd){
        return areaSalesDao.findAreaSales(areaCd);
    }

    public Map<String, Object> selectSalesMap(String areaCd){
        return areaSalesDao.findAresaSalesMap(areaCd);
    }

    public Map<String, Object> selectMultiParamsMap(HashMap<String, Object> condMap){
        return areaSalesDao.findMsaleByMultiParm(condMap);
    }

    public List<HashMap<String, Object>> findMsaleByMultiReturn(Map<String, Object> condMap){
        return areaSalesDao.findMsaleByMultiReturn(condMap);
    }

}
