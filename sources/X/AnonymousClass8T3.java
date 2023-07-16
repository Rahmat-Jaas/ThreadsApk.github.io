package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8T3  reason: invalid class name */
public final class AnonymousClass8T3 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ C882757k A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0ZU A08;
    public final /* synthetic */ AnonymousClass0YY A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8T3(Modifier modifier, C882757k r3, String str, String str2, AnonymousClass0ZU r6, AnonymousClass0ZU r7, AnonymousClass0ZU r8, AnonymousClass0YY r9, int i, int i2) {
        super(2);
        this.A05 = str;
        this.A02 = modifier;
        this.A08 = r6;
        this.A09 = r9;
        this.A07 = r7;
        this.A06 = r8;
        this.A04 = str2;
        this.A03 = r3;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        String str = this.A05;
        Modifier modifier = this.A02;
        AnonymousClass0ZU r6 = this.A08;
        AnonymousClass0YY r9 = this.A09;
        AnonymousClass0ZU r7 = this.A07;
        AnonymousClass0ZU r8 = this.A06;
        C122107Kg.A05(A0H, modifier, this.A03, str, this.A04, r6, r7, r8, r9, C115796vv.A00(this.A00), this.A01);
        return Unit.A00;
    }
}
