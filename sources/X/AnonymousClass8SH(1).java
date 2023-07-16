package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8SH  reason: invalid class name */
public final class AnonymousClass8SH extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C147258p3 A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SH(C147258p3 r2, Modifier modifier, String str, AnonymousClass0ZU r5, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A05 = r5;
        this.A04 = str;
        this.A03 = modifier;
        this.A02 = r2;
        this.A06 = z;
        this.A07 = z2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass0ZU r5 = this.A05;
        String str = this.A04;
        Modifier modifier = this.A03;
        C117816zI.A00(this.A02, A0H, modifier, str, r5, C115796vv.A00(this.A00), this.A01, this.A06, this.A07);
        return Unit.A00;
    }
}
