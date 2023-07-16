package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Yf  reason: invalid class name and case insensitive filesystem */
public final class C62313Yf {
    public static C62313Yf A0A;
    public Context A00;
    public Bitmap A01 = null;
    public ImageUrl A02 = null;
    public AnonymousClass35V A03 = null;
    public UserSession A04 = null;
    public Boolean A05 = null;
    public Boolean A06 = null;
    public boolean A07 = false;
    public boolean A08 = false;
    public final C82394pY A09 = C18220wO.A0P(this, 61);

    public static synchronized void A01(C62313Yf r4) {
        Bitmap bitmap;
        Context context;
        UserSession userSession;
        Boolean bool;
        synchronized (r4) {
            if (!(!r4.A07 || (bitmap = r4.A01) == null || !Boolean.TRUE.equals(Boolean.valueOf(r4.A08)) || (context = r4.A00) == null || (userSession = r4.A04) == null || (bool = r4.A06) == null)) {
                C59333Kk.A01(context, bitmap, userSession, bool.booleanValue());
            }
        }
    }

    public final synchronized void A02() {
        if (!this.A07) {
            this.A07 = true;
            C38040KHr.A01.A03(this.A09, AnonymousClass45J.class);
        }
    }

    public final synchronized void A03() {
        C38040KHr.A01.A04(this.A09, AnonymousClass45J.class);
        this.A07 = false;
        this.A01 = null;
        this.A05 = null;
        this.A02 = null;
        this.A04 = null;
        this.A06 = null;
        this.A08 = false;
        this.A03 = null;
        this.A00 = null;
    }

    public static C62313Yf A00() {
        C62313Yf r0 = A0A;
        if (r0 != null) {
            return r0;
        }
        C62313Yf r02 = new C62313Yf();
        A0A = r02;
        return r02;
    }
}
