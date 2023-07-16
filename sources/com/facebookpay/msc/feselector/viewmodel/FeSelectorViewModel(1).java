package com.facebookpay.msc.feselector.viewmodel;

import X.C04220Ms;
import X.C121177En;
import X.C121697Hn;
import X.C143548gv;
import X.C18180wK;
import X.C86134wK;
import X.C880856r;
import X.M5J;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.redex.IDxSProviderShape515S0100000_2_I2;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import com.facebookpay.msc.logging.LoggingData;
import java.util.List;

public final class FeSelectorViewModel extends ListSectionViewModel implements C143548gv {
    public M5J A00;
    public ListSectionWithFeSelectorViewModel A01;
    public LoggingData A02;
    public String A03;
    public List A04;
    public final C880856r A05 = C880856r.A03();
    public final C121177En A06;

    public FeSelectorViewModel(C121177En r4) {
        C04220Ms.A0B(r4, 1);
        this.A06 = r4;
        r4.A04.put("fe_selector_financial_entity", new IDxSProviderShape515S0100000_2_I2(this, 2));
    }

    public final void BQ1(ListSectionWithFeSelectorViewModel listSectionWithFeSelectorViewModel) {
        this.A01 = listSectionWithFeSelectorViewModel;
        this.A00 = C86134wK.A0K(this.A05, this, 30);
    }

    public final void A07(Bundle bundle) {
        Parcelable parcelable;
        Object A012;
        LoggingData loggingData;
        super.A07(bundle);
        List A022 = C121697Hn.A02(bundle);
        if (A022 != null) {
            this.A04 = A022;
            Bundle bundle2 = (Bundle) this.A06.A00("fe_selector_financial_entity");
            if (bundle2 == null) {
                bundle2 = bundle;
            }
            C880856r r1 = this.A05;
            if (bundle2 == null || (parcelable = bundle2.getParcelable("financial_entity")) == null || (A012 = C121697Hn.A01(parcelable)) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            r1.A0H(A012);
            if (bundle == null || (loggingData = (LoggingData) bundle.getParcelable("logging_data")) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            this.A02 = loggingData;
            String string = bundle.getString("parent_view_name");
            if (string != null) {
                this.A03 = string;
                return;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
