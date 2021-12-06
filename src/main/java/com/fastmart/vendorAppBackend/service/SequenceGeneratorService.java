package com.fastmart.vendorAppBackend.service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.fastmart.vendorAppBackend.models.VendorDbSequence;

@Service
public class SequenceGeneratorService {

	private static MongoOperations mongoOperations;

	@Autowired
	public SequenceGeneratorService(MongoOperations mongoOper) {
	      mongoOperations = mongoOper;
	}

	public SequenceGeneratorService() {

	}

	public static long generateSequence(String seqName) {

		VendorDbSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
				new Update().inc("seq", 1), options().returnNew(true).upsert(true), VendorDbSequence.class);
		return !Objects.isNull(counter) ? counter.getSeq() : 1;

	}

}
