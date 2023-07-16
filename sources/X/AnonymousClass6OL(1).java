package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.instagram.model.shopping.Product;
import com.instagram.service.session.UserSession;

/* renamed from: X.6OL  reason: invalid class name */
public final class AnonymousClass6OL {
    public static final Object A00(AnonymousClass601 r17, C63893iY r18) {
        E2V A00;
        ViewGroup viewGroup;
        AnonymousClass601 r8 = r17;
        C63893iY r0 = r18;
        boolean A1Z = AnonymousClass0wJ.A1Z(r0, r8);
        AnonymousClass3HX A01 = C63893iY.A01(r0, 0);
        C10300i6 A0E = C63913ic.A0E(A01);
        C18200wM.A1R(A0E);
        UserSession userSession = (UserSession) A0E;
        C127397h3 A03 = C63893iY.A03(r0, A1Z ? 1 : 0);
        Product A012 = C19249AtE.A01(A03);
        C109326jp A06 = C63893iY.A06(r0, 2);
        Fragment fragment = ((C130667qT) A01.A02).A02;
        AnonymousClass600 r13 = null;
        if (!(fragment == null || (A00 = C33502Fy.A00(fragment.requireActivity(), A01)) == null)) {
            View view = fragment.mView;
            if (view instanceof ViewGroup) {
                View childAt = ((ViewGroup) view).getChildAt(2);
                if ((childAt instanceof FrameLayout) && (viewGroup = (ViewGroup) childAt) != null) {
                    ViewGroup viewGroup2 = A00.A0L;
                    if (viewGroup2 instanceof FrameLayout) {
                        View childAt2 = viewGroup2.getChildAt(A1Z);
                        if (childAt2 instanceof FrameLayout) {
                            View childAt3 = ((ViewGroup) childAt2).getChildAt(0);
                            if (childAt3 instanceof LinearLayout) {
                                View childAt4 = ((ViewGroup) childAt3).getChildAt(2);
                                if ((childAt4 instanceof ImageView) && childAt4 != null) {
                                    Context context = A01.A00;
                                    C04220Ms.A06(context);
                                    r13 = new AnonymousClass600(context, fragment, new BKe(), userSession, new C127307gu());
                                    C127307gu r9 = r13.A07;
                                    r9.A01(r13);
                                    r9.A04.add(r13);
                                    C25812DsR dsR = r9.A03;
                                    if (!dsR.A0G()) {
                                        r9.CLi(dsR);
                                    }
                                    r13.A01 = new C134327xT(A01, r8, A03, A06);
                                    r13.A01(childAt4, viewGroup, A012, AnonymousClass006.A01);
                                }
                            }
                        }
                    }
                }
            }
        }
        return r13;
    }
}
