package co.kr.mono.studydb.service;

import co.kr.mono.studydb.dao.MusicJoinDao;
import co.kr.mono.studydb.model.music.Album;
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
/*
    public List<Album> albumList(String mst_id){
       return musicJoinDao.selectArtistByPrimaryKey1(mst_id);
    }
*/

   /* public Album album(String mst_id){
        return musicJoinDao.selectArtistByPrimaryKey3(mst_id);
    }*/
}
