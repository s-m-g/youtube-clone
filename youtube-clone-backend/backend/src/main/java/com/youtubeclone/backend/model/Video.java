package com.youtubeclone.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "Video")
public class Video {

    @Id
    private String id;
    private String title;
    private String description;
    private String userId;
    private Integer likes;
    private Integer dislikes;
    private List<String> tags;
    private String videoUrl;
    // this is an enum
    private VideoStatus videoStatus;
    private Integer viewCount;
    private String thumbnailUrl;
    private List<Comment> comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public VideoStatus getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(VideoStatus videoStatus) {
        this.videoStatus = videoStatus;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Video(String id, String title, String description, String userId, Integer likes, Integer dislikes, List<String> tags, String videoUrl, VideoStatus videoStatus, Integer viewCount, String thumbnailUrl, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.userId = userId;
        this.likes = likes;
        this.dislikes = dislikes;
        this.tags = tags;
        this.videoUrl = videoUrl;
        this.videoStatus = videoStatus;
        this.viewCount = viewCount;
        this.thumbnailUrl = thumbnailUrl;
        this.comments = comments;
    }

    public Video() {
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", userId='" + userId + '\'' +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", tags=" + tags +
                ", videoUrl='" + videoUrl + '\'' +
                ", videoStatus=" + videoStatus +
                ", viewCount=" + viewCount +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", comments=" + comments +
                '}';
    }
}
