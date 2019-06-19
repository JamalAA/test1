/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.EntityManager;
import utils.PuSelector;

/**
 *
 * @author jamalahmed
 */
public class UuidFacade {

    public List<Uuidd> getRandomUuid() {
        List<Uuidd> uuid = new ArrayList();

        for (int i = 0; i < 25; i++) {
            Uuidd u = new Uuidd();
            u.setUuid(UUID.randomUUID().toString());
            uuid.add(u);
        }

        return uuid;
    }

    public List<Uuidd> getRandomUuidWithTimeAndCount(int count) {
        List<String> strings = new ArrayList();
        List<Uuidd> uuid2 = new ArrayList();
        for (int i = 0; i < 1; i++) {
            Uuidd u2 = new Uuidd();
            for (int b = 0; b < count; b++) {

                String u = (UUID.randomUUID().toString());
                strings.add(u);
            }
            u2.setCreated("Created " + new SimpleDateFormat("dd.MM.yyyy-HH.mm.ss").format(new Date()));
            u2.setUuids(strings);
            uuid2.add(u2);

        }
        return uuid2;
    }

    public List<Uuidd> getRandomUuidWithTime() {
        List<Uuidd> uuid = new ArrayList();

        for (int i = 0; i < 25; i++) {
            Uuidd u = new Uuidd();
            u.setUuid(UUID.randomUUID().toString() + " Created: " + new SimpleDateFormat("dd.MM.yyyy-HH.mm.ss").format(new Date()));
            uuid.add(u);
        }

        return uuid;
    }
    
    
   
      

    public static void main(String[] args) {

    }
}
