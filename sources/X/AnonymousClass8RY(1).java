package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

/* renamed from: X.8RY  reason: invalid class name */
public final class AnonymousClass8RY extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Modifier A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RY(Modifier modifier, ImageUrl imageUrl, String str, String str2, String str3, int i) {
        super(2);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = imageUrl;
        this.A05 = str3;
        this.A01 = modifier;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        String str = this.A03;
        String str2 = this.A04;
        C117776zE.A01(A0H, this.A01, this.A02, str, str2, this.A05, C115796vv.A00(this.A00));
        return Unit.A00;
    }
}
