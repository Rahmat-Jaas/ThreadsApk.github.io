package X;

import com.instagram.model.shopping.Product;
import kotlin.Unit;

/* renamed from: X.8EA  reason: invalid class name */
public final class AnonymousClass8EA extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ C18464Afv A00;
    public final /* synthetic */ BKU A01;
    public final /* synthetic */ Product A02;
    public final /* synthetic */ C19498AxL A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8EA(C18464Afv afv, BKU bku, Product product, C19498AxL axL, String str) {
        super(0);
        this.A03 = axL;
        this.A01 = bku;
        this.A04 = str;
        this.A02 = product;
        this.A00 = afv;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C19498AxL axL = this.A03;
        C19498AxL.A03(axL);
        BKU bku = this.A01;
        String str = this.A04;
        String str2 = this.A02.A00.A0j;
        C04220Ms.A06(str2);
        C19498AxL.A01(bku, axL, str, str2, AnonymousClass000.A00(1304));
        this.A00.A00();
        return Unit.A00;
    }
}
