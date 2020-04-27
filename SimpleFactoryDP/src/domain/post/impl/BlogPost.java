/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.post.impl;

import domain.post.Post;

/**
 *
 * @author urosv
 */
public class BlogPost extends Post{
    
    
    private String author;
    private String[] tags;

    public String getAuthor() {
        return author;
    }

    public String[] getTags() {
        return tags;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
