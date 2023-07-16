package X;

import android.graphics.Rect;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.54t  reason: invalid class name and case insensitive filesystem */
public final class C878454t extends AnonymousClass7YO {
    public static C878454t A03;
    public static final C967466n A04 = C967466n.Ltr;
    public static final C967466n A05 = C967466n.Rtl;
    public AnonymousClass7HT A00;
    public AnonymousClass7AW A01;
    public Rect A02 = C86134wK.A0D();

    private final int A00(C967466n r5, int i) {
        AnonymousClass7AW r0 = this.A01;
        if (r0 != null) {
            int A052 = r0.A05(i);
            AnonymousClass7AW r02 = this.A01;
            if (r02 != null) {
                C967466n A0C = r02.A0C(A052);
                AnonymousClass7AW r1 = this.A01;
                if (r5 != A0C) {
                    if (r1 != null) {
                        return r1.A05(i);
                    }
                } else if (r1 != null) {
                    return r1.A06(i, false) - 1;
                }
            }
        }
        C04220Ms.A0E("layoutResult");
        throw null;
    }

    public final int[] ANN(int i) {
        int i2;
        if (AnonymousClass7YO.A01(this) <= 0 || i >= AnonymousClass7YO.A01(this)) {
            return null;
        }
        try {
            AnonymousClass7HT r0 = this.A00;
            if (r0 == null) {
                C04220Ms.A0E("node");
                throw null;
            }
            AnonymousClass7F6 A032 = r0.A03();
            int A022 = AnonymousClass8bA.A02(A032.A00 - A032.A03);
            int i3 = 0;
            if (0 < i) {
                i3 = i;
            }
            AnonymousClass7AW r02 = this.A01;
            if (r02 != null) {
                int A042 = r02.A04(i3);
                AnonymousClass7AW r03 = this.A01;
                if (r03 != null) {
                    float A023 = r03.A02(A042) + ((float) A022);
                    AnonymousClass7AW r1 = this.A01;
                    if (r1 != null) {
                        int i4 = (A023 > r1.A02(r1.A03.A02 - 1) ? 1 : (A023 == r1.A02(r1.A03.A02 - 1) ? 0 : -1));
                        AnonymousClass7AW r04 = this.A01;
                        if (i4 < 0) {
                            if (r04 != null) {
                                i2 = r04.A03(A023);
                            }
                        } else if (r04 != null) {
                            i2 = r04.A03.A02;
                        }
                        return A03(i3, A00(A04, i2 - 1) + 1);
                    }
                }
            }
            C04220Ms.A0E("layoutResult");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int[] CX4(int i) {
        int i2;
        if (AnonymousClass7YO.A01(this) <= 0 || i <= 0) {
            return null;
        }
        try {
            AnonymousClass7HT r0 = this.A00;
            if (r0 == null) {
                C04220Ms.A0E("node");
                throw null;
            }
            AnonymousClass7F6 A032 = r0.A03();
            int A022 = AnonymousClass8bA.A02(A032.A00 - A032.A03);
            int A012 = AnonymousClass7YO.A01(this);
            if (A012 > i) {
                A012 = i;
            }
            AnonymousClass7AW r02 = this.A01;
            if (r02 != null) {
                int A042 = r02.A04(A012);
                AnonymousClass7AW r03 = this.A01;
                if (r03 != null) {
                    float A023 = r03.A02(A042) - ((float) A022);
                    if (A023 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        AnonymousClass7AW r04 = this.A01;
                        if (r04 != null) {
                            i2 = r04.A03(A023);
                        }
                    } else {
                        i2 = 0;
                    }
                    if (A012 == AnonymousClass7YO.A01(this) && i2 < A042) {
                        i2++;
                    }
                    return A03(A00(A05, i2), A012);
                }
            }
            C04220Ms.A0E("layoutResult");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
