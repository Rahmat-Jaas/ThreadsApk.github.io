package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.4U0  reason: invalid class name */
public final class AnonymousClass4U0 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Uri A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;

    public AnonymousClass4U0(Context context, Uri uri, UserSession userSession, String str, int i) {
        this.A01 = context;
        this.A03 = userSession;
        this.A00 = i;
        this.A02 = uri;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            Context context = this.A01;
            UserSession userSession = this.A03;
            int i = this.A00;
            Bitmap A002 = C31540GrE.A00(context, this.A02, userSession, i);
            if (A002 != null) {
                int width = A002.getWidth();
                File A05 = AnonymousClass0hL.A05(context);
                C31176Gi6.A0J(A002, A05);
                A002.recycle();
                if (AnonymousClass0hL.A04(A05.getPath()) < OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) {
                    StringBuilder A0r = C18200wM.A0r();
                    A0r.append(i);
                    A0r.append(" : ");
                    C10450iM.A03("profile_image_too_small", C18180wK.A0i(this.A04, A0r));
                }
                String str = this.A04;
                String canonicalPath = A05.getCanonicalPath();
                C04220Ms.A06(canonicalPath);
                GO4.A00(userSession, str, canonicalPath, width);
                return null;
            }
            throw C18180wK.A0a("failed to load avatar bitmap");
        } catch (Exception e) {
            return e;
        }
    }
}
