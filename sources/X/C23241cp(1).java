package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.1cp  reason: invalid class name and case insensitive filesystem */
public final class C23241cp extends C34640IcN implements C144608im {
    public static final String __redex_internal_original_name = "TurnOnNotificationsFragment";
    public UserSession A00;

    public final void CAi(Map map) {
        boolean z;
        SharedPreferences.Editor A0B;
        String str;
        C04220Ms.A0B(map, 0);
        AnonymousClass2S5.A00(this);
        C08350dD A002 = C08360dF.A00();
        Object obj = map.get("android.permission.POST_NOTIFICATIONS");
        if (obj == C971568d.GRANTED) {
            z = true;
            A0B = C18220wO.A0B(A002);
            str = "preference_has_allowed_push_system_dialog";
        } else if (obj == C971568d.DENIED) {
            z = true;
            A0B = C18220wO.A0B(A002);
            str = "preference_has_denied_push_system_dialog";
        } else {
            return;
        }
        AnonymousClass0wJ.A13(A0B, str, z);
    }

    public final String getModuleName() {
        return "turn_on_notifications_nux";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C18250wR.A0l();
        throw null;
    }

    public static final void A00(C23241cp r4) {
        C82844qM r1;
        Context context = r4.getContext();
        if (context == null) {
            FragmentActivity requireActivity = r4.requireActivity();
            if ((requireActivity instanceof C82844qM) && (r1 = (C82844qM) requireActivity) != null) {
                r1.Ben(0);
            }
        } else if (!C18180wK.A1W(context.checkSelfPermission("android.permission.POST_NOTIFICATIONS"))) {
            AnonymousClass7K8.A02(r4.getActivity(), r4, new String[]{"android.permission.POST_NOTIFICATIONS"});
            AnonymousClass0wJ.A14(C18200wM.A0C(), "preference_push_permission_impression_count", 0);
        } else {
            AnonymousClass2S5.A00(r4);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1251221666);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        C14030oh.A09(1509230398, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(886957189);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nux_turn_on_notifications, viewGroup, false);
        View A0J = AnonymousClass0wJ.A0J(inflate, R.id.turn_on_button);
        View A0K = AnonymousClass0wJ.A0K(inflate, R.id.skip_button);
        A0J.setEnabled(true);
        AnonymousClass0wJ.A17(A0J, 26, this);
        AnonymousClass0wJ.A17(A0K, 27, this);
        AnonymousClass0wJ.A13(C18200wM.A0C().edit(), "preference_has_asked_push_permission_in_nux", true);
        AnonymousClass0wJ.A13(C18200wM.A0C().edit(), "preference_has_asked_push_permission_recently_in_nux", true);
        C14030oh.A09(2123481375, A02);
        return inflate;
    }
}
