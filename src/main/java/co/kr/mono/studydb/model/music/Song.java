package co.kr.mono.studydb.model.music;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Song {
    private String albumId; // FK, PK
    private String songName; // PK
    private Float playTime;
    private Album album; // Association 추가하려면 필드 넣어야 함
}
