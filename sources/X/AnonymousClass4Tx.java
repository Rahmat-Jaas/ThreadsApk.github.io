package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.4Tx  reason: invalid class name */
public final class AnonymousClass4Tx implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public AnonymousClass4Tx(Context context, Bitmap bitmap, UserSession userSession, String str) {
        this.A01 = bitmap;
        this.A00 = context;
        this.A03 = str;
        this.A02 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            Bitmap bitmap = this.A01;
            int width = bitmap.getWidth();
            File A05 = AnonymousClass0hL.A05(this.A00);
            C31176Gi6.A0J(bitmap, A05);
            String str = this.A03;
            String canonicalPath = A05.getCanonicalPath();
            C04220Ms.A06(canonicalPath);
            GO4.A00(this.A02, str, canonicalPath, width);
            return null;
        } catch (Exception e) {
            return e;
        }
    }
}
