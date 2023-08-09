package ru.skypro.homework.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.*;

@RestController
@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RequestMapping("/ads")
public class AdsController {

    @GetMapping
    public ResponseEntity<?> getAllAds(){
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Ad> addAd(CreateOrUpdateAd createOrUpdateAd){
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}/comments")
    public ResponseEntity<Comments> getComments(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/comments")
    public ResponseEntity<Comment> addComment(@PathVariable(name = "id") Integer id, CreateOrUpdateComment createOrUpdateComment){
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExtendedAd> getAds(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<ExtendedAd> removeAd(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.noContent().build();
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Ad> updateAds(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{adId}/comments/{commentId}")
    public ResponseEntity<?> deleteComment(@PathVariable(name = "adId") Integer adId, @PathVariable(name = "commentId") Integer commentId) {
        return ResponseEntity.ok().build();
    }
    @PatchMapping("{adId}/comments/{commentId}")
    public ResponseEntity<CreateOrUpdateComment> updateComment(@PathVariable(name = "adId") Integer adId, @PathVariable(name = "commentId") Integer commentId) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/me")
    public ResponseEntity<Ads> getAdsMe(){
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}/image")
    public ResponseEntity<?> updateImage(@RequestBody MultipartFile adImageFile){
        return ResponseEntity.ok().build();
    }




}
