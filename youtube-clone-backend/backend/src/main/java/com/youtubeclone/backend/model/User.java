package com.youtubeclone.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "User")
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private List<String> subscribedTo;
    private List<String> subscribers;
    private List<String> likedVideos;
    private List<String> dislikedVideos;
    private List<String> videoHistory;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSubscribedTo() {
        return subscribedTo;
    }

    public void setSubscribedTo(List<String> subscribedTo) {
        this.subscribedTo = subscribedTo;
    }

    public List<String> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<String> subscribers) {
        this.subscribers = subscribers;
    }

    public List<String> getLikedVideos() {
        return likedVideos;
    }

    public void setLikedVideos(List<String> likedVideos) {
        this.likedVideos = likedVideos;
    }

    public List<String> getDislikedVideos() {
        return dislikedVideos;
    }

    public void setDislikedVideos(List<String> dislikedVideos) {
        this.dislikedVideos = dislikedVideos;
    }

    public List<String> getVideoHistory() {
        return videoHistory;
    }

    public void setVideoHistory(List<String> videoHistory) {
        this.videoHistory = videoHistory;
    }

    public User(String id, String firstName, String lastName, String fullName, String email, List<String> subscribedTo, List<String> subscribers, List<String> likedVideos, List<String> dislikedVideos, List<String> videoHistory) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.email = email;
        this.subscribedTo = subscribedTo;
        this.subscribers = subscribers;
        this.likedVideos = likedVideos;
        this.dislikedVideos = dislikedVideos;
        this.videoHistory = videoHistory;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", subscribedTo=" + subscribedTo +
                ", subscribers=" + subscribers +
                ", likedVideos=" + likedVideos +
                ", dislikedVideos=" + dislikedVideos +
                ", videoHistory=" + videoHistory +
                '}';
    }
}
