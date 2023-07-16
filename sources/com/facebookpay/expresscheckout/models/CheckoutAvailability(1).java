package com.facebookpay.expresscheckout.models;

import X.C110606ly;
import com.facebook.graphql.impls.FBPayTransactionInfoImpl;

public final class CheckoutAvailability {
    public final C110606ly A00;
    public final String A01;
    public final FBPayTransactionInfoImpl A02;

    public CheckoutAvailability(FBPayTransactionInfoImpl fBPayTransactionInfoImpl, C110606ly r2, String str) {
        this.A00 = r2;
        this.A02 = fBPayTransactionInfoImpl;
        this.A01 = str;
    }
}
