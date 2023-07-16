package com.instagram.debug.devoptions;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass1v4;
import X.AnonymousClass29W;
import X.AnonymousClass2AC;
import X.AnonymousClass2AD;
import X.AnonymousClass3TG;
import X.AnonymousClass3TM;
import X.AnonymousClass3TQ;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18240wQ;
import X.C18250wR;
import X.C23411dm;
import X.C23949D2u;
import X.C25828Dsm;
import X.C58383Fh;
import X.C63273h9;
import X.C697049r;
import X.C80644m9;
import X.C82034oy;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public final class CrosspostUpsellLauncherFragment extends C23411dm implements C82034oy {
    public C10300i6 session;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825102);
    }

    public String getModuleName() {
        return "crosspost_upsell_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        resetItems();
    }

    public void setSession(C10300i6 r2) {
        C04220Ms.A0B(r2, 0);
        this.session = r2;
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    /* access modifiers changed from: private */
    public final void launchReelsCcp() {
        new C58383Fh(AnonymousClass0wJ.A0X(this.userSession$delegate)).A00(requireActivity(), new AnonymousClass3TG(AnonymousClass2AC.A0G, AnonymousClass2AD.A03, C23949D2u.GALLERY, (String) null, "crosspost_upsell_settings", (String) null, 0));
    }

    /* access modifiers changed from: private */
    public final void launchSingleContentFeed() {
        CrosspostUpsellLauncherFragment$launchSingleContentFeed$listener$1 crosspostUpsellLauncherFragment$launchSingleContentFeed$listener$1 = CrosspostUpsellLauncherFragment$launchSingleContentFeed$listener$1.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        AnonymousClass2AC r2 = AnonymousClass2AC.A05;
        AnonymousClass0wJ.A1O(A0X, r2);
        C04220Ms.A0B(crosspostUpsellLauncherFragment$launchSingleContentFeed$listener$1, 3);
        C697049r.A01(requireActivity, r2, A0X, crosspostUpsellLauncherFragment$launchSingleContentFeed$listener$1, false);
    }

    /* access modifiers changed from: private */
    public final void launchSingleContentStories() {
        CrosspostUpsellLauncherFragment$launchSingleContentStories$listener$1 crosspostUpsellLauncherFragment$launchSingleContentStories$listener$1 = CrosspostUpsellLauncherFragment$launchSingleContentStories$listener$1.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        AnonymousClass2AC r2 = AnonymousClass2AC.A0P;
        AnonymousClass0wJ.A1O(A0X, r2);
        C04220Ms.A0B(crosspostUpsellLauncherFragment$launchSingleContentStories$listener$1, 3);
        C697049r.A01(requireActivity, r2, A0X, crosspostUpsellLauncherFragment$launchSingleContentStories$listener$1, false);
    }

    /* access modifiers changed from: private */
    public final void launchUnifiedOnboarding() {
        CrosspostUpsellLauncherFragment$launchUnifiedOnboarding$listener$1 crosspostUpsellLauncherFragment$launchUnifiedOnboarding$listener$1 = CrosspostUpsellLauncherFragment$launchUnifiedOnboarding$listener$1.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        AnonymousClass2AC r1 = AnonymousClass2AC.A05;
        C04220Ms.A0B(A0X, 1);
        AnonymousClass0wJ.A1Q(r1, crosspostUpsellLauncherFragment$launchUnifiedOnboarding$listener$1);
        C697049r.A01(requireActivity, r1, A0X, crosspostUpsellLauncherFragment$launchUnifiedOnboarding$listener$1, true);
    }

    /* access modifiers changed from: private */
    public final void launchUserMigration(boolean z, boolean z2) {
        AnonymousClass2AC r3;
        CrosspostUpsellLauncherFragment$launchUserMigration$listener$1 crosspostUpsellLauncherFragment$launchUserMigration$listener$1 = CrosspostUpsellLauncherFragment$launchUserMigration$listener$1.INSTANCE;
        boolean z3 = z2;
        if (z2) {
            r3 = AnonymousClass2AC.A0P;
        } else {
            r3 = AnonymousClass2AC.A05;
        }
        AnonymousClass1v4.A0A.A03(requireActivity(), r3, AnonymousClass0wJ.A0X(this.userSession$delegate), crosspostUpsellLauncherFragment$launchUserMigration$listener$1, z3, z);
    }

    public C10300i6 getSession() {
        C10300i6 r0 = this.session;
        if (r0 != null) {
            return r0;
        }
        C18250wR.A0l();
        throw null;
    }

    /* access modifiers changed from: private */
    public final void launchAfterShareFeed() {
        FragmentActivity requireActivity = requireActivity();
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        AnonymousClass2AD r7 = AnonymousClass2AD.A0L;
        AnonymousClass3TQ r4 = new AnonymousClass3TQ(requireActivity, AnonymousClass2AC.A02, r7, new CrosspostUpsellLauncherFragment$launchAfterShareFeed$1(this), A0X, AnonymousClass006.A1L);
        Activity activity = r4.A03;
        C25828Dsm A0W = C18190wL.A0W(activity);
        A0W.A02 = r4.A02;
        A0W.A0p(r4.A00);
        C18200wM.A1O(A0W);
        A0W.A0c(C18220wO.A0O(r4, 31), r4.A01);
        A0W.A0a(C18220wO.A0O(r4, 32), activity.getResources().getString(2131831869));
        AnonymousClass0wJ.A1K(A0W);
        AnonymousClass3TQ.A00(AnonymousClass29W.VIEW, r4);
    }

    /* access modifiers changed from: private */
    public final void launchAfterShareStories() {
        FragmentActivity requireActivity = requireActivity();
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        AnonymousClass3TM r5 = new AnonymousClass3TM(requireActivity, AnonymousClass2AC.A02, AnonymousClass2AD.A0M, new CrosspostUpsellLauncherFragment$launchAfterShareStories$1(this), A0X);
        Activity activity = r5.A04;
        C25828Dsm A0W = C18190wL.A0W(activity);
        A0W.A02 = r5.A03;
        A0W.A0p(r5.A01);
        A0W.A0q(true);
        A0W.A0r(true);
        A0W.A0c(C18220wO.A0O(r5, 33), r5.A02);
        A0W.A0a(C18220wO.A0O(r5, 34), activity.getResources().getString(2131831869));
        C18240wQ.A1C(A0W, r5, 1);
        AnonymousClass0wJ.A1K(A0W);
        AnonymousClass3TM.A00(AnonymousClass29W.VIEW, r5);
    }

    private final void resetItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63273h9.A02(A0v);
        AnonymousClass4MA.A03(new CrosspostUpsellLauncherFragment$resetItems$1(this), A0v, 2131825050);
        AnonymousClass4MA.A03(new CrosspostUpsellLauncherFragment$resetItems$2(this), A0v, 2131825074);
        AnonymousClass4MA.A03(new CrosspostUpsellLauncherFragment$resetItems$3(this), A0v, 2131825076);
        AnonymousClass4MA.A03(new CrosspostUpsellLauncherFragment$resetItems$4(this), A0v, 2131825078);
        AnonymousClass4MA.A03(new CrosspostUpsellLauncherFragment$resetItems$5(this), A0v, 2131825077);
        AnonymousClass4MA.A03(new CrosspostUpsellLauncherFragment$resetItems$6(this), A0v, 2131825079);
        AnonymousClass4MA.A03(new CrosspostUpsellLauncherFragment$resetItems$7(this), A0v, 2131825075);
        AnonymousClass4MA.A03(new CrosspostUpsellLauncherFragment$resetItems$8(this), A0v, 2131825072);
        AnonymousClass4MA.A03(new CrosspostUpsellLauncherFragment$resetItems$9(this), A0v, 2131825073);
        AnonymousClass4MA.A03(new CrosspostUpsellLauncherFragment$resetItems$10(this), A0v, 2131825052);
        setItems(A0v);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(766404285);
        super.onCreate(bundle);
        setSession(C18200wM.A0V(this));
        C14030oh.A09(989203580, A02);
    }
}
