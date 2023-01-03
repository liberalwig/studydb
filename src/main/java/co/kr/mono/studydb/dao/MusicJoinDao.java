package co.kr.mono.studydb.dao;

import co.kr.mono.studydb.model.music.Album;
import java.util.List;

import co.kr.mono.studydb.model.music.Artist;
import co.kr.mono.studydb.model.music.Song;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicJoinDao {
    public List<Album> selectArtistByAlbumlist(String mst_id);
    public Artist selectArtistAlbumByPrimaryKey2(String mst_id);
    public List<Song> selectAlbumSongByPrimaryKey1(String album_id);
//    public Song selectAlbumByPrimaryKey2(String album_id);
}
