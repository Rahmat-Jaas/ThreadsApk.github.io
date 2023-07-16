package X;

import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape14S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3;
import kotlin.jvm.internal.KtLambdaShape4S1201000_I2;
import kotlin.jvm.internal.KtLambdaShape4S1400000_I2;

/* renamed from: X.8K2  reason: invalid class name */
public final class AnonymousClass8K2 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ KtCSuperShape0S1200000_I2 A03;
    public final /* synthetic */ AnonymousClass75b A04;
    public final /* synthetic */ C884257z A05;
    public final /* synthetic */ C968466x A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ AnonymousClass0YP A0A;
    public final /* synthetic */ C83224qz A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8K2(Modifier modifier, KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2, AnonymousClass75b r4, C884257z r5, C968466x r6, String str, String str2, String str3, AnonymousClass0YP r10, C83224qz r11, int i, int i2, boolean z) {
        super(1);
        this.A06 = r6;
        this.A0C = z;
        this.A03 = ktCSuperShape0S1200000_I2;
        this.A01 = i;
        this.A08 = str;
        this.A09 = str2;
        this.A05 = r5;
        this.A00 = i2;
        this.A02 = modifier;
        this.A07 = str3;
        this.A0B = r11;
        this.A04 = r4;
        this.A0A = r10;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0YM r0;
        C145078jn r14 = (C145078jn) obj;
        C04220Ms.A0B(r14, 0);
        C968466x r8 = this.A06;
        if (r8 == C968466x.Pending) {
            r14.Ba2((Object) null, (Object) null, AnonymousClass7WY.A01(new AnonymousClass8YM(this.A01, this.A08), 333482334, true));
        }
        C115716vn.A00(r14, new KtLambdaShape4S1201000_I2(r8, this.A05, this.A09, this.A00, 0), -1080695933);
        boolean z = this.A0C;
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2 = this.A03;
        if (!z) {
            int ordinal = ((AnonymousClass67Y) ktCSuperShape0S1200000_I2.A00).ordinal();
            if (ordinal == 0) {
                r0 = AnonymousClass6aP.A01;
            } else if (ordinal == 1 || ordinal == 2) {
                r0 = AnonymousClass7WY.A01(new KtLambdaShape14S0300000_I2(5, r8, ktCSuperShape0S1200000_I2, this.A02), -1873667146, true);
            }
            r14.Ba2((Object) null, (Object) null, r0);
        } else {
            List list = (List) ktCSuperShape0S1200000_I2.A01;
            AnonymousClass8P2 r2 = AnonymousClass8P2.A00;
            AnonymousClass8P3 r6 = AnonymousClass8P3.A00;
            String str = this.A07;
            C83224qz r10 = this.A0B;
            AnonymousClass75b r82 = this.A04;
            AnonymousClass0YP r9 = this.A0A;
            r14.Ba5(new KtLambdaShape42S0200000_I2_3(list, (AnonymousClass0YY) r2, 3), new KtLambdaShape42S0200000_I2_3(list, (AnonymousClass0YY) r6, 4), AnonymousClass7WY.A01(new KtLambdaShape4S1400000_I2(list, r82, r9, r10, str, 0), -632812321, true), list.size());
            if (ktCSuperShape0S1200000_I2.A00 == AnonymousClass67Y.Loading) {
                r0 = AnonymousClass6aP.A02;
                r14.Ba2((Object) null, (Object) null, r0);
            }
        }
        return Unit.A00;
    }
}
