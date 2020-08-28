
package com.ajinkya.axxesscodingapp.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private Object title;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("datetime")
    @Expose
    private Integer datetime;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("animated")
    @Expose
    private Boolean animated;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("bandwidth")
    @Expose
    private Integer bandwidth;
    @SerializedName("vote")
    @Expose
    private Object vote;
    @SerializedName("favorite")
    @Expose
    private Boolean favorite;
    @SerializedName("nsfw")
    @Expose
    private Object nsfw;
    @SerializedName("section")
    @Expose
    private Object section;
    @SerializedName("account_url")
    @Expose
    private Object accountUrl;
    @SerializedName("account_id")
    @Expose
    private Object accountId;
    @SerializedName("is_ad")
    @Expose
    private Boolean isAd;
    @SerializedName("in_most_viral")
    @Expose
    private Boolean inMostViral;
    @SerializedName("has_sound")
    @Expose
    private Boolean hasSound;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("ad_type")
    @Expose
    private Integer adType;
    @SerializedName("ad_url")
    @Expose
    private String adUrl;
    @SerializedName("edited")
    @Expose
    private String edited;
    @SerializedName("in_gallery")
    @Expose
    private Boolean inGallery;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("comment_count")
    @Expose
    private Object commentCount;
    @SerializedName("favorite_count")
    @Expose
    private Object favoriteCount;
    @SerializedName("ups")
    @Expose
    private Object ups;
    @SerializedName("downs")
    @Expose
    private Object downs;
    @SerializedName("points")
    @Expose
    private Object points;
    @SerializedName("score")
    @Expose
    private Object score;
    public final static Creator<Image> CREATOR = new Creator<Image>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Image createFromParcel(Parcel in) {
            return new Image(in);
        }

        public Image[] newArray(int size) {
            return (new Image[size]);
        }

    }
    ;

    protected Image(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((Object) in.readValue((Object.class.getClassLoader())));
        this.description = ((Object) in.readValue((Object.class.getClassLoader())));
        this.datetime = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.animated = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.size = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.views = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.bandwidth = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.vote = ((Object) in.readValue((Object.class.getClassLoader())));
        this.favorite = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.nsfw = ((Object) in.readValue((Object.class.getClassLoader())));
        this.section = ((Object) in.readValue((Object.class.getClassLoader())));
        this.accountUrl = ((Object) in.readValue((Object.class.getClassLoader())));
        this.accountId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isAd = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.inMostViral = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.hasSound = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        in.readList(this.tags, (Object.class.getClassLoader()));
        this.adType = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.adUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.edited = ((String) in.readValue((String.class.getClassLoader())));
        this.inGallery = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.link = ((String) in.readValue((String.class.getClassLoader())));
        this.commentCount = ((Object) in.readValue((Object.class.getClassLoader())));
        this.favoriteCount = ((Object) in.readValue((Object.class.getClassLoader())));
        this.ups = ((Object) in.readValue((Object.class.getClassLoader())));
        this.downs = ((Object) in.readValue((Object.class.getClassLoader())));
        this.points = ((Object) in.readValue((Object.class.getClassLoader())));
        this.score = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Image() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Integer getDatetime() {
        return datetime;
    }

    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getAnimated() {
        return animated;
    }

    public void setAnimated(Boolean animated) {
        this.animated = animated;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Object getVote() {
        return vote;
    }

    public void setVote(Object vote) {
        this.vote = vote;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Object getNsfw() {
        return nsfw;
    }

    public void setNsfw(Object nsfw) {
        this.nsfw = nsfw;
    }

    public Object getSection() {
        return section;
    }

    public void setSection(Object section) {
        this.section = section;
    }

    public Object getAccountUrl() {
        return accountUrl;
    }

    public void setAccountUrl(Object accountUrl) {
        this.accountUrl = accountUrl;
    }

    public Object getAccountId() {
        return accountId;
    }

    public void setAccountId(Object accountId) {
        this.accountId = accountId;
    }

    public Boolean getIsAd() {
        return isAd;
    }

    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
    }

    public Boolean getInMostViral() {
        return inMostViral;
    }

    public void setInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
    }

    public Boolean getHasSound() {
        return hasSound;
    }

    public void setHasSound(Boolean hasSound) {
        this.hasSound = hasSound;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Integer getAdType() {
        return adType;
    }

    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public Boolean getInGallery() {
        return inGallery;
    }

    public void setInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Object getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Object commentCount) {
        this.commentCount = commentCount;
    }

    public Object getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Object favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Object getUps() {
        return ups;
    }

    public void setUps(Object ups) {
        this.ups = ups;
    }

    public Object getDowns() {
        return downs;
    }

    public void setDowns(Object downs) {
        this.downs = downs;
    }

    public Object getPoints() {
        return points;
    }

    public void setPoints(Object points) {
        this.points = points;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(title);
        dest.writeValue(description);
        dest.writeValue(datetime);
        dest.writeValue(type);
        dest.writeValue(animated);
        dest.writeValue(width);
        dest.writeValue(height);
        dest.writeValue(size);
        dest.writeValue(views);
        dest.writeValue(bandwidth);
        dest.writeValue(vote);
        dest.writeValue(favorite);
        dest.writeValue(nsfw);
        dest.writeValue(section);
        dest.writeValue(accountUrl);
        dest.writeValue(accountId);
        dest.writeValue(isAd);
        dest.writeValue(inMostViral);
        dest.writeValue(hasSound);
        dest.writeList(tags);
        dest.writeValue(adType);
        dest.writeValue(adUrl);
        dest.writeValue(edited);
        dest.writeValue(inGallery);
        dest.writeValue(link);
        dest.writeValue(commentCount);
        dest.writeValue(favoriteCount);
        dest.writeValue(ups);
        dest.writeValue(downs);
        dest.writeValue(points);
        dest.writeValue(score);
    }

    public int describeContents() {
        return  0;
    }

}
