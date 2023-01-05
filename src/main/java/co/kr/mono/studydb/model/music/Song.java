package co.kr.mono.studydb.model.music;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Song {
    private String songName; // PK
    private String albumId; // FK, PK
    private Float playTime;

    @JsonIgnore
    @ToString.Exclude
    private Album album; // Association 또는 Collection 추가하려면 필드 넣어야 함

}
