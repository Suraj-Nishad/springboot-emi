/**
 * 
 */
package com.finance.springapp.dao;

import java.util.List;

import com.finance.springapp.entities.EMICard;
import com.finance.springapp.entities.EMIPurchaseDescription;
import com.finance.springapp.entities.ProductPurchased;

/**
 * @author lntinfotech
 *
 */
public interface EmiPurchaseDescriptionDao {

	public EMIPurchaseDescription createEmiPurchaseDescription(EMIPurchaseDescription eMIPurchaseDescription);

	public List<EMIPurchaseDescription> findAllEmiPurchaseDescriptionByEmiCard(String emiCard);

	public EMICard findEmiCardByEmiCardId(String emiCardId);
	
	public EMIPurchaseDescription findEmiPurchaseDescriptionById(int emiDesId);
	
	public List<ProductPurchased> findProductIdByEMICardNo(String emiCardNo);
	public EMIPurchaseDescription updateEmiPurchaseDescription(EMIPurchaseDescription emiPurchaseDescription);
}
