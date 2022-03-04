package com.cydeo.proxy;

import com.cydeo.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);

    //no comopnent for interface
    //you can not create object from interface and you can not anotate any interface
}
