package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.6Dl  reason: invalid class name and case insensitive filesystem */
public final class C97916Dl {
    public static final int A00(Integer num, Integer num2, List list, AnonymousClass0YP r12, AnonymousClass0YP r13, int i, int i2) {
        int A02;
        AnonymousClass79Y r2;
        int i3;
        AnonymousClass79Y r22;
        float f;
        AnonymousClass79Y r1;
        if (num == num2) {
            int size = list.size();
            int i4 = 0;
            float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                C147148nT r7 = (C147148nT) list.get(i6);
                C04220Ms.A0B(r7, 0);
                Object B01 = r7.B01();
                if (!(B01 instanceof AnonymousClass79Y) || (r1 = (AnonymousClass79Y) B01) == null) {
                    f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                } else {
                    f = r1.A00;
                }
                int A04 = AnonymousClass0wJ.A04(C86164wN.A0a(r7, r12, i));
                if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    i5 += A04;
                } else if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    f2 += f;
                    i4 = Math.max(i4, AnonymousClass8bA.A02(((float) A04) / f));
                }
            }
            return AnonymousClass8bA.A03((float) i4, f2) + i5 + (C86144wL.A0C(list, 1) * i2);
        }
        int min = Math.min((list.size() - 1) * i2, i);
        int size2 = list.size();
        float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        int i7 = 0;
        for (int i8 = 0; i8 < size2; i8++) {
            C147148nT r72 = (C147148nT) list.get(i8);
            C04220Ms.A0B(r72, 0);
            Object B012 = r72.B01();
            if ((B012 instanceof AnonymousClass79Y) && (r22 = (AnonymousClass79Y) B012) != null) {
                float f4 = r22.A00;
                if (f4 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    if (f4 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f3 += f4;
                    }
                }
            }
            int min2 = Math.min(AnonymousClass0wJ.A04(C86164wN.A0a(r72, r13, Integer.MAX_VALUE)), i - min);
            min += min2;
            i7 = Math.max(i7, AnonymousClass0wJ.A04(C86164wN.A0a(r72, r12, min2)));
        }
        if (f3 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            A02 = 0;
        } else if (i == Integer.MAX_VALUE) {
            A02 = Integer.MAX_VALUE;
        } else {
            A02 = AnonymousClass8bA.A02(((float) Math.max(i - min, 0)) / f3);
        }
        int size3 = list.size();
        for (int i9 = 0; i9 < size3; i9++) {
            C147148nT r73 = (C147148nT) list.get(i9);
            C04220Ms.A0B(r73, 0);
            Object B013 = r73.B01();
            if ((B013 instanceof AnonymousClass79Y) && (r2 = (AnonymousClass79Y) B013) != null) {
                float f5 = r2.A00;
                if (f5 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    if (A02 != Integer.MAX_VALUE) {
                        i3 = AnonymousClass8bA.A03((float) A02, f5);
                    } else {
                        i3 = Integer.MAX_VALUE;
                    }
                    i7 = Math.max(i7, AnonymousClass0wJ.A04(C86164wN.A0a(r73, r12, i3)));
                }
            }
        }
        return i7;
    }
}
