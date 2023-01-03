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

    public List<Album> searchArtistByAlbumlist(String mst_id){
        return musicJoinDao.selectArtistByAlbumlist(mst_id);
    }

    public Artist searchAlbumByArtist(String mst_id) {
        return musicJoinDao.selectArtistAlbumByPrimaryKey2(mst_id);
    }

   public List<Song> searchAlbumBySong(String album_id){
        return musicJoinDao.selectAlbumSongByPrimaryKey1(album_id);
    }

}
