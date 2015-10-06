/**
 * 
 */
package com.itunetworkbuilders.model;

/**
 * @author sushruthreddygade
 *
 */
public class CareerDetails {
	private String Field; 
	private String Description;
	
	public CareerDetails(String Field, String Description) {
		// TODO Auto-generated constructor stub
		super();
		this.Field= Field;
		this.Description= Description;
	}
	/**
	 * @return the field
	 */
	public String getField() {
		return Field;
	}
	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		Field = field;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}
	

}
