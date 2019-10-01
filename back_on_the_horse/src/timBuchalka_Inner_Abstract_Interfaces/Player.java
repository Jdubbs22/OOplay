package timBuchalka_Inner_Abstract_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable2 {

	 private String name;
	    private int hitPoints;
	    private int strength;
	    private String weapon;

	    public Player(String name, int hitPoints, int strength) {
	        this.name = name;
	        this.hitPoints = hitPoints;
	        this.strength = strength;
	        this.weapon = "Sword";
	    }//end constructor

	    public String getName() {
	        return name;
	    }//end getter

	    public void setName(String name) {
	        this.name = name;
	    }//end setter

	    public int getHitPoints() {
	        return hitPoints;
	    }//end getter

	    public void setHitPoints(int hitPoints) {
	        this.hitPoints = hitPoints;
	    }//end setter

	    public int getStrength() {
	        return strength;
	    }//end getter

	    public void setStrength(int strength) {
	        this.strength = strength;
	    }//end setter

	    public String getWeapon() {
	        return weapon;
	    }//end getter

	    public void setWeapon(String weapon) {
	        this.weapon = weapon;
	    }//end setter

	    @Override
	    public String toString() {
	        return "Player{" +
	                "name='" + name + '\'' +
	                ", hitPoints=" + hitPoints +
	                ", strength=" + strength +
	                ", weapon='" + weapon + '\'' +
	                '}';
	    }//end tostring

	    @Override
	    public List<String> write() {
	        List<String> values = new ArrayList<String>();
	        values.add(0, this.name);
	        values.add(1, "" + this.hitPoints);
	        values.add(2, "" + this.strength);
	        values.add(3, this.weapon);

	        return values;
	    }//end method

	    @Override
	    public void read(List<String> savedValues) {
	        if(savedValues != null && savedValues.size() >0) {
	            this.name = savedValues.get(0);
	            this.hitPoints = Integer.parseInt(savedValues.get(1));
	            this.strength = Integer.parseInt(savedValues.get(2));
	            this.weapon = savedValues.get(3);
	        }//end if

	    }//end method

}//end class
