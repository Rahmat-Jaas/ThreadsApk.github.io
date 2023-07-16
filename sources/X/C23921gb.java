package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.service.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.1gb  reason: invalid class name and case insensitive filesystem */
public final class C23921gb extends AnonymousClass436 {
    public final Context A00;
    public final C554633h A01;
    public final C11630kW A02;
    public final C57993Dj A03 = new C57993Dj();
    public final AnonymousClass34Q A04;
    public final UserSession A05;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A032 = C14030oh.A03(961997382);
        AnonymousClass38I r6 = (AnonymousClass38I) obj;
        C24970Dd5 dd5 = (C24970Dd5) obj2;
        Context context = this.A00;
        AnonymousClass37Y r4 = (AnonymousClass37Y) C18210wN.A0X(view);
        if (dd5 == null) {
            i2 = 0;
        } else {
            i2 = dd5.A00;
        }
        C57993Dj r11 = this.A03;
        C11630kW r10 = this.A02;
        UserSession userSession = this.A05;
        AnonymousClass34Q r12 = this.A04;
        C554633h r3 = this.A01;
        AnonymousClass0wJ.A1M(r4, 1, r6);
        C04220Ms.A0B(userSession, 7);
        AnonymousClass34S r14 = r6.A00;
        if (r14 != null) {
            DAA.A00(r10, r11, r12, r4.A01, r14, userSession, i2);
        }
        User user = r6.A01;
        if (user != null) {
            AnonymousClass3BF r9 = r4.A00;
            CircularImageView circularImageView = r9.A02;
            C18220wO.A1L(r10, circularImageView, user);
            TextView textView = r9.A01;
            textView.setText(user.Ak2());
            C63563ho.A08(textView, user.BZi());
            TextView textView2 = r9.A00;
            textView2.setVisibility(0);
            C18180wK.A0s(context, textView2, R.color.grey_5);
            textView2.setText(user.A0w());
            FollowButton followButton = r9.A03;
            followButton.setVisibility(0);
            followButton.A03.A02(r10, userSession, user);
            IDxCListenerShape70S0200000_1_I2 A0R = C18200wM.A0R(user, r3, 39);
            circularImageView.setOnClickListener(A0R);
            textView.setOnClickListener(A0R);
            textView2.setOnClickListener(A0R);
        }
        C14030oh.A0A(1322993149, A032);
    }

    public C23921gb(Context context, C554633h r3, C11630kW r4, AnonymousClass34Q r5, UserSession userSession) {
        this.A00 = context;
        this.A04 = r5;
        this.A02 = r4;
        this.A05 = userSession;
        this.A01 = r3;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = C14030oh.A03(2140022864);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.location_page_single_section_rounded_corner_linear_layout, viewGroup, false);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0J(inflate, R.id.container);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.location_page_business_row, viewGroup2, false);
        C18200wM.A1D(inflate2, R.id.view_profile);
        inflate2.setTag(new AnonymousClass3BF(C18180wK.A0G(inflate2, R.id.username), C18180wK.A0G(inflate2, R.id.subtitle), (CircularImageView) inflate2.findViewById(R.id.profile_imageview), (FollowButton) inflate2.findViewById(R.id.follow_button)));
        viewGroup2.addView(inflate2);
        Object tag = inflate2.getTag();
        if (tag != null) {
            AnonymousClass3BF r3 = (AnonymousClass3BF) tag;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag(new AnonymousClass34R(linearLayout));
            viewGroup2.addView(linearLayout);
            Object tag2 = linearLayout.getTag();
            if (tag2 != null) {
                inflate.setTag(new AnonymousClass37Y(r3, (AnonymousClass34R) tag2));
                C14030oh.A0A(-2103393901, A032);
                return inflate;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
