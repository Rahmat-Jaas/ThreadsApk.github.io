package X;

import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

/* renamed from: X.8Tp  reason: invalid class name and case insensitive filesystem */
public final class C140278Tp extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ C23894D0g A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0ZU A08;
    public final /* synthetic */ AnonymousClass0YY A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140278Tp(ImageUrl imageUrl, C23894D0g d0g, String str, String str2, String str3, AnonymousClass0ZU r7, AnonymousClass0ZU r8, AnonymousClass0YY r9, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A02 = imageUrl;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A0A = z;
        this.A03 = d0g;
        this.A0B = z2;
        this.A0C = z3;
        this.A09 = r9;
        this.A08 = r7;
        this.A07 = r8;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        ImageUrl imageUrl = this.A02;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A04;
        boolean z = this.A0A;
        C23894D0g d0g = this.A03;
        boolean z2 = this.A0B;
        boolean z3 = this.A0C;
        AnonymousClass7KL.A05(A0H, imageUrl, d0g, str, str2, str3, this.A08, this.A07, this.A09, C115796vv.A00(this.A00), C115796vv.A01(this.A01), z, z2, z3);
        return Unit.A00;
    }
}
