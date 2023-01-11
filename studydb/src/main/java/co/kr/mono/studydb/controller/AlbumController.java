package co.kr.mono.studydb.controller;


import co.kr.mono.studydb.model.music.Album;
import co.kr.mono.studydb.service.MusicJoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AlbumController {

    @Autowired
    MusicJoinService albumService;
/*

    @GetMapping("/album/{mst_id}")
    public List<Album> albumTest(@PathVariable String mst_id){
        return albumService.albumList(mst_id);
    }
*/

    /*@GetMapping("/album")
    public Album albumTest2(@RequestParam String mst_id){
        return albumService.album(mst_id);
    }*/

}
