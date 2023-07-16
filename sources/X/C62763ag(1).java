package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCListenerShape280S0200000_1_I2;
import com.facebook.redex.IDxDListenerShape185S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* renamed from: X.3ag  reason: invalid class name and case insensitive filesystem */
public final class C62763ag {
    public int A00 = -2;
    public View A01;
    public C37383Jqm A02;
    public final C58963Iu A03;
    public final C23291cu A04;

    public static void A00(Fragment fragment, C58963Iu r3) {
        new C62763ag(r3).A02(fragment.requireActivity());
    }

    public static void A01(C62763ag r7) {
        TextView textView;
        GradientSpinnerAvatarView gradientSpinnerAvatarView;
        IgImageView A0M;
        C58963Iu r5 = r7.A03;
        View view = r5.A00;
        if (view != null) {
            view.setOnClickListener(C18200wM.A0R(view, r7, 118));
        }
        C63613hu r6 = r5.A03;
        if (view != null) {
            C23291cu r2 = r7.A04;
            if (r2.A03) {
                ViewGroup A0J = C18220wO.A0J(r2.A00, R.id.custom_header_view);
                A0J.addView(view);
                A0J.setVisibility(0);
                ((ViewStub) r2.A00.requireViewById(R.id.action_sheet_nav_bar_divider)).inflate();
            }
        } else if (r6 != null) {
            C23291cu r4 = r7.A04;
            if (r4.A03) {
                ((ViewStub) r4.A00.requireViewById(R.id.action_sheet_simple_header)).inflate();
                TextView A0L = AnonymousClass0wJ.A0L(r4.A00, R.id.action_sheet_header_text_view);
                r4.A01 = A0L;
                AnonymousClass7JU.A01(A0L);
                TextView textView2 = null;
                if (C18210wN.A1U(r6.A0C)) {
                    textView = C18180wK.A0G(r4.A00, R.id.action_sheet_subheader_text_view);
                } else {
                    textView = null;
                }
                if (C18210wN.A1U(r6.A0B)) {
                    textView2 = C18180wK.A0G(r4.A00, R.id.action_sheet_header_meta_text_view);
                }
                r6.A06(r4.A01, textView, textView2);
                if (!(r6.A09 == null && r6.A08 == null)) {
                    r4.A00.requireViewById(R.id.action_sheet_header_picture).setVisibility(0);
                    if (!(r6.A09 == null || (A0M = C18250wR.A0M(r4.A00, R.id.action_sheet_header_picture_round)) == null)) {
                        ImageUrl imageUrl = r6.A09;
                        if (!AnonymousClass3WG.A02(imageUrl)) {
                            A0M.setUrl(imageUrl, r4);
                            A0M.setVisibility(0);
                        }
                    }
                    if (!(r6.A08 == null || (gradientSpinnerAvatarView = (GradientSpinnerAvatarView) r4.A00.requireViewById(R.id.avatar_view)) == null)) {
                        ImageUrl imageUrl2 = r6.A08;
                        if (!AnonymousClass3WG.A02(imageUrl2)) {
                            gradientSpinnerAvatarView.A09(imageUrl2, r4);
                            gradientSpinnerAvatarView.A05();
                            gradientSpinnerAvatarView.setVisibility(0);
                        }
                    }
                }
            }
        }
        C23291cu r0 = r7.A04;
        List list = r5.A05;
        AnonymousClass11A r1 = r0.A02;
        List list2 = r1.A01;
        list2.clear();
        list2.addAll(list);
        r1.notifyDataSetChanged();
    }

    public final void A02(Activity activity) {
        C37383Jqm.A00(activity, this.A04, this.A02);
        A01(this);
    }

    public final void A03(Context context) {
        C25745DrH A022 = C25745DrH.A00.A02(context);
        if (A022 != null) {
            C35189Ipf ipf = (C35189Ipf) A022;
            ipf.A0B = new C38334KWe(context, this, ipf.A0B);
            A022.A0C();
        }
    }

    public final void A04(Context context) {
        C37383Jqm.A00(context, this.A04, this.A02);
        A01(this);
    }

    public C62763ag(C58963Iu r4) {
        C37032Jj9 A0L = C18210wN.A0L(r4.A01);
        A0L.A0Y = r4.A04;
        A0L.A0I = r4.A02;
        A0L.A0K = new IDxCListenerShape280S0200000_1_I2(1, r4, this);
        A0L.A0J = new IDxDListenerShape185S0200000_1_I2(2, this, r4);
        this.A02 = A0L.A00();
        C23291cu r0 = new C23291cu();
        this.A04 = r0;
        r0.A02.A00 = new C70114Cn(this);
        this.A03 = r4;
    }

    public C62763ag(C58963Iu r3, C37383Jqm jqm) {
        this.A02 = jqm;
        C23291cu r0 = new C23291cu();
        this.A04 = r0;
        r0.A02.A00 = new C70124Co(this);
        this.A03 = r3;
    }
}
