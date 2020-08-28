
package com.ajinkya.axxesscodingapp.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdConfig implements Parcelable
{

    @SerializedName("safeFlags")
    @Expose
    private List<String> safeFlags = null;
    @SerializedName("highRiskFlags")
    @Expose
    private List<Object> highRiskFlags = null;
    @SerializedName("unsafeFlags")
    @Expose
    private List<String> unsafeFlags = null;
    @SerializedName("wallUnsafeFlags")
    @Expose
    private List<Object> wallUnsafeFlags = null;
    @SerializedName("showsAds")
    @Expose
    private Boolean showsAds;
    public final static Creator<AdConfig> CREATOR = new Creator<AdConfig>() {


        @SuppressWarnings({
            "unchecked"
        })
        public AdConfig createFromParcel(Parcel in) {
            return new AdConfig(in);
        }

        public AdConfig[] newArray(int size) {
            return (new AdConfig[size]);
        }

    }
    ;

    protected AdConfig(Parcel in) {
        in.readList(this.safeFlags, (String.class.getClassLoader()));
        in.readList(this.highRiskFlags, (Object.class.getClassLoader()));
        in.readList(this.unsafeFlags, (String.class.getClassLoader()));
        in.readList(this.wallUnsafeFlags, (Object.class.getClassLoader()));
        this.showsAds = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public AdConfig() {
    }

    public List<String> getSafeFlags() {
        return safeFlags;
    }

    public void setSafeFlags(List<String> safeFlags) {
        this.safeFlags = safeFlags;
    }

    public List<Object> getHighRiskFlags() {
        return highRiskFlags;
    }

    public void setHighRiskFlags(List<Object> highRiskFlags) {
        this.highRiskFlags = highRiskFlags;
    }

    public List<String> getUnsafeFlags() {
        return unsafeFlags;
    }

    public void setUnsafeFlags(List<String> unsafeFlags) {
        this.unsafeFlags = unsafeFlags;
    }

    public List<Object> getWallUnsafeFlags() {
        return wallUnsafeFlags;
    }

    public void setWallUnsafeFlags(List<Object> wallUnsafeFlags) {
        this.wallUnsafeFlags = wallUnsafeFlags;
    }

    public Boolean getShowsAds() {
        return showsAds;
    }

    public void setShowsAds(Boolean showsAds) {
        this.showsAds = showsAds;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(safeFlags);
        dest.writeList(highRiskFlags);
        dest.writeList(unsafeFlags);
        dest.writeList(wallUnsafeFlags);
        dest.writeValue(showsAds);
    }

    public int describeContents() {
        return  0;
    }

}
