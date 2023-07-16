package X;

import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.8RZ  reason: invalid class name */
public final class AnonymousClass8RZ extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ AnonymousClass0ZU A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RZ(Modifier modifier, List list, AnonymousClass0ZU r4, int i, int i2, int i3) {
        super(2);
        this.A02 = i;
        this.A04 = list;
        this.A05 = r4;
        this.A03 = modifier;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        int i = this.A02;
        C121947Ix.A04(A0H, this.A03, this.A04, this.A05, i, C115796vv.A00(this.A00), this.A01);
        return Unit.A00;
    }
}
