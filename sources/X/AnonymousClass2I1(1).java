package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2I1  reason: invalid class name */
public final class AnonymousClass2I1 {
    public static Object A00(AnonymousClass601 r13, C63893iY r14) {
        AnonymousClass21W r0;
        List list = r14.A00;
        if (list.size() == 2) {
            C109326jp A0R = C18190wL.A0R(list, 0);
            C127397h3 r3 = (C127397h3) list.get(1);
            if (!(A0R == null || r3 == null)) {
                AnonymousClass601 r11 = r13;
                C04220Ms.A0B(r13, 0);
                Context requireContext = C63913ic.A01(r13).requireContext();
                C12560m7 A07 = C63913ic.A07(r13);
                List A0R2 = r3.A0R(35);
                String A0o = C18230wP.A0o(r3);
                boolean A0T = r3.A0T(38, false);
                if (!A0R2.isEmpty()) {
                    FragmentActivity A05 = C63913ic.A05(r11);
                    ArrayList A0t = C18200wM.A0t(A0R2);
                    Iterator it = A0R2.iterator();
                    while (it.hasNext()) {
                        String A0k = C18180wK.A0k(it);
                        if (A0k.equals("feed_media")) {
                            r0 = AnonymousClass21W.POSTS;
                        } else if (A0k.equals("camera_roll")) {
                            r0 = AnonymousClass21W.GALLERY;
                        }
                        A0t.add(r0);
                    }
                    DW8 dw8 = new DW8(requireContext, A05, A07, r11, A0R, A0T);
                    CRT crt = new CRT();
                    crt.A00 = dw8;
                    crt.A02 = A0t;
                    crt.A01 = A0o;
                    C25786Drz A0Q = C18180wK.A0Q(A05, C63913ic.A0F(r11));
                    A0Q.A0D = true;
                    A0Q.A03 = crt;
                    A0Q.A05();
                }
            }
        }
        return null;
    }
}
