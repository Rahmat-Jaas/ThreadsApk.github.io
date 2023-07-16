package X;

/* renamed from: X.2JB  reason: invalid class name */
public final class AnonymousClass2JB {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass601 r4, X.C63893iY r5) {
        /*
            boolean r0 = X.AnonymousClass0wJ.A1Y(r5, r4)
            java.lang.Object r1 = X.C63893iY.A0B(r5, r0)
            r1.getClass()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>"
            X.C04220Ms.A0C(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            X.C101876Sy.A00()
            java.util.HashMap r0 = X.C63913ic.A0N(r1)
            java.lang.StringBuilder r3 = X.C18200wM.A0r()
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r0)
        L_0x0021:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0049
            java.util.Map$Entry r1 = X.C18180wK.A0o(r2)
            java.lang.String r0 = "\""
            r3.append(r0)
            java.lang.String r0 = X.C18200wM.A0p(r1)
            r3.append(r0)
            java.lang.String r0 = "\":\""
            r3.append(r0)
            java.lang.String r0 = X.C18230wP.A0u(r1)
            r3.append(r0)
            java.lang.String r0 = "\","
            r3.append(r0)
            goto L_0x0021
        L_0x0049:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0074
            int r0 = r3.length()
            int r0 = r0 + -1
            r3.deleteCharAt(r0)
            java.lang.String r2 = "{"
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "}"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)
            X.MMo r0 = X.C18180wK.A0L(r0)     // Catch:{ IOException -> 0x006d }
            com.instagram.infocenter.model.InfoCenterFactShareInfo r0 = X.AnonymousClass2QC.parseFromJson(r0)     // Catch:{ IOException -> 0x006d }
            goto L_0x0075
        L_0x006d:
            java.lang.String r1 = "InfoCenterPluginImpl"
            java.lang.String r0 = "Unable to parse info center fact."
            X.C10450iM.A03(r1, r0)
        L_0x0074:
            r0 = 0
        L_0x0075:
            r2 = 0
            if (r0 == 0) goto L_0x0090
            X.0i6 r0 = X.C63913ic.A0F(r4)
            X.C18200wM.A1R(r0)
            X.GVD r1 = X.C25745DrH.A00
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r4)
            X.DrH r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0090
            java.lang.NullPointerException r0 = X.C18200wM.A0d()
            throw r0
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JB.A00(X.601, X.3iY):java.lang.Object");
    }
}
