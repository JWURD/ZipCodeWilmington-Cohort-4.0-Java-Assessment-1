package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    private String name;
    private Pet[] pets;
    private ArrayList<Pet> listOfPets;


    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;

        listOfPets = new ArrayList<>();
        if(pets != null) {
            listOfPets.addAll(Arrays.asList(pets));
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        if (!listOfPets.contains(pet))
            listOfPets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        if (listOfPets.contains(pet)) {
            listOfPets.remove(pet);
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        return listOfPets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int yongest = 500;
        int temp;
        for (Pet age : listOfPets) {
            temp = age.getAge();
            if (temp < yongest) {
                yongest = temp;
            }

        }
        return yongest;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldest = 0;
        int temp;
        for (Pet age : listOfPets) {
            temp = age.getAge();
            if (temp > oldest) {
                oldest = temp;
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
       int num = listOfPets.size();
       Float  sum = 0.0f;
       Float  avgerage = 0.0f;
       for(Pet avgAge : listOfPets){
          sum += avgAge.getAge();
       }
       avgerage = sum/num;

        return avgerage;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return listOfPets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        Pet[] ownersPets = new Pet[listOfPets.size()];
        listOfPets.toArray(ownersPets);
        return ownersPets;

    }

}
