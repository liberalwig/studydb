package co.kr.mono.studydb.dao;

import co.kr.mono.studydb.model.music.Album;
import java.util.List;

import co.kr.mono.studydb.model.music.Artist;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicJoinDao {
    public List<Album> selectArtistByPrimaryKey1(String mst_id);
    public Artist selectArtistByPrimaryKey2(String mst_id);
    public Album selectAlbumByPrimaryKey(String album_id);
}
