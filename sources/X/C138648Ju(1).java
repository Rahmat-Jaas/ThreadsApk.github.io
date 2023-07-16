package X;

import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape27S0201000_I2;

/* renamed from: X.8Ju  reason: invalid class name and case insensitive filesystem */
public final class C138648Ju extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C147608pc A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ AnonymousClass0YP A07;
    public final /* synthetic */ AnonymousClass0YM A08;
    public final /* synthetic */ AnonymousClass0MZ A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138648Ju(C147608pc r2, List list, List list2, AnonymousClass0YP r5, AnonymousClass0YM r6, AnonymousClass0MZ r7, int i, int i2, int i3, long j) {
        super(1);
        this.A05 = list;
        this.A04 = r2;
        this.A07 = r5;
        this.A09 = r7;
        this.A03 = j;
        this.A01 = i;
        this.A08 = r6;
        this.A06 = list2;
        this.A00 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C04220Ms.A0B(obj, 0);
        List list = this.A05;
        AnonymousClass0MZ r6 = this.A09;
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            C122067Jz.A02((C123657Xy) next, r6.A00 * i, 0);
            i = i2;
        }
        C147608pc r8 = this.A04;
        List CwO = r8.CwO(AnonymousClass67S.Divider, this.A07);
        long j = this.A03;
        int i3 = this.A01;
        Iterator it = CwO.iterator();
        while (it.hasNext()) {
            C147578pZ.A02(it, i3, j);
        }
        AnonymousClass67S r7 = AnonymousClass67S.Indicator;
        AnonymousClass0YM r4 = this.A08;
        List<C147578pZ> CwO2 = r8.CwO(r7, AnonymousClass7WY.A01(new KtLambdaShape27S0201000_I2(this.A00, 28, this.A06, r4), 1420176418, true));
        int i4 = this.A02;
        for (C147578pZ Bg4 : CwO2) {
            C122067Jz.A02(Bg4.Bg4(Constraints.A01.A03(i4, i3)), 0, 0);
        }
        return Unit.A00;
    }
}
