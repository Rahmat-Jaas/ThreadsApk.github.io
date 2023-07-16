package X;

import android.view.View;
import com.instagram.model.shopping.Merchant;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.8JE  reason: invalid class name */
public final class AnonymousClass8JE extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ BKU A02;
    public final /* synthetic */ Merchant A03;
    public final /* synthetic */ C21730BzH A04;
    public final /* synthetic */ List A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8JE(BKU bku, Merchant merchant, C21730BzH bzH, List list, int i, long j) {
        super(1);
        this.A04 = bzH;
        this.A03 = merchant;
        this.A02 = bku;
        this.A01 = j;
        this.A00 = i;
        this.A05 = list;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View A0L = C86124wJ.A0L(obj);
        C21730BzH bzH = this.A04;
        String str = this.A03.A06;
        C04220Ms.A0A(str);
        long parseLong = Long.parseLong(str);
        String A0m = C86154wM.A0m(this.A02);
        long j = this.A01;
        bzH.Bos(A0L, new C18093AZj(A0m, (String) null, AnonymousClass000.A00(1235), this.A00 + this.A05.size(), parseLong, j));
        return Unit.A00;
    }
}
