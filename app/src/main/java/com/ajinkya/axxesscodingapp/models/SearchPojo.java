
package com.ajinkya.axxesscodingapp.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchPojo implements Parcelable
{

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("success")
    @Expose
    private Boolean success;
    public final static Creator<SearchPojo> CREATOR = new Creator<SearchPojo>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SearchPojo createFromParcel(Parcel in) {
            return new SearchPojo(in);
        }

        public SearchPojo[] newArray(int size) {
            return (new SearchPojo[size]);
        }

    }
    ;

    protected SearchPojo(Parcel in) {
        in.readList(this.data, (Datum.class.getClassLoader()));
        this.status = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.success = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public SearchPojo() {
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(data);
        dest.writeValue(status);
        dest.writeValue(success);
    }

    public int describeContents() {
        return  0;
    }

}
