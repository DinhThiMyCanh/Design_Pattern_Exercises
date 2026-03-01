package Prototype_2;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Prototype<Computer>{
	 private String os;
	    private String office;
	    private String antivirus;
	    private String browser;
	    private List<String> others;

	    public Computer(String os, String office, String antivirus, String browser) {
	        this.os = os;
	        this.office = office;
	        this.antivirus = antivirus;
	        this.browser = browser;
	        this.others = new ArrayList<>();
	    }

	    // Copy constructor
	    private Computer(Computer other) {
	        this.os = other.os;
	        this.office = other.office;
	        this.antivirus = other.antivirus;
	        this.browser = other.browser;
	        this.others = new ArrayList<>(other.others); 
	    }

	    @Override
	    public Computer clone() {
	        return new Computer(this);
	    }

	    public void addSoftware(String software) {
	        others.add(software);
	    }

	    @Override
	    public String toString() {
	        return "Computer Configuration:\n" +
	                "OS: " + os +
	                "\nOffice: " + office +
	                "\nAntivirus: " + antivirus +
	                "\nBrowser: " + browser +
	                "\nOthers: " + others +
	                "\n----------------------";
	    }
}
