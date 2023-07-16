package X;

/* renamed from: X.6OO  reason: invalid class name */
public final class AnonymousClass6OO {
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(X.AnonymousClass601 r9, X.C63893iY r10) {
        /*
            java.lang.Object r8 = X.C63893iY.A07(r10)
            X.3HX r8 = (X.AnonymousClass3HX) r8
            r6 = 1
            java.lang.Object r3 = X.C63893iY.A0B(r10, r6)
            r3.getClass()
            r0 = 2
            java.util.List r1 = r10.A00
            X.6jp r2 = X.C18190wL.A0R(r1, r0)
            r0 = 3
            X.6jp r1 = X.C18190wL.A0R(r1, r0)
            r0 = 0
            X.C04220Ms.A0B(r9, r0)
            androidx.fragment.app.Fragment r7 = X.C63913ic.A01(r9)
            java.lang.String r0 = "front"
            boolean r4 = r0.equals(r3)
            X.6q6 r5 = new X.6q6
            r5.<init>(r8, r9, r2, r1)
            android.content.Context r2 = r7.requireContext()
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            if (r3 != 0) goto L_0x003e
            java.lang.Integer r0 = X.AnonymousClass006.A0N
        L_0x0039:
            r5.A00(r0)
        L_0x003c:
            r0 = 0
            return r0
        L_0x003e:
            r0 = 441(0x1b9, float:6.18E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            boolean r1 = r3.hasSystemFeature(r0)
            r0 = 439(0x1b7, float:6.15E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            boolean r0 = r3.hasSystemFeature(r0)
            if (r4 == 0) goto L_0x0059
            if (r1 != 0) goto L_0x0060
            java.lang.Integer r0 = X.AnonymousClass006.A00
            goto L_0x0039
        L_0x0059:
            if (r0 != 0) goto L_0x0060
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r5.A00(r0)
        L_0x0060:
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = r2.checkSelfPermission(r0)
            boolean r0 = X.C18180wK.A1W(r0)
            if (r0 != 0) goto L_0x006f
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x0039
        L_0x006f:
            java.io.File r4 = X.AnonymousClass0hL.A05(r2)
            android.net.Uri r3 = X.FLN.A00(r2, r4)     // Catch:{ IOException -> 0x0092 }
            com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape21S0300000_2_I2 r2 = new com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape21S0300000_2_I2
            r2.<init>((int) r6, (java.lang.Object) r5, (java.lang.Object) r4, (java.lang.Object) r9)
            r0 = 90
            java.lang.String r0 = X.I17.A00(r0)
            android.content.Intent r1 = X.C18250wR.A05(r0)
            java.lang.String r0 = "output"
            r1.putExtra(r0, r3)
            X.C63913ic.A0Q(r9, r2)
            X.C10650ih.A07(r7, r1, r6)     // Catch:{  }
            goto L_0x003c
        L_0x0092:
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r5.A00(r0)
            r4.delete()
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OO.A00(X.601, X.3iY):java.lang.Object");
    }
}
