package X;

import android.content.Context;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2JE  reason: invalid class name */
public final class AnonymousClass2JE {
    public static Object A00(AnonymousClass601 r9, C63893iY r10) {
        boolean A01 = AnonymousClass3WF.A01(r10, 0);
        boolean A012 = AnonymousClass3WF.A01(r10, 1);
        C109326jp A0R = C18190wL.A0R(r10.A00, 2);
        C04220Ms.A0B(r9, 0);
        FragmentActivity A05 = C63913ic.A05(r9);
        Context applicationContext = A05.getApplicationContext();
        if (applicationContext != null) {
            Window window = A05.getWindow();
            if (A01) {
                C35682Ok.A00().A00(applicationContext, window, A012, false, false);
            } else {
                C35682Ok.A00().A01(window);
            }
            if (A0R != null) {
                C63893iY.A0G(r9, A0R);
            }
        }
        return null;
    }
}
