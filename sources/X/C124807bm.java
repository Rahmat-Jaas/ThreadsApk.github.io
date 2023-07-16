package X;

import android.content.Context;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.7bm  reason: invalid class name and case insensitive filesystem */
public final class C124807bm implements C147138nS {
    public final Context A00;
    public final C110396lc A01;
    public final CAu A02;
    public final UserSession A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public C124807bm(Context context, C110396lc r2, CAu cAu, UserSession userSession, String str, List list, boolean z) {
        this.A03 = userSession;
        this.A02 = cAu;
        this.A00 = context;
        this.A05 = list;
        this.A04 = str;
        this.A01 = r2;
        this.A06 = z;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A03;
        Context context = this.A00;
        MiniGalleryService miniGalleryService = new MiniGalleryService(context, AnonymousClass6LZ.A00(context, userSession), userSession);
        CAu cAu = this.A02;
        C24955Dcq A002 = C99886Ld.A00(context, userSession);
        List list = this.A05;
        return new F70(this.A01, miniGalleryService, cAu, A002, userSession, this.A04, list, this.A06);
    }
}
