package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

/* renamed from: X.8RM  reason: invalid class name */
public final class AnonymousClass8RM extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Modifier A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RM(Modifier modifier, ImageUrl imageUrl, String str, String str2, int i) {
        super(2);
        this.A02 = imageUrl;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = modifier;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass7I0.A01(C86104wH.A0H(obj, obj2), this.A01, this.A02, this.A04, this.A03, C115796vv.A00(this.A00));
        return Unit.A00;
    }
}
