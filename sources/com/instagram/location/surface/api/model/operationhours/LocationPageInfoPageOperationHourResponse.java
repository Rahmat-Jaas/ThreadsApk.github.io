package com.instagram.location.surface.api.model.operationhours;

import X.AnonymousClass0wJ;
import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import java.util.ArrayList;
import java.util.List;

public class LocationPageInfoPageOperationHourResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(22);
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        List list = this.A04;
        if (list == null) {
            list = AnonymousClass0wJ.A0v();
        }
        parcel.writeList(list);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00.booleanValue() ? 1 : 0);
    }

    public LocationPageInfoPageOperationHourResponse(Parcel parcel) {
        this.A03 = parcel.readString();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A04 = A0v;
        parcel.readList(A0v, LocationPageInfoPageOperationHour.class.getClassLoader());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = Boolean.valueOf(C18180wK.A1V(parcel.readInt()));
    }

    public LocationPageInfoPageOperationHourResponse(Boolean bool, String str, String str2, String str3, List list) {
        this.A03 = str;
        this.A04 = list;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = bool;
    }

    public LocationPageInfoPageOperationHourResponse() {
    }
}
