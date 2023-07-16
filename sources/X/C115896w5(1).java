package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6w5  reason: invalid class name and case insensitive filesystem */
public final class C115896w5 {
    public static final AnonymousClass7F6 A00(C146508mM r19) {
        C146508mM r1 = r19;
        C146508mM A01 = A01(r1);
        AnonymousClass7F6 Bax = A01(r1).Bax(r1, true);
        long BCI = A01.BCI();
        float A07 = (float) C86104wH.A07(BCI);
        float A08 = (float) C86104wH.A08(BCI);
        float A012 = AnonymousClass8bI.A01(Bax.A01, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A07);
        float A013 = AnonymousClass8bI.A01(Bax.A03, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A08);
        float A014 = AnonymousClass8bI.A01(Bax.A02, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A07);
        float A015 = AnonymousClass8bI.A01(Bax.A00, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A08);
        if (A012 == A014 || A013 == A015) {
            return AnonymousClass7F6.A04;
        }
        long Bb2 = A01.Bb2(C86104wH.A0C(A012, A013));
        long Bb22 = A01.Bb2(C86104wH.A0C(A014, A013));
        long Bb23 = A01.Bb2(C86104wH.A0C(A014, A015));
        long Bb24 = A01.Bb2(C86104wH.A0C(A012, A015));
        float A016 = AnonymousClass7KC.A01(Bb2);
        float[] fArr = {AnonymousClass7KC.A01(Bb22), AnonymousClass7KC.A01(Bb24), AnonymousClass7KC.A01(Bb23)};
        int i = 0;
        do {
            A016 = Math.min(A016, fArr[i]);
            i++;
        } while (i < 3);
        float A02 = AnonymousClass7KC.A02(Bb2);
        float[] fArr2 = {AnonymousClass7KC.A02(Bb22), AnonymousClass7KC.A02(Bb24), AnonymousClass7KC.A02(Bb23)};
        int i2 = 0;
        do {
            A02 = Math.min(A02, fArr2[i2]);
            i2++;
        } while (i2 < 3);
        float A017 = AnonymousClass7KC.A01(Bb2);
        float[] fArr3 = {AnonymousClass7KC.A01(Bb22), AnonymousClass7KC.A01(Bb24), AnonymousClass7KC.A01(Bb23)};
        int i3 = 0;
        do {
            A017 = Math.max(A017, fArr3[i3]);
            i3++;
        } while (i3 < 3);
        float A022 = AnonymousClass7KC.A02(Bb2);
        float[] fArr4 = {AnonymousClass7KC.A02(Bb22), AnonymousClass7KC.A02(Bb24), AnonymousClass7KC.A02(Bb23)};
        int i4 = 0;
        do {
            A022 = Math.max(A022, fArr4[i4]);
            i4++;
        } while (i4 < 3);
        return new AnonymousClass7F6(A016, A02, A017, A022);
    }

    public static final C146508mM A01(C146508mM r3) {
        AnonymousClass54T r2;
        AnonymousClass54T r1;
        C146508mM B03 = r3.B03();
        while (true) {
            r2 = r3;
            r3 = B03;
            if (B03 == null) {
                break;
            }
            B03 = B03.B03();
        }
        if ((r2 instanceof AnonymousClass54T) && (r1 = (AnonymousClass54T) r2) != null) {
            AnonymousClass54T r0 = r1.A07;
            while (true) {
                r2 = r1;
                r1 = r0;
                if (r0 == null) {
                    break;
                }
                r0 = r0.A07;
            }
        }
        return r2;
    }
}
