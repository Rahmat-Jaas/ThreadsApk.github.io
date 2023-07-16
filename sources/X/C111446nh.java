package X;

import android.os.Handler;
import kotlin.jvm.internal.KtLambdaShape4S0400000_I2;

/* renamed from: X.6nh  reason: invalid class name and case insensitive filesystem */
public abstract class C111446nh {
    public final void A00() {
        Integer num;
        Integer[] numArr;
        Integer num2;
        int i;
        int i2 = AnonymousClass6ZZ.A01.get();
        Integer[] A00 = AnonymousClass006.A00(4);
        int length = A00.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                num = A00[i3];
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i != i2) {
                    i3++;
                }
            } else {
                num = AnonymousClass006.A00;
            }
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            numArr = new Integer[8];
            numArr[0] = AnonymousClass006.A00;
            numArr[1] = AnonymousClass006.A01;
            numArr[2] = AnonymousClass006.A0C;
            numArr[3] = AnonymousClass006.A0N;
            numArr[4] = AnonymousClass006.A0Y;
            numArr[5] = AnonymousClass006.A0j;
            numArr[6] = AnonymousClass006.A0u;
            num2 = AnonymousClass006.A15;
        } else if (intValue == 1) {
            numArr = new Integer[]{AnonymousClass006.A00, AnonymousClass006.A01, AnonymousClass006.A0C, AnonymousClass006.A0N, AnonymousClass006.A0Y, AnonymousClass006.A1C};
            AnonymousClass0MZ r11 = new AnonymousClass0MZ();
            Handler A0F = AnonymousClass0wJ.A0F();
            C04530Oa A02 = AnonymousClass0OY.A02(new KtLambdaShape4S0400000_I2(4, A0F, r11, numArr, this));
            A0F.removeCallbacks((Runnable) A02.getValue());
            A0F.postDelayed((Runnable) A02.getValue(), 1000);
        } else if (intValue == 2) {
            numArr = new Integer[8];
            numArr[0] = AnonymousClass006.A00;
            numArr[1] = AnonymousClass006.A01;
            numArr[2] = AnonymousClass006.A0C;
            numArr[3] = AnonymousClass006.A0N;
            numArr[4] = AnonymousClass006.A0Y;
            numArr[5] = AnonymousClass006.A0j;
            numArr[6] = AnonymousClass006.A0u;
            num2 = AnonymousClass006.A1L;
        } else if (intValue == 3) {
            numArr = new Integer[8];
            numArr[0] = AnonymousClass006.A00;
            numArr[1] = AnonymousClass006.A01;
            numArr[2] = AnonymousClass006.A0C;
            numArr[3] = AnonymousClass006.A0N;
            numArr[4] = AnonymousClass006.A0Y;
            numArr[5] = AnonymousClass006.A0j;
            numArr[6] = AnonymousClass006.A0u;
            num2 = AnonymousClass006.A02;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        numArr[7] = num2;
        AnonymousClass0MZ r112 = new AnonymousClass0MZ();
        Handler A0F2 = AnonymousClass0wJ.A0F();
        C04530Oa A022 = AnonymousClass0OY.A02(new KtLambdaShape4S0400000_I2(4, A0F2, r112, numArr, this));
        A0F2.removeCallbacks((Runnable) A022.getValue());
        A0F2.postDelayed((Runnable) A022.getValue(), 1000);
    }
}
