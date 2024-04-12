package com.nt.entity2;

import java.util.ArrayList;

import lombok.Data;
@Data
public class Root {
public String cod;
    public int message;
    public int cnt;
    public ArrayList<com.nt.entity2.List> list;
    public City city;
}

