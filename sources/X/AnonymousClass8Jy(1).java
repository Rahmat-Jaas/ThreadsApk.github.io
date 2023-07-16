package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3;

/* renamed from: X.8Jy  reason: invalid class name */
public final class AnonymousClass8Jy extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ C147368pE A00;
    public final /* synthetic */ C81784oM A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass0ZU A03;
    public final /* synthetic */ AnonymousClass0ZU A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0ZU A08;
    public final /* synthetic */ AnonymousClass0YP A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Jy(C147368pE r2, C81784oM r3, UserSession userSession, AnonymousClass0ZU r5, AnonymousClass0ZU r6, AnonymousClass0ZU r7, AnonymousClass0ZU r8, AnonymousClass0ZU r9, AnonymousClass0ZU r10, AnonymousClass0YP r11) {
        super(1);
        this.A01 = r3;
        this.A07 = r5;
        this.A05 = r6;
        this.A04 = r7;
        this.A08 = r8;
        this.A03 = r9;
        this.A06 = r10;
        this.A09 = r11;
        this.A02 = userSession;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C145078jn A0M = C86124wJ.A0M(obj);
        List list = (List) ((KtCSuperShape0S1101000_I2) this.A01.getValue()).A01;
        AnonymousClass8PH r1 = AnonymousClass8PH.A00;
        AnonymousClass0ZU r10 = this.A07;
        AnonymousClass0ZU r11 = this.A05;
        AnonymousClass0ZU r12 = this.A04;
        AnonymousClass0ZU r13 = this.A08;
        AnonymousClass0ZU r14 = this.A03;
        AnonymousClass0ZU r15 = this.A06;
        AnonymousClass0YP r6 = this.A09;
        UserSession userSession = this.A02;
        C78684ip r7 = C78684ip.A00;
        A0M.Ba5(new KtLambdaShape42S0200000_I2_3(list, (AnonymousClass0YY) r1, 30), new KtLambdaShape42S0200000_I2_3(list, (AnonymousClass0YY) r7, 31), AnonymousClass7WY.A01(new C141358ao(userSession, list, r10, r11, r12, r13, r14, r15, r6), -632812321, true), list.size());
        A0M.Ba2((Object) null, (Object) null, AnonymousClass6YC.A00);
        C115716vn.A00(A0M, C86164wN.A0w(this.A00, 43), 185376288);
        return Unit.A00;
    }
}
