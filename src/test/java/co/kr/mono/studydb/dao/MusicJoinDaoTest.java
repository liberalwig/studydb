package co.kr.mono.studydb.dao;
import co.kr.mono.studydb.model.music.Album;
import co.kr.mono.studydb.model.music.Artist;
import co.kr.mono.studydb.model.music.Song;
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

    @DisplayName("D: Album -> Artist 매핑 [Association Mapping] ")
    @Test
    void selectArtistByPrimaryKeyTest(){
        List<Album> album = musicJoinDao.selectArtistByAlbumlist("BTS");
       // album.forEach(System.out::println);
        System.out.println(musicJoinDao);
    }

    @DisplayName("D: Artist -> Album 매핑 [Collection Mapping]")
    @Test
    void selectArtistByPrimaryKeyTest2(){
        Artist artist = musicJoinDao.selectArtistAlbumByPrimaryKey2("BTS");
        System.out.println(artist);
    }

    @DisplayName("D: Song -> Album 매핑 [Association Mapping]")
    @Test
    void selectAlbumByPrimaryKey1Test(){
        List<Song> songs = musicJoinDao.selectAlbumSongByPrimaryKey1("BS1");
        System.out.println(songs);
    }

//    @DisplayName("Album Id -> Artist, Album Id -> Song 매핑 [Association / Collection Mapping]")
//    @Test
//    void selectSongByPrimaryKeyTest(){
//         Song songs = musicJoinDao.selectAlbumByPrimaryKey1("BS1");
//        System.out.println(songs);
//    }
}