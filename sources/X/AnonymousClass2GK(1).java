package X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import java.util.Iterator;

/* renamed from: X.2GK  reason: invalid class name */
public final class AnonymousClass2GK {
    public static final Object A00(AnonymousClass601 r5, C63893iY r6) {
        if (r6.A00.size() >= AnonymousClass0wJ.A1Z(r6, r5)) {
            String A0E = C63893iY.A0E(r6, 0);
            C04220Ms.A0B(A0E, 0);
            String replace = A0E.replace('_', Rfc3492Idn.delimiter);
            C04220Ms.A06(replace);
            if (!TextUtils.isEmpty(replace)) {
                Iterator it = C62503a9.A01.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass19W r1 = (AnonymousClass19W) it.next();
                    if (r1.A02.equals(replace)) {
                        C62503a9.A01(C18230wP.A08(), r1);
                        break;
                    }
                }
            }
            FragmentActivity A05 = C63913ic.A05(r5);
            Intent A0B = C18230wP.A0B();
            A0B.setClassName(A05, "com.instagram.nux.activity.BloksSignedOutFragmentActivity");
            A0B.setFlags(67108864);
            C10650ih.A02(A05, A0B);
        }
        return null;
    }
}
