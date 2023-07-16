package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.1jS  reason: invalid class name */
public final class AnonymousClass1jS extends C90995fQ {
    public final /* bridge */ /* synthetic */ Object A0P(View view, AnonymousClass3HX r7, C127397h3 r8, Object obj) {
        C04220Ms.A0B(r7, 0);
        Fragment fragment = (Fragment) r7.A01.get(R.id.bloks_ig_fragment);
        String A0o = C18220wO.A0o(r8);
        if (A0o == null || !(fragment instanceof C83084ql) || !(fragment instanceof AnonymousClass1c8) || (!((C83084ql) fragment).BYn() && A0o.equals("top"))) {
            return null;
        }
        AnonymousClass1c8 r4 = (AnonymousClass1c8) fragment;
        IgBloksScreenConfig igBloksScreenConfig = r4.A0A;
        if (((!igBloksScreenConfig.A0b && !igBloksScreenConfig.A0c) || AnonymousClass1c8.A05(r4)) && A0o.equals("bottom")) {
            return null;
        }
        C31156GhE.A04(C63913ic.A04(r7), new C134367xX(this, r7, r8, A0o));
        return null;
    }

    public final View A0O(Context context) {
        return new View(context);
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        return new View(context);
    }

    public AnonymousClass1jS(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
    }

    public final /* bridge */ /* synthetic */ void A0R(View view, AnonymousClass3HX r2, C127397h3 r3, Object obj, Object obj2) {
    }
}
