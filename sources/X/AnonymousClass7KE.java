package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7KE  reason: invalid class name */
public final class AnonymousClass7KE {
    public static final long A01 = C121657He.A02(4278190080L);
    public static final long A02 = C121657He.A02(4278190335L);
    public static final long A03 = C121657He.A02(4278255360L);
    public static final long A04 = C121657He.A02(4294901760L);
    public static final long A05 = (((long) 0) << 32);
    public static final long A06 = C121657He.A04(GQI.A0H, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public static final long A07 = C121657He.A02(4294967295L);
    public final long A00;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A05(X.C115606vY r6, long r7) {
        /*
            r0 = 1
            X.C04220Ms.A0B(r6, r0)
            X.6vY r5 = X.C86154wM.A0G(r7)
            boolean r0 = r6.equals(r5)
            if (r0 != 0) goto L_0x002e
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            X.L8m r1 = X.GQI.A0G
            if (r5 != r1) goto L_0x0036
            if (r6 != r1) goto L_0x002f
            X.7EG r4 = X.AnonymousClass7EG.A05
        L_0x001a:
            float r3 = A03(r7)
            float r2 = A02(r7)
            float r1 = A01(r7)
            float r0 = A00(r7)
            long r7 = r4.A00(r3, r2, r1, r0)
        L_0x002e:
            return r7
        L_0x002f:
            X.6vY r0 = X.GQI.A02
            if (r6 != r0) goto L_0x003f
            X.7EG r4 = X.AnonymousClass7EG.A06
            goto L_0x001a
        L_0x0036:
            X.6vY r0 = X.GQI.A02
            if (r5 != r0) goto L_0x003f
            if (r6 != r1) goto L_0x003f
            X.7EG r4 = X.AnonymousClass7EG.A04
            goto L_0x001a
        L_0x003f:
            if (r5 != r6) goto L_0x0047
            X.53v r4 = new X.53v
            r4.<init>(r5)
            goto L_0x001a
        L_0x0047:
            long r1 = r5.A01
            long r3 = X.AnonymousClass74K.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x005f
            long r1 = r6.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x005f
            X.L8m r5 = (X.C39928L8m) r5
            X.L8m r6 = (X.C39928L8m) r6
            X.L8n r4 = new X.L8n
            r4.<init>(r5, r6)
            goto L_0x001a
        L_0x005f:
            X.7EG r4 = new X.7EG
            r4.<init>(r5, r6)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KE.A05(X.6vY, long):long");
    }

    public static final float A00(long j) {
        float A012;
        float f;
        if ((63 & j) == 0) {
            A012 = (float) AnonymousClass7G2.A01((j >>> 56) & 255);
            f = 255.0f;
        } else {
            A012 = (float) AnonymousClass7G2.A01((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return A012 / f;
    }

    public static final float A01(long j) {
        if ((63 & j) == 0) {
            return ((float) AnonymousClass7G2.A01((j >>> 32) & 255)) / 255.0f;
        }
        return C134837yS.A00((short) ((int) ((j >>> 16) & 65535)));
    }

    public static final float A02(long j) {
        if ((63 & j) == 0) {
            return ((float) AnonymousClass7G2.A01((j >>> 40) & 255)) / 255.0f;
        }
        return C134837yS.A00((short) ((int) ((j >>> 32) & 65535)));
    }

    public static final float A03(long j) {
        int i = ((63 & j) > 0 ? 1 : ((63 & j) == 0 ? 0 : -1));
        long j2 = j >>> 48;
        if (i == 0) {
            return ((float) AnonymousClass7G2.A01(j2 & 255)) / 255.0f;
        }
        return C134837yS.A00((short) ((int) (j2 & 65535)));
    }

    public static String A06(long j) {
        StringBuilder A0s = C18190wL.A0s("Color(");
        A0s.append(A03(j));
        A0s.append(", ");
        A0s.append(A02(j));
        A0s.append(", ");
        A0s.append(A01(j));
        A0s.append(", ");
        A0s.append(A00(j));
        A0s.append(", ");
        A0s.append(C86154wM.A0G(j).A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass7KE) || j != ((AnonymousClass7KE) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        return A06(this.A00);
    }

    public /* synthetic */ AnonymousClass7KE(long j) {
        this.A00 = j;
    }
}
