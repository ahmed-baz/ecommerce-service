package com.skyros.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

@Service
public class CachingServiceImpl implements CachingService {

    @Autowired
    private CacheManager cacheManager;

    @Override
    @Caching(
            evict = {@CacheEvict(value = "category_list", allEntries = true)}
    )
    public void clearCache() {
    }


    @Override
    public void clearCacheByName(String cacheName) {
        cacheManager.getCache(cacheName).clear();
    }
}
