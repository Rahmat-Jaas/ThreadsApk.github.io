package X;

import android.graphics.RectF;
import android.text.Layout;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.7AW  reason: invalid class name */
public final class AnonymousClass7AW {
    public final float A00;
    public final float A01;
    public final long A02;
    public final AnonymousClass7EK A03;
    public final C115396uz A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7AW) {
                AnonymousClass7AW r8 = (AnonymousClass7AW) obj;
                if (!C04220Ms.A0I(this.A04, r8.A04) || !C04220Ms.A0I(this.A03, r8.A03) || this.A02 != r8.A02 || this.A00 != r8.A00 || this.A01 != r8.A01 || !C04220Ms.A0I(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static C115346uu A00(AnonymousClass7AW r6, int i) {
        int i2;
        AnonymousClass7EK r0 = r6.A03;
        AnonymousClass7EK.A01(r0, i);
        List list = r0.A04;
        C04220Ms.A0B(list, 0);
        int size = list.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 > size) {
                i2 = -(i3 + 1);
                break;
            }
            i2 = (i3 + size) >>> 1;
            C115346uu r1 = (C115346uu) list.get(i2);
            if (r1.A03 <= i) {
                if (r1.A02 > i) {
                    break;
                }
                i3 = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return (C115346uu) list.get(i2);
    }

    public final int A03(float f) {
        int A002;
        AnonymousClass7EK r3 = this.A03;
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            A002 = 0;
        } else {
            int i = (f > r3.A00 ? 1 : (f == r3.A00 ? 0 : -1));
            List list = r3.A04;
            if (i >= 0) {
                C04220Ms.A0B(list, 0);
                A002 = C86104wH.A0B(list);
            } else {
                A002 = C115956wB.A00(list, f);
            }
        }
        C115346uu r32 = (C115346uu) r3.A04.get(A002);
        int i2 = r32.A04;
        int i3 = r32.A05;
        if (i2 - i3 == 0) {
            return Math.max(0, i3 - 1);
        }
        C143058g2 r1 = r32.A06;
        float f2 = f - r32.A01;
        C115526vM r0 = ((C123707Ye) r1).A01;
        return r0.A08.getLineForVertical(r0.A05 + ((int) f2)) + r32.A03;
    }

    public final int A04(int i) {
        int A012;
        AnonymousClass7EK r2 = this.A03;
        if (i >= r2.A03.A00.length()) {
            List list = r2.A04;
            C04220Ms.A0B(list, 0);
            A012 = C86104wH.A0B(list);
        } else if (i < 0) {
            A012 = 0;
        } else {
            A012 = C115956wB.A01(r2.A04, i);
        }
        C115346uu r4 = (C115346uu) r2.A04.get(A012);
        C143058g2 r3 = r4.A06;
        int i2 = r4.A05;
        return ((C123707Ye) r3).A01.A08.getLineForOffset(AnonymousClass8bI.A02(i, i2, r4.A04) - i2) + r4.A03;
    }

    public final int A07(long j) {
        int A002;
        float f;
        AnonymousClass7EK r3 = this.A03;
        if (AnonymousClass7KC.A02(j) <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            A002 = 0;
        } else {
            int i = (AnonymousClass7KC.A02(j) > r3.A00 ? 1 : (AnonymousClass7KC.A02(j) == r3.A00 ? 0 : -1));
            List list = r3.A04;
            if (i >= 0) {
                C04220Ms.A0B(list, 0);
                A002 = C86104wH.A0B(list);
            } else {
                A002 = C115956wB.A00(list, AnonymousClass7KC.A02(j));
            }
        }
        C115346uu r32 = (C115346uu) r3.A04.get(A002);
        int i2 = r32.A04;
        int i3 = r32.A05;
        if (i2 - i3 == 0) {
            return Math.max(0, i3 - 1);
        }
        C143058g2 r4 = r32.A06;
        long A0C = C86104wH.A0C(AnonymousClass7KC.A01(j), AnonymousClass7KC.A02(j) - r32.A01);
        C115526vM r6 = ((C123707Ye) r4).A01;
        int A022 = (int) AnonymousClass7KC.A02(A0C);
        Layout layout = r6.A08;
        int lineForVertical = layout.getLineForVertical(r6.A05 + A022);
        float A012 = AnonymousClass7KC.A01(A0C);
        float f2 = (float) -1;
        if (lineForVertical == r6.A04 - 1) {
            f = r6.A00 + r6.A01;
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return layout.getOffsetForHorizontal(lineForVertical, A012 + (f2 * f)) + i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dd, code lost:
        if (X.C121607Gz.A02(r6, r2) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e8, code lost:
        if (X.C121607Gz.A02(r6, r2) != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0108, code lost:
        if (X.C121607Gz.A01(r8, r2) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0114, code lost:
        if (X.C121607Gz.A01(r8, r2) != false) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A08(int r12) {
        /*
            r11 = this;
            X.7EK r1 = r11.A03
            X.AnonymousClass7EK.A00(r1, r12)
            X.7Yf r0 = r1.A03
            X.7yH r0 = r0.A00
            int r0 = r0.length()
            java.util.List r1 = r1.A04
            if (r12 != r0) goto L_0x0117
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            int r0 = X.C86104wH.A0B(r1)
        L_0x0019:
            java.lang.Object r0 = r1.get(r0)
            X.6uu r0 = (X.C115346uu) r0
            X.8g2 r1 = r0.A06
            int r4 = r0.A05
            int r0 = r0.A04
            int r2 = X.AnonymousClass8bI.A02(r12, r4, r0)
            int r2 = r2 - r4
            X.7Ye r1 = (X.C123707Ye) r1
            X.0Oa r5 = r1.A05
            java.lang.Object r0 = r5.getValue()
            X.6bP r0 = (X.C104206bP) r0
            r10 = r2
            X.7Gz r8 = r0.A00
            X.C121607Gz.A00(r8, r2)
            java.text.BreakIterator r6 = r8.A03
            int r0 = r6.preceding(r2)
            int r9 = r8.A01
            int r7 = r8.A00
            if (r0 >= r7) goto L_0x00f4
            if (r9 > r0) goto L_0x00f4
            java.lang.CharSequence r3 = r8.A02
            int r0 = java.lang.Character.codePointAt(r3, r0)
            boolean r0 = X.AnonymousClass6FS.A00(r0)
            if (r0 == 0) goto L_0x00f4
            r1 = r2
            X.C121607Gz.A00(r8, r2)
        L_0x0058:
            r0 = -1
            if (r1 == r0) goto L_0x0073
            if (r1 >= r7) goto L_0x00eb
            if (r9 > r1) goto L_0x00eb
            int r0 = java.lang.Character.codePointAt(r3, r1)
            boolean r0 = X.AnonymousClass6FS.A00(r0)
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r8.A03(r1)
            if (r0 != 0) goto L_0x00eb
        L_0x006f:
            r0 = -1
            if (r1 == r0) goto L_0x0073
            r10 = r1
        L_0x0073:
            java.lang.Object r0 = r5.getValue()
            X.6bP r0 = (X.C104206bP) r0
            X.7Gz r6 = r0.A00
            X.C121607Gz.A00(r6, r2)
            java.text.BreakIterator r5 = r6.A03
            int r0 = r5.following(r2)
            boolean r0 = r6.A03(r0)
            r1 = r2
            if (r0 == 0) goto L_0x00ca
            X.C121607Gz.A00(r6, r2)
        L_0x008e:
            r0 = -1
            if (r1 == r0) goto L_0x00af
            int r3 = r6.A01
            int r0 = r6.A00
            if (r1 >= r0) goto L_0x00a5
            if (r3 > r1) goto L_0x00a5
            java.lang.CharSequence r0 = r6.A02
            int r0 = java.lang.Character.codePointAt(r0, r1)
            boolean r0 = X.AnonymousClass6FS.A00(r0)
            if (r0 != 0) goto L_0x00c2
        L_0x00a5:
            boolean r0 = r6.A03(r1)
            if (r0 == 0) goto L_0x00c2
        L_0x00ab:
            r0 = -1
            if (r1 == r0) goto L_0x00af
            r2 = r1
        L_0x00af:
            long r2 = X.AnonymousClass6FM.A00(r10, r2)
            int r1 = X.C86104wH.A07(r2)
            int r1 = r1 + r4
            int r0 = X.C86104wH.A08(r2)
            int r0 = r0 + r4
            long r0 = X.AnonymousClass6FM.A00(r1, r0)
            return r0
        L_0x00c2:
            X.C121607Gz.A00(r6, r1)
            int r1 = r5.following(r1)
            goto L_0x008e
        L_0x00ca:
            X.C121607Gz.A00(r6, r2)
            boolean r0 = X.C121607Gz.A01(r6, r2)
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r5.isBoundary(r2)
            if (r0 == 0) goto L_0x00df
            boolean r0 = X.C121607Gz.A02(r6, r2)
            if (r0 == 0) goto L_0x00ab
        L_0x00df:
            int r1 = r5.following(r2)
            goto L_0x00ab
        L_0x00e4:
            boolean r0 = X.C121607Gz.A02(r6, r2)
            if (r0 == 0) goto L_0x00af
            goto L_0x00df
        L_0x00eb:
            X.C121607Gz.A00(r8, r1)
            int r1 = r6.preceding(r1)
            goto L_0x0058
        L_0x00f4:
            r1 = r2
            X.C121607Gz.A00(r8, r2)
            boolean r0 = X.C121607Gz.A02(r8, r2)
            if (r0 == 0) goto L_0x0110
            boolean r0 = r6.isBoundary(r2)
            if (r0 == 0) goto L_0x010a
            boolean r0 = X.C121607Gz.A01(r8, r2)
            if (r0 == 0) goto L_0x006f
        L_0x010a:
            int r1 = r6.preceding(r2)
            goto L_0x006f
        L_0x0110:
            boolean r0 = X.C121607Gz.A01(r8, r2)
            if (r0 == 0) goto L_0x0073
            goto L_0x010a
        L_0x0117:
            int r0 = X.C115956wB.A01(r1, r12)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7AW.A08(int):long");
    }

    public final AnonymousClass7F6 A09(int i) {
        float A042;
        float A043;
        AnonymousClass7EK r3 = this.A03;
        if (i < 0 || i >= C134747yH.A02(r3.A03.A00)) {
            throw C18190wL.A0a(C86134wK.A0l(i, r3.A03.A00.length(), "offset(", ") is out of bounds [0, "));
        }
        List list = r3.A04;
        C115346uu r5 = (C115346uu) list.get(C115956wB.A01(list, i));
        C143058g2 r2 = r5.A06;
        int i2 = r5.A05;
        int A022 = AnonymousClass8bI.A02(i, i2, r5.A04) - i2;
        C115526vM r7 = ((C123707Ye) r2).A01;
        Layout layout = r7.A08;
        int lineForOffset = layout.getLineForOffset(A022);
        float A023 = r7.A02(lineForOffset);
        float A012 = r7.A01(lineForOffset);
        boolean A1T = AnonymousClass0wJ.A1T(layout.getParagraphDirection(lineForOffset), 1);
        boolean isRtlCharAt = layout.isRtlCharAt(A022);
        if (A1T) {
            if (!isRtlCharAt) {
                A042 = r7.A03(A022, false);
                A043 = r7.A03(A022 + 1, true);
            } else {
                A043 = r7.A04(A022, false);
                A042 = r7.A04(A022 + 1, true);
            }
        } else if (isRtlCharAt) {
            A043 = r7.A03(A022, false);
            A042 = r7.A03(A022 + 1, true);
        } else {
            A042 = r7.A04(A022, false);
            A043 = r7.A04(A022 + 1, true);
        }
        RectF rectF = new RectF(A042, A023, A043, A012);
        return new AnonymousClass7F6(rectF.left, rectF.top, rectF.right, rectF.bottom).A03(C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, r5.A01));
    }

    public final AnonymousClass7F6 A0A(int i) {
        int A012;
        AnonymousClass7EK r1 = this.A03;
        AnonymousClass7EK.A00(r1, i);
        int length = r1.A03.A00.length();
        List list = r1.A04;
        if (i == length) {
            C04220Ms.A0B(list, 0);
            A012 = C86104wH.A0B(list);
        } else {
            A012 = C115956wB.A01(list, i);
        }
        C115346uu r5 = (C115346uu) list.get(A012);
        C143058g2 r3 = r5.A06;
        int i2 = r5.A05;
        int A022 = AnonymousClass8bI.A02(i, i2, r5.A04) - i2;
        C123707Ye r32 = (C123707Ye) r3;
        if (A022 < 0 || A022 > r32.A03.length()) {
            throw new AssertionError(AnonymousClass00U.A01(A022, r32.A03.length(), "offset(", ") is out of bounds (0,"));
        }
        C115526vM r2 = r32.A01;
        float A032 = r2.A03(A022, false);
        int lineForOffset = r2.A08.getLineForOffset(A022);
        return new AnonymousClass7F6(A032, r2.A02(lineForOffset), A032, r2.A01(lineForOffset)).A03(C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, r5.A01));
    }

    public final C967466n A0B(int i) {
        int A012;
        AnonymousClass7EK r1 = this.A03;
        AnonymousClass7EK.A00(r1, i);
        int length = r1.A03.A00.length();
        List list = r1.A04;
        if (i == length) {
            C04220Ms.A0B(list, 0);
            A012 = C86104wH.A0B(list);
        } else {
            A012 = C115956wB.A01(list, i);
        }
        C115346uu r0 = (C115346uu) list.get(A012);
        C143058g2 r3 = r0.A06;
        int i2 = r0.A05;
        if (((C123707Ye) r3).A01.A08.isRtlCharAt(AnonymousClass8bI.A02(i, i2, r0.A04) - i2)) {
            return C967466n.Rtl;
        }
        return C967466n.Ltr;
    }

    public final C967466n A0C(int i) {
        int A012;
        AnonymousClass7EK r1 = this.A03;
        AnonymousClass7EK.A00(r1, i);
        int length = r1.A03.A00.length();
        List list = r1.A04;
        if (i == length) {
            C04220Ms.A0B(list, 0);
            A012 = C86104wH.A0B(list);
        } else {
            A012 = C115956wB.A01(list, i);
        }
        C115346uu r0 = (C115346uu) list.get(A012);
        C143058g2 r3 = r0.A06;
        int i2 = r0.A05;
        int A022 = AnonymousClass8bI.A02(i, i2, r0.A04) - i2;
        Layout layout = ((C123707Ye) r3).A01.A08;
        if (layout.getParagraphDirection(layout.getLineForOffset(A022)) == 1) {
            return C967466n.Ltr;
        }
        return C967466n.Rtl;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A05, C86104wH.A05(C86104wH.A05(C86104wH.A06(AnonymousClass0wJ.A05(this.A03, C18210wN.A04(this.A04)), this.A02), this.A00), this.A01));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TextLayoutResult(layoutInput=");
        A0s.append(this.A04);
        A0s.append(", multiParagraph=");
        A0s.append(this.A03);
        A0s.append(", size=");
        long j = this.A02;
        A0s.append(AnonymousClass00U.A0K(" x ", C86104wH.A07(j), C86104wH.A08(j)));
        A0s.append(", firstBaseline=");
        A0s.append(this.A00);
        A0s.append(", lastBaseline=");
        A0s.append(this.A01);
        A0s.append(", placeholderRects=");
        return C86104wH.A0y(this.A05, A0s);
    }

    public AnonymousClass7AW(AnonymousClass7EK r4, C115396uz r5, long j) {
        float A002;
        float A003;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = j;
        List list = r4.A04;
        if (list.isEmpty()) {
            A002 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            A002 = ((C123707Ye) ((C115346uu) list.get(0)).A06).A01.A00(0);
        }
        this.A00 = A002;
        if (list.isEmpty()) {
            A003 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            C115346uu r2 = (C115346uu) AnonymousClass00J.A0E(list);
            C115526vM r1 = ((C123707Ye) r2.A06).A01;
            A003 = r1.A00(r1.A04 - 1) + r2.A01;
        }
        this.A01 = A003;
        this.A05 = r4.A05;
    }

    public final float A01(int i) {
        C115346uu A002 = A00(this, i);
        C143058g2 r1 = A002.A06;
        return ((C123707Ye) r1).A01.A01(i - A002.A03) + A002.A01;
    }

    public final float A02(int i) {
        C115346uu A002 = A00(this, i);
        C143058g2 r1 = A002.A06;
        return ((C123707Ye) r1).A01.A02(i - A002.A03) + A002.A01;
    }

    public final int A05(int i) {
        C115346uu A002 = A00(this, i);
        C143058g2 r1 = A002.A06;
        return ((C123707Ye) r1).A01.A08.getLineStart(i - A002.A03) + A002.A05;
    }

    public final int A06(int i, boolean z) {
        int length;
        C115346uu A002 = A00(this, i);
        C143058g2 r1 = A002.A06;
        int i2 = i - A002.A03;
        Layout layout = ((C123707Ye) r1).A01.A08;
        int ellipsisStart = layout.getEllipsisStart(i2);
        if (z) {
            if (ellipsisStart == 0) {
                length = layout.getLineVisibleEnd(i2);
            } else {
                length = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else if (ellipsisStart == 0) {
            length = layout.getLineEnd(i2);
        } else {
            length = layout.getText().length();
        }
        return length + A002.A05;
    }
}
