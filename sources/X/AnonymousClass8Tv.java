package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

/* renamed from: X.8Tv  reason: invalid class name */
public final class AnonymousClass8Tv extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ LineType A04;
    public final /* synthetic */ C970267q A05;
    public final /* synthetic */ ImageUrl A06;
    public final /* synthetic */ ImageUrl A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ AnonymousClass0ZU A0B;
    public final /* synthetic */ AnonymousClass0ZU A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Tv(Modifier modifier, LineType lineType, C970267q r4, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, AnonymousClass0ZU r10, AnonymousClass0ZU r11, int i, int i2, int i3, boolean z) {
        super(2);
        this.A08 = str;
        this.A06 = imageUrl;
        this.A07 = imageUrl2;
        this.A09 = str2;
        this.A0A = str3;
        this.A04 = lineType;
        this.A0D = z;
        this.A03 = modifier;
        this.A05 = r4;
        this.A0B = r10;
        this.A0C = r11;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        String str = this.A08;
        ImageUrl imageUrl = this.A06;
        ImageUrl imageUrl2 = this.A07;
        String str2 = this.A09;
        String str3 = this.A0A;
        LineType lineType = this.A04;
        boolean z = this.A0D;
        C117776zE.A00(A0H, this.A03, lineType, this.A05, imageUrl, imageUrl2, str, str2, str3, this.A0B, this.A0C, C115796vv.A00(this.A00), C115796vv.A01(this.A01), this.A02, z);
        return Unit.A00;
    }
}
