package com.wersa.kafka.portal.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.wersa.kafka.portal.model.Asset;
import com.wersa.kafka.portal.repository.AssetRepository;

import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class AssetServiceImpl implements AssetService {
    private final AssetRepository assetRepository;

    @Override
    public List<Asset> findAssetsBy(Optional<String[]> keywords) {
        if (keywords.isPresent() && keywords.get().length > 0) {
            TextCriteria criteria = TextCriteria.forDefaultLanguage().matchingAny(keywords.get());
            log.info("Returning assets matching {}", Arrays.toString(keywords.get()));
            return assetRepository.findAllBy(criteria);
        } else {
            log.info("Returning all assets");
            return assetRepository.findAll();
        }
    }

    @Override
    public Asset createAsset(Asset asset) {
        return assetRepository.save(asset);
    }
}