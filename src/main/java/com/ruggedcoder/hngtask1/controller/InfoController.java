package com.ruggedcoder.hngtask1.controller;

import com.ruggedcoder.hngtask1.response.InfoResponse;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    public InfoController() {
    }

    @GetMapping({"/info"})
    public ResponseEntity<InfoResponse> getInfo(@RequestParam String slackName, @RequestParam int utcOffset, @RequestParam String track) {
        InfoResponse response = new InfoResponse();
        LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
        String UtcTime = DayOfWeek.from(now).toString();
        if (utcOffset >= -2 && utcOffset <= 2) {
            response.setUtcTime(now.toString());
            response.setSlackName("Nwachukwu Chinaza Esther");
            response.setCurrentDay("Monday");
            response.setUtcTime(now.toString());
            response.setTrack("Backend");
            response.setGithubFileUrl("https://github.com/NecyNazy/hngtask1/blob/master/src/main/java/com/ruggedcoder/hngtask1/MyFile.java");
            response.setGithubRepoUrl("https://github.com/NecyNazy/hngtask1");
            response.setStatusCode(200);
            return new ResponseEntity(response, HttpStatus.OK);
        } else {
            response.setUtcTime("INVALID UTC OFFSET");
            return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
        }
    }

}
