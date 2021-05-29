package com.dream.repo;

import com.dream.model.CrickInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CrickInfoRepo extends MongoRepository<CrickInfo, String> {
}
