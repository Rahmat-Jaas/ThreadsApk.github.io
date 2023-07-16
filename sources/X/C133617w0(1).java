package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2;

/* renamed from: X.7w0  reason: invalid class name and case insensitive filesystem */
public final class C133617w0 implements C33516HpC {
    public final /* synthetic */ KtCSuperShape0S1110000_I2 A00;
    public final /* synthetic */ AnonymousClass5HR A01;
    public final /* synthetic */ AnonymousClass58H A02;

    public C133617w0(KtCSuperShape0S1110000_I2 ktCSuperShape0S1110000_I2, AnonymousClass5HR r2, AnonymousClass58H r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = ktCSuperShape0S1110000_I2;
    }

    public final boolean onToggle(boolean z) {
        Integer num;
        Map map;
        AnonymousClass58H r1 = this.A02;
        C122027Jo r7 = r1.A00;
        Integer num2 = AnonymousClass006.A01;
        if (z) {
            num = AnonymousClass006.A0C;
        } else {
            num = AnonymousClass006.A0N;
        }
        AnonymousClass5HR r2 = this.A01;
        boolean z2 = r2.A04;
        Boolean valueOf = Boolean.valueOf(z2);
        boolean z3 = r2.A01;
        Boolean valueOf2 = Boolean.valueOf(z3);
        KtCSuperShape0S1110000_I2 ktCSuperShape0S1110000_I2 = this.A00;
        Map map2 = null;
        if (ktCSuperShape0S1110000_I2 != null) {
            map = (Map) ktCSuperShape0S1110000_I2.A00;
        } else {
            map = null;
        }
        boolean z4 = r2.A02;
        Boolean valueOf3 = Boolean.valueOf(z4);
        boolean z5 = r2.A03;
        C122027Jo.A02(r7, valueOf, valueOf2, valueOf3, Boolean.valueOf(z5), num2, num, map, (Map) null, (Map) null, 288);
        if (z) {
            if (ktCSuperShape0S1110000_I2 != null) {
                map2 = (Map) ktCSuperShape0S1110000_I2.A00;
            }
            r1.A06(map2, true, z2, z3, z4, z5);
            return true;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape8S0301000_I2((Object) r1, (Object) r2, (Object) ktCSuperShape0S1110000_I2, (C146958n9) null, 49), AnonymousClass3J5.A00(r1), 3);
        return false;
    }
}
