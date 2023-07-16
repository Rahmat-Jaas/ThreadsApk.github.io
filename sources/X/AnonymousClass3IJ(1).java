package X;

import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3IJ  reason: invalid class name */
public final class AnonymousClass3IJ {
    public static boolean A09;
    public AnonymousClass23X A00;
    public String A01 = "";
    public String A02 = "";
    public List A03;
    public final BusinessFlowAnalyticsLogger A04;
    public final OnboardingCheckListFragment A05;
    public final AnonymousClass3V5 A06;
    public final UserSession A07;
    public final String A08;

    public AnonymousClass3IJ(BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, OnboardingCheckListFragment onboardingCheckListFragment, AnonymousClass3V5 r4, UserSession userSession, String str) {
        C04220Ms.A0B(userSession, 1);
        C18180wK.A1R(businessFlowAnalyticsLogger, str);
        this.A07 = userSession;
        this.A05 = onboardingCheckListFragment;
        this.A06 = r4;
        this.A04 = businessFlowAnalyticsLogger;
        this.A08 = str;
    }

    public final void A01(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A04;
        String str2 = str;
        if (str != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("onboarding_checklist", this.A08, str2, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final void A00() {
        View view;
        I2G i2g;
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        List<AnonymousClass3HW> list = this.A03;
        if (list == null) {
            list = AnonymousClass0ZV.A00;
        }
        for (AnonymousClass3HW r2 : list) {
            if ("complete".equals(r2.A03)) {
                builder2.add((Object) r2);
            } else {
                builder.add((Object) r2);
            }
        }
        ImmutableList build = builder.build();
        ImmutableList build2 = builder2.build();
        OnboardingCheckListFragment onboardingCheckListFragment = this.A05;
        AnonymousClass3I1 r3 = new AnonymousClass3I1();
        C1366783w it = build.iterator();
        while (it.hasNext()) {
            r3.A01(new AnonymousClass48A((AnonymousClass3HW) it.next()));
        }
        if (!build2.isEmpty()) {
            r3.A01(new AnonymousClass48B(onboardingCheckListFragment.getString(2131824233)));
            C1366783w it2 = build2.iterator();
            while (it2.hasNext()) {
                r3.A01(new AnonymousClass48A((AnonymousClass3HW) it2.next()));
            }
        }
        onboardingCheckListFragment.A06.A04(r3);
        int size = build2.size();
        int size2 = build2.size() + build.size();
        String A0k = C18220wO.A0k(onboardingCheckListFragment, Integer.valueOf(size), Integer.valueOf(size2), 2131824234);
        SpannableString spannableString = new SpannableString(AnonymousClass00U.A0V(A0k, " ", onboardingCheckListFragment.getString(2131836129)));
        AnonymousClass0h8.A03(spannableString, spannableString.toString(), onboardingCheckListFragment.getContext().getColor(R.color.igds_secondary_text));
        int i = size2 / 2;
        int i2 = R.color.igds_success;
        if (size <= i) {
            i2 = R.color.clips_gradient_redesign_color_1;
        }
        AnonymousClass0h8.A03(spannableString, A0k, onboardingCheckListFragment.getContext().getColor(i2));
        onboardingCheckListFragment.mStepsCompletedTextView.setText(spannableString);
        onboardingCheckListFragment.mHeadline.setHeadline((CharSequence) onboardingCheckListFragment.A04.A02);
        onboardingCheckListFragment.mHeadline.setBody(onboardingCheckListFragment.A04.A01, (View.OnClickListener) null);
        if (onboardingCheckListFragment.A0A) {
            onboardingCheckListFragment.A0A = false;
            C570839r r22 = onboardingCheckListFragment.A02;
            ImageView imageView = r22.A01;
            if (!(imageView == null || (i2g = r22.A02) == null || i2g.isPlaying())) {
                imageView.setVisibility(0);
                r22.A02.Cgd(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                r22.A02.CWi();
            }
        }
        if (build.isEmpty()) {
            onboardingCheckListFragment.mBusinessNavBar.setVisibility(0);
            C18210wN.A0z(onboardingCheckListFragment.mSkipOcContainer);
            return;
        }
        UserSession userSession = onboardingCheckListFragment.A07;
        C04220Ms.A0B(userSession, 0);
        if (C67333zN.A06(userSession, 36315357237086740L, true) && (view = onboardingCheckListFragment.mSkipOcContainer) != null) {
            view.setVisibility(0);
        }
    }

    public final void A02(List list) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            String str = ((AnonymousClass3HW) next).A05;
            C04220Ms.A06(str);
            if (AnonymousClass2K7.A00(str) != null) {
                A0v.add(next);
            }
        }
        this.A03 = A0v;
        A00();
    }
}
