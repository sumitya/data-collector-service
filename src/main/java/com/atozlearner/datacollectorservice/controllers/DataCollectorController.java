package com.atozlearner.datacollectorservice.controllers;

import com.atozlearner.datacollectorservice.models.YouTubeItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/youtube")
public class DataCollectorController {

    @Autowired
    RestTemplate restTemplate;

    //@RequestMapping("/youtube")
    //public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

    @RequestMapping("/video")
    public YouTubeItem getYouTubeTrendingVideo() {
        // How to create new YouTube API and use to fetch the youtube video.
        return restTemplate.
                getForObject("https://youtube.googleapis.com/youtube/v3/videos?part=snippet&chart=mostPopular&maxResults=2&regionCode=IN&key=AIzaSyCWfxnH6SEaCDXrYYaFcjSkbw7wtdFtPvQ", YouTubeItem.class);
        //System.out.println(videoSummary.getEtag());

    }
}
