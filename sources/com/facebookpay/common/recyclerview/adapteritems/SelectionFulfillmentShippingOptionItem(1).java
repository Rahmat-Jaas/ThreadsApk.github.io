package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass0wJ;
import X.AnonymousClass69U;
import X.C86144wL;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import java.util.Date;

public final class SelectionFulfillmentShippingOptionItem extends SelectionFulfillmentOptionItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(90);
    public Integer A00;
    public final CurrencyAmount A01;
    public final AnonymousClass69U A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Date A06;
    public final Date A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionFulfillmentShippingOptionItem(CurrencyAmount currencyAmount, AnonymousClass69U r2, Integer num, String str, String str2, String str3, Date date, Date date2) {
        super(currencyAmount, r2, num, str, str2, str3);
        AnonymousClass0wJ.A1O(r2, num);
        AnonymousClass0wJ.A1R(str, str2);
        this.A02 = r2;
        this.A00 = num;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = currencyAmount;
        this.A03 = str3;
        this.A07 = date;
        this.A06 = date2;
    }
}
