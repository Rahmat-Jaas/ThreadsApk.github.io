package X;

/* renamed from: X.3PV  reason: invalid class name */
public final class AnonymousClass3PV {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r2.A1p() == 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r0.booleanValue() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r3, 36318664361775788L) == false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A00(X.BKU r2, com.instagram.service.session.UserSession r3) {
        /*
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            com.instagram.user.model.User r0 = r2.A2Z(r3)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C18250wR.A1J(r3, r0)
            if (r0 == 0) goto L_0x0033
            X.BKN r0 = r2.A0f
            X.9AD r0 = r0.A0l
            if (r0 == 0) goto L_0x005d
            java.lang.Boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005d
            int r0 = r2.A1o()
            if (r0 != 0) goto L_0x0076
            int r0 = r2.A1p()
            if (r0 != 0) goto L_0x0076
            java.lang.Integer r0 = X.AnonymousClass006.A00
            return r0
        L_0x0033:
            int r0 = r2.A1o()
            if (r0 != 0) goto L_0x003f
            int r0 = r2.A1p()
            if (r0 == 0) goto L_0x0099
        L_0x003f:
            X.BKN r0 = r2.A0f
            X.9AD r0 = r0.A0l
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0076
        L_0x004f:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36318664361775788(0x8107a2000012ac, double:3.031407813685516E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0099
            goto L_0x0076
        L_0x005d:
            int r0 = r2.A1o()
            if (r0 != 0) goto L_0x0069
            int r0 = r2.A1p()
            if (r0 == 0) goto L_0x0079
        L_0x0069:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36318664361775788(0x8107a2000012ac, double:3.031407813685516E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0079
        L_0x0076:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            return r0
        L_0x0079:
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r3)
            X.9tz r1 = r0.A0e()
            X.9tz r0 = X.C169839tz.PrivacyStatusPublic
            if (r1 != r0) goto L_0x0099
            X.3ZL r0 = X.AnonymousClass3Zu.A03(r3)
            boolean r0 = r0.A08()
            if (r0 != 0) goto L_0x0099
            r0 = 0
            boolean r0 = X.C67343zO.A02(r0, r3)
            if (r0 != 0) goto L_0x0099
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            return r0
        L_0x0099:
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PV.A00(X.BKU, com.instagram.service.session.UserSession):java.lang.Integer");
    }

    public static final boolean A01(BKU bku) {
        AnonymousClass9AD r0;
        Boolean bool;
        C04220Ms.A0B(bku, 1);
        if (!bku.A4B() || (r0 = bku.A0f.A0l) == null || (bool = r0.A0Q) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
