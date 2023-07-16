package com.facebookpay.expresscheckout.models;

import X.AnonymousClass0wJ;
import X.AnonymousClass68F;
import X.C04220Ms;
import X.C18200wM;
import X.C18230wP;
import X.C40307LcE;
import X.C86104wH;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ECPPaymentResponseParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(23);
    @SerializedName("fulfillmentOption")
    public final FulfillmentOption A00;
    @SerializedName("shippingOption")
    public final ShippingOption A01;
    public final TransactionInfo A02;
    public final C40307LcE A03;
    public final OtcInput A04;
    @SerializedName("billingAddress")
    public final ShippingAddress A05;
    @SerializedName("shippingAddress")
    public final ShippingAddress A06;
    public final Long A07;
    @SerializedName("containerDescription")
    public final String A08;
    @SerializedName("containerExternalId")
    public final String A09;
    @SerializedName("containerId")
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    @SerializedName("payerEmail")
    public final String A0E;
    @SerializedName("payerName")
    public final String A0F;
    @SerializedName("payerPhone")
    public final String A0G;
    @SerializedName("paymentContainer")
    public final String A0H;
    @SerializedName("paymentMode")
    public final String A0I;
    @SerializedName("pickupEmail")
    public final String A0J;
    @SerializedName("pickupName")
    public final String A0K;
    @SerializedName("pickupPhone")
    public final String A0L;
    public final String A0M;
    public final String A0N;
    @SerializedName("requestId")
    public final String A0O;
    @SerializedName("sessionId")
    public final String A0P;
    public final List A0Q;
    public final boolean A0R;
    @SerializedName("apiVersion")
    public final int A0S;
    @SerializedName("checkoutConfigReturnFields")
    public final Set<AnonymousClass68F> A0T;

    public ECPPaymentResponseParams(FulfillmentOption fulfillmentOption, ShippingOption shippingOption, TransactionInfo transactionInfo, C40307LcE lcE, OtcInput otcInput, ShippingAddress shippingAddress, ShippingAddress shippingAddress2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List list, Set set, int i, boolean z) {
        String str19 = str;
        C04220Ms.A0B(str19, 1);
        String str20 = str3;
        String str21 = str2;
        AnonymousClass0wJ.A1R(str21, str20);
        String str22 = str4;
        String str23 = str5;
        C18230wP.A1R(str22, 5, str23);
        String str24 = str7;
        C04220Ms.A0B(str24, 8);
        String str25 = str14;
        C04220Ms.A0B(str25, 20);
        String str26 = str15;
        C04220Ms.A0B(str26, 21);
        String str27 = str17;
        C04220Ms.A0B(str27, 23);
        C04220Ms.A0B(transactionInfo, 26);
        this.A0P = str19;
        this.A0S = i;
        this.A0O = str21;
        this.A09 = str20;
        this.A0A = str22;
        this.A08 = str23;
        this.A0H = str6;
        this.A0I = str24;
        this.A0F = str8;
        this.A0E = str9;
        this.A0G = str10;
        this.A0K = str11;
        this.A0J = str12;
        this.A0L = str13;
        this.A06 = shippingAddress;
        this.A05 = shippingAddress2;
        this.A01 = shippingOption;
        this.A00 = fulfillmentOption;
        this.A0T = set;
        this.A0D = str25;
        this.A0N = str26;
        this.A0C = str16;
        this.A0M = str27;
        this.A04 = otcInput;
        this.A0Q = list;
        this.A02 = transactionInfo;
        this.A0B = str18;
        this.A0R = z;
        this.A03 = lcE;
        this.A07 = l;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A0P);
        parcel.writeInt(this.A0S);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A05, i);
        ShippingOption shippingOption = this.A01;
        if (shippingOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingOption.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A00, i);
        Set<AnonymousClass68F> set = this.A0T;
        if (set == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A11 = C86124wJ.A11(parcel, set);
            while (A11.hasNext()) {
                C86104wH.A1B(parcel, (AnonymousClass68F) A11.next());
            }
        }
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0M);
        parcel.writeParcelable(this.A04, i);
        Iterator A0v = C18200wM.A0v(parcel, this.A0Q);
        while (A0v.hasNext()) {
            ((ECPOffer) A0v.next()).writeToParcel(parcel, i);
        }
        this.A02.writeToParcel(parcel, i);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0R ? 1 : 0);
        C40307LcE lcE = this.A03;
        if (lcE == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, lcE);
        }
        Long l = this.A07;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C86134wK.A18(parcel, l, 1);
        }
    }
}
