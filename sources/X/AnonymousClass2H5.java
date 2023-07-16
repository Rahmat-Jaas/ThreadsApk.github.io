package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2H5  reason: invalid class name */
public final class AnonymousClass2H5 {
    public static Object A00(AnonymousClass601 r12, C63893iY r13) {
        String str = (String) C63893iY.A09(r13);
        List list = r13.A00;
        String A0q = C18190wL.A0q(list, 3);
        String A0q2 = C18190wL.A0q(list, 4);
        String A0q3 = C18190wL.A0q(list, 5);
        C04220Ms.A0B(r12, 0);
        FragmentActivity A05 = C63913ic.A05(r12);
        UserSession A0J = C63913ic.A0J(r12);
        if (AnonymousClass3E3.A00 != null) {
            AnonymousClass43J r7 = new AnonymousClass43J(str);
            C37383Jqm A06 = M6q.A06(r12);
            if (A06 == null) {
                C25786Drz A0Q = C18180wK.A0Q(C63913ic.A05(r12), C63913ic.A0F(r12));
                AnonymousClass3E3 r5 = AnonymousClass3E3.A00;
                if (r5 != null) {
                    C18180wK.A17(r5.A00(A05, r7, A0J, A0q2, A0q, A0q3, (HashMap) null), A0Q);
                    return null;
                }
            } else if (A0q2 == null || !Arrays.asList(A0q2.split(":")).contains("full_screen")) {
                AnonymousClass3E3 r52 = AnonymousClass3E3.A00;
                if (r52 != null) {
                    boolean A1Z = AnonymousClass0wJ.A1Z(A05, A0J);
                    C37032Jj9 A0L = C18210wN.A0L(A0J);
                    C18230wP.A10(A05, A0L, 2131829626);
                    C18250wR.A1B(A0L, A1Z);
                    A0L.A0f = A1Z;
                    A0L.A0Z = false;
                    A06.A09(r52.A00(A05, r7, A0J, A0q2, A0q, A0q3, C63203gz.A03("source", "bottom_sheet_android")), A0L);
                    return null;
                }
            } else {
                FragmentActivity A052 = C63913ic.A05(r12);
                Bundle A062 = C18180wK.A06();
                A062.putString("analytics_module_name", str);
                C18210wN.A0x(A062, A0q2);
                A062.putString("location", A0q);
                A062.putString("nua_action", A0q3);
                C63863iT.A08(A052, A062, A0J, ModalActivity.class, "sensitive_content_control");
                return null;
            }
        }
        C18250wR.A0k();
        throw null;
    }
}
