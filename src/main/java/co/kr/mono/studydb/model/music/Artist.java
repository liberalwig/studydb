package co.kr.mono.studydb.model.music;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class Artist {
    private String mstId; // PK, FK
    private String mstName;
    private String debutDate;

    @JsonIgnore
    //@ToString.Exclude
    private List<Album> album;

    @JsonIgnore // Json 만들 때 그 컬럼을 빼겠다
    //@ToString.Exclude
    private  List<Song> songs; //album_id

}
