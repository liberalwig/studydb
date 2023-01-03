package co.kr.mono.studydb.service;

import co.kr.mono.studydb.model.music.Album;
import co.kr.mono.studydb.model.music.Artist;
import co.kr.mono.studydb.model.music.Song;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class MusicJoinServiceTest {

    @Autowired
    MusicJoinService musicJoinService;

    ObjectMapper mapper;

    @BeforeEach
    void setup() {mapper = new ObjectMapper();}

    @Test
    @DisplayName("S: Albumlist -> Artist 매핑 [Association Mapping]")
    public void searchArtistByAlbumlist() throws JsonProcessingException {
        List<Album> albumList = musicJoinService.searchArtistByAlbumlist("BTS");
        log.info("Json 변환 : ", mapper.writeValueAsString(albumList));
    }

    @Test
    @DisplayName("S: Artist -> Album 매핑 [Collection Mapping]")
    public void searchAlbumByArtist() throws JsonProcessingException {
        Artist artist = musicJoinService.searchAlbumByArtist("BTS");
        log.info("Json 변환 : ", mapper.writeValueAsString(artist));
    }

    @Test
    @DisplayName("S: Song -> Album 매핑 [Association Mapping]")
    public void searchAlbumBySong() throws JsonProcessingException {
        List<Song> songs = musicJoinService.searchAlbumBySong("BTS");
        log.info("Json 변환 : ", mapper.writeValueAsString(songs));
    }
}