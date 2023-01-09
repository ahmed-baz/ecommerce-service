package com.skyros.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CachingServiceImpl implements CachingService {

    @Autowired
    private CacheManager cacheManager;

    @Override
    public void clearCache() {
        Collection<String> cacheNames = cacheManager.getCacheNames();
        cacheNames.forEach(cacheName -> {
            getCacheManager().getCache(cacheName).clear();
        });
    }


    @Override
    public void clearCacheByName(String cacheName) {
        getCacheManager().getCache(cacheName).clear();
    }

    public CacheManager getCacheManager() {
        return cacheManager;
    }

    public void setCacheManager(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }
}
