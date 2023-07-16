package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0301000_I2_4;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S1100000_I2;

/* renamed from: X.7xF  reason: invalid class name and case insensitive filesystem */
public final class C134217xF implements C27855EuS {
    public final C31580Grx A00;

    public C134217xF(C31580Grx grx) {
        C04220Ms.A0B(grx, 1);
        this.A00 = grx;
    }

    public final C84714tk AMN() {
        C31580Grx grx = this.A00;
        PandoGraphQLRequest A002 = new C126417fD().build();
        C04220Ms.A06(A002);
        return new IDxFlowShape94S0200000_2_I2(26, (Object) C25239DiK.A00(new KtSLambdaShape12S0301000_I2_4(grx, A002, (C146958n9) null, 12)), (Object) AnonymousClass8QK.A00);
    }

    public final C84714tk AMT(String str) {
        C84714tk AMN = AMN();
        KtSLambdaShape3S1100000_I2 ktSLambdaShape3S1100000_I2 = new KtSLambdaShape3S1100000_I2(str, (C146958n9) null, 13);
        return AnonymousClass7J0.A03(new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) ktSLambdaShape3S1100000_I2, AMN, 33), AnonymousClass7J0.A00);
    }
}
