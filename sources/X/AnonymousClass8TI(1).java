package X;

import androidx.compose.ui.Modifier;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.8TI  reason: invalid class name */
public final class AnonymousClass8TI extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ C134747yH A06;
    public final /* synthetic */ C121807If A07;
    public final /* synthetic */ Map A08;
    public final /* synthetic */ AnonymousClass0YY A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8TI(Modifier modifier, C134747yH r3, C121807If r4, Map map, AnonymousClass0YY r6, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(2);
        this.A06 = r3;
        this.A05 = modifier;
        this.A07 = r4;
        this.A09 = r6;
        this.A04 = i;
        this.A0A = z;
        this.A02 = i2;
        this.A03 = i3;
        this.A08 = map;
        this.A00 = i4;
        this.A01 = i5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        C134747yH r3 = this.A06;
        Modifier modifier = this.A05;
        C121807If r4 = this.A07;
        AnonymousClass0YY r6 = this.A09;
        int i = this.A04;
        boolean z = this.A0A;
        C115746vq.A00(A0H, modifier, r3, r4, this.A08, r6, i, this.A02, this.A03, C115796vv.A00(this.A00), this.A01, z);
        return Unit.A00;
    }
}
