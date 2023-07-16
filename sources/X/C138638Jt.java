package X;

import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape27S0201000_I2;

/* renamed from: X.8Jt  reason: invalid class name and case insensitive filesystem */
public final class C138638Jt extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C147608pc A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ AnonymousClass0YP A08;
    public final /* synthetic */ AnonymousClass0YM A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138638Jt(C147608pc r2, List list, List list2, AnonymousClass0YP r5, AnonymousClass0YM r6, int i, int i2, int i3, int i4, long j) {
        super(1);
        this.A06 = list;
        this.A05 = r2;
        this.A08 = r5;
        this.A03 = i;
        this.A04 = j;
        this.A01 = i2;
        this.A09 = r6;
        this.A07 = list2;
        this.A00 = i3;
        this.A02 = i4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C04220Ms.A0B(obj, 0);
        List list = this.A06;
        int i = this.A03;
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C06750aI.A1A();
                throw null;
            }
            C122067Jz.A02((C123657Xy) next, i2 * i, 0);
            i2 = i3;
        }
        C147608pc r8 = this.A05;
        List CwO = r8.CwO(AnonymousClass67B.Divider, this.A08);
        long j = this.A04;
        int i4 = this.A01;
        Iterator it = CwO.iterator();
        while (it.hasNext()) {
            C147578pZ.A02(it, i4, j);
        }
        AnonymousClass67B r7 = AnonymousClass67B.Indicator;
        AnonymousClass0YM r4 = this.A09;
        List<C147578pZ> CwO2 = r8.CwO(r7, AnonymousClass7WY.A01(new KtLambdaShape27S0201000_I2(this.A00, 20, this.A07, r4), -1341594997, true));
        int i5 = this.A02;
        for (C147578pZ Bg4 : CwO2) {
            C122067Jz.A02(Bg4.Bg4(Constraints.A01.A03(i5, i4)), 0, 0);
        }
        return Unit.A00;
    }
}
