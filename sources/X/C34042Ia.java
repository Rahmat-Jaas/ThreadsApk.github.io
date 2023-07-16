package X;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Ia  reason: invalid class name and case insensitive filesystem */
public final class C34042Ia {
    public static Object A00(AnonymousClass601 r21, C63893iY r22) {
        AnonymousClass601 r3 = r21;
        C04220Ms.A0B(r3, 0);
        C10300i6 A0F = C63913ic.A0F(r3);
        UserSession A02 = C05030Qo.A02(A0F);
        FragmentActivity A05 = C63913ic.A05(r3);
        Fragment A03 = C63913ic.A03(r3);
        int i = 1;
        C63893iY r1 = r22;
        Object A0B = C63893iY.A0B(r1, 1);
        A0B.getClass();
        String obj = A0B.toString();
        Object A0B2 = C63893iY.A0B(r1, 2);
        if (A0B2 != null) {
            i = AnonymousClass0wJ.A04(A0B2);
        }
        FragmentActivity A052 = C63913ic.A05(r3);
        AnonymousClass3UZ r0 = AnonymousClass3UZ.A02;
        long A053 = C63043bN.A01.A05(A02);
        Drawable A01 = C18742Ake.A01(A05, R.drawable.instagram_clock_dotted_pano_outline_24);
        if (r0 != null) {
            if (i == 0) {
                C37383Jqm A00 = AnonymousClass3Zz.A00(A05, (AnonymousClass37X) null, A02, r0);
                r0.A00();
                C37383Jqm.A00(A05, new AnonymousClass1wP(), A00);
            } else {
                C37383Jqm A032 = r0.A00().A03(A05, A052, A02, new C71994Lo(A05, A01, A03, A052, (AnonymousClass37X) null, A0F, A02, obj, A053, false), 0, false);
                r0.A00();
                C37383Jqm.A00(A05, new C29071wf(), A032);
            }
            C696349j.A03(A02);
            long A002 = C696349j.A00();
            if (A03 instanceof C156929Py) {
                C63583hq.A02(A02, AnonymousClass006.A0j, A002);
            }
        }
        return null;
    }
}
