package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

/* renamed from: X.8Se  reason: invalid class name and case insensitive filesystem */
public final class C140148Se extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ ImageUrl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140148Se(Modifier modifier, ImageUrl imageUrl, String str, AnonymousClass0ZU r5, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A05 = r5;
        this.A04 = str;
        this.A03 = imageUrl;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A02 = modifier;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass0ZU r5 = this.A05;
        String str = this.A04;
        C121317Fl.A01(A0H, this.A02, this.A03, str, r5, C115796vv.A00(this.A00), this.A01, this.A06, this.A07, this.A08);
        return Unit.A00;
    }
}
