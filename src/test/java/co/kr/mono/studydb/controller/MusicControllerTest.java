package co.kr.mono.studydb.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
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
    @DisplayName("C: Albumlist -> Artist 매핑 [Association Mapping]")
    public void albumlistArtistTest() throws Exception {
        this.mockMvc.perform(get("/albumList/BS1"))
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
        this.mockMvc.perform(get("/song/BTS"))
                .andDo(print());
    }

    @Test
    public void albumTest() throws Exception {
        this.mockMvc.perform(get("/album/BTS"))
                .andDo(print());
    }

}