package com.facebookpay.msc.filter.viewmodel;

import X.AnonymousClass006;
import X.AnonymousClass69Q;
import X.AnonymousClass6IH;
import X.AnonymousClass7E5;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C121177En;
import X.C121187Eo;
import X.C121777Ib;
import X.C143548gv;
import X.C143688h9;
import X.C146928n6;
import X.C146998nD;
import X.C86134wK;
import X.C86164wN;
import X.C880856r;
import X.C92425iM;
import X.M5J;
import com.facebook.redex.IDxCListenerShape15S1100000_2_I2;
import com.facebook.redex.IDxSProviderShape515S0100000_2_I2;
import com.facebookpay.msc.feselector.viewmodel.ListSectionWithFeSelectorViewModel;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public final class FilterViewModel extends ListSectionViewModel implements C143548gv {
    public M5J A00;
    public ListSectionWithFeSelectorViewModel A01;
    public LoggingData A02;
    public String A03;
    public final C880856r A04 = C880856r.A03();
    public final C121177En A05;

    public FilterViewModel(C121177En r4) {
        C04220Ms.A0B(r4, 1);
        this.A05 = r4;
        r4.A04.put("bottom_sheet_filter_index", new IDxSProviderShape515S0100000_2_I2(this, 4));
    }

    public static final void A01(FilterViewModel filterViewModel, ImmutableList.Builder builder, String str) {
        C121777Ib r3 = new C121777Ib((C146998nD) null, A00(str), AnonymousClass69Q.PRIMARY_TEXT);
        C880856r r4 = filterViewModel.A04;
        boolean A0I = C04220Ms.A0I(r4.A08(), str);
        builder.add((Object) C92425iM.A00(new IDxCListenerShape15S1100000_2_I2(str, filterViewModel, 0), r3, new AnonymousClass7E5(new C121187Eo(A00(str), (C146928n6) null, AnonymousClass006.A01, 104, true, C04220Ms.A0I(r4.A08(), str), false)), A0I));
    }

    public final void BQ1(ListSectionWithFeSelectorViewModel listSectionWithFeSelectorViewModel) {
        this.A01 = listSectionWithFeSelectorViewModel;
        this.A00 = C86134wK.A0K(this.A04, this, 31);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0 == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C146928n6 A00(java.lang.String r3) {
        /*
            int r1 = r3.hashCode()
            r0 = -68623507(0xfffffffffbe8e36d, float:-2.4184512E36)
            r2 = 0
            if (r1 == r0) goto L_0x0031
            r0 = -25097047(0xfffffffffe810ca9, float:-8.576807E37)
            if (r1 == r0) goto L_0x0027
            r0 = 64897(0xfd81, float:9.094E-41)
            if (r1 != r0) goto L_0x001f
            java.lang.String r0 = "ALL"
            boolean r0 = r3.equals(r0)
            r1 = 2131827481(0x7f111b19, float:1.9287876E38)
        L_0x001d:
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.7is r0 = X.C128097is.A00(r0, r1)
            return r0
        L_0x0027:
            java.lang.String r0 = "EARNINGS"
            boolean r0 = r3.equals(r0)
            r1 = 2131827482(0x7f111b1a, float:1.9287878E38)
            goto L_0x001d
        L_0x0031:
            java.lang.String r0 = "PAYOUTS"
            boolean r0 = r3.equals(r0)
            r1 = 2131827483(0x7f111b1b, float:1.928788E38)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.msc.filter.viewmodel.FilterViewModel.A00(java.lang.String):X.8n6");
    }

    public static final void A02(FilterViewModel filterViewModel, String str, String str2) {
        String str3;
        C143688h9 A08 = AnonymousClass7Kz.A08();
        LoggingData loggingData = filterViewModel.A02;
        if (loggingData == null) {
            str3 = "loggingData";
        } else {
            HashMap A002 = AnonymousClass6IH.A00(loggingData);
            String str4 = filterViewModel.A03;
            if (str4 == null) {
                str3 = "financialEntityID";
            } else {
                C86164wN.A1I(str4, A002);
                A002.put("view_name", "transactions");
                A002.put("target_name", str);
                A002.put("filter_type", str2);
                A08.Bb8("user_click_payouthub_atomic", A002);
                return;
            }
        }
        C04220Ms.A0E(str3);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.os.BaseBundle] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A07(r4)
            r0 = 0
            if (r4 == 0) goto L_0x000e
            java.lang.String r0 = "logging_data"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            com.facebookpay.msc.logging.LoggingData r0 = (com.facebookpay.msc.logging.LoggingData) r0
        L_0x000e:
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x0045
            r3.A02 = r0
            if (r4 == 0) goto L_0x0040
            java.lang.String r0 = "financial_entity_id"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x0040
            r3.A03 = r0
            X.7En r1 = r3.A05
            java.lang.String r0 = "bottom_sheet_filter_index"
            java.lang.Object r0 = r1.A00(r0)
            android.os.BaseBundle r0 = (android.os.BaseBundle) r0
            if (r0 == 0) goto L_0x002d
            r4 = r0
        L_0x002d:
            X.56r r1 = r3.A04
            java.lang.String r0 = "filter_transaction_type"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x003b
            r1.A0H(r0)
            return
        L_0x003b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        L_0x0040:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        L_0x0045:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.msc.filter.viewmodel.FilterViewModel.A07(android.os.Bundle):void");
    }
}
