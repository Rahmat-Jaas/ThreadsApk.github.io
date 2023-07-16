package com.facebook.businessextension.jscalls;

import X.AnonymousClass0wJ;
import X.C18200wM;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RequestAutofillJSBridgeCallData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(4);
    public final String A00;
    public final LinkedHashSet A01;
    public final LinkedHashSet A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList A0v;
        ArrayList A0v2;
        parcel.writeString(this.A00);
        LinkedHashSet linkedHashSet = this.A02;
        if (linkedHashSet != null) {
            A0v = C18200wM.A0s(linkedHashSet);
        } else {
            A0v = AnonymousClass0wJ.A0v();
        }
        parcel.writeStringList(A0v);
        LinkedHashSet linkedHashSet2 = this.A01;
        if (linkedHashSet2 != null) {
            A0v2 = C18200wM.A0s(linkedHashSet2);
        } else {
            A0v2 = AnonymousClass0wJ.A0v();
        }
        parcel.writeStringList(A0v2);
    }

    public RequestAutofillJSBridgeCallData(String str, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.A00 = str;
        this.A02 = linkedHashSet;
        this.A01 = linkedHashSet2;
    }

    public RequestAutofillJSBridgeCallData(Parcel parcel) {
        LinkedHashSet A0u;
        LinkedHashSet A0u2;
        this.A00 = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        if (createStringArrayList != null) {
            A0u = new LinkedHashSet(createStringArrayList);
        } else {
            A0u = C86134wK.A0u();
        }
        this.A02 = A0u;
        if (createStringArrayList2 != null) {
            A0u2 = new LinkedHashSet(createStringArrayList2);
        } else {
            A0u2 = C86134wK.A0u();
        }
        this.A01 = A0u2;
    }
}
