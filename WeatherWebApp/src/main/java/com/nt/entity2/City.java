package com.nt.entity2;

import lombok.Data;

@Data
public class City {
	public int id;
    public String name;
    public Coord coord;
    public String country;
    public int population;
    public int timezone;
    public int sunrise;
    public int sunset;
}
