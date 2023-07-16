package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.3yl  reason: invalid class name and case insensitive filesystem */
public final class C67033yl implements CallerContextable {
    public static final String __redex_internal_original_name = "SecondaryBottomSheetController";
    public final C62243Xy A00;
    public final MediaMapFragment A01;
    public final UserSession A02;

    public C67033yl(MediaMapFragment mediaMapFragment, UserSession userSession) {
        this.A01 = mediaMapFragment;
        this.A02 = userSession;
        this.A00 = new C62243Xy(userSession);
    }
}
