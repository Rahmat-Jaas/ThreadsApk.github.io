package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import kotlin.Unit;

/* renamed from: X.8TO  reason: invalid class name */
public final class AnonymousClass8TO extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ LineType A04;
    public final /* synthetic */ C970267q A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0YY A08;
    public final /* synthetic */ AnonymousClass0YY A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8TO(Modifier modifier, LineType lineType, C970267q r4, String str, AnonymousClass0ZU r6, AnonymousClass0YY r7, AnonymousClass0YY r8, int i, int i2, int i3, boolean z) {
        super(2);
        this.A06 = str;
        this.A05 = r4;
        this.A04 = lineType;
        this.A0A = z;
        this.A09 = r7;
        this.A08 = r8;
        this.A03 = modifier;
        this.A02 = i;
        this.A07 = r6;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        String str = this.A06;
        C970267q r4 = this.A05;
        LineType lineType = this.A04;
        boolean z = this.A0A;
        AnonymousClass0YY r7 = this.A09;
        AnonymousClass0YY r8 = this.A08;
        C100276Mr.A00(A0H, this.A03, lineType, r4, str, this.A07, r7, r8, this.A02, C115796vv.A00(this.A00), this.A01, z);
        return Unit.A00;
    }
}
