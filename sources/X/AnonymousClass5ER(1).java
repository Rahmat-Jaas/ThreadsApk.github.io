package X;

/* renamed from: X.5ER  reason: invalid class name */
public final class AnonymousClass5ER extends AnonymousClass5ES {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008a, code lost:
        if (A0D() == false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog A0C(android.os.Bundle r21) {
        /*
            r20 = this;
            r14 = r20
            android.content.Context r0 = r14.requireContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131494579(0x7f0c06b3, float:1.861267E38)
            r8 = 0
            android.view.View r7 = r1.inflate(r0, r8)
            android.os.Bundle r3 = r14.requireArguments()
            java.lang.String r0 = "disable_autofill_dismiss_option"
            r1 = 0
            long r5 = r3.getLong(r0, r1)
            r3 = 2
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x013d
            r0 = 1
            X.C86164wN.A1A(r7, r0, r14)
        L_0x0028:
            android.content.Context r3 = r14.requireContext()
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            android.app.AlertDialog$Builder r0 = r0.setView(r7)
            android.app.AlertDialog r3 = r0.create()
            r0 = 0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0041
            r3.setCanceledOnTouchOutside(r0)
        L_0x0041:
            android.os.Bundle r2 = r14.requireArguments()
            java.lang.String r1 = "is_consent_accepted"
            boolean r5 = r2.getBoolean(r1, r0)
            android.os.Bundle r2 = r14.requireArguments()
            java.lang.String r1 = "should_always_show_ads_disclosure"
            boolean r4 = r2.getBoolean(r1, r0)
            X.7K3 r2 = r14.A00
            r2.getClass()
            java.lang.String r1 = "CLICKED_LEARN_MORE"
            X.78Q r1 = X.AnonymousClass7K3.A01(r2, r1)
            X.6n8 r9 = r1.A01()
            if (r4 != 0) goto L_0x0124
            if (r5 == 0) goto L_0x0124
            r13 = 1
            androidx.fragment.app.FragmentActivity r6 = r14.requireActivity()
            r10 = 2131830268(0x7f1125fc, float:1.9293529E38)
            r11 = 2131302879(0x7f0919df, float:1.8223857E38)
            r12 = 2131829574(0x7f112346, float:1.929212E38)
            X.AnonymousClass7B3.A00(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0079:
            android.os.Bundle r2 = r14.requireArguments()
            java.lang.String r1 = "should_show_fbpay_disclosure"
            boolean r1 = r2.getBoolean(r1, r0)
            if (r1 == 0) goto L_0x008c
            boolean r1 = r14.A0D()
            r4 = 1
            if (r1 != 0) goto L_0x008d
        L_0x008c:
            r4 = 0
        L_0x008d:
            android.os.Bundle r2 = r14.requireArguments()
            java.lang.String r1 = "show_meta_pay_brand"
            boolean r1 = r2.getBoolean(r1, r0)
            X.AnonymousClass7B3.A01(r7, r4, r1)
            android.os.Bundle r2 = r14.requireArguments()
            java.lang.String r1 = "contact_entries"
            java.util.ArrayList r17 = r2.getParcelableArrayList(r1)
            android.os.Bundle r2 = r14.requireArguments()
            java.lang.String r1 = "requested_fields"
            java.util.ArrayList r1 = r2.getStringArrayList(r1)
            if (r1 == 0) goto L_0x0122
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r1)
        L_0x00b5:
            if (r17 == 0) goto L_0x00d9
            boolean r1 = r17.isEmpty()
            if (r1 != 0) goto L_0x00d9
            if (r2 == 0) goto L_0x00d9
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x00d9
            r1 = 2131297153(0x7f090381, float:1.8212243E38)
            android.view.View r1 = X.C18200wM.A0G(r7, r1)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r1 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r1
            r15 = r8
            r16 = r1
            r18 = r2
            r19 = r13
            X.AnonymousClass7B3.A02(r14, r15, r16, r17, r18, r19)
            r8 = r1
        L_0x00d9:
            r1 = 2131297163(0x7f09038b, float:1.8212263E38)
            android.view.View r2 = X.C18200wM.A0G(r7, r1)
            r1 = 2131297166(0x7f09038e, float:1.821227E38)
            android.view.View r5 = r2.requireViewById(r1)
            com.facebook.redex.IDxObserverShape99S0200000_2_I2 r6 = X.C86164wN.A0O(r5, r14, r13)
            androidx.fragment.app.FragmentActivity r4 = r14.requireActivity()
            r1 = 244(0xf4, float:3.42E-43)
            java.lang.String r1 = X.I17.A00(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            X.7IX r2 = new X.7IX
            r2.<init>(r4, r1)
            boolean r1 = r2.A04()
            if (r1 == 0) goto L_0x010c
            X.7l0 r1 = new X.7l0
            r1.<init>(r14, r6, r14, r2)
            r2.A03(r1)
        L_0x010c:
            r1 = 2131299831(0x7f090df7, float:1.8217675E38)
            android.view.View r1 = r7.requireViewById(r1)
            X.C86144wL.A1C(r1, r5, r14, r8, r0)
            r0 = 2131303782(0x7f091d66, float:1.8225688E38)
            android.view.View r1 = r7.requireViewById(r0)
            r0 = 5
            X.C86104wH.A1C(r1, r0, r14)
            return r3
        L_0x0122:
            r2 = r8
            goto L_0x00b5
        L_0x0124:
            r13 = 1
            androidx.fragment.app.FragmentActivity r6 = r14.requireActivity()
            r10 = 2131835127(0x7f1138f7, float:1.9303384E38)
            r11 = 2131297147(0x7f09037b, float:1.821223E38)
            r12 = 2131829574(0x7f112346, float:1.929212E38)
            X.AnonymousClass7B3.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 2131302879(0x7f0919df, float:1.8223857E38)
            X.C86154wM.A1I(r7, r1)
            goto L_0x0079
        L_0x013d:
            r0 = 2131297638(0x7f090566, float:1.8213227E38)
            X.C18200wM.A1D(r7, r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ER.A0C(android.os.Bundle):android.app.Dialog");
    }
}
