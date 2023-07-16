package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import kotlin.Unit;

/* renamed from: X.8TZ  reason: invalid class name */
public final class AnonymousClass8TZ extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ LineType A03;
    public final /* synthetic */ C970267q A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0YY A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8TZ(Modifier modifier, LineType lineType, C970267q r4, AnonymousClass0ZU r5, AnonymousClass0ZU r6, AnonymousClass0ZU r7, AnonymousClass0YY r8, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A04 = r4;
        this.A08 = r8;
        this.A0A = z;
        this.A05 = r5;
        this.A07 = r6;
        this.A06 = r7;
        this.A0B = z2;
        this.A03 = lineType;
        this.A09 = z3;
        this.A02 = modifier;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        C970267q r4 = this.A04;
        AnonymousClass0YY r8 = this.A08;
        boolean z = this.A0A;
        AnonymousClass0ZU r5 = this.A05;
        AnonymousClass0ZU r6 = this.A07;
        AnonymousClass0ZU r7 = this.A06;
        boolean z2 = this.A0B;
        C120477Ba.A00(A0H, this.A02, this.A03, r4, r5, r6, r7, r8, C115796vv.A00(this.A00), this.A01, z, z2, this.A09);
        return Unit.A00;
    }
}
