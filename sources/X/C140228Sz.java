package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import kotlin.Unit;

/* renamed from: X.8Sz  reason: invalid class name and case insensitive filesystem */
public final class C140228Sz extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ LineType A04;
    public final /* synthetic */ C970267q A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass8s2 A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140228Sz(Modifier modifier, LineType lineType, C970267q r4, AnonymousClass0ZU r5, AnonymousClass8s2 r6, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A06 = r5;
        this.A02 = i;
        this.A07 = r6;
        this.A05 = r4;
        this.A04 = lineType;
        this.A08 = z;
        this.A03 = modifier;
        this.A09 = z2;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass0ZU r5 = this.A06;
        int i = this.A02;
        AnonymousClass8s2 r6 = this.A07;
        C970267q r4 = this.A05;
        LineType lineType = this.A04;
        boolean z = this.A08;
        AnonymousClass7BZ.A02(A0H, this.A03, lineType, r4, r5, r6, i, C115796vv.A00(this.A00), this.A01, z, this.A09);
        return Unit.A00;
    }
}
