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

    public List<Album> searchArtistList(String mst_id){
        return musicJoinDao.selectArtistByPrimaryKey1(mst_id);
    }

    public Artist searchArtist(String mst_id) {
        return musicJoinDao.selectArtistByPrimaryKey2(mst_id);
    }

   public List<Song> searchAlbum(String album_id){
        return musicJoinDao.selectAlbumByPrimaryKey1(album_id);
    }

}
