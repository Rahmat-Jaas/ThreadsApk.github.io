package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.instagram.model.shopping.Product;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.2Gb  reason: invalid class name and case insensitive filesystem */
public final class C33532Gb {
    public static final Object A00(AnonymousClass601 r19, C63893iY r20) {
        C310023v r15;
        E2V A00;
        C25918DvM A002;
        C63893iY r2 = r20;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r19);
        AnonymousClass3HX A01 = C63893iY.A01(r2, 0);
        Product A012 = C19249AtE.A01(C63893iY.A03(r2, A1Z ? 1 : 0));
        C10300i6 A0E = C63913ic.A0E(A01);
        C18200wM.A1R(A0E);
        UserSession userSession = (UserSession) A0E;
        Fragment fragment = ((C130667qT) A01.A02).A02;
        BKe bKe = new BKe();
        C110476lk A013 = AnonymousClass70B.A01(A01, bKe, userSession, "bk.action.cxf.cpdp.ShowAddToCartTooltip");
        List list = r2.A00;
        if (list.size() > 3) {
            Object obj = list.get(3);
            Object obj2 = null;
            if (obj instanceof String) {
                obj2 = obj;
            }
            r15 = (C310023v) C310023v.A01.get(obj2);
            if (r15 == null) {
                r15 = C310023v.UNKNOWN;
            }
        } else {
            r15 = C310023v.CART;
        }
        SharedPreferences A014 = AnonymousClass3Zs.A03(userSession).A01(D2R.A1o);
        if (fragment == null || A013 == null || (A00 = C33502Fy.A00(C63913ic.A04(A01), A01)) == null) {
            return null;
        }
        ViewGroup viewGroup = A00.A0L;
        C04220Ms.A0C(viewGroup, "null cannot be cast to non-null type android.widget.FrameLayout");
        View childAt = viewGroup.getChildAt(2);
        C04220Ms.A0C(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
        View childAt2 = ((ViewGroup) childAt).getChildAt(0);
        C04220Ms.A0C(childAt2, "null cannot be cast to non-null type android.widget.LinearLayout");
        ViewGroup viewGroup2 = (ViewGroup) childAt2;
        int ordinal = r15.ordinal();
        int i = 3;
        if (ordinal != 0) {
            if (ordinal != A1Z) {
                if (ordinal != 2) {
                    throw AnonymousClass4VZ.A00();
                }
            }
            View childAt3 = viewGroup2.getChildAt(i);
            C04220Ms.A0C(childAt3, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) childAt3;
            C04220Ms.A06(A01.A00.getString(2131829234));
            Object A0B = C63893iY.A0B(r2, 2);
            A0B.getClass();
            String str = (String) A0B;
            Rect bounds = imageView.getDrawable().getBounds();
            C04220Ms.A06(bounds);
            Context context = imageView.getContext();
            C04220Ms.A0C(context, "null cannot be cast to non-null type android.app.Activity");
            C04220Ms.A06(context);
            C25553Dnn dnn = new C25553Dnn((Activity) context, new C26401qa(context, str));
            dnn.A02(imageView, 0, bounds.height() / 2, A1Z);
            dnn.A03(D0f.BELOW_ANCHOR);
            dnn.A0D = A1Z;
            dnn.A04(AnonymousClass3TC.A06);
            dnn.A05 = new AnonymousClass624(imageView, r15, A013, bKe, A012, userSession, str);
            dnn.A0A = A1Z;
            A002 = dnn.A00();
            if (ordinal == 0 && ordinal == A1Z) {
                if (!A014.getBoolean("PRODUCT_NOTIFICATIONS_TOOLTIP", false)) {
                    A002.A05();
                }
                AnonymousClass0wJ.A13(A014.edit(), "PRODUCT_NOTIFICATIONS_TOOLTIP", A1Z);
                return null;
            }
            A002.A05();
            return null;
        }
        i = 2;
        View childAt32 = viewGroup2.getChildAt(i);
        C04220Ms.A0C(childAt32, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) childAt32;
        C04220Ms.A06(A01.A00.getString(2131829234));
        Object A0B2 = C63893iY.A0B(r2, 2);
        A0B2.getClass();
        String str2 = (String) A0B2;
        Rect bounds2 = imageView2.getDrawable().getBounds();
        C04220Ms.A06(bounds2);
        Context context2 = imageView2.getContext();
        C04220Ms.A0C(context2, "null cannot be cast to non-null type android.app.Activity");
        C04220Ms.A06(context2);
        C25553Dnn dnn2 = new C25553Dnn((Activity) context2, new C26401qa(context2, str2));
        dnn2.A02(imageView2, 0, bounds2.height() / 2, A1Z);
        dnn2.A03(D0f.BELOW_ANCHOR);
        dnn2.A0D = A1Z;
        dnn2.A04(AnonymousClass3TC.A06);
        dnn2.A05 = new AnonymousClass624(imageView2, r15, A013, bKe, A012, userSession, str2);
        dnn2.A0A = A1Z;
        A002 = dnn2.A00();
        if (ordinal == 0) {
        }
        A002.A05();
        return null;
    }
}
