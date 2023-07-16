package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8RW  reason: invalid class name */
public final class AnonymousClass8RW extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ C111216my A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RW(Modifier modifier, C111216my r3, int i, int i2, long j, boolean z) {
        super(2);
        this.A05 = z;
        this.A04 = r3;
        this.A03 = modifier;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        boolean z = this.A05;
        C111216my r3 = this.A04;
        C120857Cv.A01(A0H, this.A03, r3, C115796vv.A00(this.A00), this.A01, this.A02, z);
        return Unit.A00;
    }
}
