package co.kr.mono.studydb.controller;

import co.kr.mono.studydb.model.music.Album;
import co.kr.mono.studydb.model.music.Artist;
import co.kr.mono.studydb.model.music.Song;
import co.kr.mono.studydb.service.MusicJoinService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Json 으로 바꿔주는 역할
@Log4j2
public class MusicController {

    @Autowired
    MusicJoinService musicJoinService;

    @GetMapping("/album/{albumId}")
    public List<Album> album(@PathVariable String albumId){
        List<Album> albums = musicJoinService.searchArtistByAlbum(albumId);
        log.info(albums);
        return albums;
    }

    @GetMapping("/artist/{artistId}")
    public Artist artist(@PathVariable String artistId){
        Artist artist = musicJoinService.searchAlbumByArtist(artistId);
        log.info(artist);
        return artist;
    }

    @GetMapping("/song/{songName}")
    public List<Song> song(@PathVariable String songName){
        List<Song> song = musicJoinService.searchAlbumBySong(songName);
        log.info(song);
        return song;
    }

    @GetMapping("/artistSong/{artistId}")
    public Artist artistSong(@PathVariable String artistId){
        Artist artistSong = musicJoinService.searchSongByArtist(artistId);
        log.info(artistSong);
        return artistSong;
    }

}