package co.kr.mono.studydb.model.music;

import co.kr.mono.studydb.model.music.Artist;
import lombok.Data;

import java.util.List;

@Data
public class Album {

    private String albumId;
    private String mstId;
    private int albumSeq;
    private String albumTitle;
    private String openDate;

    //@JsonIgnore
    //@ToString.Exclude
    private Artist artist;

    //@JsonIgnore
    //@ToString.Exclude
    private List<Song> songs;
}
