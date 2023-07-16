package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8T1  reason: invalid class name */
public final class AnonymousClass8T1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C134747yH A05;
    public final /* synthetic */ C121807If A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ AnonymousClass0YY A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8T1(Modifier modifier, C134747yH r3, C121807If r4, String str, AnonymousClass0YY r6, int i, int i2, int i3, int i4, boolean z) {
        super(2);
        this.A05 = r3;
        this.A07 = str;
        this.A04 = modifier;
        this.A06 = r4;
        this.A09 = z;
        this.A03 = i;
        this.A02 = i2;
        this.A08 = r6;
        this.A00 = i3;
        this.A01 = i4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        C134747yH r3 = this.A05;
        String str = this.A07;
        Modifier modifier = this.A04;
        C121807If r4 = this.A06;
        boolean z = this.A09;
        AnonymousClass7Bb.A01(A0H, modifier, r3, r4, str, this.A08, this.A03, this.A02, C115796vv.A00(this.A00), this.A01, z);
        return Unit.A00;
    }
}
