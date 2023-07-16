package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8SK  reason: invalid class name */
public final class AnonymousClass8SK extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ C304621k A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SK(Modifier modifier, C304621k r3, AnonymousClass0ZU r4, AnonymousClass0ZU r5, int i, int i2, int i3, boolean z) {
        super(2);
        this.A02 = i;
        this.A04 = r3;
        this.A03 = modifier;
        this.A06 = r4;
        this.A05 = r5;
        this.A07 = z;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        int i = this.A02;
        C304621k r3 = this.A04;
        C122107Kg.A07(A0H, this.A03, r3, this.A06, this.A05, i, C115796vv.A00(this.A00), this.A01, this.A07);
        return Unit.A00;
    }
}
