package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8SB  reason: invalid class name */
public final class AnonymousClass8SB extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C147258p3 A02;
    public final /* synthetic */ C141728cr A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SB(C147258p3 r2, C141728cr r3, Modifier modifier, AnonymousClass0ZU r5, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A07 = z;
        this.A05 = r5;
        this.A04 = modifier;
        this.A06 = z2;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        boolean z = this.A07;
        AnonymousClass0ZU r5 = this.A05;
        AnonymousClass74S.A00(this.A02, this.A03, A0H, this.A04, r5, C115796vv.A00(this.A00), this.A01, z, this.A06);
        return Unit.A00;
    }
}
