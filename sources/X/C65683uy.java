package X;

import android.widget.CompoundButton;

/* renamed from: X.3uy  reason: invalid class name and case insensitive filesystem */
public final class C65683uy implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ AnonymousClass1wW A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C65683uy(AnonymousClass1wW r1, boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = r1;
        this.A02 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0065, code lost:
        if (r10.A02 == false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r11, boolean r12) {
        /*
            r10 = this;
            boolean r2 = r10.A01
            if (r2 == r12) goto L_0x003a
            if (r12 == 0) goto L_0x004a
            X.1wW r2 = r10.A00
            X.0Oa r3 = r2.A00
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r3)
            java.lang.Integer r0 = X.AnonymousClass006.A02
            X.AnonymousClass3WQ.A00(r1, r0)
            android.os.Bundle r5 = r2.requireArguments()
            java.lang.String r0 = "is_phone_confirmed"
            boolean r0 = r5.getBoolean(r0)
            X.3Hi r4 = X.C62653aT.A01()
            if (r0 == 0) goto L_0x003b
            java.lang.String r8 = X.C63833iQ.A08(r5)
            java.lang.Integer r6 = X.AnonymousClass006.A00
            r9 = 1
            r7 = r6
            androidx.fragment.app.Fragment r0 = r4.A00(r5, r6, r7, r8, r9)
        L_0x002f:
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r3)
            X.AnonymousClass0wJ.A19(r0, r2, r1)
        L_0x003a:
            return
        L_0x003b:
            r1 = 0
            java.lang.String r0 = "ARG_IS_ENABLING_WHATSAPP"
            r5.putBoolean(r0, r1)
            X.1am r0 = new X.1am
            r0.<init>()
            r0.setArguments(r5)
            goto L_0x002f
        L_0x004a:
            X.1wW r6 = r10.A00
            X.0Oa r0 = r6.A00
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A04
            X.AnonymousClass3WQ.A00(r1, r0)
            X.C04220Ms.A07(r11)
            if (r2 == 0) goto L_0x0067
            boolean r0 = r10.A02
            r2 = 1
            r5 = 2131837155(0x7f1140e3, float:1.9307497E38)
            r1 = 2131837154(0x7f1140e2, float:1.9307495E38)
            if (r0 != 0) goto L_0x006e
        L_0x0067:
            r2 = 0
            r5 = 2131836992(0x7f114040, float:1.9307166E38)
            r1 = 2131836991(0x7f11403f, float:1.9307164E38)
        L_0x006e:
            r0 = 2131837167(0x7f1140ef, float:1.9307521E38)
            java.lang.String r4 = X.C18180wK.A0g(r6, r0)
            if (r2 == 0) goto L_0x0099
            X.25l r3 = X.AnonymousClass25l.BLUE_BOLD
        L_0x0079:
            X.Dsm r2 = X.AnonymousClass0wJ.A0V(r6)
            r2.A0L(r5)
            r2.A0K(r1)
            r0 = 103(0x67, float:1.44E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r1 = X.C18220wO.A0O(r6, r0)
            r0 = 1
            r2.A0Y(r1, r3, r4, r0)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r0 = 104(0x68, float:1.46E-43)
            X.C18180wK.A1N(r2, r11, r0, r1)
            X.AnonymousClass0wJ.A1K(r2)
            return
        L_0x0099:
            X.25l r3 = X.AnonymousClass25l.RED_BOLD
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65683uy.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
