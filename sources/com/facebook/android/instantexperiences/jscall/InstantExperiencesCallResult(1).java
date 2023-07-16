package com.facebook.android.instantexperiences.jscall;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass7CU;
import X.C18200wM;
import X.C18230wP;
import X.C972168k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class InstantExperiencesCallResult implements Parcelable {
    public String A00;
    public String A01;
    public final C972168k A02;
    public final List A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList A0s;
        List list = this.A03;
        if (list == null) {
            A0s = null;
        } else {
            A0s = C18200wM.A0s(list);
        }
        parcel.writeSerializable(A0s);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeSerializable(this.A02);
    }

    public InstantExperiencesCallResult(C972168k r5, String str) {
        this.A03 = AnonymousClass0wJ.A0v();
        JSONObject A0y = C18230wP.A0y();
        try {
            A0y.put("errorCode", Integer.toString(r5.A00));
            if (!AnonymousClass7CU.A00(str)) {
                A0y.put("errorMessage", str);
            }
        } catch (JSONException e) {
            AnonymousClass0LU.A03(InstantExperiencesCallResult.class, "Failed to create error", e);
        }
        this.A03.add(A0y.toString());
        this.A02 = r5;
    }

    public InstantExperiencesCallResult(Parcel parcel) {
        this.A03 = (ArrayList) parcel.readSerializable();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = (C972168k) parcel.readSerializable();
    }

    public InstantExperiencesCallResult(List list) {
        this.A03 = list;
        this.A02 = null;
    }
}
