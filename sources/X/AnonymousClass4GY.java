package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.4GY  reason: invalid class name */
public final class AnonymousClass4GY implements C82884qQ, CallerContextable {
    public static final String __redex_internal_original_name = "SupportResourcesCsomFilter";
    public final Context A00;
    public final UserSession A01;

    public final boolean CW4(C58743Gz r4) {
        if (!C35692Ol.A00(this.A01).A05(CallerContext.A00(AnonymousClass4GY.class), "ig_android_linking_cache_ig_to_fb_cross_communication") || !C09650fs.A08(this.A00, "com.facebook.orca", 293)) {
            return false;
        }
        return true;
    }

    public AnonymousClass4GY(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
