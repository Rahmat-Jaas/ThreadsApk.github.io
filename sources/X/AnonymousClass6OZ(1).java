package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.modal.ModalActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6OZ  reason: invalid class name */
public final class AnonymousClass6OZ {
    public static final Object A00(AnonymousClass601 r16, C63893iY r17) {
        AnonymousClass601 r4 = r16;
        C63893iY r2 = r17;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r4);
        Object A0B = C63893iY.A0B(r2, 0);
        A0B.getClass();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = ((Iterable) A0B).iterator();
        while (it.hasNext()) {
            C86124wJ.A1V(A0v, it);
        }
        Object A0B2 = C63893iY.A0B(r2, A1Z ? 1 : 0);
        A0B2.getClass();
        String A0h = C86164wN.A0h(A0B2);
        FragmentActivity A05 = C63913ic.A05(r4);
        C10300i6 A0F = C63913ic.A0F(r4);
        C18200wM.A1R(A0F);
        C20309BYl A00 = C20309BYl.A00();
        C63863iT.A05(A05, C98316Fa.A00(C18180wK.A0p(C18170wI.A00(24), AnonymousClass00J.A0C(A0v)), C18180wK.A0p(C18170wI.A00(23), C18200wM.A0s(A0v)), C18180wK.A0p(C18170wI.A00(22), A05.getString(2131832741)), C18180wK.A0p(AnonymousClass000.A00(1188), A00.A00), C18180wK.A0p(C18170wI.A00(69), "Static"), C18180wK.A0p(C18170wI.A00(47), AnonymousClass000.A00(1263)), C18180wK.A0p(AnonymousClass000.A00(635), Boolean.valueOf(A1Z)), C18180wK.A0p(AnonymousClass000.A00(100), new ContextualFeedNetworkConfig((String) AnonymousClass00J.A0E(A0v), (String) A0B2, (String) C63893iY.A0C(r2, A0h, 2), 0))), A0F, ModalActivity.class, I17.A00(51)).A0I(A05);
        A05.finish();
        return null;
    }
}
