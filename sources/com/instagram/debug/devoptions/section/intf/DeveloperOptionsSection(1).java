package com.instagram.debug.devoptions.section.intf;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.List;

public interface DeveloperOptionsSection {

    /* renamed from: com.instagram.debug.devoptions.section.intf.DeveloperOptionsSection$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Integer $default$getTitleRes(DeveloperOptionsSection developerOptionsSection) {
            return null;
        }

        public static boolean $default$isEnabled(DeveloperOptionsSection developerOptionsSection, UserSession userSession) {
            return true;
        }
    }

    List getItems(UserSession userSession, FragmentActivity fragmentActivity);

    Integer getTitleRes();

    boolean isEnabled(UserSession userSession);
}
