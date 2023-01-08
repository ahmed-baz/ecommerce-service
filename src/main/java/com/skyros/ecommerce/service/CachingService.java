package com.skyros.ecommerce.service;

public interface CachingService {

    void clearCache();

    void clearCacheByName(String cacheName);
}
