
package com.ajinkya.axxesscodingapp.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class DescriptionAnnotations implements Parcelable
{

    public final static Creator<DescriptionAnnotations> CREATOR = new Creator<DescriptionAnnotations>() {


        @SuppressWarnings({
            "unchecked"
        })
        public DescriptionAnnotations createFromParcel(Parcel in) {
            return new DescriptionAnnotations(in);
        }

        public DescriptionAnnotations[] newArray(int size) {
            return (new DescriptionAnnotations[size]);
        }

    }
    ;

    protected DescriptionAnnotations(Parcel in) {
    }

    public DescriptionAnnotations() {
    }

    public void writeToParcel(Parcel dest, int flags) {
    }

    public int describeContents() {
        return  0;
    }

}
