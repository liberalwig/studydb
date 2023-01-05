package co.kr.mono.studydb.service;

import co.kr.mono.studydb.dao.MusicJoinDao;
import co.kr.mono.studydb.model.music.Album;
import co.kr.mono.studydb.model.music.Artist;
import co.kr.mono.studydb.model.music.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicJoinService {
    @Autowired
    MusicJoinDao musicJoinDao;

    public List<Album> searchArtistByAlbum(String mst_id){
        return musicJoinDao.selectArtistByAlbum(mst_id);
    }

    public Artist searchAlbumByArtist(String artist_id) {
        return musicJoinDao.selectAlbumByArtist(artist_id);
    }

   public List<Song> searchAlbumBySong(String songName){
        return musicJoinDao.selectAlbumBySong(songName);
    }

    public Artist searchSongByArtist(String artist_id) {
        return musicJoinDao.selectSongByArtist(artist_id);
    }

}
