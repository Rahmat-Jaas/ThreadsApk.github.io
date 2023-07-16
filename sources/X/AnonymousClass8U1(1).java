package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

/* renamed from: X.8U1  reason: invalid class name */
public final class AnonymousClass8U1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ AnonymousClass5I4 A04;
    public final /* synthetic */ ImageUrl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ AnonymousClass0ZU A08;
    public final /* synthetic */ AnonymousClass0YY A09;
    public final /* synthetic */ AnonymousClass0YM A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8U1(Modifier modifier, AnonymousClass5I4 r3, ImageUrl imageUrl, String str, String str2, AnonymousClass0ZU r7, AnonymousClass0YY r8, AnonymousClass0YM r9, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.A05 = imageUrl;
        this.A06 = str;
        this.A03 = modifier;
        this.A07 = str2;
        this.A0D = z;
        this.A0C = z2;
        this.A0B = z3;
        this.A0E = z4;
        this.A04 = r3;
        this.A08 = r7;
        this.A09 = r8;
        this.A0A = r9;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        ImageUrl imageUrl = this.A05;
        String str = this.A06;
        Modifier modifier = this.A03;
        String str2 = this.A07;
        boolean z = this.A0D;
        boolean z2 = this.A0C;
        boolean z3 = this.A0B;
        boolean z4 = this.A0E;
        int i = this.A02;
        boolean z5 = z;
        AnonymousClass6MG.A00(A0H, modifier, this.A04, imageUrl, str, str2, this.A08, this.A09, this.A0A, C115796vv.A00(this.A00), C115796vv.A01(this.A01), i, z5, z2, z3, z4);
        return Unit.A00;
    }
}
