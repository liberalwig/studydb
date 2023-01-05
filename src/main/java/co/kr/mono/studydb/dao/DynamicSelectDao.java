
package co.kr.mono.studydb.dao;

import org.apache.ibatis.annotations.Mapper;

import javax.swing.plaf.PanelUI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface DynamicSelectDao {

    List<Map<String, Object>> subqueryInList(List<String> list);
    Map<String, Object>findGradeWithClassLike1(String str);
    List<Map<String, Object>>findGradeWithClassLike2(HashMap<String,String >hash);
    <K,V> List<Map<String, Object>>findChooseExam(Map<K, V> condition);
    List<Map<String,Object>> findExamTrim(Map<String, String> map);
}
