
import java.util.HashMap;
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blinderjay
 */
public class testMap {
    private static final HashMap<UUID,String> hm = new HashMap<UUID, String>();
    public static void createnew(){
        hm.put(UUID.randomUUID(), "hellow");
    }
    
    
   public static void main(String[] args){
        testMap.createnew();
    }
    
}
