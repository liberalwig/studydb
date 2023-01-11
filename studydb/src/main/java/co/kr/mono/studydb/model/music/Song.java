package co.kr.mono.studydb.model.music;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Song {
    private String albumId;
    private String songName;
    private Float playTime;
    /*private Album album; */

    //private Artist artist;
}
