package com.wersa.kafka.portal.rest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.wersa.kafka.portal.model.Asset;
import com.wersa.kafka.portal.service.AssetService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AssetController {
    private final AssetService assetService;

    @GetMapping("/assets")
    public List<Asset> searchAssets(@RequestParam(value = "q", required = false) String[] keywords) {
        log.info("Received a GET request to /assets with q = {}", Arrays.toString(keywords));
        return assetService.findAssetsBy(Optional.ofNullable(keywords));
    }

    @PostMapping("/assets")
    public Asset createAsset(@RequestBody Asset asset) {
        log.info("Received a POST request to /assets with asset = {}", asset);
        return assetService.createAsset(asset);
    }
}