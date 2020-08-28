
package com.ajinkya.axxesscodingapp.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("datetime")
    @Expose
    private Integer datetime;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("cover_width")
    @Expose
    private Integer coverWidth;
    @SerializedName("cover_height")
    @Expose
    private Integer coverHeight;
    @SerializedName("account_url")
    @Expose
    private String accountUrl;
    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("privacy")
    @Expose
    private String privacy;
    @SerializedName("layout")
    @Expose
    private String layout;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("ups")
    @Expose
    private Integer ups;
    @SerializedName("downs")
    @Expose
    private Integer downs;
    @SerializedName("points")
    @Expose
    private Integer points;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("is_album")
    @Expose
    private Boolean isAlbum;
    @SerializedName("vote")
    @Expose
    private Object vote;
    @SerializedName("favorite")
    @Expose
    private Boolean favorite;
    @SerializedName("nsfw")
    @Expose
    private Boolean nsfw;
    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("favorite_count")
    @Expose
    private Integer favoriteCount;
    @SerializedName("topic")
    @Expose
    private String topic;
    @SerializedName("topic_id")
    @Expose
    private Integer topicId;
    @SerializedName("images_count")
    @Expose
    private Integer imagesCount;
    @SerializedName("in_gallery")
    @Expose
    private Boolean inGallery;
    @SerializedName("is_ad")
    @Expose
    private Boolean isAd;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;
    @SerializedName("ad_type")
    @Expose
    private Integer adType;
    @SerializedName("ad_url")
    @Expose
    private String adUrl;
    @SerializedName("in_most_viral")
    @Expose
    private Boolean inMostViral;
    @SerializedName("include_album_ads")
    @Expose
    private Boolean includeAlbumAds;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("ad_config")
    @Expose
    private AdConfig adConfig;
    public final static Creator<Datum> CREATOR = new Creator<Datum>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Datum createFromParcel(Parcel in) {
            return new Datum(in);
        }

        public Datum[] newArray(int size) {
            return (new Datum[size]);
        }

    }
    ;

    protected Datum(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((Object) in.readValue((Object.class.getClassLoader())));
        this.datetime = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.cover = ((String) in.readValue((String.class.getClassLoader())));
        this.coverWidth = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.coverHeight = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.accountUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.accountId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.privacy = ((String) in.readValue((String.class.getClassLoader())));
        this.layout = ((String) in.readValue((String.class.getClassLoader())));
        this.views = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.link = ((String) in.readValue((String.class.getClassLoader())));
        this.ups = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.downs = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.points = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.score = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isAlbum = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.vote = ((Object) in.readValue((Object.class.getClassLoader())));
        this.favorite = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.nsfw = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.section = ((String) in.readValue((String.class.getClassLoader())));
        this.commentCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.favoriteCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.topic = ((String) in.readValue((String.class.getClassLoader())));
        this.topicId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.imagesCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.inGallery = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isAd = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        in.readList(this.tags, (com.ajinkya.axxesscodingapp.models.Tag.class.getClassLoader()));
        this.adType = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.adUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.inMostViral = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.includeAlbumAds = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        in.readList(this.images, (com.ajinkya.axxesscodingapp.models.Image.class.getClassLoader()));
        this.adConfig = ((AdConfig) in.readValue((AdConfig.class.getClassLoader())));
    }

    public Datum() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getCoverWidth() {
        return coverWidth;
    }

    public void setCoverWidth(Integer coverWidth) {
        this.coverWidth = coverWidth;
    }

    public Integer getCoverHeight() {
        return coverHeight;
    }

    public void setCoverHeight(Integer coverHeight) {
        this.coverHeight = coverHeight;
    }

    public String getAccountUrl() {
        return accountUrl;
    }

    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getUps() {
        return ups;
    }

    public void setUps(Integer ups) {
        this.ups = ups;
    }

    public Integer getDowns() {
        return downs;
    }

    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Boolean getIsAlbum() {
        return isAlbum;
    }

    public void setIsAlbum(Boolean isAlbum) {
        this.isAlbum = isAlbum;
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

    public Boolean getNsfw() {
        return nsfw;
    }

    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getImagesCount() {
        return imagesCount;
    }

    public void setImagesCount(Integer imagesCount) {
        this.imagesCount = imagesCount;
    }

    public Boolean getInGallery() {
        return inGallery;
    }

    public void setInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
    }

    public Boolean getIsAd() {
        return isAd;
    }

    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
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

    public Boolean getInMostViral() {
        return inMostViral;
    }

    public void setInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
    }

    public Boolean getIncludeAlbumAds() {
        return includeAlbumAds;
    }

    public void setIncludeAlbumAds(Boolean includeAlbumAds) {
        this.includeAlbumAds = includeAlbumAds;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public AdConfig getAdConfig() {
        return adConfig;
    }

    public void setAdConfig(AdConfig adConfig) {
        this.adConfig = adConfig;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(title);
        dest.writeValue(description);
        dest.writeValue(datetime);
        dest.writeValue(cover);
        dest.writeValue(coverWidth);
        dest.writeValue(coverHeight);
        dest.writeValue(accountUrl);
        dest.writeValue(accountId);
        dest.writeValue(privacy);
        dest.writeValue(layout);
        dest.writeValue(views);
        dest.writeValue(link);
        dest.writeValue(ups);
        dest.writeValue(downs);
        dest.writeValue(points);
        dest.writeValue(score);
        dest.writeValue(isAlbum);
        dest.writeValue(vote);
        dest.writeValue(favorite);
        dest.writeValue(nsfw);
        dest.writeValue(section);
        dest.writeValue(commentCount);
        dest.writeValue(favoriteCount);
        dest.writeValue(topic);
        dest.writeValue(topicId);
        dest.writeValue(imagesCount);
        dest.writeValue(inGallery);
        dest.writeValue(isAd);
        dest.writeList(tags);
        dest.writeValue(adType);
        dest.writeValue(adUrl);
        dest.writeValue(inMostViral);
        dest.writeValue(includeAlbumAds);
        dest.writeList(images);
        dest.writeValue(adConfig);
    }

    public int describeContents() {
        return  0;
    }

}
