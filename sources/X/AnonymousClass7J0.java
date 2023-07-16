package X;

import com.facebook.redex.IDxFlowShape251S0100000_2_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0301000_I2;

/* renamed from: X.7J0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7J0 {
    public static final int A00 = ((int) AnonymousClass6W6.A00("kotlinx.coroutines.flow.defaultConcurrency", (long) 16, (long) 1, (long) Integer.MAX_VALUE));

    public static final C84714tk A01(AnonymousClass0YP r3, C84714tk r4) {
        return A02(new KtSLambdaShape15S0301000_I2((C146958n9) null, (Object) r3, 45), r4);
    }

    public static final C84714tk A03(C84714tk r6, int i) {
        int i2 = i;
        if (i > 0) {
            C84714tk r4 = r6;
            if (i == 1) {
                return new IDxFlowShape251S0100000_2_I2(r6, 24);
            }
            return new C27462Ens(AnonymousClass006.A00, AnonymousClass869.A00, r4, i2, -2);
        }
        throw C18190wL.A0a(AnonymousClass00U.A0J("Expected positive concurrency level, but had ", i));
    }

    public static final C84714tk A04(C84714tk... r1) {
        Iterable r0;
        if (r1.length == 0) {
            r0 = AnonymousClass0ZV.A00;
        } else {
            r0 = new C134897yY(r1);
        }
        return A00(r0);
    }

    public static final C84714tk A00(Iterable iterable) {
        return new C27461Enr(AnonymousClass006.A00, iterable, AnonymousClass869.A00, -2);
    }

    public static final C84714tk A02(AnonymousClass0YM r6, C84714tk r7) {
        return new C27464Enu(AnonymousClass006.A00, AnonymousClass869.A00, r6, r7, -2);
    }
}
