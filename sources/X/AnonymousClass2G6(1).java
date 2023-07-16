package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2G6  reason: invalid class name */
public final class AnonymousClass2G6 {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        boolean z = false;
        String A0D = C63893iY.A0D(r9, 0);
        Object A0B = C63893iY.A0B(r9, A1Z ? 1 : 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        List list = (List) A0B;
        Context context = C63913ic.A0D(r8).A00;
        C04220Ms.A06(context);
        if (!AnonymousClass8bP.A0j(A0D, "://", false)) {
            A0D = AnonymousClass00U.A0L(A0D, "://");
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            if (AnonymousClass0wJ.A1W(new Intent("android.intent.action.VIEW", Uri.parse(A0D)).resolveActivity(packageManager))) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        try {
                            if (packageManager.getPackageInfo(C18180wK.A0k(it), 0) != null) {
                                break;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                }
                z = true;
            }
            return Boolean.valueOf(z);
        }
        throw AnonymousClass0wJ.A0b();
    }
}
