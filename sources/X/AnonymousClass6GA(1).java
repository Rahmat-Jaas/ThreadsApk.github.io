package X;

import android.animation.TimeInterpolator;
import com.facebook.redex.IDxUListenerShape146S0200000_2_I2;
import java.util.List;

/* renamed from: X.6GA  reason: invalid class name */
public final class AnonymousClass6GA {
    public static final Object A00(AnonymousClass601 r12, C63893iY r13) {
        char A1Z = AnonymousClass0wJ.A1Z(r13, r12);
        AnonymousClass3HX r7 = r12.A00;
        if (r7 == null) {
            return null;
        }
        C109326jp A06 = C63893iY.A06(r13, 0);
        List list = r13.A00;
        C109326jp A0R = C18190wL.A0R(list, A1Z);
        Object A0B = C63893iY.A0B(r13, 2);
        A0B.getClass();
        float A00 = C18240wQ.A00(A0B);
        float A002 = C18240wQ.A00(C63893iY.A0C(r13, "null cannot be cast to non-null type kotlin.Number", 3));
        float A003 = C18240wQ.A00(C63893iY.A0C(r13, "null cannot be cast to non-null type kotlin.Number", 4));
        L67 l67 = new L67();
        float[] fArr = new float[2];
        fArr[0] = A00;
        fArr[A1Z] = A002;
        l67.setFloatValues(fArr);
        l67.setDuration((long) (A003 * ((float) AnonymousClass7Jm.A00)));
        l67.setInterpolator((TimeInterpolator) list.get(5));
        l67.addUpdateListener(new IDxUListenerShape146S0200000_2_I2(0, (Object) r12, (Object) A06));
        if (A0R == null) {
            return l67;
        }
        l67.addListener(new C18290wW(r7, r12, A0R));
        return l67;
    }
}
