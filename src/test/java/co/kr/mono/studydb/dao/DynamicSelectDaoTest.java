package co.kr.mono.studydb.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.ApplicationContext;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DynamicSelectDaoTest {

    @Autowired
    DynamicSelectDao dynamicSelectDao;
    //@Autowired
    ApplicationContext applicationContext;

    ObjectMapper mapper;

    @BeforeEach
    void setup(){
        mapper = new ObjectMapper();
    }

    /*@Test
    @DisplayName("subquery inList 동적 sql 생성")
    void selectInList() throws JsonProcessingException{

        *//*for each*//*
        List<String> clsNames = new ArrayList<>(Arrays.asList("별림반, 달림반"));
        List<Map<String, Object>> clsResult = dynamicSelectDao.subqueryInList(clsNames);
        //log.info("JSON 변환 : {} ", mapper.writeValueAsString(clsResult));
    }*/

    @Test
    public void subqueryInListTest(){
        List<String> classId = new ArrayList<>(Arrays.asList("달림반","별림반","샛별반"));

        List<Map<String,Object>> result = dynamicSelectDao.subqueryInList(classId);
    }

    @Test
    @DisplayName("2")
    public void selectIfTest1() throws JsonProcessingException{
        String name ="송해";
        dynamicSelectDao.findGradeWithClassLike1(name)
                .forEach((key,val)-> System.out.println(String.format("key : %s, Val : %s",key,val)));

        name = null;
        dynamicSelectDao.findGradeWithClassLike1(name)
                .forEach((key,val)-> System.out.println(String.format("key : %s, Val : %s",key,val)));
    }

    @Test
    @DisplayName("3")
    public void selectIfTest2() throws JsonProcessingException{

        HashMap<String, String> parameter = new HashMap<>();
        dynamicSelectDao.findGradeWithClassLike2(parameter)
                .forEach(user->user.forEach((key,val)-> System.out.println(String.format("key : %s, val : %s",key,val))));

        parameter.put("grade","1");
        dynamicSelectDao.findGradeWithClassLike2(parameter)
                .forEach(user->user.forEach((key,val)-> System.out.println(String.format("key : %s, val : %s",key,val))));


        parameter.put("name", "이");
        dynamicSelectDao.findGradeWithClassLike2(parameter)
                .forEach(user->user.forEach((key,val)-> System.out.println(String.format("key : %s, val : %s",key,val))));
    }
    @Test
    @DisplayName("4")
    public void selectIfTest3() throws JsonProcessingException{

        Map<String, String> parameter = new HashMap<>();
        findResultlistMap(dynamicSelectDao,null);

        parameter.put("grade","3");
        findResultlistMap(dynamicSelectDao,parameter);

        parameter.put("name","이정우");
        findResultlistMap(dynamicSelectDao,parameter);
    }

    public static <K,V> void findResultlistMap(DynamicSelectDao dynamicSelectDao, Map<K,V> parameter){
        dynamicSelectDao.findChooseExam(parameter)
                .forEach(user->user.forEach((key,val)-> System.out.println(String.format("key : %s, val : %s",key,val))));
    }

    @Test
    void findExamTrimTest(){

        Map<String, String> parameter = new HashMap<>();
        parameter.put("grade", "1");


        dynamicSelectDao.findExamTrim(parameter)
                .forEach(user->user.forEach((key,val)-> System.out.println(String.format("key : %s, val : %s", key, val))));

        parameter.put("name", "이정우");
        dynamicSelectDao.findExamTrim(parameter)
                .forEach(user->user.forEach((key,val)-> System.out.println(String.format("key : %s, val : %s", key, val))));

    }



}