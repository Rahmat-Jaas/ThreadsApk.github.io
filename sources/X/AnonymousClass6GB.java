package X;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.graphics.Color;
import com.facebook.redex.IDxUListenerShape146S0200000_2_I2;
import java.util.List;

/* renamed from: X.6GB  reason: invalid class name */
public final class AnonymousClass6GB {
    public static final Object A00(AnonymousClass601 r10, C63893iY r11) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r10);
        AnonymousClass3HX r6 = r10.A00;
        if (r6 == null) {
            return null;
        }
        C109326jp A06 = C63893iY.A06(r11, 0);
        List list = r11.A00;
        C109326jp A0R = C18190wL.A0R(list, A1Z ? 1 : 0);
        Object A09 = C63893iY.A09(r11);
        String A0h = C86164wN.A0h(A09);
        int parseColor = Color.parseColor((String) A09);
        int parseColor2 = Color.parseColor((String) C63893iY.A0C(r11, A0h, 3));
        float A00 = C18240wQ.A00(C63893iY.A0A(r11, 4));
        L67 l67 = new L67();
        l67.setIntValues(new int[]{parseColor, parseColor2});
        l67.setEvaluator(new ArgbEvaluator());
        l67.setDuration((long) (A00 * ((float) AnonymousClass7Jm.A00)));
        l67.setInterpolator((TimeInterpolator) list.get(5));
        l67.addUpdateListener(new IDxUListenerShape146S0200000_2_I2((int) A1Z, (Object) r10, (Object) A06));
        if (A0R == null) {
            return l67;
        }
        l67.addListener(new C18290wW(r6, r10, A0R));
        return l67;
    }
}
