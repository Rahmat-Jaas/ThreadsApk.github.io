package X;

import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0eh  reason: invalid class name and case insensitive filesystem */
public final class C09020eh {
    public final UserSession A00;
    public final String A01;
    public final boolean A02;

    private void A01(C05600Uj r6, File file) {
        AnonymousClass0Vt.A00().A02(file.getName(), 4, "IgProfiloUploadService", "Trace Upload Failed: %s (reason = %d)");
        C31155GhB.A03(new C08270d5(r6, this, file));
    }

    public C09020eh(UserSession userSession, String str, boolean z) {
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = z;
    }

    public static void A00(C05600Uj r5, C09020eh r6, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!r6.A02) {
                if (!file.delete()) {
                    AnonymousClass0LU.A0N("IgProfiloUploadService", "Could not delete file : %s", file.getPath());
                }
                r6.A01(r5, file);
            } else {
                C32165H8c A012 = C08320dA.A01(r6.A00, file, r6.A01);
                A012.A01(new C08260d4(r5, (C08270d5) null, file));
                C31155GhB.A03(A012);
            }
        }
    }
}
