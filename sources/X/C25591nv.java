package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.1nv  reason: invalid class name and case insensitive filesystem */
public final class C25591nv extends C12140lP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass49Q A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Set A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25591nv(Context context, AnonymousClass49Q r8, String str, Set set, int i) {
        super("MultiNativeAuthVerification", 1206645857, i, true, true);
        this.A01 = r8;
        this.A00 = context;
        this.A02 = str;
        this.A03 = set;
    }

    public final void loggedRun() {
        AnonymousClass2A9 r2;
        try {
            AnonymousClass49Q r4 = this.A01;
            if (C63803iN.A0E(AnonymousClass0TJ.A05, r4.A01, 36321546286078877L)) {
                Context context = this.A00;
                String str = this.A02;
                ArrayList A0v = AnonymousClass0wJ.A0v();
                A0v.addAll(r4.A01(context));
                A0v.addAll(r4.A02(context));
                AnonymousClass49Q.A00(ImmutableList.copyOf((Collection) A0v), r4, str);
                return;
            }
            Context context2 = this.A00;
            Set set = this.A03;
            String str2 = this.A02;
            if (set.contains("FACEBOOK")) {
                AnonymousClass49Q.A00(r4.A01(context2), r4, str2);
            }
            if (set.contains("MESSENGER")) {
                AnonymousClass49Q.A00(r4.A02(context2), r4, str2);
            }
        } catch (Exception e) {
            UserSession userSession = this.A01.A01;
            AnonymousClass2A8 r3 = AnonymousClass2A8.A0F;
            String str3 = this.A02;
            if (C04220Ms.A0I(str3, "IG_FB_REEL_STORY_VIEWERS_DASHBOARD_BOTTOM")) {
                r2 = AnonymousClass2A9.A08;
            } else if (C04220Ms.A0I(str3, "IG_FB_PROFILE_LINK_INTEGRATION")) {
                r2 = AnonymousClass2A9.A06;
            } else {
                r2 = AnonymousClass2A9.A0J;
            }
            C62383Zj.A02(r2, r3, userSession, AnonymousClass4WK.A0O(C18180wK.A0p("criticalPathException", e.toString())));
        }
    }
}
