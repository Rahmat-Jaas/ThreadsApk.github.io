package com.facebookpay.msc.earnings.viewmodel;

import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass6IH;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C04530Oa;
import X.C121177En;
import X.C138238Gs;
import X.C143688h9;
import X.C30821GXg;
import X.C86134wK;
import X.C86144wL;
import X.C86164wN;
import X.M5J;
import android.os.Bundle;
import com.facebook.pando.TreeJNI;
import com.facebookpay.msc.feselector.viewmodel.ListSectionWithFeSelectorViewModel;
import java.util.HashMap;

public final class EarningsViewModel extends ListSectionWithFeSelectorViewModel {
    public M5J A00;
    public AnonymousClass7Kx A01 = AnonymousClass7Kx.A01();
    public boolean A02;
    public final C04530Oa A03 = AnonymousClass0OY.A02(C138238Gs.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EarningsViewModel(C121177En r2) {
        super(r2);
        C04220Ms.A0B(r2, 1);
    }

    public static final void A00(EarningsViewModel earningsViewModel, String str) {
        String A0r;
        C143688h9 A08 = AnonymousClass7Kz.A08();
        HashMap A002 = AnonymousClass6IH.A00(earningsViewModel.A09());
        TreeJNI A0N = C86144wL.A0N(earningsViewModel);
        if (A0N == null || (A0r = C86144wL.A0r(A0N)) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        C86164wN.A1I(A0r, A002);
        A002.put("view_name", "payouthub_earnings");
        A08.Bb8(str, A002);
    }

    public final void A07(Bundle bundle) {
        super.A07(bundle);
        this.A00 = C86134wK.A0K(C30821GXg.A02(this.A03, C86164wN.A0r(this, 28)), this, 29);
    }
}
