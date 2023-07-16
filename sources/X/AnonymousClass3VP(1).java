package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.instagram.fbpay.shoppay.IGShopPayCustomTabsActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3VP  reason: invalid class name */
public final class AnonymousClass3VP {
    public final C10300i6 A00;

    public final void A00(Context context, String str) {
        if (str.startsWith("instagram://bloks/?")) {
            AnonymousClass2JO.A00(context, (UserSession) this.A00, str);
            return;
        }
        Intent A0B = C18190wL.A0B(str);
        if (!C16420t2.A00().A06().A09(context, A0B)) {
            C16420t2.A00().A09().A09(context, A0B);
        }
    }

    public final void A02(Fragment fragment, String str, int i) {
        while (fragment.mParentFragment != null && !(fragment instanceof AnonymousClass5xI)) {
            fragment = fragment.mParentFragment;
        }
        Intent A04 = C18250wR.A04(fragment.requireContext(), IGShopPayCustomTabsActivity.class);
        A04.putExtra("extra_url", str);
        C10650ih.A0E(A04, fragment, i);
    }

    public AnonymousClass3VP(C10300i6 r1) {
        this.A00 = r1;
    }

    public final void A01(Context context, String str) {
        try {
            Uri A01 = C15430rJ.A01(str);
            if ("https".equals(A01.getScheme())) {
                C563436u A002 = new AnonymousClass3UQ().A00();
                Intent intent = A002.A00;
                intent.setData(A01);
                context.startActivity(intent, A002.A01);
            }
        } catch (SecurityException e) {
            AnonymousClass0LU.A0E("FBPayUrlLauncher", "Encounter security exception when parsing url!", e);
        }
    }

    public AnonymousClass3VP() {
    }
}
