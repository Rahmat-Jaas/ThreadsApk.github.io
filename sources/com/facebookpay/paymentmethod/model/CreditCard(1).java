package com.facebookpay.paymentmethod.model;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass2C6;
import X.AnonymousClass66O;
import X.AnonymousClass69W;
import X.AnonymousClass8bQ;
import X.C04220Ms;
import X.C148488rA;
import X.C18180wK;
import X.C18230wP;
import X.C40307LcE;
import X.C86104wH;
import X.C86124wJ;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.impls.BillingAddressImpl;
import com.facebook.graphql.impls.CardVerificationFieldsImpl;
import com.facebook.graphql.impls.CreditCardCredentialImpl;
import com.facebook.pando.TreeJNI;

public class CreditCard implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(87);
    public C148488rA A00;
    public final CardVerificationFieldsImpl A01;
    public final CreditCardCredentialImpl A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public CreditCard(CreditCardCredentialImpl creditCardCredentialImpl, boolean z, boolean z2) {
        CardVerificationFieldsImpl cardVerificationFieldsImpl;
        C04220Ms.A0B(creditCardCredentialImpl, 1);
        this.A02 = creditCardCredentialImpl;
        this.A05 = z;
        this.A04 = z2;
        TreeJNI treeValue = creditCardCredentialImpl.getTreeValue("billing_address", CreditCardCredentialImpl.BillingAddress.class);
        if (treeValue != null) {
            C148488rA r0 = (C148488rA) treeValue.reinterpret(BillingAddressImpl.class);
            C04220Ms.A06(r0);
            this.A00 = r0;
            this.A03 = C86144wL.A0s(creditCardCredentialImpl, "card_holder_name");
            TreeJNI treeValue2 = creditCardCredentialImpl.getTreeValue("fields_needing_verification(product_id:$payment_product_id)", CreditCardCredentialImpl.FieldsNeedingVerification.class);
            if (treeValue2 != null) {
                cardVerificationFieldsImpl = (CardVerificationFieldsImpl) treeValue2.reinterpret(CardVerificationFieldsImpl.class);
            } else {
                cardVerificationFieldsImpl = null;
            }
            this.A01 = cardVerificationFieldsImpl;
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final int describeContents() {
        return 0;
    }

    public final AnonymousClass69W A00() {
        AnonymousClass66O r0 = (AnonymousClass66O) C86104wH.A0a(this.A02, AnonymousClass66O.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "card_association");
        if (r0 != null) {
            switch (r0.ordinal()) {
                case 1:
                    return AnonymousClass69W.AMERICAN_EXPRESS;
                case 4:
                    return AnonymousClass69W.DISCOVER;
                case 7:
                    return AnonymousClass69W.JCB;
                case 9:
                    return AnonymousClass69W.MASTERCARD;
                case 11:
                    return AnonymousClass69W.RUPAY;
                case 13:
                    return AnonymousClass69W.VISA;
            }
        }
        return AnonymousClass69W.UNKNOWN;
    }

    public final String A01() {
        String stringValue;
        CreditCardCredentialImpl creditCardCredentialImpl = this.A02;
        String stringValue2 = creditCardCredentialImpl.getStringValue("expiry_month");
        if (stringValue2 == null || AnonymousClass8bQ.A0n(stringValue2) || (stringValue = creditCardCredentialImpl.getStringValue("expiry_year")) == null || AnonymousClass8bQ.A0n(stringValue)) {
            return "";
        }
        String stringValue3 = creditCardCredentialImpl.getStringValue("expiry_month");
        if (stringValue3 == null) {
            throw C18180wK.A0a("Required value was null.");
        } else if (AnonymousClass2C6.A00(stringValue3) != 2) {
            return "";
        } else {
            String stringValue4 = creditCardCredentialImpl.getStringValue("expiry_year");
            if (stringValue4 == null) {
                throw C18180wK.A0a("Required value was null.");
            } else if (AnonymousClass2C6.A00(stringValue4) < 4) {
                return "";
            } else {
                String stringValue5 = creditCardCredentialImpl.getStringValue("expiry_month");
                String stringValue6 = creditCardCredentialImpl.getStringValue("expiry_year");
                if (stringValue6 != null) {
                    return AnonymousClass00U.A0L(stringValue5, C18230wP.A0s(stringValue6, 2, 4));
                }
                throw C18180wK.A0a("Required value was null.");
            }
        }
    }

    public final String Aal() {
        return C86144wL.A0s(this.A02, "credential_id");
    }

    public final C40307LcE Aam() {
        C40307LcE lcE = (C40307LcE) C86104wH.A0a(this.A02, C40307LcE.A07, "credential_type");
        if (lcE == null) {
            return C40307LcE.A02;
        }
        return lcE;
    }

    public final String AnP() {
        return C86144wL.A0s(this.A02, "card_association_image_url");
    }

    public final String BEm() {
        return C86144wL.A0s(this.A02, "cc_subtitle");
    }

    public final String BH2() {
        return C86144wL.A0s(this.A02, "cc_title");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        if (this instanceof TokenizedCard) {
            TokenizedCard tokenizedCard = (TokenizedCard) this;
            C04220Ms.A0B(parcel, 0);
            parcel.writeValue(tokenizedCard.A00);
            parcel.writeValue(tokenizedCard.A01);
            parcel.writeInt(tokenizedCard.A05 ? 1 : 0);
            z = tokenizedCard.A04;
        } else {
            C04220Ms.A0B(parcel, 0);
            parcel.writeValue(this.A02);
            parcel.writeInt(this.A05 ? 1 : 0);
            z = this.A04;
        }
        parcel.writeInt(z ? 1 : 0);
    }
}
