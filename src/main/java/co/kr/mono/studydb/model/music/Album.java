package co.kr.mono.studydb.model.music;

import co.kr.mono.studydb.model.music.Artist;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
public class Album {

    private String albumId; // PK
    private String mstId; // FK
    private int albumSeq;
    private String albumTitle;
    private String openDate;

    //@JsonIgnore
    //@ToString.Exclude
    private Artist artist;

    @JsonIgnore
    @ToString.Exclude
    private List<Song> songs;
}
