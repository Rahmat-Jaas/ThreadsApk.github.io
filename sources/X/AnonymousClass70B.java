package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import java.util.Map;

/* renamed from: X.70B  reason: invalid class name */
public final class AnonymousClass70B {
    public static final FrameLayout A00(View view) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(view);
        frameLayout.setTag(view.getTag());
        return frameLayout;
    }

    public static final C110476lk A01(AnonymousClass3HX r6, C21839C2o c2o, UserSession userSession, String str) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, userSession);
        Object obj = r6.A01.get(R.id.bk_context_key_pdp_arguments);
        if (!Map.class.isInstance(obj)) {
            obj = null;
        }
        Map map = (Map) obj;
        C110476lk r2 = null;
        if (map != null) {
            ProductDetailsPageArguments productDetailsPageArguments = (ProductDetailsPageArguments) map.get(AnonymousClass000.A00(856));
            String A0r = C18220wO.A0r("shopping_session_id", map);
            if (A0r == null) {
                AnonymousClass0wJ.A1N(userSession, c2o);
                A0r = C18180wK.A0e();
                C04220Ms.A06(A0r);
            }
            String A0r2 = C18220wO.A0r(AnonymousClass000.A00(775), map);
            if (!(productDetailsPageArguments == null || A0r2 == null)) {
                r2 = new C110476lk(productDetailsPageArguments, A0r, A0r2, C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36312806026380479L));
            }
        }
        String A0L = AnonymousClass00U.A0L("Unable to get CpdpArguments for RenderUnit ", str);
        String A00 = AnonymousClass000.A00(602);
        C04220Ms.A0B(A0L, A1Z ? 1 : 0);
        if (r2 == null) {
            C30967GcS.A02(A00, A0L);
        }
        return r2;
    }
}
