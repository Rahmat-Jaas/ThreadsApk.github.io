package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.service.session.UserSession;

/* renamed from: X.19a  reason: invalid class name and case insensitive filesystem */
public final class C211319a extends C90925fJ {
    public final AnonymousClass252 A00;
    public final UserSession A01;

    public final AnonymousClass7H0 A0P(AnonymousClass39P r6, int i, int i2) {
        C04220Ms.A0B(r6, 0);
        Context context = r6.A00.A04;
        C04220Ms.A06(context);
        IgFrameLayout igFrameLayout = new IgFrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.layout_reel_live_badge_small, igFrameLayout, true);
        igFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return C18220wO.A0Q(igFrameLayout, i, i2);
    }

    public final boolean A0S(C90925fJ r3, Object obj, Object obj2) {
        C04220Ms.A0B(r3, 0);
        return C18240wQ.A1Y(((C211319a) r3).A00, this.A00);
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        C04220Ms.A0B(context, 0);
        IgFrameLayout igFrameLayout = new IgFrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.layout_reel_live_badge_small, igFrameLayout, true);
        return igFrameLayout;
    }

    public final /* bridge */ /* synthetic */ void A0Q(Context context, Object obj, Object obj2) {
        int i;
        View view = (View) obj;
        C04220Ms.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.badge_label);
        C04220Ms.A0C(requireViewById, I17.A00(0));
        AnonymousClass252 r2 = this.A00;
        if (r2 == AnonymousClass252.A08) {
            i = R.drawable.reel_badge_label_subscribers_background;
        } else {
            AnonymousClass252 r0 = AnonymousClass252.A03;
            i = R.drawable.reel_badge_label_2021_branding_background;
            if (r2 == r0) {
                i = R.drawable.reel_badge_label_close_friends_background;
            }
        }
        requireViewById.setBackgroundResource(i);
    }

    public final /* bridge */ /* synthetic */ void A0R(Context context, Object obj, Object obj2) {
        View view = (View) obj;
        C04220Ms.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.badge_label);
        C04220Ms.A0C(requireViewById, I17.A00(0));
        requireViewById.setBackgroundResource(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C211319a(UserSession userSession, AnonymousClass252 r3) {
        super(AnonymousClass006.A01);
        AnonymousClass0wJ.A1O(r3, userSession);
        this.A00 = r3;
        this.A01 = userSession;
    }
}
