package com.facebookpay.msc.earningdetail.viewmodel;

import X.AnonymousClass0OY;
import X.AnonymousClass5iR;
import X.AnonymousClass5k7;
import X.AnonymousClass69Q;
import X.AnonymousClass6IH;
import X.AnonymousClass7E5;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C04530Oa;
import X.C121187Eo;
import X.C121277Fh;
import X.C121777Ib;
import X.C128097is;
import X.C138208Gp;
import X.C143688h9;
import X.C146928n6;
import X.C18180wK;
import X.C86114wI;
import X.C86134wK;
import X.C86164wN;
import X.C880756q;
import X.C92375iF;
import X.M5J;
import android.os.Bundle;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.redex.IDxFunctionShape0S2100000_2_I2;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public final class EarningsDetailViewModel extends ListSectionViewModel {
    public AnonymousClass7Kx A00 = AnonymousClass7Kx.A01();
    public String A01;
    public String A02;
    public LoggingData A03;
    public final C880756q A04 = C880756q.A01();
    public final C04530Oa A05 = AnonymousClass0OY.A02(C138208Gp.A00);

    public static final void A01(ImmutableList.Builder builder, int i) {
        AnonymousClass5iR A002 = AnonymousClass5iR.A00(0);
        A002.A05 = C121777Ib.A01(C128097is.A00(new Object[0], i), C92375iF.A00(), AnonymousClass69Q.A19);
        A002.A02 = 1;
        C121187Eo r4 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
        C121187Eo.A00(r4, new Object[0], i);
        r4.A05 = true;
        AnonymousClass7E5.A01(r4, A002, builder);
    }

    public static final void A00(EarningsDetailViewModel earningsDetailViewModel, String str, String str2, String str3) {
        String str4;
        C143688h9 A08 = AnonymousClass7Kz.A08();
        LoggingData loggingData = earningsDetailViewModel.A03;
        if (loggingData == null) {
            str4 = "loggingData";
        } else {
            HashMap A002 = AnonymousClass6IH.A00(loggingData);
            String str5 = earningsDetailViewModel.A01;
            if (str5 == null) {
                str4 = "financialID";
            } else {
                C86164wN.A1I(str5, A002);
                String str6 = earningsDetailViewModel.A02;
                if (str6 == null) {
                    str4 = "payoutRecordID";
                } else {
                    A002.put("payout_record_id", str6);
                    C86134wK.A1M("earning_details", str2, A002);
                    if (str3 != null) {
                        A002.put("target_url", str3);
                    }
                    A08.Bb8(str, A002);
                    return;
                }
            }
        }
        C04220Ms.A0E(str4);
        throw null;
    }

    public final void A07(Bundle bundle) {
        String string;
        String str;
        super.A07(bundle);
        String str2 = null;
        if (bundle != null) {
            str2 = bundle.getString("financial_entity_id");
        }
        if (str2 != null) {
            this.A01 = str2;
            if (bundle == null || (string = bundle.getString("payout_record_id")) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            this.A02 = string;
            LoggingData loggingData = (LoggingData) bundle.getParcelable("logging_data");
            if (loggingData != null) {
                this.A03 = loggingData;
                C880756q r6 = this.A04;
                Object value = this.A05.getValue();
                String str3 = this.A01;
                if (str3 == null) {
                    str = "financialID";
                } else {
                    String str4 = this.A02;
                    if (str4 == null) {
                        str = "payoutRecordID";
                    } else {
                        M5J A002 = AnonymousClass5k7.A00(new IDxFunctionShape0S2100000_2_I2(value, str3, str4, 0), AnonymousClass7Kz.A0C());
                        C04220Ms.A06(A002);
                        C121277Fh.A02(A002, r6, C86114wI.A0Q(this, 88));
                        return;
                    }
                }
                C04220Ms.A0E(str);
                throw null;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
