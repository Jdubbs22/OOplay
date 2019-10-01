package timBuchalka_Inner_Abstract_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable2 {
	 private String name;
	    private int hitPoints;
	    private int strength;

	    public Monster(String name, int hitPoints, int strength) {
	        this.name = name;
	        this.hitPoints = hitPoints;
	        this.strength = strength;
	    }//end constructor

	    public String getName() {
	        return name;
	    }//end getter

	    public int getHitPoints() {
	        return hitPoints;
	    }//end getter

	    public int getStrength() {
	        return strength;
	    }//end getter

	    @Override
	    public List<String> write() {
	        ArrayList<String> values = new ArrayList<String>();
	        values.add(0, this.name);
	        values.add(1, "" + this.hitPoints);
	        values.add(2, "" + this.strength);
	        return values;
	    }//end method

	    @Override
	    public void read(List<String> savedValues) {
	        if(savedValues != null && savedValues.size() > 0) {
	            this.name = savedValues.get(0);
	            this.hitPoints = Integer.parseInt(savedValues.get(1));
	            this.strength = Integer.parseInt(savedValues.get(2));
	        }//end if

	    }//end method

	    @Override
	    public String toString() {
	        return "Monster{" +
	                "name='" + name + '\'' +
	                ", hitPoints=" + hitPoints +
	                ", strength=" + strength +
	                '}';
	    }//end tostring

}//end class
