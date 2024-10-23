package com.example.shirodemo;

import org.ho.yaml.Yaml;

public class Second {
    public  Object yml(String input){
        Yaml yaml = new Yaml();
        return Yaml.load(input);
    }
    public  Object yml2(String input){
        Yaml yaml = new Yaml();
        return Yaml.load(input);
    }
}
