package cn.edu.fjnu.visitmode;

import java.util.List;

public class Client {    
    public static void main(String[] args){    
        List<Element> list = ObjectStruture.getList();    
        for(Element e: list){    
            e.accept(new Visitor());    
        }    
    }    
}   