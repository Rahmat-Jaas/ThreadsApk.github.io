package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2IJ  reason: invalid class name */
public final class AnonymousClass2IJ {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        String A0D = C63893iY.A0D(r9, 0);
        FragmentActivity A05 = C63913ic.A05(r8);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r8));
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("timezone_offset", String.valueOf(C19591Ayr.A00().longValue()));
        C63743iE A022 = C63743iE.A02(A0D, A0y);
        IgBloksScreenConfig A0N = C18190wL.A0N(A02);
        A0N.A0S = A05.getResources().getString(2131827713);
        A0N.A0h = A1Z;
        C63743iE.A07(A05, A0N, A022);
        return null;
    }
}
