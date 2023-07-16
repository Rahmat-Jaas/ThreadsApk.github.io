package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112;

/* renamed from: X.1gc  reason: invalid class name and case insensitive filesystem */
public final class C23931gc extends AnonymousClass436 {
    public final Activity A00;
    public final C17713AKr A01;
    public final AnonymousClass3C8 A02;
    public final C13330nS A03;
    public final UserSession A04;
    public final AnonymousClass36V A05;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r7, Object obj, Object obj2) {
        BKU bku = (BKU) obj;
        C04220Ms.A0B(bku, 1);
        if (r7 != null) {
            r7.A5K(0);
        }
        AnonymousClass3C8 r5 = this.A02;
        Integer A0d = C18220wO.A0d();
        BKN bkn = bku.A0f;
        C37021Jix A002 = C37284Jnx.A00(bku, A0d, AnonymousClass00U.A0L("fb_comment_thread_banner_impression_", bkn.A4Y));
        A002.A01(r5.A00);
        r5.A03.A80(A002.A02(), AnonymousClass00U.A0L("fb_comment_thread_banner_impression_", bkn.A4Y));
    }

    public C23931gc(Activity activity, C17713AKr aKr, AnonymousClass3C8 r5, C11630kW r6, UserSession userSession) {
        this.A00 = activity;
        this.A04 = userSession;
        this.A02 = r5;
        this.A01 = aKr;
        this.A03 = C18230wP.A0U(r6, userSession);
        this.A05 = (AnonymousClass36V) userSession.A01(AnonymousClass36V.class, new KtLambdaShape132S0100000_I2_112(userSession, 37));
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A032 = C14030oh.A03(-775960221);
        AnonymousClass0wJ.A1O(view, obj);
        BKU bku = (BKU) obj;
        View A0K = AnonymousClass0wJ.A0K(view, R.id.comment_composer_fb_feedback_facebook_icon);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A04, 36316611367668966L)) {
            A0K.setVisibility(0);
        } else {
            A0K.setVisibility(8);
        }
        View A0J = AnonymousClass0wJ.A0J(view, R.id.comment_composer_fb_feedback_banner_container);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.comment_composer_fb_feedback_banner_title);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view, R.id.comment_composer_fb_feedback_banner_description);
        TextView textView3 = (TextView) AnonymousClass0wJ.A0J(view, R.id.comment_composer_fb_feedback_banner_count);
        C566237x r0 = bku.A0e.A06;
        if (r0 != null) {
            i2 = r0.A00;
        } else {
            i2 = 0;
        }
        Activity activity = this.A00;
        String A0m = AnonymousClass0wJ.A0m(activity.getResources(), i2, R.plurals.comments_from_facebook_title);
        C04220Ms.A06(A0m);
        textView.setText(A0m);
        int i3 = 2131824191;
        if (this.A05.A00.getBoolean("has_clicked_comments_from_fb_cta", false)) {
            i3 = 2131824192;
        }
        C18200wM.A15(activity, textView2, i3);
        textView3.setText(String.valueOf(i2));
        AnonymousClass0wJ.A18(A0J, 55, this, bku);
        A0J.setContentDescription(A0m);
        C18210wN.A0y(A0J);
        AnonymousClass3C8 r3 = this.A02;
        C37284Jnx BLY = r3.A03.BLY(AnonymousClass00U.A0L("fb_comment_thread_banner_impression_", bku.A0f.A4Y));
        C04220Ms.A06(BLY);
        r3.A02.A03(view, BLY);
        C14030oh.A0A(-986373662, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = C14030oh.A03(1456280280);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.comment_composer_fb_feedback_banner);
        C04220Ms.A06(A0H);
        C14030oh.A0A(469512782, A032);
        return A0H;
    }
}
