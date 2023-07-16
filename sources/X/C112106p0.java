package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* renamed from: X.6p0  reason: invalid class name and case insensitive filesystem */
public final class C112106p0 {
    public final Context A00;
    public final Map A01;

    public final Set A00(String str, String str2) {
        ArrayList<Pair> arrayList;
        String str3;
        String str4 = str2;
        C971868g[] r7 = (C971868g[]) this.A01.get(AnonymousClass6HE.A00(str4));
        if (r7 != null) {
            ArrayList<C971868g> A0v = AnonymousClass0wJ.A0v();
            for (C971868g r2 : r7) {
                C18240wQ.A1N(r2, A0v, C04220Ms.A0I(r2.A00, this.A00.getPackageName()) ? 1 : 0);
            }
            arrayList = AnonymousClass0wJ.A0w(A0v);
            for (C971868g r0 : A0v) {
                String str5 = r0.A00;
                StringBuilder A0s = C18190wL.A0s("content://");
                A0s.append(str5);
                A0s.append(".ShareKey/");
                A0s.append(str4);
                A0s.append('/');
                arrayList.add(C18180wK.A0p(str5, C15430rJ.A01(C18180wK.A0i(str, A0s))));
            }
        } else {
            arrayList = null;
        }
        LinkedHashSet A0u = C86134wK.A0u();
        if (arrayList != null) {
            for (Pair pair : arrayList) {
                String str6 = (String) pair.A00;
                try {
                    Cursor A002 = C13960oa.A00(this.A00.getContentResolver(), (Uri) pair.A01, (String) null, (String) null, (String[]) null, (String[]) null, -1354073294);
                    boolean z = true;
                    if (A002 == null || !A002.moveToFirst()) {
                        z = false;
                    }
                    if (z) {
                        str3 = A002.getString(0);
                    } else {
                        str3 = null;
                    }
                    if (A002 != null) {
                        A002.close();
                    }
                } catch (SecurityException unused) {
                    str3 = null;
                }
                if (str3 != null) {
                    A0u.add(new KtCSuperShape0S2000000_I2(str3, str6, 2));
                }
            }
        }
        return A0u;
    }

    public C112106p0(Context context, Map map) {
        this.A00 = context;
        this.A01 = map;
    }
}
