package co.kr.mono.studydb.controller;

import co.kr.mono.studydb.model.AreaSalesDTO;
import co.kr.mono.studydb.service.SalesService;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController //결과를 뷰로 주지 않고 데이터로 달라 //@Controller는 화면에 띄우기 위해 필요
@Log4j2
public class SalesController {
    @Autowired
    SalesService salesService;

    //http://localhost:8000/salelist/10
    @GetMapping("/salelist/{areacd}")
    public AreaSalesDTO saleList(@PathVariable String areacd){ //@PathVariable uri 변수
        AreaSalesDTO dto = salesService.selectSales(areacd);
        log.info(areacd);
        return dto;
    }

    //http://localhost:8000/salemap/10
    @GetMapping("/salemap/{areacd}")
    public Map<String, Object> SalesMap(@PathVariable String areacd){
        Map<String, Object> map = salesService.selectSalesMap(areacd);
        log.info(areacd);
        return map;
    }

    @GetMapping("salemaplist")
    // http://localhost:8000/salemaplist?PRODID=10&PRODNM=notebook
    public Map<String, Object> SalesMapParam(@RequestParam HashMap<String, Object> param){
        /*HashMap<String, Object> paramVal = new HashMap<>();

        paramVal.put("PRODID", param.get("PRODID"));
        paramVal.put("PRODNM", param.get("PRODNM"));
        log.info(paramVal);*/

        Map<String, Object> map = salesService.selectMultiParamsMap(param);
        return map;
    }

    @GetMapping("/mulitlist")
    //http://localhost:8000/mulitlist?PRODID=10&PRODNM=not
    public List<HashMap<String, Object>> SalesMapParamMulit(@RequestParam Map<String, String> param){

        Map<String, Object> paramVal = new HashMap<>();

        paramVal.put("PRODID", param.get("PRODID"));
        paramVal.put("PRODNM", param.get("PRODNM"));

        List<HashMap<String, Object>> listmap = salesService.findMsaleByMultiReturn(paramVal);
        return listmap;
    }

    //=======@Controller를 사용하는 경우 @ResponseBody만 추가하면 됨

    /*@GetMapping("/mulitlist")
    @ResponseBody
    //http://localhost:8000/mulitlist?PRODID=10&PRODNM=not
    public List<HashMap<String, Object>> SalesMapParamMulit(@RequestParam Map<String, String> param){

        Map<String, Object> paramVal = new HashMap<>();

        paramVal.put("PRODID", param.get("PRODID"));
        paramVal.put("PRODNM", param.get("PRODNM"));

        List<HashMap<String, Object>> listmap = salesService.findMsaleByMultiReturn(paramVal);

        return listmap;
    }*/


}
