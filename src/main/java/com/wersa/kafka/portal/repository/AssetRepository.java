package com.wersa.kafka.portal.repository;

import java.util.List;

import com.wersa.kafka.portal.model.Asset;

import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AssetRepository extends MongoRepository<Asset, String> {
    List<Asset> findAllBy(TextCriteria criteria);
}