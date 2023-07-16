package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8Rb  reason: invalid class name */
public final class AnonymousClass8Rb extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Rb(Modifier modifier, String str, float f, int i, int i2, boolean z) {
        super(2);
        this.A04 = str;
        this.A05 = z;
        this.A00 = f;
        this.A03 = modifier;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        String str = this.A04;
        boolean z = this.A05;
        C100416Nf.A00(A0H, this.A03, str, this.A00, C115796vv.A00(this.A01), this.A02, z);
        return Unit.A00;
    }
}
