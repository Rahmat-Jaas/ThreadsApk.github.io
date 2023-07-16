package X;

import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0223000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0200000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0301000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape17S0201000_I2_3;
import kotlin.coroutines.jvm.internal.KtSLambdaShape7S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11;

/* renamed from: X.3hv  reason: invalid class name and case insensitive filesystem */
public final class C63623hv {
    public static /* synthetic */ C84714tk A03(C32165H8c h8c, int i, int i2, int i3) {
        int i4 = i2;
        boolean z = false;
        if ((i3 & 2) != 0) {
            i4 = 3;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        C04220Ms.A0B(h8c, 0);
        return C25239DiK.A00(new KtSLambdaShape0S0223000_I2(h8c, (C146958n9) null, i, i4, 1, z, false));
    }

    public static final C84714tk A04(AnonymousClass0ZU r3, C84714tk r4) {
        C04220Ms.A0B(r3, 1);
        return new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) new KtSLambdaShape7S0200000_I2_2((C146958n9) null, r3), r4, 34);
    }

    public static final C84714tk A05(AnonymousClass0ZU r3, C84714tk r4) {
        return new IDxFlowShape94S0200000_2_I2(28, (Object) new KtSLambdaShape15S0200000_I2(r3, (C146958n9) null, 8), (Object) r4);
    }

    public static final C84714tk A06(AnonymousClass0YY r3, C84714tk r4) {
        return AnonymousClass7J0.A02(new KtSLambdaShape15S0301000_I2((C146958n9) null, (Object) r3, 8), r4);
    }

    public static final C84714tk A07(AnonymousClass0YP r3, C84714tk r4) {
        return new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) new KtSLambdaShape17S0201000_I2_3((C146958n9) null, r3, 47), r4, 34);
    }

    public static final C84714tk A08(AnonymousClass0YP r3, C84714tk r4) {
        C04220Ms.A0B(r4, 0);
        return new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) new KtSLambdaShape17S0201000_I2_3((C146958n9) null, r3, 48), r4, 34);
    }

    public static Object A00(C32165H8c h8c, C146958n9 r2, int i, int i2) {
        return A01(h8c, r2, i, i2, 14);
    }

    public static /* synthetic */ Object A01(C32165H8c h8c, C146958n9 r6, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 3;
        }
        boolean A1V = C18180wK.A1V(i3 & 4);
        C27420EnC enC = new C27420EnC(1, C25598DoY.A02(r6));
        enC.A0D();
        C63873iU.A0E(h8c, enC, 43);
        enC.BQt(new KtLambdaShape156S0100000_I2_11(h8c, 13));
        C31155GhB.A05(h8c, i, i2, A1V, false);
        return enC.A0B();
    }

    public static final void A09(String str, AnonymousClass0ZU r3) {
        try {
            r3.invoke();
        } catch (Throwable th) {
            C10450iM.A05("channel_offer_workaround", AnonymousClass00U.A0L("offer on closed channel: ", str), 100, th);
        }
    }
}
