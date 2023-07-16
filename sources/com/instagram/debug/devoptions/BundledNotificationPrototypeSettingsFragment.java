package com.instagram.debug.devoptions;

import X.AnonymousClass00U;
import X.AnonymousClass0RA;
import X.AnonymousClass0wJ;
import X.AnonymousClass4n8;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18250wR;
import X.C23411dm;
import X.C28161tl;
import X.C31155GhB;
import X.C61353Sw;
import X.C62563aI;
import X.C63293hC;
import X.C63613hu;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;
import com.instagram.debug.devoptions.api.BundledNotificationPrototypeApiHelper;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class BundledNotificationPrototypeSettingsFragment extends C23411dm implements C82034oy {
    public String checkedValue;
    public UserSession session;

    public enum ExperienceType {
        NONE("Off"),
        FLOODED("On");
        
        public final String experienceText;

        public final String getExperienceText() {
            return this.experienceText;
        }

        /* access modifiers changed from: public */
        ExperienceType(String str) {
            this.experienceText = str;
        }
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825541);
    }

    public String getModuleName() {
        return "bundled_notification_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        setItems(getItems((String) null));
    }

    public void setSession(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        this.session = userSession;
    }

    private final String getExperienceInformation() {
        return AnonymousClass00U.A0X(AnonymousClass4n8.A08(AnonymousClass00U.A0V("\n  ", getString(2131825542), "\n  \n  ")), getString(2131825544), getString(2131825546), 10);
    }

    public UserSession getSession() {
        UserSession userSession = this.session;
        if (userSession != null) {
            return userSession;
        }
        C18250wR.A0l();
        throw null;
    }

    private final C61353Sw createExperienceOptions(String str) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ExperienceType experienceType = ExperienceType.NONE;
        C62563aI.A01(experienceType.toString(), experienceType.getExperienceText(), A0v);
        ExperienceType experienceType2 = ExperienceType.FLOODED;
        C62563aI.A01(experienceType2.toString(), experienceType2.getExperienceText(), A0v);
        String A0h = C18200wM.A0h(C28161tl.A04(getSession()), "shopping_bundled_notification_prototype_experience");
        if (str == null) {
            str = A0h;
            if (A0h == null) {
                str = experienceType.toString();
            }
        }
        return new C61353Sw(new BundledNotificationPrototypeSettingsFragment$createExperienceOptions$1(this, A0v), str, A0v);
    }

    /* access modifiers changed from: private */
    public final List getItems(String str) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C61353Sw createExperienceOptions = createExperienceOptions(str);
        C63293hC.A02(getExperienceInformation(), A0v);
        C63613hu.A03(A0v, 2131825545);
        A0v.add(createExperienceOptions);
        return A0v;
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(2057102758);
        super.onCreate(bundle);
        setSession(C18180wK.A0W(this, AnonymousClass0RA.A0C));
        C31155GhB.A02(BundledNotificationPrototypeApiHelper.createBundledActivityFeedRetrieveExperienceTask(getSession(), new BundledNotificationPrototypeSettingsFragment$onCreate$1(this)));
        C14030oh.A09(-673055084, A02);
    }
}
