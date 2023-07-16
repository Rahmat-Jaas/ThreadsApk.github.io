package X;

import android.animation.TimeInterpolator;
import com.facebook.redex.IDxUListenerShape146S0200000_2_I2;
import java.util.List;

/* renamed from: X.6GC  reason: invalid class name */
public final class AnonymousClass6GC {
    public static final Object A00(AnonymousClass601 r12, C63893iY r13) {
        float f;
        float f2;
        Integer num;
        char A1Z = AnonymousClass0wJ.A1Z(r13, r12);
        AnonymousClass3HX r6 = r12.A00;
        if (r6 == null) {
            return null;
        }
        C109326jp A06 = C63893iY.A06(r13, 0);
        List list = r13.A00;
        C109326jp A0R = C18190wL.A0R(list, A1Z);
        Object A0B = C63893iY.A0B(r13, 2);
        A0B.getClass();
        String A0h = C86164wN.A0h(A0B);
        String str = (String) A0B;
        String str2 = (String) C63893iY.A0C(r13, A0h, 3);
        float A00 = C18240wQ.A00(C63893iY.A0A(r13, 4));
        TimeInterpolator timeInterpolator = (TimeInterpolator) list.get(5);
        try {
            if (C86144wL.A1Y(str)) {
                f = AnonymousClass7Kk.A00(str);
                f2 = AnonymousClass7Kk.A00(str2);
                num = AnonymousClass006.A00;
            } else {
                f = AnonymousClass7Kk.A01(str);
                f2 = AnonymousClass7Kk.A01(str2);
                num = AnonymousClass006.A01;
            }
            AnonymousClass5CT r7 = new AnonymousClass5CT(num);
            float[] fArr = new float[2];
            fArr[0] = f;
            fArr[A1Z] = f2;
            r7.setFloatValues(fArr);
            r7.setDuration((long) (A00 * ((float) AnonymousClass7Jm.A00)));
            r7.setInterpolator(timeInterpolator);
            r7.addUpdateListener(new IDxUListenerShape146S0200000_2_I2(2, (Object) r12, (Object) A06));
            if (A0R == null) {
                return r7;
            }
            r7.addListener(new C18290wW(r6, r12, A0R));
            return r7;
        } catch (C29721zB e) {
            throw C18190wL.A0a(AnonymousClass0wJ.A0t("Could not parse start and end values. ", e));
        }
    }
}
