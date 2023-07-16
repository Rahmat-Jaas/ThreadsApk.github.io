package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

/* renamed from: X.8T2  reason: invalid class name */
public final class AnonymousClass8T2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ AnonymousClass75b A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ AnonymousClass0YY A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8T2(Modifier modifier, AnonymousClass75b r3, ImageUrl imageUrl, String str, String str2, String str3, AnonymousClass0YY r8, int i, int i2, boolean z) {
        super(2);
        this.A08 = r8;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A04 = imageUrl;
        this.A09 = z;
        this.A03 = r3;
        this.A02 = modifier;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass0YY r8 = this.A08;
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A07;
        ImageUrl imageUrl = this.A04;
        boolean z = this.A09;
        AnonymousClass7KY.A07(A0H, this.A02, this.A03, imageUrl, str, str2, str3, r8, C115796vv.A00(this.A00), this.A01, z);
        return Unit.A00;
    }
}
