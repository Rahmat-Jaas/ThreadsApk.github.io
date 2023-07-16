package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8Ra  reason: invalid class name */
public final class AnonymousClass8Ra extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass0ZU A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Ra(Modifier modifier, String str, AnonymousClass0ZU r4, float f, int i, int i2) {
        super(2);
        this.A05 = r4;
        this.A04 = str;
        this.A03 = modifier;
        this.A00 = f;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass0ZU r4 = this.A05;
        C121947Ix.A02(A0H, this.A03, this.A04, r4, this.A00, C115796vv.A00(this.A01), this.A02);
        return Unit.A00;
    }
}
