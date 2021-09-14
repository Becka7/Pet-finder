
package com.moringaschool.petfinder;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class PetSearchResponse {

    @SerializedName("bred_for")
    @Expose
    private String bredFor;
    @SerializedName("breed_group")
    @Expose
    private String breedGroup;
    @SerializedName("height")
    @Expose
    private Height height;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("life_span")
    @Expose
    private String lifeSpan;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("reference_image_id")
    @Expose
    private String referenceImageId;
    @SerializedName("temperament")
    @Expose
    private String temperament;
    @SerializedName("weight")
    @Expose
    private Weight weight;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PetSearchResponse() {
    }

    /**
     * 
     * @param image
     * @param bredFor
     * @param lifeSpan
     * @param origin
     * @param temperament
     * @param name
     * @param weight
     * @param id
     * @param referenceImageId
     * @param breedGroup
     * @param height
     */
    public PetSearchResponse(String bredFor, String breedGroup, Height height, Integer id, Image image, String lifeSpan, String name, String origin, String referenceImageId, String temperament, Weight weight) {
        super();
        this.bredFor = bredFor;
        this.breedGroup = breedGroup;
        this.height = height;
        this.id = id;
        this.image = image;
        this.lifeSpan = lifeSpan;
        this.name = name;
        this.origin = origin;
        this.referenceImageId = referenceImageId;
        this.temperament = temperament;
        this.weight = weight;
    }

    public String getBredFor() {
        return bredFor;
    }

    public void setBredFor(String bredFor) {
        this.bredFor = bredFor;
    }

    public String getBreedGroup() {
        return breedGroup;
    }

    public void setBreedGroup(String breedGroup) {
        this.breedGroup = breedGroup;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getReferenceImageId() {
        return referenceImageId;
    }

    public void setReferenceImageId(String referenceImageId) {
        this.referenceImageId = referenceImageId;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

}
