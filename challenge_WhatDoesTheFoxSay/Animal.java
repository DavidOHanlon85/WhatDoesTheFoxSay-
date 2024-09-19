/**
 * 
 */
package challenge_WhatDoesTheFoxSay;

/**
 * 
 */
public class Animal {

	// Instance Variables
	
	private String name;
	private String noise;
	private String eyeColour;
	private String noseType;
	private String pawSize;
	private String furColour;
	
	// Make Noise Method
	
	public void makeNoise() {
		System.out.println(getNoise());
	}
	
	// "Goes" Method
	
	public static void printGoes() {
		System.out.print(" goes ");
	}
	
	// "There is one sound" Method
	
	public void printButThereIsOneSound() {
		System.out.println("But there's one sound that no one knows...");
	}
	
	// "What does the fox say?" method
	
	public void whatDoesTheFoxSay() {
		System.out.println("WHAT DOES THE FOX SAY?");
	}
	
	// Getters and Setters
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the noise
	 */
	public String getNoise() {
		return noise;
	}
	/**
	 * @param noise the noise to set
	 */
	public void setNoise(String noise) {
		this.noise = noise;
	}
	/**
	 * @return the eyeColour
	 */
	public String getEyeColour() {
		return eyeColour;
	}
	/**
	 * @param eyeColour the eyeColour to set
	 */
	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}
	/**
	 * @return the noseType
	 */
	public String getNoseType() {
		return noseType;
	}
	/**
	 * @param noseType the noseType to set
	 */
	public void setNoseType(String noseType) {
		this.noseType = noseType;
	}
	/**
	 * @return the pawSize
	 */
	public String getPawSize() {
		return pawSize;
	}
	/**
	 * @param pawSize the pawSize to set
	 */
	public void setPawSize(String pawSize) {
		this.pawSize = pawSize;
	}
	/**
	 * @return the furColour
	 */
	public String getFurColour() {
		return furColour;
	}
	/**
	 * @param furColour the furColour to set
	 */
	public void setFurColour(String furColour) {
		this.furColour = furColour;
	}
	
	
	
	
	
	
	
}
