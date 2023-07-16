package com.instagram.debug.devoptions.igns;

import X.AnonymousClass0wJ;
import X.AnonymousClass4UR;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C18180wK;
import X.C18210wN;
import X.C34640IcN;
import X.C82034oy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class InternalIgNotificationDetailsFragment extends C34640IcN implements C82034oy {
    public static final Companion Companion = new Companion();
    public static final String IG_NOTIFICATION_DETAILS_STRING = "IG_NOTIFICATION_DETAILS_STRING";
    public static final String MODULE_NAME = "internal_notification_details";
    public final C04530Oa userSession$delegate = new AnonymousClass4UR(new InternalIgNotificationDetailsFragment$userSession$2(this));

    public static final InternalIgNotificationDetailsFragment newInstance(String str) {
        return Companion.newInstance(str);
    }

    public String getModuleName() {
        return MODULE_NAME;
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public final class Companion {
        public final InternalIgNotificationDetailsFragment newInstance(String str) {
            C04220Ms.A0B(str, 0);
            InternalIgNotificationDetailsFragment internalIgNotificationDetailsFragment = new InternalIgNotificationDetailsFragment();
            Bundle A06 = C18180wK.A06();
            A06.putString(InternalIgNotificationDetailsFragment.IG_NOTIFICATION_DETAILS_STRING, str);
            internalIgNotificationDetailsFragment.setArguments(A06);
            return internalIgNotificationDetailsFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A05(r2);
        AnonymousClass4u2.A02(this, r2, 2131828493);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-989305001);
        C04220Ms.A0B(layoutInflater, 0);
        String A0b = C18210wN.A0b(requireArguments(), IG_NOTIFICATION_DETAILS_STRING, InternalIgNotificationConstantsKt.NOT_SET);
        View inflate = layoutInflater.inflate(R.layout.internal_notification_details_fragment, viewGroup, false);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.ig_notification_details);
        A0L.setText(A0b);
        A0L.setOnLongClickListener(new InternalIgNotificationDetailsFragment$onCreateView$1$1(inflate, A0b));
        C14030oh.A09(-335418124, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
