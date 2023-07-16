package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8Ru  reason: invalid class name and case insensitive filesystem */
public final class C140068Ru extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ AnonymousClass0ZU A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140068Ru(Modifier modifier, String str, AnonymousClass0ZU r4, int i, int i2, int i3, long j) {
        super(2);
        this.A06 = r4;
        this.A02 = i;
        this.A05 = str;
        this.A04 = modifier;
        this.A03 = j;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass0ZU r4 = this.A06;
        int i = this.A02;
        String str = this.A05;
        C121317Fl.A02(A0H, this.A04, str, r4, i, C115796vv.A00(this.A00), this.A01, this.A03);
        return Unit.A00;
    }
}
