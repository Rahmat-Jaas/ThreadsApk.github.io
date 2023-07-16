package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.forker.Process;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1gn  reason: invalid class name and case insensitive filesystem */
public final class C24041gn extends AnonymousClass436 {
    public final AnonymousClass1k1 A00;
    public final Context A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return 0;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C24041gn(Context context, AnonymousClass1k1 r2, UserSession userSession) {
        this.A01 = context;
        this.A00 = r2;
        this.A02 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass25W r2;
        TextView textView;
        int B10;
        View view2;
        AnonymousClass2AP r5;
        int A03 = C14030oh.A03(1502300453);
        C57813Co r7 = (C57813Co) C18210wN.A0X(view);
        C84354t0 r13 = (C84354t0) obj;
        if (r13 instanceof ELY) {
            r2 = AnonymousClass25W.A01;
        } else if (r13 instanceof ELX) {
            r2 = AnonymousClass25W.A02;
        } else {
            throw C18190wL.A0a("Unsupported sticky notification type");
        }
        C18200wM.A1E(r7.A00, this, r2, r13, 47);
        ImageView imageView = r7.A01;
        Context context = this.A01;
        UserSession userSession = this.A02;
        imageView.setImageDrawable(r2.A00(context, userSession));
        imageView.setColorFilter(C63393hP.A00(C121907Is.A00(context, R.attr.glyphColorPrimary)));
        r7.A05.setText(r2.A01(context, r13, userSession));
        if (r13.BNt()) {
            r7.A02.setVisibility(0);
            view2 = r7.A03;
        } else {
            if (r13.AxJ() != 0) {
                textView = r7.A03;
                textView.setVisibility(0);
                B10 = r13.AxJ();
            } else {
                int B102 = r13.B10();
                textView = r7.A03;
                if (B102 != 0) {
                    textView.setVisibility(0);
                    B10 = r13.B10();
                } else {
                    textView.setVisibility(8);
                    view2 = r7.A02;
                }
            }
            textView.setText(String.valueOf(B10));
            view2 = r7.A02;
        }
        view2.setVisibility(8);
        r2.A02(r7.A04, r13, userSession);
        AnonymousClass1k1 r6 = this.A00;
        if (r6.A05.add(r2.toString())) {
            if (AnonymousClass318.A00[r2.ordinal()] != 1) {
                r5 = AnonymousClass2AP.A0A;
            } else {
                r5 = AnonymousClass2AP.A09;
                if (r13.BNt()) {
                    C57433Ba r22 = ((ELY) r13).A03;
                    r22.getClass();
                    C37062Jjm A002 = C34462Jq.A00(r6.A04);
                    String A003 = AnonymousClass2RT.A00(r22.A00);
                    String str = r22.A03;
                    C04220Ms.A0B(A003, 1);
                    USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A002.A00, "payments_view_component"), 2489);
                    A0I.A0T("component", "sticky_activity_feed_notification");
                    A0I.A0T("error_identifier", A003);
                    AnonymousClass14Q r1 = new AnonymousClass14Q();
                    r1.A0A("landing_url", str);
                    A0I.A0P(r1, "configurations");
                    A0I.Bb4();
                }
            }
            int B103 = r13.B10();
            C684944a A004 = AnonymousClass3NS.A00(r6.A04);
            AnonymousClass17J r23 = new AnonymousClass17J(r5, B103);
            A004.A02(AnonymousClass25P.LIST_ITEM, AnonymousClass25R.ACTIVITY_FEED, r23);
        }
        C14030oh.A0A(-1254506417, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-396368152);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A01), viewGroup, R.layout.sticky_notification);
        A0H.setTag(new C57813Co(A0H));
        C14030oh.A0A(-1325416075, A03);
        return A0H;
    }
}
