package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Qp  reason: invalid class name and case insensitive filesystem */
public final class C73014Qp implements Runnable {
    public final /* synthetic */ C10300i6 A00;
    public final /* synthetic */ List A01;

    public C73014Qp(C10300i6 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        C10300i6 r7 = this.A00;
        List list = this.A01;
        AnonymousClass01V r1 = C62623aQ.A00;
        if (r1 != null) {
            r1.markerPoint(896612552, "add_nonpassword_saved_accounts_start");
            List<AnonymousClass3Uc> A002 = AnonymousClass3WX.A00();
            ArrayList A0v = AnonymousClass0wJ.A0v();
            int i = 0;
            for (AnonymousClass3Uc A003 : A002) {
                String A004 = A003.A00();
                C04220Ms.A06(A004);
                if (A004.length() != 0) {
                    list.add(AnonymousClass4WJ.A0H(C18180wK.A0p(FXPFAccessLibraryDebugFragment.UID, A004), C18180wK.A0p("credential_type", NetInfoModule.CONNECTION_TYPE_NONE), C18180wK.A0p("token", "")));
                }
                i++;
                A0v.add(C62623aQ.A00(A004));
            }
            if (i == 0) {
                C62893b5.A01(r7, NetInfoModule.CONNECTION_TYPE_NONE);
            } else {
                C62893b5.A04(r7, NetInfoModule.CONNECTION_TYPE_NONE, A0v);
            }
            AnonymousClass01V r12 = C62623aQ.A00;
            if (r12 != null) {
                r12.markerPoint(896612552, "add_nonpassword_saved_accounts_end");
                return;
            }
        }
        C04220Ms.A0E("qplLogger");
        throw null;
    }
}
