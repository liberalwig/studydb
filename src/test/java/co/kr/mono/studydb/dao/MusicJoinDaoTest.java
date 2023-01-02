package co.kr.mono.studydb.dao;
import co.kr.mono.studydb.model.music.Album;
import co.kr.mono.studydb.model.music.Artist;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import java.util.List;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//DAO Test
class MusicJoinDaoTest {

    @Autowired
    MusicJoinDao musicJoinDao;

    @DisplayName("Album -> Artist 매핑 [Association Mapping] ")
    @Test
    void selectArtistByPrimaryKeyTest(){
        List<Album> album = musicJoinDao.selectArtistByPrimaryKey1("BTS");
       // album.forEach(System.out::println);
        System.out.println(musicJoinDao);
    }

    @DisplayName("Artist -> Album 매핑 [Collection Mapping]")
    @Test
    void selectArtistByPrimaryKeyTest2(){
        Artist artist = musicJoinDao.selectArtistByPrimaryKey2("BTS");
        System.out.println(artist);
    }

//    @DisplayName("Album Id -> Song 매핑 [Collection Mapping]")
//    @Test
//    void selectAlbumByPrimaryKeyTest(){
//        Album album = musicJoinDao.selectAlbumByPrimaryKey("BS1");
//        System.out.println(album);
//    }
}