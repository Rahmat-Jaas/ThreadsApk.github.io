package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape172S0100000_I2_1;
import kotlin.jvm.internal.KtLambdaShape30S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape47S0200000_I2_8;

/* renamed from: X.8K0  reason: invalid class name */
public final class AnonymousClass8K0 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C147368pE A01;
    public final /* synthetic */ C147368pE A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C965165g A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ AnonymousClass0YY A06;
    public final /* synthetic */ AnonymousClass0YY A07;
    public final /* synthetic */ AnonymousClass0YY A08;
    public final /* synthetic */ AnonymousClass0YM A09;
    public final /* synthetic */ C83224qz A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8K0(C147368pE r2, C147368pE r3, UserSession userSession, C965165g r5, AnonymousClass0ZU r6, AnonymousClass0YY r7, AnonymousClass0YY r8, AnonymousClass0YY r9, AnonymousClass0YM r10, C83224qz r11, int i) {
        super(1);
        this.A04 = r5;
        this.A07 = r7;
        this.A00 = i;
        this.A03 = userSession;
        this.A05 = r6;
        this.A02 = r2;
        this.A0A = r11;
        this.A08 = r8;
        this.A09 = r10;
        this.A06 = r9;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C145078jn A0M = C86124wJ.A0M(obj);
        C965165g r4 = this.A04;
        AnonymousClass0YY r2 = this.A07;
        int i = this.A00;
        C115716vn.A00(A0M, new KtLambdaShape30S0201000_I2(i, 15, r2, r4), 990839744);
        KtCSuperShape0S0400000_I2 ktCSuperShape0S0400000_I2 = r4.A01;
        Object obj2 = ktCSuperShape0S0400000_I2.A03;
        if (obj2 != null) {
            C115716vn.A00(A0M, new KtLambdaShape172S0100000_I2_1(obj2, 8), -1668415345);
            if (C18190wL.A1a(r4.A05)) {
                C115716vn.A00(A0M, new KtLambdaShape172S0100000_I2_1(r4, 9), 2047899028);
            }
        }
        A0M.Ba2((Object) null, (Object) null, C103386Yz.A00);
        Object obj3 = ktCSuperShape0S0400000_I2.A01;
        if (obj3 != null) {
            UserSession userSession = this.A03;
            AnonymousClass0ZU r5 = this.A05;
            if (!AnonymousClass7KL.A09((BKU) ktCSuperShape0S0400000_I2.A02, userSession)) {
                C115716vn.A00(A0M, new KtLambdaShape30S0201000_I2(i, 16, obj3, r5), 1695377714);
            }
        }
        List list = r4.A05;
        AnonymousClass8QQ r1 = AnonymousClass8QQ.A00;
        UserSession userSession2 = this.A03;
        C147368pE r8 = this.A02;
        C83224qz r14 = this.A0A;
        AnonymousClass0YY r11 = this.A08;
        AnonymousClass0YM r13 = this.A09;
        AnonymousClass0YY r12 = this.A06;
        C80554lv r7 = C80554lv.A00;
        A0M.Ba5(new KtLambdaShape47S0200000_I2_8(list, (AnonymousClass0YY) r1, 6), new KtLambdaShape47S0200000_I2_8(list, (AnonymousClass0YY) r7, 7), AnonymousClass7WY.A01(new C141348am(r8, userSession2, list, r11, r12, r13, r14), -632812321, true), list.size());
        if (list.isEmpty()) {
            C115716vn.A00(A0M, new KtLambdaShape172S0100000_I2_1(r4, 10), 1953035141);
        }
        C147368pE r6 = this.A01;
        if (((AnonymousClass7JK) r6.getValue()).A00 != AnonymousClass7JK.A01) {
            C115716vn.A00(A0M, new KtLambdaShape172S0100000_I2_1(r6, 11), 303696046);
        }
        return Unit.A00;
    }
}
