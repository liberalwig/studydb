package co.kr.mono.studydb.dao;

import co.kr.mono.studydb.model.music.Album;
import java.util.List;

import co.kr.mono.studydb.model.music.Artist;
import co.kr.mono.studydb.model.music.Song;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicJoinDao {
    List<Album> selectArtistByAlbum(String album_id);
    Artist selectAlbumByArtist(String artist_id);
    List<Song> selectAlbumBySong(String songName);
    Artist selectSongByArtist(String artist_id);
}
