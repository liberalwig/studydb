package co.kr.mono.studydb.dao;
import co.kr.mono.studydb.model.AreaSalesDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@MybatisTest

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class AreaSalesDaoTest {

    @Autowired //mapper 연결
    private AreaSalesDao areaSalesDao;

    @Test
    @DisplayName("areaSaleMapper Test")
    public void areaSaleMapperTest(){
        AreaSalesDTO areaSalesDTO = areaSalesDao.findAreaSales("10");
    }

    @Test
    @DisplayName("Exam Test")
    public  void ExamTest(){
        AreaSalesDTO testDTO = areaSalesDao.testid("이정우"); //이정우를 testid sql문에 넣고 나온 결과를 testDTO에 담기
    }

    @Test
    @DisplayName("DTO 없이 Map으로 대체")
    public void findAreaSalesMapTest(){
        areaSalesDao.findAresaSalesMap("10"); //
      /*  Map<String, Object> areaSaleMap = areaSalesDao.findAresaSalesMap("10"); //xml 보면 파라미터가 string임

        areaSaleMap.forEach((key,val)-> {
            System.out.println(String.format("key : %s, Value : %s", key, val));
        });*/

        /*areaSalesDao.findAresaSalesMap("10").forEach((key,val)-> {
            System.out.println(String.format("key : %s, Value : %s", key, val));
        });
        이렇게 해도 같은 것임
        */
    }

    @Test
    @DisplayName("MultiParameter map으로 전달")
    public void findMsaleByMultiParmTest(){

        HashMap<String, Object> condMap = new HashMap<>();
        condMap.put("PRODID", "10");
        condMap.put("PRODNM", "notebook");
        Map<String, Object> areaParamMap = areaSalesDao.findMsaleByMultiParm(condMap);
        areaParamMap.forEach((key,val)-> {
            System.out.println(String.format("key : %s, Value : %s", key, val));
        });
    }
    @Test
    @DisplayName("MulitParam MultiReturn 작성")
    public void findMsaleByMultiReturnTest(){

        HashMap<String, Object> condMap = new HashMap<>();
        condMap.put("PRODID", "10");
        condMap.put("PRODNM", "notebook");

        List<HashMap<String, Object>> rsltlist = areaSalesDao.findMsaleByMultiReturn(condMap);

        rsltlist.stream().forEach(System.out::println);


    }
}