package com.orange.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by msaidi on 12/17/15.
 */

@Data
@AllArgsConstructor
@Document(collection = "video")
@TypeAlias(value = "video")
public class Video {

    @Id
    private String id;

    @Field(value = "titre")
    private String titre;

    public Video(String id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    public static Video of(final String id,final String titre) {
        return new Video(id, titre);
    }
}
