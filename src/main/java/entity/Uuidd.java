/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;

/**
 *
 * @author jamalahmed
 */
public class Uuidd {
    private String Uuid;
    private List <String> uuids;
    private String Created;
    public Uuidd() {
      
    }

    public List<String> getUuids() {
        return uuids;
    }

    public void setUuids(List<String> uuids) {
        this.uuids = uuids;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String Created) {
        this.Created = Created;
    }
    
    
    
    public String getUuid() {
        return Uuid;
    }

    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }
    
    
}
