package com.instagram.debug.devoptions.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3Za;
import X.C18180wK;
import X.C32165H8c;
import X.C63873iU;
import X.C85814vo;
import X.H1T;
import com.instagram.service.session.UserSession;

public class BundledNotificationPrototypeApiHelper {
    public static C32165H8c createBundledActivityFeedPrototypeTask(UserSession userSession, String str, C63873iU r4) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("commerce/inbox/prototype/");
        A0N.A0O("experience", str);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0N, C85814vo.class, AnonymousClass3Za.class);
        A0T.A00 = r4;
        return A0T;
    }

    public static C32165H8c createBundledActivityFeedRetrieveExperienceTask(UserSession userSession, C63873iU r3) {
        H1T A0O = C18180wK.A0O(userSession);
        A0O.A0J("commerce/inbox/prototype/setting/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, BundledActivityFeedExperienceResponse.class, BundledActivityFeedExperienceResponse__JsonHelper.class);
        A0T.A00 = r3;
        return A0T;
    }
}
