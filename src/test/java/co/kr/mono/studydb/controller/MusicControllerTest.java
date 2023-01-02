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
    @DisplayName("Album 에 담긴 노래목록 조회")
    public void albumListTest() throws Exception {
        this.mockMvc.perform(get("/albumList/BTS"))
                .andDo(print());
    }

    @Test
    public void artistTest() throws Exception {
        this.mockMvc.perform(get("/artist/BTS"))
                .andDo(print());
    }

    @Test
    public void albumTest() throws Exception {
        this.mockMvc.perform(get("/album/BTS"))
                .andDo(print());
    }

    @Test
    public void songTest() throws Exception {
        this.mockMvc.perform(get("/song/BTS"))
                .andDo(print());
    }

}