package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8SF  reason: invalid class name */
public final class AnonymousClass8SF extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C147258p3 A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C107816hM A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ AnonymousClass0ZU A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SF(C147258p3 r2, Modifier modifier, C107816hM r4, String str, AnonymousClass0ZU r6, int i, int i2, int i3) {
        super(2);
        this.A07 = r6;
        this.A06 = str;
        this.A02 = i;
        this.A05 = r4;
        this.A04 = modifier;
        this.A03 = r2;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass0ZU r6 = this.A07;
        String str = this.A06;
        int i = this.A02;
        C107816hM r4 = this.A05;
        C100186Mi.A00(this.A03, A0H, this.A04, r4, str, r6, i, C115796vv.A00(this.A00), this.A01);
        return Unit.A00;
    }
}
