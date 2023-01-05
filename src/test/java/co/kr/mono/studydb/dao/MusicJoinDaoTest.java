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
    void selectArtistByAlbumTest(){
        List<Album> album = musicJoinDao.selectArtistByAlbum("BS1");
       // album.forEach(System.out::println);
        System.out.println(album);
    }

    @DisplayName("D: Artist -> Album 매핑 [Collection Mapping]")
    @Test
    void selectAlbumByArtistTest(){
        Artist artist = musicJoinDao.selectAlbumByArtist("BTS");
        System.out.println(artist);
    }

    @DisplayName("D: Song -> Album 매핑 [Association Mapping]")
    @Test
    void selectAlbumBySongTest(){
        List<Song> songs = musicJoinDao.selectAlbumBySong("Danger");
        System.out.println(songs);
    }

    @Test
    @DisplayName("C: Artist -> (Album 지나) Song 매핑 [Collection / Collection Mapping]")
    void selectSongByArtistTest(){
        Artist artist = musicJoinDao.selectSongByArtist("IU");
        System.out.println(artist);
    }
}