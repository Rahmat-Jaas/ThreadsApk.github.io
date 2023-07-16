package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import com.instagram.service.session.UserSession;

/* renamed from: X.3PW  reason: invalid class name */
public final class AnonymousClass3PW {
    public static final void A01(Fragment fragment, UserSession userSession, Integer num) {
        C28521uW r1 = new C28521uW(C18240wQ.A0A(fragment, userSession, 1), fragment.mFragmentManager, userSession, num);
        C32165H8c A00 = C36902Tc.A00(userSession, num);
        A00.A00 = r1;
        ((C145538kf) fragment).schedule(A00);
    }

    public static final void A00(Context context, Integer num, String str, String str2) {
        if (num == AnonymousClass006.A01) {
            C50702tQ.A00(context, str2);
        } else if (num == AnonymousClass006.A00) {
            C50632tJ.A00(context, str, str2);
        } else {
            Intent A0B = C18230wP.A0B();
            A0B.setAction("android.intent.action.SEND");
            A0B.putExtra("android.intent.extra.SUBJECT", str);
            A0B.putExtra("android.intent.extra.TEXT", str2);
            A0B.setType(HTTP.PLAIN_TEXT_TYPE);
            if (num == AnonymousClass006.A0Y) {
                A0B.setPackage("com.whatsapp");
            }
            if (num == AnonymousClass006.A0j) {
                A0B.setPackage("com.facebook.orca");
            }
            C10650ih.A01(context, Intent.createChooser(A0B, (CharSequence) null));
        }
    }
}
