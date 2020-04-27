/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.post.factory;

import domain.constants.PostType;
import domain.post.Post;
import domain.post.impl.BlogPost;
import domain.post.impl.NewsPost;

/**
 *
 * @author urosv
 */
public class PostFactory {
    
    public static Post createPost(String postType) {
        switch (postType) {
            case PostType.BLOG:
                return new BlogPost();
            case PostType.NEWS:
                return new NewsPost();
            default:
                throw new IllegalArgumentException("Post type is unknown !");
        }
    }
    
}
