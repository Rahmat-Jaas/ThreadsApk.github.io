package X;

import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Gs  reason: invalid class name and case insensitive filesystem */
public final class C33702Gs {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        C109326jp r7;
        AnonymousClass601 r6 = r9;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        List list = r10.A00;
        if (list.size() >= 4) {
            Map map = (Map) list.get(0);
            String A0E = C63893iY.A0E(r10, A1Z ? 1 : 0);
            Object A09 = C63893iY.A09(r10);
            if (A09 == null) {
                r7 = null;
            } else {
                r7 = ((C105916eC) A09).A00;
            }
            Object A0B = C63893iY.A0B(r10, 3);
            A0B.getClass();
            C109326jp r8 = ((C105916eC) A0B).A00;
            AnonymousClass3If r5 = (AnonymousClass3If) C63913ic.A0L(r6, AnonymousClass3If.class, R.id.ixt_event_ended_handler);
            if (!(r5 == null || map == null || r7 == null || r8 == null)) {
                ImmutableList.Builder builder = new ImmutableList.Builder();
                Iterator A0z = AnonymousClass0wJ.A0z(map);
                while (A0z.hasNext()) {
                    builder.add((Object) C63913ic.A0M(C18180wK.A0o(A0z).getValue()));
                }
                r5.A03(r6, r7, r8, A0E, C18250wR.A0F(builder));
            }
        }
        return null;
    }
}
