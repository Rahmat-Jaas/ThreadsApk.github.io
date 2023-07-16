package X;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bugreporter.BugReport;
import com.instagram.service.session.UserSession;

/* renamed from: X.2IH  reason: invalid class name */
public final class AnonymousClass2IH {
    public static Object A00(AnonymousClass601 r10) {
        UserSession A0J = C63913ic.A0J(r10);
        C04220Ms.A0B(r10, 0);
        FragmentActivity A05 = C63913ic.A05(r10);
        AnonymousClass3IL r1 = new AnonymousClass3IL();
        r1.A03 = "636812293063672";
        r1.A04 = "306244556460128";
        String userId = A0J.getUserId();
        C04220Ms.A0B(userId, 0);
        r1.A09 = userId;
        BugReport A00 = r1.A00();
        String string = A05.getString(2131827453);
        AnonymousClass3GE r12 = new AnonymousClass3GE(A05);
        r12.A02 = string;
        r12.A00 = A05.getString(2131827454);
        r12.A01 = "";
        r12.A05 = true;
        new AnonymousClass1jI(A05, (Bitmap) null, A00, r12.A00(), (C61593Uj) null, A0J).A02(new Void[0]);
        return null;
    }
}
