package co.kr.mono.studydb.dao;
import co.kr.mono.studydb.model.music.Album;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import java.util.List;


/*
import static org.junit.jupiter.api.Assertions.*;

import co.kr.mono.studydb.model.music.Album;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import static org.junit.jupiter.api.Assertions.*;
*/

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//DAO Test
class MusicJoinDaoTest {

    @Autowired
    MusicJoinDao musicJoinDao;

    @DisplayName("Artist로 album -> artist 매핑(Association Mapping)")
    @Test
    void selectArtistByPrimaryKeyTest(){
        List<Album> album = musicJoinDao.selectArtistByPrimaryKey1("BTS");
       // album.forEach(System.out::println);
        System.out.println(musicJoinDao);
    }
}