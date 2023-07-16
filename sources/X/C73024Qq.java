package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: X.4Qq  reason: invalid class name and case insensitive filesystem */
public final class C73024Qq implements Runnable {
    public final /* synthetic */ C10300i6 A00;
    public final /* synthetic */ List A01;

    public C73024Qq(C10300i6 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        String str;
        C10300i6 r7 = this.A00;
        List list = this.A01;
        AnonymousClass01V r1 = C62623aQ.A00;
        if (r1 != null) {
            r1.markerPoint(896612552, "add_onetap_account_start");
            List A08 = C63533hk.A02(r7).A08(r7);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            Iterator it = A08.iterator();
            int i = 0;
            while (it.hasNext()) {
                C62733ac A0Q = C18250wR.A0Q(it);
                Pair A0p = C18180wK.A0p(FXPFAccessLibraryDebugFragment.UID, A0Q.A05);
                Pair A0p2 = C18180wK.A0p("token", A0Q.A03);
                Pair A0p3 = C18180wK.A0p("account_type", "nonce");
                AnonymousClass3AB r0 = AnonymousClass44X.A00().A01;
                if (r0 != null) {
                    str = r0.A02;
                } else {
                    str = null;
                }
                list.add(AnonymousClass4WJ.A0H(A0p, A0p2, A0p3, C18180wK.A0p("metadata", AnonymousClass4WJ.A0G(C18180wK.A0p("big_blue_token", str), C18180wK.A0p("device_base_login_session", A0Q.A00())))));
                i++;
                String str2 = A0Q.A05;
                C04220Ms.A06(str2);
                A0v.add(str2);
            }
            if (i == 0) {
                C62893b5.A01(r7, "nonce");
            } else {
                C62893b5.A04(r7, "nonce", A0v);
            }
            AnonymousClass01V r12 = C62623aQ.A00;
            if (r12 != null) {
                r12.markerPoint(896612552, "add_onetap_account_end");
                return;
            }
        }
        C04220Ms.A0E("qplLogger");
        throw null;
    }
}
