package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.redex.IDxCSpanShape5S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.reels.dashboard.fragment.ReelDashboardFragment;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.1gg  reason: invalid class name and case insensitive filesystem */
public final class C23971gg extends AnonymousClass436 {
    public final ReelDashboardFragment A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        C57503Bh A002 = C25177DhI.A00((BKH) obj);
        A002.getClass();
        String str = A002.A03;
        str.getClass();
        return str.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C57503Bh A002 = C25177DhI.A00((BKH) obj);
        A002.getClass();
        String str = A002.A02;
        str.getClass();
        return str.hashCode();
    }

    public C23971gg(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        int A03 = C14030oh.A03(-2089600162);
        C57293Am r7 = (C57293Am) C18210wN.A0X(view);
        C57503Bh A002 = C25177DhI.A00((BKH) obj);
        A002.getClass();
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2 = A002.A00;
        ktCSuperShape0S1200000_I2.getClass();
        boolean z = !C09560fi.A03((List) ktCSuperShape0S1200000_I2.A00);
        C19577Ayd ayd = r7.A02;
        if (z) {
            ayd.A09(0);
            View A08 = ayd.A08();
            AnonymousClass0wJ.A0L(A08, R.id.fundraiser_results_summary_amount_raised_text).setText(A002.A02);
            AnonymousClass0wJ.A17(A08.requireViewById(R.id.fundraiser_results_summary_amount_raised_disclaimer_icon), 68, this);
            textView = r7.A01;
            C09860go.A0V(textView, 0);
        } else {
            ayd.A09(8);
            textView = r7.A01;
            C09860go.A0V(textView, C18210wN.A02(r7.A00));
        }
        User user = A002.A01;
        user.getClass();
        String BK7 = user.BK7();
        Context context = r7.A00;
        int i2 = 2131834182;
        if (z) {
            i2 = 2131834181;
        }
        AnonymousClass3Zw.A03(new IDxCSpanShape5S0200000_1_I2(5, user, this), textView, BK7, AnonymousClass0wJ.A0l(context, BK7, i2));
        C14030oh.A0A(1412637494, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(228837986);
        View A0H = AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.reel_dashboard_fundraiser_results_summary);
        A0H.setTag(new C57293Am(A0H));
        C14030oh.A0A(-1030161487, A03);
        return A0H;
    }
}
