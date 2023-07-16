package X;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.624  reason: invalid class name */
public final class AnonymousClass624 extends AnonymousClass4DQ {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C310023v A01;
    public final /* synthetic */ C110476lk A02;
    public final /* synthetic */ C21839C2o A03;
    public final /* synthetic */ Product A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ String A06;

    public final void CPO(C25918DvM dvM) {
        String str;
        C04220Ms.A0B(dvM, 0);
        if (this.A01.ordinal() == 0) {
            C19513Axa axa = C19513Axa.A00;
            Context context = this.A00.getContext();
            C04220Ms.A0C(context, C18170wI.A00(2));
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            Product product = this.A04;
            Merchant merchant = product.A00.A0C;
            if (merchant != null) {
                str = merchant.A06;
            } else {
                str = null;
            }
            C04220Ms.A0A(str);
            axa.A0j(fragmentActivity, A00.A0N, C171619zh.UNKNOWN, C171749zu.A0K, A01.A0A, this.A05, (Long) null, str, this.A02.A02, this.A03.getModuleName(), AnonymousClass000.A00(1270), (String) null, (String) null, (String) null, (String) null, (String) null, product.A00.A0j, (String) null, (String) null, this.A06, (HashMap) null);
        }
    }

    public AnonymousClass624(ImageView imageView, C310023v r2, C110476lk r3, C21839C2o c2o, Product product, UserSession userSession, String str) {
        this.A01 = r2;
        this.A00 = imageView;
        this.A04 = product;
        this.A05 = userSession;
        this.A02 = r3;
        this.A03 = c2o;
        this.A06 = str;
    }
}
