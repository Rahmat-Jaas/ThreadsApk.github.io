package X;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.unit.Constraints;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.6FL  reason: invalid class name */
public final class AnonymousClass6FL {
    public static final void A00(C146678mg r19, AnonymousClass7AW r20) {
        int i;
        long j;
        float f;
        AnonymousClass7AW r5 = r20;
        long j2 = r5.A02;
        float A07 = (float) C86104wH.A07(j2);
        AnonymousClass7EK r2 = r5.A03;
        C146678mg r8 = r19;
        if ((A07 < r2.A01 || r2.A06 || ((float) C86104wH.A08(j2)) < r2.A00) && r5.A04.A01 != 3) {
            i = 1;
            AnonymousClass7F6 A00 = AnonymousClass6EY.A00(AnonymousClass7KC.A03, C86104wH.A0C(A07, (float) C86104wH.A08(j2)));
            r8.Cfm();
            r8.ADO(A00.A01, A00.A03, A00.A02, A00.A00, i);
        } else {
            i = 0;
        }
        AnonymousClass7F0 r0 = r5.A04.A04.A02;
        AnonymousClass79I r7 = r0.A0C;
        if (r7 == null) {
            r7 = AnonymousClass79I.A02;
        }
        C1201679b r6 = r0.A03;
        if (r6 == null) {
            r6 = C1201679b.A03;
        }
        C98126Eh r52 = r0.A04;
        if (r52 == null) {
            r52 = C877353x.A00;
        }
        try {
            C147038nH r1 = r0.A0D;
            C111366nD AUS = r1.AUS();
            if (AUS != null) {
                if (r1 != AnonymousClass7ZF.A00) {
                    f = r1.AQV();
                } else {
                    f = 1.0f;
                }
                r8.Cfm();
                List list = r2.A04;
                if (list.size() <= 1 || (AUS instanceof C876253m)) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C143058g2 r15 = ((C115346uu) list.get(i2)).A06;
                        C123707Ye r13 = (C123707Ye) r15;
                        C86904zW r4 = r13.A02.A05;
                        C146398mB r3 = r4.A03;
                        int i3 = ((AnonymousClass7X0) r3).A00;
                        r4.A00(AUS, f, AnonymousClass7An.A02(r13));
                        r4.A01(r6);
                        r4.A03(r7);
                        r4.A02(r52);
                        r3.CiJ(3);
                        C123707Ye.A01(r8, r13);
                        r3.CiJ(i3);
                        r8.D7f(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, r15.Amg());
                    }
                } else if (AUS instanceof C876753r) {
                    int size2 = list.size();
                    float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    for (int i4 = 0; i4 < size2; i4++) {
                        C143058g2 r12 = ((C115346uu) list.get(i4)).A06;
                        f3 += r12.Amg();
                        f2 = Math.max(f2, (float) Constraints.A02(((C123707Ye) r12).A00));
                    }
                    Shader A01 = ((C876753r) AUS).A01(C86104wH.A0C(f2, f3));
                    Matrix A0E = C86164wN.A0E();
                    A01.getLocalMatrix(A0E);
                    int size3 = list.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        C143058g2 r17 = ((C115346uu) list.get(i5)).A06;
                        C876553p r32 = new C876553p(A01);
                        C123707Ye r22 = (C123707Ye) r17;
                        C86904zW r14 = r22.A02.A05;
                        C146398mB r02 = r14.A03;
                        int i6 = ((AnonymousClass7X0) r02).A00;
                        r14.A00(r32, f, AnonymousClass7An.A02(r22));
                        r14.A01(r6);
                        r14.A03(r7);
                        r14.A02(r52);
                        r02.CiJ(3);
                        C123707Ye.A01(r8, r22);
                        r02.CiJ(i6);
                        r8.D7f(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, r17.Amg());
                        A0E.setTranslate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -r17.Amg());
                        A01.setLocalMatrix(A0E);
                    }
                }
            } else {
                if (r1 != AnonymousClass7ZF.A00) {
                    j = r1.AYH();
                } else {
                    j = AnonymousClass7KE.A01;
                }
                r8.Cfm();
                List list2 = r2.A04;
                int size4 = list2.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    C143058g2 r11 = ((C115346uu) list2.get(i7)).A06;
                    C123707Ye r10 = (C123707Ye) r11;
                    C86904zW r9 = r10.A02.A05;
                    C146398mB r42 = r9.A03;
                    int i8 = ((AnonymousClass7X0) r42).A00;
                    if (j != AnonymousClass7KE.A06) {
                        r42.CjA(j);
                        AnonymousClass7X0 r23 = (AnonymousClass7X0) r42;
                        r23.A02 = null;
                        r23.A01.setShader((Shader) null);
                    }
                    r9.A01(r6);
                    r9.A03(r7);
                    r9.A02(r52);
                    r42.CiJ(3);
                    C123707Ye.A01(r8, r10);
                    r42.CiJ(i8);
                    r8.D7f(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, r11.Amg());
                }
            }
            r8.Ces();
        } finally {
            if (i != 0) {
                r8.Ces();
            }
        }
    }
}
