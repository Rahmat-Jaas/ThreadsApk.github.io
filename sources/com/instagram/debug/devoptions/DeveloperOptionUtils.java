package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.C04220Ms;
import X.C63273h9;
import X.C63613hu;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.helper.DevOptionsHelper;
import com.instagram.debug.devoptions.section.intf.DeveloperOptionsSection;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DeveloperOptionUtils {
    public static final Companion Companion = new Companion();
    public static final C63273h9 SEPARATOR = new C63273h9();

    public final class Companion {
        public final void addSection(List list, DeveloperOptionsSection developerOptionsSection, UserSession userSession, FragmentActivity fragmentActivity, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AnonymousClass0wJ.A1N(list, developerOptionsSection);
            AnonymousClass0wJ.A1Q(userSession, fragmentActivity);
            C04220Ms.A0B(onPinnedDevOptionItemAdded, 4);
            if (developerOptionsSection.isEnabled(userSession)) {
                Integer titleRes = developerOptionsSection.getTitleRes();
                if (titleRes != null) {
                    C63613hu.A04(list, titleRes.intValue());
                }
                for (Object next : developerOptionsSection.getItems(userSession, fragmentActivity)) {
                    if (next instanceof AnonymousClass4MA) {
                        DevOptionsHelper.Companion.addLongPressToPin((AnonymousClass4MA) next, userSession, onPinnedDevOptionItemAdded);
                    }
                    list.add(next);
                }
                list.add(DeveloperOptionUtils.SEPARATOR);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
