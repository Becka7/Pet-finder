
package com.moringaschool.petfinder;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


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

    public String getBreedGroup() {
        return breedGroup;
    }

    public Height getHeight() {
        return height;
    }

    public Integer getId() {
        return id;
    }

    public Image getImage() {
        return image;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public String getReferenceImageId() {
        return referenceImageId;
    }

    public String getTemperament() {
        return temperament;
    }

    public Weight getWeight() {
        return weight;
    }
}

