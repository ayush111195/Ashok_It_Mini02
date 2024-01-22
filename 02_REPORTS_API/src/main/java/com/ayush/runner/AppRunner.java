package com.ayush.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ayush.entity.EligibilityDetails;
import com.ayush.repo.EligibilityDetailsRepo;

@Component
public class AppRunner implements ApplicationRunner {    // this is call for put dummy data in data base 

	@Autowired
	private EligibilityDetailsRepo detailsRepo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {  // ye method bass ek baar run hoga--->>
    EligibilityDetails entity1 =new EligibilityDetails();
    
    entity1.setEligId(1);
    entity1.setName("Jhon");
    entity1.setMobile(9454709288l);
    entity1.setGender('m');
    entity1.setSsn(46576765546l);
    entity1.setPlanName("SNAP");
    entity1.setPlanStatus("Approved");
    detailsRepo.save(entity1);
    
    EligibilityDetails entity2 =new EligibilityDetails();
    entity2.setEligId(2);
    entity2.setName("Ayush");
    entity2.setMobile(8853738141l);
    entity2.setGender('m');
    entity2.setSsn(465755656l);
    entity2.setPlanName("gupt");
    entity2.setPlanStatus("Denied");
    detailsRepo.save(entity2);	
		
    
    EligibilityDetails entity3 =new EligibilityDetails();
    entity3.setEligId(3);
    entity3.setName("Jhonypar");
    entity3.setMobile(9476765765l);
    entity3.setGender('f');
    entity3.setSsn(46576765546l);
    entity3.setPlanName("ran");
    entity3.setPlanStatus("Closed");
    detailsRepo.save(entity3);
		
	}

	
}
