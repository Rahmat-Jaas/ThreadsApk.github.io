package com.facebookpay.expresscheckout.models;

import X.AnonymousClass0wJ;
import X.AnonymousClass67H;
import X.AnonymousClass692;
import X.C04220Ms;
import X.C18180wK;
import X.C18230wP;
import X.C86104wH;
import X.C86124wJ;
import X.C967666p;
import X.C971368b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ECPPaymentConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(21);
    @SerializedName("estimatedTotal")
    public final CurrencyAmount A00;
    @SerializedName("knownData")
    public final KnownData A01;
    @SerializedName("paymentEnv")
    public final C971368b A02;
    @SerializedName("containerContext")
    public final String A03;
    @SerializedName("securityOrigin")
    public final String A04;
    @SerializedName("offers")
    public final ArrayList<String> A05;
    @SerializedName("paymentActionType")
    public final ArrayList<AnonymousClass67H> A06;
    @SerializedName("supportedContainerTypes")
    public final ArrayList<AnonymousClass692> A07;
    @SerializedName("supportedContainerConfigurations")
    public final Map<AnonymousClass692, Bundle> A08;
    @SerializedName("allowedCredentialTypes")
    public final Set<C967666p> A09;

    public ECPPaymentConfiguration(CurrencyAmount currencyAmount, KnownData knownData, C971368b r4, String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map, Set set) {
        C18230wP.A1R(r4, 1, arrayList2);
        this.A02 = r4;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = arrayList;
        this.A00 = currencyAmount;
        this.A07 = arrayList2;
        this.A01 = knownData;
        this.A05 = arrayList3;
        this.A08 = map;
        this.A09 = set;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        Iterator A10 = C86124wJ.A10(parcel, this.A06);
        while (A10.hasNext()) {
            C86104wH.A1B(parcel, (AnonymousClass67H) A10.next());
        }
        parcel.writeParcelable(this.A00, i);
        Iterator A102 = C86124wJ.A10(parcel, this.A07);
        while (A102.hasNext()) {
            C86104wH.A1B(parcel, (AnonymousClass692) A102.next());
        }
        KnownData knownData = this.A01;
        if (knownData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            knownData.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.A05);
        Map<AnonymousClass692, Bundle> map = this.A08;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                C86104wH.A1B(parcel, (AnonymousClass692) A0o.getKey());
                parcel.writeBundle((Bundle) A0o.getValue());
            }
        }
        Set<C967666p> set = this.A09;
        if (set == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A11 = C86124wJ.A11(parcel, set);
        while (A11.hasNext()) {
            C86104wH.A1B(parcel, (C967666p) A11.next());
        }
    }
}
