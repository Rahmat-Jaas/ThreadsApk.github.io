package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8SE  reason: invalid class name */
public final class AnonymousClass8SE extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C111216my A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SE(Modifier modifier, C111216my r3, int i, int i2, long j, long j2, boolean z, boolean z2) {
        super(2);
        this.A06 = z;
        this.A05 = r3;
        this.A04 = modifier;
        this.A02 = j;
        this.A03 = j2;
        this.A07 = z2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        boolean z = this.A06;
        C111216my r3 = this.A05;
        AnonymousClass7DB.A00(A0H, this.A04, r3, C115796vv.A00(this.A00), this.A01, this.A02, this.A03, z, this.A07);
        return Unit.A00;
    }
}
