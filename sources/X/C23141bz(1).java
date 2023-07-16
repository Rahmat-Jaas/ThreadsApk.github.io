package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.1bz  reason: invalid class name and case insensitive filesystem */
public final class C23141bz extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "LearnProfessionalToolsFragment";
    public FragmentActivity A00;
    public E2V A01;
    public C34640IcN A02;
    public BusinessFlowAnalyticsLogger A03;
    public AnonymousClass3V5 A04;
    public UserSession A05;
    public String A06;
    public boolean A07;
    public boolean A08 = true;
    public C84654td A09;
    public final C82394pY A0A = C18220wO.A0P(this, 15);

    public final String getModuleName() {
        return "learn_professional_tools_fragment";
    }

    public static void A01(C23141bz r8, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r8.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("learn_professional_tools", r8.A06, str, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.setTitle("");
        r3.Crj(C18190wL.A0H(this, 153), R.drawable.instagram_check_pano_outline_24);
        C25764Drc A0K = C18190wL.A0K();
        A0K.A0C = C18190wL.A0H(this, 154);
        A0K.A04 = 2131824015;
        AnonymousClass4u2.A03(A0K, r3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return this.A05;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A08 || (businessFlowAnalyticsLogger = this.A03) == null) {
            return false;
        }
        businessFlowAnalyticsLogger.BbZ(new C37408JrQ("learn_professional_tools", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public static void A00(View.OnClickListener onClickListener, View view, int i, int i2, int i3, int i4) {
        C18200wM.A0J(view, R.id.education_icon).setImageResource(i);
        AnonymousClass0wJ.A0L(view, R.id.education_title).setText(i2);
        AnonymousClass0wJ.A0L(view, R.id.education_body).setText(i3);
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.education_cta);
        A0L.setText(i4);
        A0L.setOnClickListener(onClickListener);
        view.setVisibility(0);
    }

    public final void onAttach(Context context) {
        C84654td r1;
        super.onAttach(context);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof C84654td) {
            r1 = (C84654td) requireActivity;
        } else {
            r1 = null;
        }
        this.A09 = r1;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1288471162);
        super.onCreate(bundle);
        this.A05 = AnonymousClass0wJ.A0W(this);
        this.A02 = this;
        this.A00 = requireActivity();
        this.A06 = C18190wL.A0j(requireArguments(), "entry_point");
        this.A03 = C67293zJ.A00(this.A09, this, this.A05);
        C38040KHr.A01.A03(this.A0A, AnonymousClass0P9.class);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdt(new C37408JrQ("learn_professional_tools", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        this.A04 = new AnonymousClass3V5(this, this.A05);
        this.A07 = C18240wQ.A1S(requireArguments(), "ARG_CHECKLIST_ITEM_COMPLETED");
        this.A01 = C18230wP.A0R(this);
        C14030oh.A09(693508883, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(2067503940);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.learn_professional_tools_fragment);
        C14030oh.A09(256592803, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-311879858);
        super.onDestroy();
        C14030oh.A09(-1054788520, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1645962728);
        super.onDestroyView();
        C38040KHr.A01.A04(this.A0A, AnonymousClass0P9.class);
        C14030oh.A09(1915593613, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        IgdsHeadline A0S = C18240wQ.A0S(view, R.id.onboarding_checklist_headline);
        A0S.setHeadline(2131829582);
        A0S.setBody(2131829581);
        A0S.setVisibility(0);
        A00(C18190wL.A0H(this, 149), view.requireViewById(R.id.insights_education_unit), R.drawable.instagram_insights_pano_outline_24, 2131829080, 2131829078, 2131829079);
        A00(C18190wL.A0H(this, 150), view.requireViewById(R.id.promote_education_unit), R.drawable.instagram_promote_pano_outline_24, 2131833443, 2131833441, 2131833442);
        UserSession userSession = this.A05;
        C04620Ok r1 = C06810aP.A01;
        if (C18200wM.A1X(userSession, r1)) {
            A00(C18190wL.A0H(this, 151), view.requireViewById(R.id.activity_status_education_unit), R.drawable.instagram_activity_status_pano_outline_24, 2131827929, 2131820975, 2131820976);
        }
        if (C18200wM.A1X(this.A05, r1)) {
            KK1.A00(this.A05).A06();
            A00(C18190wL.A0H(this, 152), view.requireViewById(R.id.faq_education_unit), R.drawable.instagram_app_imessage_pano_outline_24, 2131827176, 2131827174, 2131827175);
        }
        super.onViewCreated(view, bundle);
    }
}
