package X;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.compose.ui.unit.Constraints;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7EK  reason: invalid class name */
public final class AnonymousClass7EK {
    public final float A00;
    public final float A01;
    public final int A02;
    public final C123717Yf A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final int A07;

    public AnonymousClass7EK(C123717Yf r22, int i, long j, boolean z) {
        boolean z2;
        AnonymousClass7F6 r0;
        float Amg;
        int i2;
        C123717Yf r2 = r22;
        this.A03 = r2;
        this.A07 = i;
        if (Constraints.A04(j) == 0 && Constraints.A03(j) == 0) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            List list = r2.A01;
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            while (true) {
                if (i3 >= size) {
                    z2 = false;
                    break;
                }
                C114896u4 r7 = (C114896u4) list.get(i3);
                C145758l2 r8 = r7.A02;
                int A022 = Constraints.A02(j);
                boolean A1V = C18180wK.A1V(Constraints.A00(j));
                int A012 = Constraints.A01(j);
                if (A1V && (A012 = A012 - C86124wJ.A03(f)) < 0) {
                    A012 = 0;
                }
                C123707Ye r15 = new C123707Ye((C123727Yg) r8, this.A07 - i4, AnonymousClass7JT.A02(0, A022, 0, A012), z);
                Amg = f + r15.Amg();
                C115526vM r6 = r15.A01;
                i2 = i4 + r6.A04;
                A0v.add(new C115346uu(r15, f, Amg, r7.A01, r7.A00, i4, i2));
                if (r6.A0B) {
                    break;
                }
                if (i2 == this.A07) {
                    List list2 = this.A03.A01;
                    C04220Ms.A0B(list2, 0);
                    if (i3 != C86104wH.A0B(list2)) {
                        break;
                    }
                }
                i3++;
                i4 = i2;
                f = Amg;
            }
            i4 = i2;
            f = Amg;
            z2 = true;
            this.A00 = f;
            this.A02 = i4;
            this.A06 = z2;
            this.A04 = A0v;
            this.A01 = (float) Constraints.A02(j);
            ArrayList A0k = C18240wQ.A0k(A0v.size());
            int size2 = A0v.size();
            for (int i5 = 0; i5 < size2; i5++) {
                C115346uu r12 = (C115346uu) A0v.get(i5);
                List list3 = ((C123707Ye) r12.A06).A04;
                ArrayList A0t = C18200wM.A0t(list3);
                int size3 = list3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    AnonymousClass7F6 r152 = (AnonymousClass7F6) list3.get(i6);
                    if (r152 != null) {
                        r0 = r152.A03(C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, r12.A01));
                    } else {
                        r0 = null;
                    }
                    A0t.add(r0);
                }
                C000300e.A0r(A0t, A0k);
            }
            int size4 = A0k.size();
            List list4 = A0k;
            if (size4 < this.A03.A02.size()) {
                int size5 = this.A03.A02.size() - A0k.size();
                ArrayList A0k2 = C18240wQ.A0k(size5);
                for (int i7 = 0; i7 < size5; i7++) {
                    A0k2.add((Object) null);
                }
                list4 = AnonymousClass00J.A0V(A0k2, A0k);
            }
            this.A05 = list4;
            return;
        }
        throw C18190wL.A0a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }

    public static final void A00(AnonymousClass7EK r4, int i) {
        if (i < 0 || i > C134747yH.A02(r4.A03.A00)) {
            throw C18190wL.A0a(AnonymousClass00U.A0P("offset(", ") is out of bounds [0, ", ']', i, r4.A03.A00.length()));
        }
    }

    public static final void A01(AnonymousClass7EK r3, int i) {
        if (i < 0 || i >= r3.A02) {
            throw C18190wL.A0a(C86134wK.A0l(i, r3.A02, "lineIndex(", ") is out of bounds [0, "));
        }
    }

    public final C147018nF A02(int i, int i2) {
        if (i < 0 || i > i2 || i2 > C134747yH.A02(this.A03.A00)) {
            StringBuilder A0s = C18190wL.A0s("Start(");
            A0s.append(i);
            A0s.append(") or End(");
            A0s.append(i2);
            A0s.append(") is out of range [0..");
            A0s.append(C134747yH.A02(this.A03.A00));
            throw C18190wL.A0a(C18180wK.A0i("), or start > end!", A0s));
        } else if (i == i2) {
            return new AnonymousClass7X1(C86144wL.A0G());
        } else {
            List list = this.A04;
            AnonymousClass7X1 r9 = new AnonymousClass7X1(C86144wL.A0G());
            int size = list.size();
            for (int A012 = C115956wB.A01(list, i); A012 < size; A012++) {
                C115346uu r4 = (C115346uu) list.get(A012);
                if (r4.A05 >= i2) {
                    return r9;
                }
                if (r4.A05 != r4.A04) {
                    C143058g2 r10 = r4.A06;
                    int i3 = r4.A05;
                    int i4 = r4.A04;
                    int A022 = AnonymousClass8bI.A02(i, i3, i4) - i3;
                    int A023 = AnonymousClass8bI.A02(i2, i3, i4) - i3;
                    C123707Ye r102 = (C123707Ye) r10;
                    if (A022 < 0 || A022 > A023 || A023 > r102.A03.length()) {
                        StringBuilder A0s2 = C18190wL.A0s("Start(");
                        A0s2.append(A022);
                        A0s2.append(") or End(");
                        A0s2.append(A023);
                        A0s2.append(") is out of Range(0..");
                        A0s2.append(r102.A03.length());
                        throw new AssertionError(C18180wK.A0i("), or start > end!", A0s2));
                    }
                    Path A0G = C86144wL.A0G();
                    C115526vM r1 = r102.A01;
                    r1.A08.getSelectionPath(A022, A023, A0G);
                    int i5 = r1.A05;
                    if (i5 != 0 && !A0G.isEmpty()) {
                        A0G.offset(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i5);
                    }
                    AnonymousClass7X1 r5 = new AnonymousClass7X1(A0G);
                    long A0C = C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, r4.A01);
                    Matrix matrix = r5.A00;
                    matrix.reset();
                    matrix.setTranslate(AnonymousClass7KC.A01(A0C), AnonymousClass7KC.A02(A0C));
                    Path path = r5.A01;
                    path.transform(matrix);
                    long j = AnonymousClass7KC.A03;
                    r9.A01.addPath(path, AnonymousClass7KC.A01(j), AnonymousClass7KC.A02(j));
                }
            }
            return r9;
        }
    }
}
