package com.facebook.redex;

import X.C143638h4;

public class IDxCListenerShape508S0100000_2_I2 implements C143638h4 {
    public Object A00;
    public final int A01;

    public IDxCListenerShape508S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        X.AnonymousClass7JD.A02(r2.A03, new X.C128357jR(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r0 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        r0 = "viewContext";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        r1.A01(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C4b(X.C108886j7 r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 2: goto L_0x001a;
                case 3: goto L_0x002a;
                case 4: goto L_0x003d;
                case 5: goto L_0x000f;
                case 6: goto L_0x0060;
                case 7: goto L_0x00f3;
                case 8: goto L_0x0077;
                case 9: goto L_0x004c;
                case 10: goto L_0x008b;
                case 11: goto L_0x009b;
                case 12: goto L_0x00ab;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r5.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.String r0 = r6.A02
            r1.invoke(r0)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r1 = r5.A00
            X.5j7 r1 = (X.AnonymousClass5j7) r1
            X.58M r0 = r1.A09
            if (r0 != 0) goto L_0x00cf
            java.lang.String r0 = "ecpViewModel"
            goto L_0x0072
        L_0x001a:
            java.lang.Object r2 = r5.A00
            com.facebookpay.msc.earningdetail.viewmodel.EarningsDetailViewModel r2 = (com.facebookpay.msc.earningdetail.viewmodel.EarningsDetailViewModel) r2
            java.lang.String r3 = r6.A02
            if (r3 == 0) goto L_0x000e
            java.lang.String r1 = "user_click_payouthub_atomic"
            java.lang.String r0 = "payouthub_link_click"
            com.facebookpay.msc.earningdetail.viewmodel.EarningsDetailViewModel.A00(r2, r1, r0, r3)
            goto L_0x0032
        L_0x002a:
            java.lang.String r3 = r6.A02
            if (r3 == 0) goto L_0x000e
            java.lang.Object r2 = r5.A00
            com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel r2 = (com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel) r2
        L_0x0032:
            X.56q r1 = r2.A03
            X.7jR r0 = new X.7jR
            r0.<init>(r3)
            X.AnonymousClass7JD.A02(r1, r0)
            return
        L_0x003d:
            java.lang.String r2 = r6.A02
            if (r2 == 0) goto L_0x000e
            java.lang.Object r0 = r5.A00
            X.5it r0 = (X.C92585it) r0
            X.3VP r1 = X.AnonymousClass7Kz.A0N()
            android.content.Context r0 = r0.A00
            goto L_0x0087
        L_0x004c:
            java.lang.String r2 = r6.A02
            if (r2 == 0) goto L_0x000e
            java.lang.Object r0 = r5.A00
            X.563 r0 = (X.AnonymousClass563) r0
            X.3VP r1 = X.AnonymousClass7Kz.A0N()
            android.view.ContextThemeWrapper r0 = r0.A00
            if (r0 == 0) goto L_0x0070
            r1.A00(r0, r2)
            return
        L_0x0060:
            java.lang.String r2 = r6.A02
            if (r2 == 0) goto L_0x000e
            java.lang.Object r0 = r5.A00
            X.5j7 r0 = (X.AnonymousClass5j7) r0
            X.3VP r1 = X.AnonymousClass7Kz.A0N()
            android.view.ContextThemeWrapper r0 = r0.A00
            if (r0 != 0) goto L_0x0087
        L_0x0070:
            java.lang.String r0 = "viewContext"
        L_0x0072:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0077:
            java.lang.String r2 = r6.A02
            if (r2 == 0) goto L_0x000e
            java.lang.Object r0 = r5.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.3VP r1 = X.AnonymousClass7Kz.A0N()
            android.content.Context r0 = r0.requireContext()
        L_0x0087:
            r1.A01(r0, r2)
            return
        L_0x008b:
            java.lang.String r2 = r6.A02
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r5.A00
            android.content.Context r1 = (android.content.Context) r1
            X.3VP r0 = X.AnonymousClass7Kz.A0N()
            r0.A00(r1, r2)
            return
        L_0x009b:
            java.lang.String r2 = r6.A02
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r5.A00
            android.content.Context r1 = (android.content.Context) r1
            X.3VP r0 = X.AnonymousClass7Kz.A0N()
            r0.A01(r1, r2)
            return
        L_0x00ab:
            java.lang.String r1 = r6.A02
            if (r1 == 0) goto L_0x000e
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r0 = X.C18250wR.A05(r0)
            android.content.Intent r2 = X.C86164wN.A0B(r0, r1)
            X.0t2 r0 = X.C16420t2.A00()
            X.05P r1 = r0.A05()
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r0 = (com.facebook.redex.IDxObserverShape211S0100000_2_I2) r0
            java.lang.Object r0 = r0.A00
            androidx.fragment.app.FragmentActivity r0 = X.C18240wQ.A0I(r0)
            r1.A09(r0, r2)
            return
        L_0x00cf:
            X.0m7 r4 = r1.getChildFragmentManager()
            X.C04220Ms.A06(r4)
            android.os.Bundle r3 = X.C18180wK.A06()
            X.7JJ r1 = X.AnonymousClass7Kz.A05()
            java.lang.String r0 = "blank_bottom_sheet_fragment"
            androidx.fragment.app.Fragment r2 = r1.A06(r3, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment"
            X.C04220Ms.A0C(r2, r0)
            X.5qq r2 = (X.AnonymousClass5qq) r2
            java.lang.String r1 = "terms_condition_fragment"
            java.lang.String r0 = "TERMS_CONTENT_FRAGMENT_TAG"
            r2.A0E(r3, r4, r1, r0)
            return
        L_0x00f3:
            X.7JJ r1 = X.AnonymousClass7Kz.A05()
            java.lang.Object r0 = r5.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.AnonymousClass7JJ.A04(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape508S0100000_2_I2.C4b(X.6j7):void");
    }
}
