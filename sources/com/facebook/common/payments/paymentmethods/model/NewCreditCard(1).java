package com.facebook.common.payments.paymentmethods.model;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NewCreditCard implements PaymentCredential {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(59);
    public final AdditionalFields A00;
    public final String A01;
    public final List A02;
    public final Set A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList A0v;
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A02);
        Set set = this.A03;
        if (set == null) {
            A0v = null;
        } else {
            A0v = AnonymousClass0wJ.A0v();
            A0v.addAll(set);
        }
        parcel.writeList(A0v);
    }

    public NewCreditCard(Parcel parcel) {
        Set hashSet;
        this.A01 = parcel.readString();
        this.A00 = (AdditionalFields) C18180wK.A0A(parcel, AdditionalFields.class);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C86134wK.A17(parcel, ArrayList.class, A0v);
        this.A02 = A0v;
        ArrayList readArrayList = parcel.readArrayList(List.class.getClassLoader());
        if (readArrayList == null) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(readArrayList);
        }
        this.A03 = hashSet;
    }
}
