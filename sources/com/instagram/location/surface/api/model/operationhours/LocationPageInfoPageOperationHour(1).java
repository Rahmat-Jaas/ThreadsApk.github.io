package com.instagram.location.surface.api.model.operationhours;

import X.AnonymousClass0wJ;
import X.AnonymousClass1j3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import java.util.ArrayList;
import java.util.List;

public class LocationPageInfoPageOperationHour extends AnonymousClass1j3 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(21);
    public String A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        List list = this.A01;
        if (list == null) {
            list = AnonymousClass0wJ.A0v();
        }
        this.A01 = list;
        parcel.writeStringList(list);
    }

    public LocationPageInfoPageOperationHour(Parcel parcel) {
        this.A00 = parcel.readString();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A01 = A0v;
        parcel.readStringList(A0v);
    }

    public LocationPageInfoPageOperationHour(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public LocationPageInfoPageOperationHour() {
    }
}
