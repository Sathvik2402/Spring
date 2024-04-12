package com.nt.entity2;

import java.util.ArrayList;

import lombok.Data;

@Data
public class List {
	
	    public int dt;
	    public Main main;
	    public ArrayList<Weather> weather;
	    public Clouds clouds;
	    public Wind wind;
	    public int visibility;
	    public double pop;
	    public Rain rain;
	    public Sys sys;
	    public String dt_txt;
}
