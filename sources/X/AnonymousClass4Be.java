package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4Be  reason: invalid class name */
public final class AnonymousClass4Be implements C21566BwV {
    public final C11630kW A00;
    public final Product A01;
    public final UserSession A02;
    public final User A03;

    public final User BK6() {
        return this.A03;
    }

    public final void ChC(I0W i0w, H8D h8d, DirectShareTarget directShareTarget, String str, boolean z) {
        String obj;
        if (str != null && (obj = AnonymousClass8bP.A0L(str).toString()) != null && obj.length() != 0) {
            this.A00.getModuleName();
            throw C18210wN.A0W("enqueueProductMessageToMerchant");
        }
    }

    public AnonymousClass4Be(C11630kW r4, Product product, UserSession userSession) {
        String str;
        AnonymousClass0wJ.A1P(userSession, product);
        this.A02 = userSession;
        this.A00 = r4;
        this.A01 = product;
        Merchant merchant = product.A00.A0C;
        if (merchant != null) {
            str = merchant.A06;
        } else {
            str = null;
        }
        User user = new User(str, merchant.A08);
        user.A1z(product.A00.A0C.A02);
        this.A03 = user;
    }
}
