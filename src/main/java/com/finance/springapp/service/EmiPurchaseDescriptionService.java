package com.finance.springapp.service;

import java.util.List;

import com.finance.springapp.entities.EMICard;
import com.finance.springapp.entities.EMIPurchaseDescription;
import com.finance.springapp.entities.ProductPurchased;

public interface EmiPurchaseDescriptionService {

	public EMIPurchaseDescription createEmiPurchaseDescription(EMIPurchaseDescription eMIPurchaseDescription);

	public List<EMIPurchaseDescription> findAllEmiPurchaseDescriptionByEmiCard(String emiCard);
	
	public EMICard findEmiCardByEmiCardId(String emiCardId);
	
	public EMIPurchaseDescription findEmiPurchaseDescriptionById(int emiDesId);
	
	public EMIPurchaseDescription updateEmiPurchaseDescription(EMIPurchaseDescription emiPurchaseDescription);

	public List<ProductPurchased> findProductIdByEMICardNo(String emiCardNo);
}
