package X;

import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21;
import kotlin.jvm.internal.KtLambdaShape7S0110000_I2;

/* renamed from: X.7Cc  reason: invalid class name and case insensitive filesystem */
public final class C120707Cc {
    public static final C04530Oa A00 = AnonymousClass0OY.A02(C138428Hl.A00);

    public static final List A00(String str) {
        C04220Ms.A0B(str, 0);
        String A0l = AnonymousClass8bQ.A0l(str, "\n", "", false);
        C1371486h r3 = new C1371486h(A0l, new KtLambdaShape7S0110000_I2(1, new char[]{BasicHeaderValueParser.ELEM_DELIMITER, 65292, 1548, 12289}, false), 0);
        KtLambdaShape166S0100000_I2_21 ktLambdaShape166S0100000_I2_21 = new KtLambdaShape166S0100000_I2_21(A0l, 35);
        AnonymousClass0wJ.A1N(r3, ktLambdaShape166S0100000_I2_21);
        C1371286f r2 = new C1371286f(ktLambdaShape166S0100000_I2_21, r3);
        C139818Pk r0 = C139818Pk.A00;
        AnonymousClass0wJ.A1N(r2, r0);
        return C06750aI.A16(AnonymousClass8bJ.A02(new C1370886b(C79374jw.A00, AnonymousClass8bJ.A03(C79364jv.A00, new C1371286f(r0, r2)))));
    }

    public static final List A01(String str) {
        List A02 = ((C134697yC) A00.getValue()).A02(str, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : A02) {
            if (AnonymousClass2C6.A00((String) next) >= 2) {
                A0v.add(next);
            }
        }
        return A0v;
    }
}
