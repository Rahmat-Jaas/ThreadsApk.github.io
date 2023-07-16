package X;

/* renamed from: X.4P3  reason: invalid class name */
public final class AnonymousClass4P3 implements Runnable {
    public final /* synthetic */ AnonymousClass3VG A00;

    public AnonymousClass4P3(AnonymousClass3VG r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (X.C59713Ma.A01(r4.A06, true) == false) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            X.3VG r0 = r13.A00
            boolean r1 = r0 instanceof X.C26141q7
            if (r1 == 0) goto L_0x00b3
            r4 = r0
            X.1q7 r4 = (X.C26141q7) r4
            java.lang.String r2 = r4.A05
            java.lang.String r1 = "ig_interop"
            boolean r1 = r1.equals(r2)
            r8 = 1
            if (r1 != 0) goto L_0x001d
            X.0i6 r1 = r4.A06
            boolean r1 = X.C59713Ma.A01(r1, r8)
            r9 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r9 = 0
        L_0x001e:
            android.content.Context r6 = r4.A01
            if (r6 == 0) goto L_0x0045
            X.01V r3 = r4.A00
            r2 = 444800256(0x1a831d00, float:5.422718E-23)
            java.lang.String r1 = "show_loading_state"
            r3.markerPoint(r2, r1)
            X.3Gl r5 = X.C35682Ok.A00()
            android.view.Window r7 = r4.A03
            X.0i6 r4 = r4.A06
            X.C18200wM.A1R(r4)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36326124719973809(0x810e6b000025b1, double:3.0361257742503956E-306)
            boolean r10 = X.C63803iN.A0E(r3, r4, r1)
            r5.A00(r6, r7, r8, r9, r10)
        L_0x0045:
            X.44A r10 = X.AnonymousClass44A.A00
            androidx.fragment.app.Fragment r8 = r0.A04
            boolean r1 = r8 instanceof X.I5x
            r9 = 0
            if (r1 == 0) goto L_0x008d
            android.util.SparseArray r7 = r0.A02
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.base.fragment.IgListFragment"
            X.0i6 r11 = r0.A06
            X.C04220Ms.A0C(r8, r1)
            X.I5x r8 = (X.I5x) r8
        L_0x0059:
            if (r7 != 0) goto L_0x0084
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            X.7qT r6 = X.C130667qT.A01(r8, r10, r11, r9)
        L_0x0061:
            X.8kf r5 = r6.A07
            if (r5 == 0) goto L_0x0080
            boolean r1 = r0 instanceof X.C26131q6
            if (r1 == 0) goto L_0x0081
            java.lang.String r2 = "com.bloks.www.fxim.native.launcher.async"
        L_0x006b:
            java.util.Map r1 = r0.A02()
            X.4A9 r4 = X.C63263h8.A00(r11, r2, r1)
            r3 = 5
            r2 = 42
            com.instagram.bloks.util.IDxACallbackShape31S0200000_1_I2 r1 = new com.instagram.bloks.util.IDxACallbackShape31S0200000_1_I2
            r1.<init>(r3, r2, r6, r0)
            r4.A00 = r1
            r5.schedule(r4)
        L_0x0080:
            return
        L_0x0081:
            java.lang.String r2 = "com.bloks.www.fxcal.link.async"
            goto L_0x006b
        L_0x0084:
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            X.7qT r6 = new X.7qT
            r12 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0061
        L_0x008d:
            boolean r1 = r8 instanceof X.C34640IcN
            if (r1 == 0) goto L_0x009d
            android.util.SparseArray r7 = r0.A02
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment"
            X.0i6 r11 = r0.A06
            X.C04220Ms.A0C(r8, r1)
            X.IcN r8 = (X.C34640IcN) r8
            goto L_0x0059
        L_0x009d:
            android.app.Activity r2 = r0.A00
            boolean r1 = r2 instanceof androidx.fragment.app.FragmentActivity
            if (r1 == 0) goto L_0x0080
            X.0i6 r11 = r0.A06
            java.lang.String r1 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            X.C04220Ms.A0C(r2, r1)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            android.util.SparseArray r1 = r0.A02
            X.7qT r6 = X.C130667qT.A00(r1, r2, r10, r11)
            goto L_0x0061
        L_0x00b3:
            X.0i6 r1 = r0.A06
            r6 = 0
            boolean r5 = X.C59713Ma.A01(r1, r6)
            android.content.Context r2 = r0.A01
            if (r2 == 0) goto L_0x0045
            X.3Gl r1 = X.C35682Ok.A00()
            android.view.Window r3 = r0.A03
            r4 = 1
            r1.A00(r2, r3, r4, r5, r6)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4P3.run():void");
    }
}
