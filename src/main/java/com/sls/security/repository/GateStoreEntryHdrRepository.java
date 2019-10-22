package com.sls.security.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sls.security.entity.GateStoreEntryRegHdr;

@Repository
public interface GateStoreEntryHdrRepository extends JpaRepository<GateStoreEntryRegHdr, Long> {
	
	/*@Query("SELECT s FROM GateStoreEntryHdr s WHERE s.hdrId =:hdrId")
	GateStoreEntryHdrRepository findByHdrId(@Param("hdrId") long hdrId);*/
	
	List<GateStoreEntryRegHdr> findByInDateBetween(Date fromDate, Date toDate);
	GateStoreEntryRegHdr findByPoNoAndChallanNo(String poNo, long challanNo);
	GateStoreEntryRegHdr findByPoNo(String poNo);

}
