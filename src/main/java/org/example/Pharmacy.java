package org.example;

/*
 Step 2: Create a Java class 'Pharmacy' that uses a Java Map to store the Medication name as the key and its information as the value.
 Step 3: Create a method 'int getCount()' in the class Pharmacy. This method should return the number of Medications in the pharmacy.
 Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy. This method should insert the Medication indexed by its name into the pharmacy.
 Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy. This method should return the requested Medication with this name. If no Medication with this name is found, the method should return null.
 Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy. This method should delete the Medication with this name.
 Step 7: Implement a method to print all Medications in the map, including their name, price, and availability.
 */


import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    Map<String, Medication> medicationMap = new HashMap<>();

    public int getMedicationCount(){
        // Step 3: Create a method 'int getCount()' in the class Pharmacy.
        // This method should return the number of Medications in the pharmacy.
        System.out.println("returning MedicationCount()");
        return medicationMap.size();
    }

    public void saveMedication(Medication medication){
        // Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy.
        // This method should insert the Medication indexed by its name into the pharmacy.
        medicationMap.put(medication.getName(), medication);
    }

    public Medication findMedication(String medicationName){
        // Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy.
        // This method should return the requested Medication with this name.
        // If no Medication with this name is found, the method should return null.
        return medicationMap.get(medicationName);
    }

    public void deleteMedication(String medicationName){
        // Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy.
        // This method should delete the Medication with this name.
        medicationMap.remove(medicationName);
    }

    public void printFullMedicationInventory(){
        // Step 7: Implement a method to print all Medications in the map, including their name, price, and availability.
        medicationMap.values().forEach(System.out::println);

        // alternative Lösung mit Lambda - hier allerdings unnötig
        // medicationMap.forEach((k, v) -> System.out.println(v));
    }
}
