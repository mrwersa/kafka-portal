package com.wersa.kafka.portal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.TextScore;

import lombok.Data;

@Data
@Document(collection = "asset")
public class Asset {
    @Id
    private String id;
    @TextIndexed(weight = 3)
    private String name;
    @TextIndexed(weight = 2)
    private String description;
    @TextIndexed(weight = 5)
    private String[] tags;
    @TextScore
    private Float score;
}