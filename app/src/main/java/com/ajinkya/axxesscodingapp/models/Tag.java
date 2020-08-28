
package com.ajinkya.axxesscodingapp.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tag implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("followers")
    @Expose
    private Integer followers;
    @SerializedName("total_items")
    @Expose
    private Integer totalItems;
    @SerializedName("following")
    @Expose
    private Boolean following;
    @SerializedName("is_whitelisted")
    @Expose
    private Boolean isWhitelisted;
    @SerializedName("background_hash")
    @Expose
    private String backgroundHash;
    @SerializedName("thumbnail_hash")
    @Expose
    private Object thumbnailHash;
    @SerializedName("accent")
    @Expose
    private String accent;
    @SerializedName("background_is_animated")
    @Expose
    private Boolean backgroundIsAnimated;
    @SerializedName("thumbnail_is_animated")
    @Expose
    private Boolean thumbnailIsAnimated;
    @SerializedName("is_promoted")
    @Expose
    private Boolean isPromoted;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("logo_hash")
    @Expose
    private Object logoHash;
    @SerializedName("logo_destination_url")
    @Expose
    private Object logoDestinationUrl;
    @SerializedName("description_annotations")
    @Expose
    private DescriptionAnnotations descriptionAnnotations;
    public final static Creator<Tag> CREATOR = new Creator<Tag>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Tag createFromParcel(Parcel in) {
            return new Tag(in);
        }

        public Tag[] newArray(int size) {
            return (new Tag[size]);
        }

    }
    ;

    protected Tag(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.displayName = ((String) in.readValue((String.class.getClassLoader())));
        this.followers = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.totalItems = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.following = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isWhitelisted = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.backgroundHash = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnailHash = ((Object) in.readValue((Object.class.getClassLoader())));
        this.accent = ((String) in.readValue((String.class.getClassLoader())));
        this.backgroundIsAnimated = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.thumbnailIsAnimated = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isPromoted = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.logoHash = ((Object) in.readValue((Object.class.getClassLoader())));
        this.logoDestinationUrl = ((Object) in.readValue((Object.class.getClassLoader())));
        this.descriptionAnnotations = ((DescriptionAnnotations) in.readValue((DescriptionAnnotations.class.getClassLoader())));
    }

    public Tag() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public Boolean getIsWhitelisted() {
        return isWhitelisted;
    }

    public void setIsWhitelisted(Boolean isWhitelisted) {
        this.isWhitelisted = isWhitelisted;
    }

    public String getBackgroundHash() {
        return backgroundHash;
    }

    public void setBackgroundHash(String backgroundHash) {
        this.backgroundHash = backgroundHash;
    }

    public Object getThumbnailHash() {
        return thumbnailHash;
    }

    public void setThumbnailHash(Object thumbnailHash) {
        this.thumbnailHash = thumbnailHash;
    }

    public String getAccent() {
        return accent;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }

    public Boolean getBackgroundIsAnimated() {
        return backgroundIsAnimated;
    }

    public void setBackgroundIsAnimated(Boolean backgroundIsAnimated) {
        this.backgroundIsAnimated = backgroundIsAnimated;
    }

    public Boolean getThumbnailIsAnimated() {
        return thumbnailIsAnimated;
    }

    public void setThumbnailIsAnimated(Boolean thumbnailIsAnimated) {
        this.thumbnailIsAnimated = thumbnailIsAnimated;
    }

    public Boolean getIsPromoted() {
        return isPromoted;
    }

    public void setIsPromoted(Boolean isPromoted) {
        this.isPromoted = isPromoted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getLogoHash() {
        return logoHash;
    }

    public void setLogoHash(Object logoHash) {
        this.logoHash = logoHash;
    }

    public Object getLogoDestinationUrl() {
        return logoDestinationUrl;
    }

    public void setLogoDestinationUrl(Object logoDestinationUrl) {
        this.logoDestinationUrl = logoDestinationUrl;
    }

    public DescriptionAnnotations getDescriptionAnnotations() {
        return descriptionAnnotations;
    }

    public void setDescriptionAnnotations(DescriptionAnnotations descriptionAnnotations) {
        this.descriptionAnnotations = descriptionAnnotations;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(displayName);
        dest.writeValue(followers);
        dest.writeValue(totalItems);
        dest.writeValue(following);
        dest.writeValue(isWhitelisted);
        dest.writeValue(backgroundHash);
        dest.writeValue(thumbnailHash);
        dest.writeValue(accent);
        dest.writeValue(backgroundIsAnimated);
        dest.writeValue(thumbnailIsAnimated);
        dest.writeValue(isPromoted);
        dest.writeValue(description);
        dest.writeValue(logoHash);
        dest.writeValue(logoDestinationUrl);
        dest.writeValue(descriptionAnnotations);
    }

    public int describeContents() {
        return  0;
    }

}
