package com.instagram.wellbeing.respectfulcommentnudge.data;

public final class RespectfulNudgeApi {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.BZI r8, X.BKU r9, com.instagram.service.session.UserSession r10, java.lang.String r11, java.util.List r12, X.C146958n9 r13, boolean r14) {
        /*
            r7 = this;
            r3 = 39
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4.A00(r3, r13)
            if (r0 == 0) goto L_0x0089
            r5 = r13
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0089
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0039
            if (r0 != r4) goto L_0x0115
            X.AnonymousClass0OU.A00(r1)
        L_0x0025:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x008f
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.5t1 r0 = (X.AnonymousClass5t1) r0
            X.6jM r0 = r0.A00
            if (r0 != 0) goto L_0x0098
            X.C18250wR.A0m()
            throw r3
        L_0x0039:
            X.AnonymousClass0OU.A00(r1)
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r10)
            java.lang.String r0 = "nudges/generate_nudge/"
            r2.A0J(r0)
            java.lang.Class<X.5t1> r1 = X.AnonymousClass5t1.class
            java.lang.Class<X.6yZ> r0 = X.C117366yZ.class
            r2.A0B(r1, r0)
            java.lang.String r0 = "source"
            r2.A0O(r0, r11)
            X.BKN r0 = r9.A0f
            java.lang.String r1 = r0.A4Y
            java.lang.String r0 = "media_id"
            r2.A0O(r0, r1)
            java.lang.String r0 = "is_bottom_sheet_open"
            r2.A0R(r0, r14)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r12)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "viewed_comment_ids"
            r2.A0O(r0, r1)
            if (r8 == 0) goto L_0x0076
            java.lang.String r1 = r8.A0f
            java.lang.String r0 = "comment_id"
            r2.A0O(r0, r1)
        L_0x0076:
            X.H8c r2 = r2.A02()
            r5.A01 = r7
            r5.A00 = r4
            r1 = 1358667743(0x50fb9fdf, float:3.37724682E10)
            r0 = 0
            java.lang.Object r1 = X.C63623hv.A00(r2, r5, r1, r0)
            if (r1 != r6) goto L_0x0025
            return r6
        L_0x0089:
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4
            r5.<init>(r7, r13, r3)
            goto L_0x0016
        L_0x008f:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x009c
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0098:
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x009c:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0110
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x00a8:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x010a
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r1 = r1.A00
            X.6jM r1 = (X.C109036jM) r1
            com.instagram.api.schemas.NudgeType r0 = r1.A00
            if (r0 == 0) goto L_0x00b8
            java.lang.String r3 = r0.A00
        L_0x00b8:
            java.util.Map r0 = com.instagram.api.schemas.NudgeType.A01
            java.lang.Object r0 = r0.get(r3)
            com.instagram.api.schemas.NudgeType r0 = (com.instagram.api.schemas.NudgeType) r0
            if (r0 != 0) goto L_0x00c4
            com.instagram.api.schemas.NudgeType r0 = com.instagram.api.schemas.NudgeType.UNRECOGNIZED
        L_0x00c4:
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x00ff;
                case 2: goto L_0x0107;
                case 3: goto L_0x00e9;
                case 4: goto L_0x00d3;
                case 5: goto L_0x00d3;
                case 6: goto L_0x00e9;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            java.util.List r0 = r1.A02
            X.65o r6 = new X.65o
            r6.<init>(r0)
            return r6
        L_0x00d3:
            com.instagram.api.schemas.NudgeVisualType r0 = r1.A01
            if (r0 != 0) goto L_0x00de
            r0 = 0
        L_0x00d8:
            X.65k r6 = new X.65k
            r6.<init>(r0)
            return r6
        L_0x00de:
            java.lang.String r1 = r0.A00
            com.instagram.api.schemas.NudgeVisualType r0 = com.instagram.api.schemas.NudgeVisualType.POST_LEVEL_PERSISTENT
            java.lang.String r0 = r0.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            goto L_0x00d8
        L_0x00e9:
            com.instagram.api.schemas.NudgeVisualType r0 = r1.A01
            if (r0 != 0) goto L_0x00f4
            r0 = 0
        L_0x00ee:
            X.65l r6 = new X.65l
            r6.<init>(r0)
            return r6
        L_0x00f4:
            java.lang.String r1 = r0.A00
            com.instagram.api.schemas.NudgeVisualType r0 = com.instagram.api.schemas.NudgeVisualType.POST_LEVEL_PERSISTENT
            java.lang.String r0 = r0.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            goto L_0x00ee
        L_0x00ff:
            java.util.List r0 = r1.A02
            X.65m r6 = new X.65m
            r6.<init>(r0)
            return r6
        L_0x0107:
            X.65n r6 = X.C965465n.A00
            return r6
        L_0x010a:
            X.65o r0 = new X.65o
            r0.<init>(r3, r3, r4)
            return r0
        L_0x0110:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0115:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.respectfulcommentnudge.data.RespectfulNudgeApi.A00(X.BZI, X.BKU, com.instagram.service.session.UserSession, java.lang.String, java.util.List, X.8n9, boolean):java.lang.Object");
    }
}
