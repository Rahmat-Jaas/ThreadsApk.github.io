package X;

import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.realtimeclient.RealtimeSubscription;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;

/* renamed from: X.5j9  reason: invalid class name */
public final class AnonymousClass5j9 extends AnonymousClass567 implements C143648h5 {
    public ContextThemeWrapper A00;

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Object obj = requireArguments().get("ECP_CONTAINER_FRAGMENT_TYPE");
        String A0h = C86164wN.A0h(obj);
        String str = (String) obj;
        Bundle A06 = C18180wK.A06();
        if (C04220Ms.A0I(str, "web_view_fragment")) {
            Object obj2 = requireArguments().get("ECP_PAYPAL_BA_LOADING_URL");
            C04220Ms.A0C(obj2, A0h);
            Object obj3 = requireArguments().get("ECP_PAYPAL_BA_ALLOWED_INTERCEPT_URL");
            C04220Ms.A0C(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            A06.putString("WEB_VIEW_URL", (String) obj2);
            A06.putStringArray("WEB_VIEW_ALLOWED_INTERCEPT_URLS", (String[]) obj3);
            A06.putBoolean("WEB_VIEW_FULL_SCREEN", true);
            Fragment A062 = AnonymousClass7Kz.A05().A06(A06, str);
            AnonymousClass01J A0R = C86124wJ.A0R(this);
            A062.setTargetFragment((Fragment) null, 1111);
            A0R.A0G(A062, "CHILD_FRAGMENT_TAG", R.id.ecp_container_view);
            A0R.A00();
            return;
        }
        throw C18240wQ.A0j();
    }

    public final boolean Bzy(Bundle bundle, int i, boolean z) {
        String str;
        if (i != 1111) {
            return false;
        }
        Fragment A0O = getChildFragmentManager().A0O("CHILD_FRAGMENT_TAG");
        if (A0O != null) {
            AnonymousClass01J A0R = C86124wJ.A0R(this);
            A0R.A04(A0O);
            A0R.A01();
        }
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString("WEB_VIEW_RESULT_INTERCEPT_URL");
            str2 = bundle.getString("WEB_VIEW_RESULT_ERROR_MESSAGE_FOR_LOGGING");
        } else {
            str = null;
        }
        Object obj = requireArguments().get("ECP_CONTAINER_FRAGMENT_TYPE");
        C18240wQ.A1I(obj);
        if (C04220Ms.A0I(obj, "web_view_fragment")) {
            Bundle A06 = C18180wK.A06();
            String string = requireArguments().getString("ECP_CONTENT_FRAGMENT_REQUEST_KEY");
            if (string != null) {
                int i2 = 0;
                if ((str2 != null && str2.length() != 0) || str == null || str.length() == 0) {
                    A06.putString("PAYPAL_BA_LINKING_ERROR_MESSAGE_FOR_LOGGING", str2);
                    i2 = 1;
                } else {
                    UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(str);
                    if (C04220Ms.A0I(urlQuerySanitizer.getValue("cancel"), RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                        i2 = 2;
                    } else {
                        String value = urlQuerySanitizer.getValue("ba_token");
                        if (value != null) {
                            A06.putString("PAYPAL_BA_TOKEN", value);
                        }
                        i2 = 1;
                    }
                }
                A06.putInt("PAYPAL_BA_LINKING_RESULT_STATUS", i2);
                C010604w.A00(A06, this, string);
                Fragment fragment = this.mParentFragment;
                C04220Ms.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.BottomSheetDialogController");
                ((C147048nI) fragment).Brt();
                return false;
            }
            throw AnonymousClass0wJ.A0b();
        }
        throw C18240wQ.A0j();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1022478174);
        super.onCreate(bundle);
        C14030oh.A09(1915641427, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(857650437);
        ContextThemeWrapper A002 = AnonymousClass567.A00(this, layoutInflater);
        this.A00 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_container_fragment, viewGroup, false);
        C14030oh.A09(451865946, A02);
        return inflate;
    }

    public final void onResume() {
        int A02 = C14030oh.A02(1507775862);
        super.onResume();
        String string = requireArguments().getString("ECP_CONTAINER_FRAGMENT_TITLE");
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            C04220Ms.A0E("viewContext");
            throw null;
        }
        Object obj = requireArguments().get("ECP_CONTAINER_FRAGMENT_NAV_BAR_STYLE");
        if (obj != null) {
            AnonymousClass3JK.A00(contextThemeWrapper, this, (AnonymousClass69R) obj, string, (String) null, new KtLambdaShape26S0100000_I2_6(this, 15), (AnonymousClass0ZU) null, 464, false);
            C14030oh.A09(-729183365, A02);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
