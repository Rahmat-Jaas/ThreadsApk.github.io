package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.6Od  reason: invalid class name and case insensitive filesystem */
public final class C100656Od {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        List list = r9.A00;
        C121997Jj r7 = (C121997Jj) list.get(0);
        C127397h3 A0S = C86164wN.A0S(list, A1Z ? 1 : 0);
        Bundle A06 = C18180wK.A06();
        AnonymousClass3W9.A01(A06, C63913ic.A0F(r8));
        AnonymousClass3HX r2 = r8.A00;
        String str = (String) C121107Ed.A04.A0T();
        if (str == null) {
            return null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) AnonymousClass77M.A00.A00(str);
        if (fragmentActivity != null) {
            String A0n = C18190wL.A0n(C03480Iw.A00());
            C1192073y.A00(A0n, str);
            C1192073y.A01.put(A0n, new C108786iw(r2, r7, A0S));
            C94755wh r22 = new C94755wh();
            Bundle A062 = C18180wK.A06();
            A062.putString("prompt_id", A0n);
            A062.putAll(A06);
            r22.setArguments(A062);
            fragmentActivity.runOnUiThread(new C1358280h(r22, fragmentActivity));
            return null;
        }
        throw C18180wK.A0a("No active consent flow is opened!");
    }
}
