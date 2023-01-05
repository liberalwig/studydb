package co.kr.mono.studydb.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class MusicControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("C: Album -> Artist 매핑 [Association Mapping]")
    public void albumArtistTest() throws Exception {
        this.mockMvc.perform(get("/album/BS1"))
                .andDo(print());
    }

    @Test
    @DisplayName("C: Artist -> Album 매핑 [Collection Mapping]")
    public void artistAlbumTest() throws Exception {
        this.mockMvc.perform(get("/artist/BTS"))
                .andDo(print());
    }

    @Test
    @DisplayName("C: Song -> Album 매핑 [Association Mapping]")
    public void songAlbumTest() throws Exception {
        this.mockMvc.perform(get("/song/Lost"))
                .andDo(print());
    }

    @Test
    @DisplayName("C: Artist -> (Album 지나) Song 매핑 [Collection / Association Mapping]")
    public void artistSongTest() throws Exception {
        this.mockMvc.perform(get("/artistSong/IU"))
                .andDo(print());
    }

}