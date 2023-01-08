package com.skyros.ecommerce.controller;

import com.skyros.ecommerce.service.CachingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private CachingService cachingService;

    @GetMapping("clearCache")
    void clearCache() {
        cachingService.clearCache();
    }

    @GetMapping("clearCacheByName/{cacheName}")
    void clearCacheByName(@PathVariable String cacheName) {
        cachingService.clearCacheByName(cacheName);
    }

}
