package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8TP  reason: invalid class name */
public final class AnonymousClass8TP extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C147368pE A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C36483JXj A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8TP(C147368pE r2, Modifier modifier, C36483JXj jXj, String str, AnonymousClass0ZU r6, float f, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A05 = jXj;
        this.A00 = f;
        this.A08 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A06 = str;
        this.A04 = modifier;
        this.A03 = r2;
        this.A07 = r6;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        C36483JXj jXj = this.A05;
        float f = this.A00;
        boolean z = this.A08;
        boolean z2 = this.A09;
        boolean z3 = this.A0A;
        String str = this.A06;
        C100356Mz.A00(A0H, this.A03, this.A04, jXj, str, this.A07, f, C115796vv.A00(this.A01), this.A02, z, z2, z3);
        return Unit.A00;
    }
}
