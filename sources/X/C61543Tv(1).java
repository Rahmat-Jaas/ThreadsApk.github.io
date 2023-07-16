package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.TimeZone;
import kotlin.Pair;

/* renamed from: X.3Tv  reason: invalid class name and case insensitive filesystem */
public final class C61543Tv {
    public static final C61543Tv A00 = new C61543Tv();

    public final void A00(FragmentActivity fragmentActivity, C11630kW r10, UserSession userSession, String str, String str2) {
        String id;
        boolean A1Z = C18200wM.A1Z(r10);
        C18180wK.A1R(str, str2);
        C37032Jj9 A0Y = C18200wM.A0Y(userSession, A1Z);
        A0Y.A0Z = A1Z;
        A0Y.A0e = A1Z;
        A0Y.A00 = 0.7f;
        Pair A0p = C18180wK.A0p("customer_id", str);
        Pair A0p2 = C18180wK.A0p("merchant_id", str2);
        String str3 = "";
        Pair A0p3 = C18180wK.A0p("appointment_id", str3);
        TimeZone timeZone = TimeZone.getDefault();
        if (!(timeZone == null || (id = timeZone.getID()) == null)) {
            str3 = id;
        }
        C63743iE A02 = C63743iE.A02("com.bloks.www.services.ig.appointment.customer", AnonymousClass4WJ.A09(A0p, A0p2, A0p3, C18180wK.A0p("timezone", str3), C18180wK.A0p("referrer_ui_component", "book_now_cta_media_post")));
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        A0N.A0P = r10.getModuleName();
        A0N.A00 = 32;
        A0N.A0O = AnonymousClass006.A01;
        C23221cn A01 = C62853b1.A01(A0N, A02);
        A0Y.A0I = A01;
        C18200wM.A16(fragmentActivity, A01, A0Y);
    }
}
