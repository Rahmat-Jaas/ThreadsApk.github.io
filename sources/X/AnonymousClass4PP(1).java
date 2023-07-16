package X;

import java.util.List;

/* renamed from: X.4PP  reason: invalid class name */
public final class AnonymousClass4PP implements Runnable {
    public final /* synthetic */ C22641Yw A00;

    public AnonymousClass4PP(C22641Yw r1) {
        this.A00 = r1;
    }

    public final void run() {
        String str;
        C22641Yw r3 = this.A00;
        C07530bf r2 = r3.A09;
        if (r2 == null) {
            str = "loggedOutSession";
        } else {
            String str2 = r3.A0H;
            if (str2 == null) {
                str = C63833iQ.A06();
            } else {
                String A0d = C18240wQ.A0d(r3);
                String str3 = r3.A0G;
                if (str3 == null) {
                    str = "twoFacIdentifier";
                } else {
                    AnonymousClass3YZ r0 = r3.A08;
                    if (r0 == null) {
                        str = "twoFacSecureNonceManager";
                    } else {
                        String str4 = r3.A0E;
                        if (str4 == null) {
                            str = "pk";
                        } else {
                            List list = (List) r0.A01.get(str4);
                            H1T A0N = AnonymousClass0wJ.A0N(r2);
                            A0N.A0J("two_factor/check_trusted_notification_status/");
                            A0N.A0O(C63833iQ.A06(), str2);
                            A0N.A0P(C63833iQ.A09(A0N, C63833iQ.A00(), A0d), str3);
                            if (list != null && !list.isEmpty()) {
                                A0N.A0O("trusted_notification_polling_nonces", C18220wO.A0p(list));
                            }
                            C32165H8c A0T = AnonymousClass0wJ.A0T(A0N, C22221Tw.class, C60563Pp.class);
                            A0T.A00 = r3.A0S;
                            r3.schedule(A0T);
                            return;
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
