package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape171S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape20S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape25S0101000_I2;
import kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3;
import kotlin.jvm.internal.KtLambdaShape4S1400000_I2;

/* renamed from: X.8Jw  reason: invalid class name */
public final class AnonymousClass8Jw extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C81784oM A01;
    public final /* synthetic */ AnonymousClass77X A02;
    public final /* synthetic */ KtCSuperShape0S1200000_I2 A03;
    public final /* synthetic */ AnonymousClass75b A04;
    public final /* synthetic */ AnonymousClass582 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ C83224qz A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Jw(C81784oM r2, AnonymousClass77X r3, KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2, AnonymousClass75b r5, AnonymousClass582 r6, String str, AnonymousClass0ZU r8, C83224qz r9, int i, boolean z) {
        super(1);
        this.A09 = z;
        this.A03 = ktCSuperShape0S1200000_I2;
        this.A07 = r8;
        this.A00 = i;
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = str;
        this.A08 = r9;
        this.A04 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0YM r0;
        C145078jn r2 = (C145078jn) obj;
        C04220Ms.A0B(r2, 0);
        r2.Ba2((Object) null, (Object) null, C103736ae.A01);
        AnonymousClass0ZU r02 = this.A07;
        int i = this.A00;
        C115716vn.A00(r2, new KtLambdaShape25S0101000_I2(r02, i, 5), 454747216);
        AnonymousClass582 r8 = this.A05;
        C115716vn.A00(r2, new KtLambdaShape20S0301000_I2(i, 5, this.A02, this.A01, r8), -1287476625);
        boolean z = this.A09;
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2 = this.A03;
        if (!z) {
            int ordinal = ((AnonymousClass67Y) ktCSuperShape0S1200000_I2.A00).ordinal();
            if (ordinal == 0) {
                r0 = C103736ae.A02;
            } else if (ordinal == 1 || ordinal == 2) {
                KtLambdaShape171S0100000_I2 A0w = C86164wN.A0w(ktCSuperShape0S1200000_I2, 34);
                C04220Ms.A0B(A0w, 2);
                r0 = AnonymousClass7WY.A01(A0w, 284895211, true);
            }
            r2.Ba2((Object) null, (Object) null, r0);
        } else {
            List list = (List) ktCSuperShape0S1200000_I2.A01;
            AnonymousClass8P5 r1 = AnonymousClass8P5.A00;
            AnonymousClass8P6 r6 = AnonymousClass8P6.A00;
            String str = this.A06;
            C83224qz r9 = this.A08;
            AnonymousClass75b r10 = this.A04;
            r2.Ba5(new KtLambdaShape42S0200000_I2_3(list, (AnonymousClass0YY) r1, 7), new KtLambdaShape42S0200000_I2_3(list, (AnonymousClass0YY) r6, 8), AnonymousClass7WY.A01(new KtLambdaShape4S1400000_I2(list, r8, r9, r10, str, 1), -632812321, true), list.size());
            if (ktCSuperShape0S1200000_I2.A00 == AnonymousClass67Y.Loading) {
                r0 = C103736ae.A03;
                r2.Ba2((Object) null, (Object) null, r0);
            }
        }
        return Unit.A00;
    }
}
