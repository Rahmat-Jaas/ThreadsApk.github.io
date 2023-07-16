package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import kotlin.Unit;

/* renamed from: X.8Tu  reason: invalid class name */
public final class AnonymousClass8Tu extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ LineType A04;
    public final /* synthetic */ C970267q A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Tu(Modifier modifier, LineType lineType, C970267q r4, AnonymousClass0ZU r5, AnonymousClass0ZU r6, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(2);
        this.A06 = r5;
        this.A07 = r6;
        this.A05 = r4;
        this.A04 = lineType;
        this.A0C = z;
        this.A0B = z2;
        this.A0A = z3;
        this.A09 = z4;
        this.A08 = z5;
        this.A03 = modifier;
        this.A0D = z6;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass0ZU r12 = this.A06;
        AnonymousClass0ZU r13 = this.A07;
        C970267q r11 = this.A05;
        LineType lineType = this.A04;
        boolean z = this.A0C;
        boolean z2 = this.A0B;
        boolean z3 = this.A0A;
        boolean z4 = this.A09;
        boolean z5 = this.A08;
        Modifier modifier = this.A03;
        boolean z6 = this.A0D;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        int i = this.A02;
        C100296Mt.A00(A0H, modifier, lineType, r11, r12, r13, C115796vv.A00(this.A00), C115796vv.A01(this.A01), i, z10, z9, z8, z7, z5, z6);
        return Unit.A00;
    }
}
