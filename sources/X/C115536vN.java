package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2;

/* renamed from: X.6vN  reason: invalid class name and case insensitive filesystem */
public class C115536vN {
    public final AnonymousClass84X A00 = AnonymousClass84X.A01(new AnonymousClass54B[16]);

    public final void A01() {
        int i = 0;
        while (true) {
            AnonymousClass84X r2 = this.A00;
            if (i < r2.A00) {
                AnonymousClass54B r1 = (AnonymousClass54B) r2.A01[i];
                if (!((AnonymousClass7YG) r1.A06).A03.A08) {
                    r2.A03(i);
                    r1.A00();
                } else {
                    i++;
                    r1.A01();
                }
            } else {
                return;
            }
        }
    }

    public final void A00() {
        float f;
        if (this instanceof AnonymousClass54B) {
            AnonymousClass54B r4 = (AnonymousClass54B) this;
            AnonymousClass84X r0 = r4.A00;
            int i = r0.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = r0.A01;
                do {
                    ((C115536vN) objArr[i2]).A00();
                    i2++;
                } while (i2 < i);
            }
            C147538pV r1 = ((AnonymousClass53X) r4.A06).A00;
            C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
            C104156bK B21 = ((C147428pK) r1).B21();
            if (B21 instanceof AnonymousClass54D) {
                AnonymousClass54D r12 = (AnonymousClass54D) B21;
                C109656kM r5 = r12.A02;
                if (r5 != null) {
                    List list = r5.A03;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (!(!C86124wJ.A0P(list, i3).A0A)) {
                            List list2 = r5.A03;
                            ArrayList A0t = C18200wM.A0t(list2);
                            int size2 = list2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                C121197Es A0P = C86124wJ.A0P(list2, i4);
                                long j = A0P.A04;
                                long j2 = A0P.A05;
                                long j3 = A0P.A09;
                                Float f2 = A0P.A01;
                                if (f2 != null) {
                                    f = f2.floatValue();
                                } else {
                                    f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                                }
                                boolean z = A0P.A0A;
                                A0t.add(new C121197Es(f, j, j3, j2, j3, j2, z, z));
                            }
                            C109656kM r2 = new C109656kM((C112316pN) null, A0t);
                            r12.A01 = r2;
                            AnonymousClass54D.A00(r2, AnonymousClass67C.Initial, r12);
                            AnonymousClass54D.A00(r2, AnonymousClass67C.Main, r12);
                            AnonymousClass54D.A00(r2, AnonymousClass67C.Final, r12);
                            r12.A02 = null;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            AnonymousClass54C r13 = (AnonymousClass54C) B21;
            if (r13.A00 == AnonymousClass006.A01) {
                long uptimeMillis = SystemClock.uptimeMillis();
                AnonymousClass7XO r3 = r13.A01;
                KtLambdaShape147S0100000_I2_2 A10 = C86154wM.A10(r3, 28);
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0);
                obtain.setSource(0);
                A10.invoke(obtain);
                obtain.recycle();
                r13.A00 = AnonymousClass006.A00;
                r3.A02 = false;
                return;
            }
            return;
        }
        AnonymousClass84X r02 = this.A00;
        int i5 = r02.A00;
        if (i5 > 0) {
            int i6 = 0;
            Object[] objArr2 = r02.A01;
            do {
                ((C115536vN) objArr2[i6]).A00();
                i6++;
            } while (i6 < i5);
        }
    }

    public void A02(C112316pN r4) {
        AnonymousClass84X r2 = this.A00;
        int i = r2.A00;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((AnonymousClass54B) r2.A01[i]).A05.A00 == 0) {
                r2.A03(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r0 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r0 = r7.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C112316pN r11) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.AnonymousClass54B
            if (r0 == 0) goto L_0x0052
            r7 = r10
            X.54B r7 = (X.AnonymousClass54B) r7
            java.util.Map r6 = r7.A07
            boolean r0 = r6.isEmpty()
            r1 = 1
            r5 = 0
            if (r0 != 0) goto L_0x0050
            X.8po r9 = r7.A06
            r0 = r9
            X.7YG r0 = (X.AnonymousClass7YG) r0
            X.7YG r8 = r0.A03
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x0050
            X.6kM r4 = r7.A00
            X.C04220Ms.A0A(r4)
            X.8mM r0 = r7.A01
            X.C04220Ms.A0A(r0)
            long r2 = r0.BCI()
            X.67C r0 = X.AnonymousClass67C.Final
            r9.CBU(r4, r0, r2)
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x0046
            X.84X r0 = r7.A00
            int r3 = r0.A00
            if (r3 <= 0) goto L_0x0046
            java.lang.Object[] r2 = r0.A01
        L_0x003b:
            r0 = r2[r5]
            X.6vN r0 = (X.C115536vN) r0
            r0.A03(r11)
            int r5 = r5 + 1
            if (r5 < r3) goto L_0x003b
        L_0x0046:
            r7.A02(r11)
            r6.clear()
            r0 = 0
            r7.A01 = r0
            return r1
        L_0x0050:
            r1 = 0
            goto L_0x0046
        L_0x0052:
            X.84X r0 = r10.A00
            int r4 = r0.A00
            r1 = 0
            if (r4 <= 0) goto L_0x006f
            java.lang.Object[] r3 = r0.A01
            r2 = 0
        L_0x005c:
            r0 = r3[r2]
            X.6vN r0 = (X.C115536vN) r0
            boolean r0 = r0.A03(r11)
            if (r0 != 0) goto L_0x006a
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L_0x006b
        L_0x006a:
            r1 = 1
        L_0x006b:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x005c
        L_0x006f:
            r10.A02(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115536vN.A03(X.6pN):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C112316pN r6, X.C146508mM r7, java.util.Map r8, boolean r9) {
        /*
            r5 = this;
            X.84X r0 = r5.A00
            int r4 = r0.A00
            r1 = 0
            if (r4 <= 0) goto L_0x001d
            java.lang.Object[] r3 = r0.A01
            r2 = 0
        L_0x000a:
            r0 = r3[r2]
            X.6vN r0 = (X.C115536vN) r0
            boolean r0 = r0.A04(r6, r7, r8, r9)
            if (r0 != 0) goto L_0x0018
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r1 = 1
        L_0x0019:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x000a
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115536vN.A04(X.6pN, X.8mM, java.util.Map, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r0 != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        r0 = r13.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.C112316pN r15, X.C146508mM r16, java.util.Map r17, boolean r18) {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.AnonymousClass54B
            r6 = r18
            if (r0 == 0) goto L_0x0057
            r13 = r14
            X.54B r13 = (X.AnonymousClass54B) r13
            java.util.Map r12 = r13.A07
            boolean r0 = r12.isEmpty()
            r1 = 1
            r11 = 0
            if (r0 != 0) goto L_0x0079
            X.8po r10 = r13.A06
            r0 = r10
            X.7YG r0 = (X.AnonymousClass7YG) r0
            X.7YG r9 = r0.A03
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x0079
            X.6kM r8 = r13.A00
            X.C04220Ms.A0A(r8)
            X.8mM r0 = r13.A01
            X.C04220Ms.A0A(r0)
            long r2 = r0.BCI()
            X.67C r0 = X.AnonymousClass67C.Initial
            r10.CBU(r8, r0, r2)
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x004d
            X.84X r0 = r13.A00
            int r7 = r0.A00
            if (r7 <= 0) goto L_0x004d
            java.lang.Object[] r5 = r0.A01
        L_0x003d:
            r4 = r5[r11]
            X.6vN r4 = (X.C115536vN) r4
            X.8mM r0 = r13.A01
            X.C04220Ms.A0A(r0)
            r4.A05(r15, r0, r12, r6)
            int r11 = r11 + 1
            if (r11 < r7) goto L_0x003d
        L_0x004d:
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x0056
            X.67C r0 = X.AnonymousClass67C.Main
            r10.CBU(r8, r0, r2)
        L_0x0056:
            return r1
        L_0x0057:
            X.84X r0 = r14.A00
            int r4 = r0.A00
            r1 = 0
            if (r4 <= 0) goto L_0x0056
            java.lang.Object[] r3 = r0.A01
            r2 = 0
        L_0x0061:
            r0 = r3[r2]
            X.6vN r0 = (X.C115536vN) r0
            r5 = r17
            r7 = r16
            boolean r0 = r0.A05(r15, r7, r5, r6)
            if (r0 != 0) goto L_0x0073
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L_0x0074
        L_0x0073:
            r1 = 1
        L_0x0074:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x0061
            return r1
        L_0x0079:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115536vN.A05(X.6pN, X.8mM, java.util.Map, boolean):boolean");
    }
}
