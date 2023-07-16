package com.facebookpay.expresscheckout.models;

import X.AnonymousClass0wJ;
import X.AnonymousClass68F;
import X.AnonymousClass68M;
import X.C04220Ms;
import X.C18190wL;
import X.C18210wN;
import X.C18240wQ;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.fbpay.logging.LoggingPolicy;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.Set;

public final class ECPAvailabilityRequestParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(17);
    @SerializedName("paymentConfiguration")
    public final ECPPaymentConfiguration A00;
    @SerializedName("receiverInfo")
    public final PaymentReceiverInfo A01;
    @SerializedName("loggingPolicy")
    public final LoggingPolicy A02;
    @SerializedName("productId")
    public final String A03;
    @SerializedName("requestId")
    public final String A04;
    @SerializedName("securityOrigin")
    public final String A05;
    @SerializedName("sessionId")
    public final String A06;
    @SerializedName("optionalFields")
    public final Set<AnonymousClass68M> A07;
    @SerializedName("returnFields")
    public final Set<AnonymousClass68F> A08;
    public final boolean A09;
    public final boolean A0A;
    @SerializedName("apiVersion")
    public final int A0B;
    @SerializedName("getDefaultPaymentMethodFields")
    public final boolean A0C;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A0B);
        this.A01.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        Iterator A11 = C86124wJ.A11(parcel, this.A07);
        while (A11.hasNext()) {
            C86104wH.A1B(parcel, (AnonymousClass68M) A11.next());
        }
        Iterator A112 = C86124wJ.A11(parcel, this.A08);
        while (A112.hasNext()) {
            C86104wH.A1B(parcel, (AnonymousClass68F) A112.next());
        }
        this.A00.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
    }

    public ECPAvailabilityRequestParams(ECPPaymentConfiguration eCPPaymentConfiguration, PaymentReceiverInfo paymentReceiverInfo, LoggingPolicy loggingPolicy, String str, String str2, String str3, String str4, Set set, Set set2, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass0wJ.A1O(str, str2);
        C18190wL.A1S(paymentReceiverInfo, 4, str3);
        C18210wN.A1M(str4, 6, set2);
        C18240wQ.A1J(eCPPaymentConfiguration, 9, loggingPolicy);
        this.A06 = str;
        this.A04 = str2;
        this.A0B = i;
        this.A01 = paymentReceiverInfo;
        this.A03 = str3;
        this.A05 = str4;
        this.A07 = set;
        this.A08 = set2;
        this.A00 = eCPPaymentConfiguration;
        this.A02 = loggingPolicy;
        this.A0C = z;
        this.A09 = z2;
        this.A0A = z3;
    }
}
