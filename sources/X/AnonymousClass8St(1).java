package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8St  reason: invalid class name */
public final class AnonymousClass8St extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ C121807If A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ AnonymousClass0YY A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8St(Modifier modifier, C121807If r3, String str, AnonymousClass0YY r5, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(2);
        this.A07 = str;
        this.A05 = modifier;
        this.A06 = r3;
        this.A08 = r5;
        this.A04 = i;
        this.A09 = z;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A01 = i5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        String str = this.A07;
        C115746vq.A01(A0H, this.A05, this.A06, str, this.A08, this.A04, this.A02, this.A03, C115796vv.A00(this.A00), this.A01, this.A09);
        return Unit.A00;
    }
}
