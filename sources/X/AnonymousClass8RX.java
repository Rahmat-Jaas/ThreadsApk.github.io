package X;

import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

/* renamed from: X.8RX  reason: invalid class name */
public final class AnonymousClass8RX extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ AnonymousClass0ZU A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RX(ImageUrl imageUrl, String str, AnonymousClass0ZU r4, int i, boolean z, boolean z2) {
        super(2);
        this.A02 = str;
        this.A01 = imageUrl;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = r4;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        String str = this.A02;
        AnonymousClass6MV.A00(A0H, this.A01, str, this.A03, C115796vv.A00(this.A00), this.A05, this.A04);
        return Unit.A00;
    }
}
