/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import domain.constants.PostType;
import domain.post.Post;
import domain.post.factory.PostFactory;

/**
 *
 * @author urosv
 */
public class SimpleFactoryDemo {
    
    public static void main(String[] args) {
        Post post = PostFactory.createPost(PostType.BLOG);
        System.out.println(post);
        
        post = PostFactory.createPost(PostType.NEWS);
        System.out.println(post);
    }
    
}
