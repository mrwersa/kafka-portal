package com.wersa.kafka.portal.service;

import java.util.List;
import java.util.Optional;

import com.wersa.kafka.portal.model.Asset;

public interface AssetService {

    /**
     * 
     * @param keywords
     * @return
     */
    List<Asset> findAssetsBy(Optional<String[]> keywords);

    /**
     * 
     * @param asset
     * @return
     */
    Asset createAsset(Asset asset);
}