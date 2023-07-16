package X;

import java.util.List;

/* renamed from: X.70a  reason: invalid class name and case insensitive filesystem */
public final class C1182570a {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        if (X.C86124wJ.A01(r5.A05, r4.A05) < 5.0f) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.creation.capture.quickcapture.analytics.ReusableTextLoggingMetadata A00(java.util.List r6, java.util.List r7) {
        /*
            r1 = 0
            if (r6 == 0) goto L_0x00f8
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00f8
            com.instagram.creation.capture.quickcapture.analytics.ReusableTextLoggingMetadata r3 = new com.instagram.creation.capture.quickcapture.analytics.ReusableTextLoggingMetadata
            r3.<init>()
            java.lang.Object r0 = r6.get(r1)
            X.5MB r0 = (X.AnonymousClass5MB) r0
            java.lang.String r0 = r0.A0E
            r3.A00 = r0
            if (r7 == 0) goto L_0x00f4
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00f4
            int r1 = r7.size()
            int r0 = r6.size()
            if (r1 == r0) goto L_0x002d
            r0 = 1
            r3.A01 = r0
        L_0x002d:
            r0 = 10
            int r0 = X.C02260Al.A0z(r6, r0)
            int r0 = X.AnonymousClass4WK.A0L(r0)
            java.util.LinkedHashMap r2 = X.C18190wL.A0v(r0)
            java.util.Iterator r4 = r6.iterator()
        L_0x003f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.5MB r0 = (X.AnonymousClass5MB) r0
            java.lang.String r0 = r0.A0F
            r2.put(r0, r1)
            goto L_0x003f
        L_0x0052:
            java.util.Iterator r7 = r7.iterator()
        L_0x0056:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r5 = r7.next()
            X.5MB r5 = (X.AnonymousClass5MB) r5
            java.lang.String r0 = r5.A0E
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00ef
            java.lang.String r1 = r5.A0F
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r4 = r2.get(r1)
            X.5MB r4 = (X.AnonymousClass5MB) r4
            if (r4 == 0) goto L_0x0056
            float r1 = r5.A03
            float r0 = r4.A03
            float r0 = X.C86124wJ.A01(r1, r0)
            r6 = 1028443341(0x3d4ccccd, float:0.05)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b0
            float r1 = r5.A04
            float r0 = r4.A04
            float r0 = X.C86124wJ.A01(r1, r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b0
            float r0 = r5.A06
            float r1 = r4.A06
            float r0 = X.C86124wJ.A01(r0, r1)
            float r0 = r0 / r1
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b0
            float r1 = r5.A05
            float r0 = r4.A05
            float r1 = X.C86124wJ.A01(r1, r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b3
        L_0x00b0:
            r0 = 1
            r3.A02 = r0
        L_0x00b3:
            com.instagram.api.schemas.ClipsTextAlignment r1 = r5.A0B
            com.instagram.api.schemas.ClipsTextAlignment r0 = r4.A0B
            if (r1 != r0) goto L_0x00d5
            java.util.List r1 = r5.A0G
            java.util.List r0 = r4.A0G
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d5
            int r1 = r5.A09
            int r0 = r4.A09
            if (r1 != r0) goto L_0x00d5
            com.instagram.api.schemas.ClipsTextEmphasisMode r1 = r5.A0C
            com.instagram.api.schemas.ClipsTextEmphasisMode r0 = r4.A0C
            if (r1 != r0) goto L_0x00d5
            com.instagram.api.schemas.ClipsTextFormatType r1 = r5.A0D
            com.instagram.api.schemas.ClipsTextFormatType r0 = r4.A0D
            if (r1 == r0) goto L_0x00d8
        L_0x00d5:
            r0 = 1
            r3.A03 = r0
        L_0x00d8:
            float r1 = r5.A07
            float r0 = r4.A07
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00ea
            float r1 = r5.A00
            float r0 = r4.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00ea
            goto L_0x0056
        L_0x00ea:
            r0 = 1
            r3.A04 = r0
            goto L_0x0056
        L_0x00ef:
            r0 = 1
            r3.A01 = r0
            goto L_0x0056
        L_0x00f4:
            r0 = 1
            r3.A01 = r0
            return r3
        L_0x00f8:
            r3 = 0
        L_0x00f9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1182570a.A00(java.util.List, java.util.List):com.instagram.creation.capture.quickcapture.analytics.ReusableTextLoggingMetadata");
    }

    public static final boolean A01(AnonymousClass9AD r3) {
        List list;
        List list2;
        if (r3 != null) {
            list = r3.A0X;
        } else {
            list = null;
        }
        if (list == null || (list2 = r3.A0X) == null || !C18190wL.A1a(list2)) {
            return false;
        }
        return true;
    }
}
