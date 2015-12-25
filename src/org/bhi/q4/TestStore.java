package org.bhi.q4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestStore {

    public static void main(String[] args) {

        final String DELIMITER = ":";

        File consults = new File("D:\\store.txt");

        List<Store> stores = new ArrayList<>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(consults));
            String line = in.readLine();

            while (line != null) {
                StringTokenizer token = new StringTokenizer(line, DELIMITER);

                int storeID = Integer.parseInt(token.nextToken());
                String address = token.nextToken();
                String phoneno = token.nextToken();

                stores.add(new Store(storeID, address, phoneno));
                line = in.readLine();

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (Store tempstore : stores) {
            if (tempstore instanceof Store) {
                Store store = (Store) tempstore;
                System.out.println("Store ID : " + store.getStoreID() + "\nStore Address : " + store.getAddress() + "\nStore Phone No." + store.getPhoneno());
                System.out.println("");
            }
        }
    }
}
