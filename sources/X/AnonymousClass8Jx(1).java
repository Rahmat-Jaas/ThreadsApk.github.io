package X;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3;

/* renamed from: X.8Jx  reason: invalid class name */
public final class AnonymousClass8Jx extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C147368pE A02;
    public final /* synthetic */ C81784oM A03;
    public final /* synthetic */ AnonymousClass75b A04;
    public final /* synthetic */ C882757k A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0YY A08;
    public final /* synthetic */ C83224qz A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Jx(Context context, C147368pE r3, C81784oM r4, AnonymousClass75b r5, C882757k r6, AnonymousClass0ZU r7, AnonymousClass0ZU r8, AnonymousClass0YY r9, C83224qz r10, int i) {
        super(1);
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = r9;
        this.A02 = r3;
        this.A00 = i;
        this.A07 = r7;
        this.A06 = r8;
        this.A01 = context;
        this.A09 = r10;
        this.A04 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C145078jn A0M = C86124wJ.A0M(obj);
        C81784oM r16 = this.A03;
        AnonymousClass8s2 r15 = ((AnonymousClass5Hg) r16.getValue()).A05;
        AnonymousClass8PB r2 = AnonymousClass8PB.A00;
        C882757k r14 = this.A05;
        AnonymousClass0YY r13 = this.A08;
        C147368pE r11 = this.A02;
        int i = this.A00;
        AnonymousClass0ZU r9 = this.A07;
        AnonymousClass0ZU r8 = this.A06;
        Context context = this.A01;
        C83224qz r6 = this.A09;
        AnonymousClass75b r5 = this.A04;
        C78634ik r1 = C78634ik.A00;
        int size = r15.size();
        AnonymousClass8s2 r19 = r15;
        AnonymousClass0ZU r20 = r9;
        AnonymousClass75b r17 = r5;
        C882757k r18 = r14;
        C147368pE r152 = r11;
        Context context2 = context;
        A0M.Ba5(new KtLambdaShape42S0200000_I2_3((List) r15, (AnonymousClass0YY) r2, 11), new KtLambdaShape42S0200000_I2_3((List) r15, (AnonymousClass0YY) r1, 12), AnonymousClass7WY.A00(new C141388as(context2, r152, r16, r17, r18, r19, r20, r8, r13, r6, i), -632812321), size);
        return Unit.A00;
    }
}
