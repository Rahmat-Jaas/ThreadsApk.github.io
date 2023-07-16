package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1h0  reason: invalid class name */
public final class AnonymousClass1h0 extends AnonymousClass435 {
    public final C558734x A00;
    public final Context A01;
    public final C11630kW A02;
    public final C57993Dj A03 = new AnonymousClass1p4(this);
    public final AnonymousClass34Q A04;
    public final AnonymousClass350 A05;
    public final UserSession A06;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        AnonymousClass3AM r5;
        AnonymousClass34R r11;
        AnonymousClass34R r8;
        View view2 = view;
        int A032 = C14030oh.A03(334316289);
        AnonymousClass38I r6 = (AnonymousClass38I) obj;
        C24970Dd5 dd5 = (C24970Dd5) obj2;
        if (view == null) {
            Context context = this.A01;
            view2 = LayoutInflater.from(context).inflate(R.layout.location_page_single_section_rounded_corner_linear_layout, viewGroup, false);
            ViewGroup A0J = C18220wO.A0J(view2, R.id.container);
            AnonymousClass3AM r1 = null;
            if (r6.A00 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setTag(new AnonymousClass34R(linearLayout));
                A0J.addView(linearLayout);
                r8 = (AnonymousClass34R) linearLayout.getTag();
            } else {
                r8 = null;
            }
            if (r6.A01 != null) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.location_page_business_row, A0J, false);
                inflate.setTag(new AnonymousClass3AM(C18180wK.A0G(inflate, R.id.username), C18180wK.A0G(inflate, R.id.view_profile), (CircularImageView) inflate.findViewById(R.id.profile_imageview)));
                A0J.addView(inflate);
                r1 = (AnonymousClass3AM) inflate.getTag();
            }
            view2.setTag(new AnonymousClass3AN(A0J, r8, r1));
        }
        Context context2 = this.A01;
        AnonymousClass3AN r52 = (AnonymousClass3AN) view2.getTag();
        if (dd5 == null) {
            i2 = 0;
        } else {
            i2 = dd5.A00;
        }
        C57993Dj r9 = this.A03;
        C11630kW r82 = this.A02;
        UserSession userSession = this.A06;
        AnonymousClass350 r4 = this.A05;
        AnonymousClass34Q r10 = this.A04;
        AnonymousClass34S r12 = r6.A00;
        if (!(r12 == null || (r11 = r52.A01) == null)) {
            DAA.A00(r82, r9, r10, r11, r12, userSession, i2);
        }
        User user = r6.A01;
        if (!(user == null || (r5 = r52.A02) == null)) {
            CircularImageView circularImageView = r5.A02;
            if (circularImageView != null) {
                C18220wO.A1L(r82, circularImageView, user);
            }
            TextView textView = r5.A00;
            if (textView != null) {
                textView.setText(user.Ak2());
            }
            TextView textView2 = r5.A01;
            if (textView2 != null) {
                C18200wM.A17(context2.getResources(), textView2, 2131837947);
            }
            AnonymousClass0wJ.A16(textView2, 484, r4);
            AnonymousClass0wJ.A16(circularImageView, 485, r4);
            AnonymousClass0wJ.A16(textView, 486, r4);
        }
        C14030oh.A0A(-1259500212, A032);
        return view2;
    }

    public AnonymousClass1h0(Context context, C11630kW r3, AnonymousClass34Q r4, C558734x r5, AnonymousClass350 r6, UserSession userSession) {
        this.A01 = context;
        this.A04 = r4;
        this.A02 = r3;
        this.A06 = userSession;
        this.A05 = r6;
        this.A00 = r5;
    }
}
