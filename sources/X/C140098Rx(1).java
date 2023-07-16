package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8Rx  reason: invalid class name and case insensitive filesystem */
public final class C140098Rx extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ AnonymousClass8f5 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ AnonymousClass0YY A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140098Rx(Modifier modifier, AnonymousClass8f5 r3, String str, AnonymousClass0YY r5, int i, int i2, int i3) {
        super(2);
        this.A05 = str;
        this.A06 = r5;
        this.A04 = r3;
        this.A03 = modifier;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        String str = this.A05;
        AnonymousClass0YY r5 = this.A06;
        C101756Sm.A00(A0H, this.A03, this.A04, str, r5, this.A02, C115796vv.A00(this.A00), this.A01);
        return Unit.A00;
    }
}
