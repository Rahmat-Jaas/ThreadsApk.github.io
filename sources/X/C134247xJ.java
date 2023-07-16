package X;

import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductVariantDimension;

/* renamed from: X.7xJ  reason: invalid class name and case insensitive filesystem */
public final class C134247xJ implements C21727BzE {
    public final /* synthetic */ AnonymousClass601 A00;
    public final /* synthetic */ C109326jp A01;

    public final void CHT(ProductVariantDimension productVariantDimension) {
    }

    public C134247xJ(AnonymousClass601 r1, C109326jp r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void By4() {
        AnonymousClass601 r3 = this.A00;
        C04220Ms.A0B(r3, 0);
        C10450iM.A03(C63913ic.A0A(r3).getModuleName(), AnonymousClass000.A00(280));
        C19424Aw6.A03(C63913ic.A0D(r3).A00.getResources().getString(2131836068), 0, "cart_multi_variant_select_failure_bloks");
    }

    public final void CSx(Product product) {
        if (product != null) {
            C109326jp r4 = this.A01;
            AnonymousClass601 r3 = this.A00;
            if (r4 != null) {
                AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                A002.A02(product.A00.A0j, 0);
                C61043Rr.A00(r3, C86154wM.A0R(A002, product.A00.A0C.A06, 1), r4);
            }
        }
    }
}
