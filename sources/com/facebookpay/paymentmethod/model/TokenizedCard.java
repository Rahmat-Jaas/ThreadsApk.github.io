package com.facebookpay.paymentmethod.model;

import X.C86124wJ;
import android.os.Parcelable;
import com.facebook.graphql.impls.CreditCardCredentialImpl;
import com.facebook.graphql.impls.TokenizedCardCredentialImpl;

public final class TokenizedCard extends CreditCard {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(89);
    public final CreditCardCredentialImpl A00;
    public final TokenizedCardCredentialImpl A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (X.AnonymousClass8bQ.A0n(r3) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TokenizedCard(com.facebook.graphql.impls.CreditCardCredentialImpl r5, com.facebook.graphql.impls.TokenizedCardCredentialImpl r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            X.AnonymousClass0wJ.A1O(r5, r6)
            r4.<init>(r5, r7, r8)
            r4.A00 = r5
            r4.A01 = r6
            r4.A05 = r7
            r4.A04 = r8
            java.lang.String r0 = "issuer_card_art_url"
            java.lang.String r3 = r6.getStringValue(r0)
            if (r3 == 0) goto L_0x001d
            boolean r1 = X.AnonymousClass8bQ.A0n(r3)
            r0 = 0
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            r2 = 0
            if (r0 == 0) goto L_0x0022
            r3 = r2
        L_0x0022:
            r4.A02 = r3
            java.lang.String r0 = "issuer_name"
            java.lang.String r1 = r6.getStringValue(r0)
            if (r1 == 0) goto L_0x0033
            boolean r0 = X.AnonymousClass8bQ.A0n(r1)
            if (r0 != 0) goto L_0x0033
            r2 = r1
        L_0x0033:
            r4.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.paymentmethod.model.TokenizedCard.<init>(com.facebook.graphql.impls.CreditCardCredentialImpl, com.facebook.graphql.impls.TokenizedCardCredentialImpl, boolean, boolean):void");
    }
}
