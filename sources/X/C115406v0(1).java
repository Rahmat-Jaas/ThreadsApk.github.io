package X;

import com.google.gson.annotations.SerializedName;

/* renamed from: X.6v0  reason: invalid class name and case insensitive filesystem */
public final class C115406v0 {
    @SerializedName("auth_factor_type")
    public final String A00;
    @SerializedName("connect_url")
    public final String A01;
    @SerializedName("cred_id")
    public final String A02;
    @SerializedName("hidden_email")
    public final String A03;
    @SerializedName("nonce")
    public final String A04;
    @SerializedName("three_ds_url")
    public final String A05;
    @SerializedName("title")
    public final String A06;
    @SerializedName("auth_amount")
    public final AnonymousClass79S A07;
    @SerializedName("billing_agreement_type")
    public final String A08;
    @SerializedName("email")
    public final String A09;

    public C115406v0(AnonymousClass79S r2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C04220Ms.A0B(str6, 6);
        this.A01 = str;
        this.A02 = str2;
        this.A09 = str3;
        this.A03 = str4;
        this.A06 = str5;
        this.A00 = str6;
        this.A08 = str7;
        this.A04 = str8;
        this.A05 = str9;
        this.A07 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115406v0) {
                C115406v0 r5 = (C115406v0) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A09, r5.A09) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass0wJ.A07(this.A00, ((((((((AnonymousClass0wJ.A06(this.A01) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A09)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A06(this.A08)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + C18200wM.A07(this.A07);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("AuthFactor(connectUrl=");
        A0s.append(this.A01);
        A0s.append(", credId=");
        A0s.append(this.A02);
        A0s.append(", email=");
        A0s.append(this.A09);
        A0s.append(", hiddenEmail=");
        A0s.append(this.A03);
        A0s.append(", title=");
        A0s.append(this.A06);
        A0s.append(", authFactorType=");
        A0s.append(this.A00);
        A0s.append(", billingAgreementType=");
        A0s.append(this.A08);
        A0s.append(AnonymousClass000.A00(520));
        A0s.append(this.A04);
        A0s.append(", three_ds_url=");
        A0s.append(this.A05);
        A0s.append(", authAmount=");
        return C86104wH.A0y(this.A07, A0s);
    }
}
