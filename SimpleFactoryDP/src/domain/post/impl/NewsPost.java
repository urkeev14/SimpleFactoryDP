/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.post.impl;

import domain.post.Post;
import java.time.LocalDate;

/**
 *
 * @author urosv
 */
public class NewsPost extends Post {
    
    private String headline;
    private LocalDate newsTime;

    public String getHeadline() {
        return headline;
    }

    public LocalDate getNewsTime() {
        return newsTime;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setNewsTime(LocalDate newsTime) {
        this.newsTime = newsTime;
    }
    
}
