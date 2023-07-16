package X;

/* renamed from: X.6Ol  reason: invalid class name and case insensitive filesystem */
public final class C100736Ol {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r0.CrW(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (r0 == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        r2 = r2.equals("show_captions");
        r1 = r3.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        if (X.C127397h3.A0C(r1.A04) == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ad, code lost:
        r0.A03.A08().setVisibility(X.C18190wL.A00(r2 ? 1 : 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0029, code lost:
        X.C30967GcS.A02("bk.action.video.SendEvent", X.AnonymousClass00U.A0L("Received unknown action: ", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C63893iY r5) {
        /*
            r4 = 0
            X.C04220Ms.A0B(r5, r4)
            X.3HX r1 = X.C63893iY.A01(r5, r4)
            r0 = 1
            java.lang.String r2 = X.C63893iY.A0D(r5, r0)
            r0 = 2
            X.7h3 r0 = X.C63893iY.A03(r5, r0)
            java.lang.String r5 = X.C18220wO.A0o(r0)
            if (r5 == 0) goto L_0x00c6
            X.4rP r0 = r1.A02
            X.7qT r0 = (X.C130667qT) r0
            X.9V6 r3 = X.AnonymousClass6OG.A00(r0)
            int r0 = r2.hashCode()
            java.lang.String r1 = "show_captions"
            switch(r0) {
                case -1714437718: goto L_0x0036;
                case -840405966: goto L_0x003d;
                case 3363353: goto L_0x0058;
                case 3443508: goto L_0x0079;
                case 3540994: goto L_0x0085;
                case 1690109519: goto L_0x0091;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.String r0 = "Received unknown action: "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r2)
            java.lang.String r0 = "bk.action.video.SendEvent"
            X.C30967GcS.A02(r0, r1)
        L_0x0034:
            r0 = 0
            return r0
        L_0x0036:
            java.lang.String r0 = "hide_captions"
            boolean r0 = r2.equals(r0)
            goto L_0x0095
        L_0x003d:
            java.lang.String r0 = "unmute"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0029
            X.AgB r1 = r3.A00(r5)
            if (r1 == 0) goto L_0x0034
            java.util.HashMap r0 = r3.A03
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x00bc
            X.9sw r0 = (X.C169229sw) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0071
        L_0x0058:
            java.lang.String r0 = "mute"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0029
            X.AgB r1 = r3.A00(r5)
            if (r1 == 0) goto L_0x0034
            java.util.HashMap r0 = r3.A03
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x00c1
            X.9sw r0 = (X.C169229sw) r0
            r1 = 0
        L_0x0071:
            X.C2j r0 = r0.A02
            if (r0 == 0) goto L_0x0034
            r0.CrW(r1, r4)
            goto L_0x0034
        L_0x0079:
            java.lang.String r0 = "play"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0029
            r3.A04(r5)
            goto L_0x0034
        L_0x0085:
            java.lang.String r0 = "stop"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0029
            r3.A03(r5)
            goto L_0x0034
        L_0x0091:
            boolean r0 = r2.equals(r1)
        L_0x0095:
            if (r0 == 0) goto L_0x0029
            boolean r2 = r2.equals(r1)
            X.AgB r1 = r3.A00(r5)
            if (r1 == 0) goto L_0x0034
            X.7h3 r0 = r1.A04
            java.lang.String r0 = X.C127397h3.A0C(r0)
            if (r0 == 0) goto L_0x0034
            X.AVV r0 = r1.A00
            if (r0 == 0) goto L_0x0034
            int r1 = X.C18190wL.A00(r2)
            X.Ayd r0 = r0.A03
            android.view.View r0 = r0.A08()
            r0.setVisibility(r1)
            goto L_0x0034
        L_0x00bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x00c1:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x00c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100736Ol.A00(X.3iY):java.lang.Object");
    }
}
