package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.56G  reason: invalid class name */
public final class AnonymousClass56G extends Fragment implements C143648h5, C143618h2 {
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Bzy(android.os.Bundle r9, int r10, boolean r11) {
        /*
            r8 = this;
            r7 = 0
            r0 = 1111(0x457, float:1.557E-42)
            if (r10 != r0) goto L_0x007e
            X.0m7 r1 = r8.getChildFragmentManager()
            java.lang.String r0 = "THREE_DS_WEBVIEW_FRAGMENT_TAG"
            androidx.fragment.app.Fragment r1 = r1.A0O(r0)
            if (r1 == 0) goto L_0x001b
            X.01J r0 = X.C86124wJ.A0R(r8)
            r0.A04(r1)
            r0.A01()
        L_0x001b:
            r6 = 0
            if (r9 == 0) goto L_0x0081
            java.lang.String r0 = "WEB_VIEW_RESULT_INTERCEPT_URL"
            java.lang.String r2 = r9.getString(r0)
            java.lang.String r0 = "WEB_VIEW_RESULT_ERROR_ENCOUNTERED"
            boolean r1 = r9.getBoolean(r0)
            if (r2 == 0) goto L_0x007f
            int r0 = r2.length()
            if (r0 == 0) goto L_0x007f
            android.net.UrlQuerySanitizer r5 = new android.net.UrlQuerySanitizer
            r5.<init>(r2)
        L_0x0037:
            if (r1 != 0) goto L_0x0081
            if (r5 == 0) goto L_0x0081
            java.lang.String r0 = "auth_result"
            java.lang.String r1 = r5.getValue(r0)
            java.lang.String r0 = "Success"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "step_up_complete_token"
            java.lang.String r4 = r5.getValue(r0)
            java.lang.String r3 = "client_load_threeds_success"
            java.lang.String r2 = "complete_redirect_3ds"
            android.os.Bundle r0 = r8.requireArguments()
            java.util.Map r1 = X.C121257Ff.A01(r0)
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = "auth_view_name_key"
            r1.put(r0, r2)
        L_0x0066:
            A00(r3, r1)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r9)
            java.lang.String r0 = "3ds_token_token"
            r2.putString(r0, r4)
            androidx.fragment.app.Fragment r1 = r8.mParentFragment
            boolean r0 = r1 instanceof X.C145868lF
            if (r0 == 0) goto L_0x007e
            X.8lF r1 = (X.C145868lF) r1
            r1.BzY(r2, r6)
        L_0x007e:
            return r7
        L_0x007f:
            r5 = r6
            goto L_0x0037
        L_0x0081:
            android.content.Context r1 = r8.requireContext()
            r0 = 2131836792(0x7f113f78, float:1.930676E38)
            java.lang.String r4 = X.AnonymousClass0wJ.A0k(r1, r0)
            android.content.Context r1 = r8.requireContext()
            r0 = 2131836791(0x7f113f77, float:1.9306759E38)
            java.lang.String r3 = X.AnonymousClass0wJ.A0k(r1, r0)
            android.content.Context r1 = r8.requireContext()
            r0 = 2131836790(0x7f113f76, float:1.9306757E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r1, r0)
            X.67N r0 = X.AnonymousClass67N.DISMISS
            X.5k9 r2 = new X.5k9
            r2.<init>(r0, r4, r3, r1)
            goto L_0x00f9
        L_0x00aa:
            java.lang.String r0 = "error_title"
            java.lang.String r1 = r5.getValue(r0)
            X.C04220Ms.A06(r1)
            java.lang.String r3 = "_"
            X.7yC r0 = X.C18250wR.A0h(r3)
            java.lang.String r2 = " "
            java.lang.String r0 = r0.A01(r1, r2)
            java.lang.String r4 = X.AnonymousClass8bP.A0P(r0)
            java.lang.String r0 = "error_message"
            java.lang.String r1 = r5.getValue(r0)
            X.C04220Ms.A06(r1)
            X.7yC r0 = X.C18250wR.A0h(r3)
            java.lang.String r0 = r0.A01(r1, r2)
            java.lang.String r3 = X.AnonymousClass8bP.A0P(r0)
            java.lang.String r0 = "cta_type"
            java.lang.String r2 = r5.getValue(r0)
            android.content.Context r1 = r8.requireContext()
            r0 = 2131836790(0x7f113f76, float:1.9306757E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r1, r0)
            X.67N r0 = X.AnonymousClass67N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r0 = com.facebook.graphql.enums.EnumHelper.A00(r2, r0)
            X.67N r0 = (X.AnonymousClass67N) r0
            X.C04220Ms.A06(r0)
            X.5k9 r2 = new X.5k9
            r2.<init>(r0, r4, r3, r1)
        L_0x00f9:
            androidx.fragment.app.Fragment r1 = r8.mParentFragment
            boolean r0 = r1 instanceof X.C145868lF
            if (r0 == 0) goto L_0x0104
            X.8lF r1 = (X.C145868lF) r1
            r1.BzZ(r2)
        L_0x0104:
            java.lang.String r5 = "client_load_threeds_fail"
            java.lang.String r1 = "complete_redirect_3ds"
            android.os.Bundle r0 = r8.requireArguments()
            java.util.Map r4 = X.C121257Ff.A01(r0)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x011b
            java.lang.String r0 = "auth_view_name_key"
            r4.put(r0, r1)
        L_0x011b:
            java.lang.String r3 = X.C117026y0.A01(r2)
            java.lang.String r2 = "error_message"
            java.lang.String r1 = "AUTH_LOGGING_EXTRA_KEY"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x0136
            java.lang.Object r0 = X.C86104wH.A0h(r1, r4)
            java.util.Map r0 = (java.util.Map) r0
        L_0x012f:
            r0.put(r2, r3)
            A00(r5, r4)
            return r7
        L_0x0136:
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            r4.put(r1, r0)
            goto L_0x012f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56G.Bzy(android.os.Bundle, int, boolean):boolean");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        Map A01 = C121257Ff.A01(requireArguments());
        if ("load_3ds_init_url".length() != 0) {
            A01.put("auth_view_name_key", "load_3ds_init_url");
        }
        A00("client_render_threeds_display", A01);
        C1203379t A07 = AnonymousClass7Kz.A07();
        Fragment A012 = A07.A06.A01(requireArguments(), "AUTH_THREE_DS_WEB_VIEW");
        C04220Ms.A06(A012);
        A012.setTargetFragment((Fragment) null, 1111);
        AnonymousClass01J A0R = C86124wJ.A0R(this);
        A0R.A0F(A012, "THREE_DS_WEBVIEW_FRAGMENT_TAG", R.id.webview_container);
        A0R.A00();
    }

    public final boolean onBackPressed() {
        Map A01 = C121257Ff.A01(requireArguments());
        if ("cancel_3ds".length() != 0) {
            A01.put("auth_target_name_key", "cancel_3ds");
        }
        A00("user_click_threeds_exit", A01);
        C1373088b r2 = new C1373088b();
        Fragment fragment = this.mParentFragment;
        if (!(fragment instanceof C145338kL)) {
            return false;
        }
        ((C145338kL) fragment).AMq((Bundle) null, (C120967Dk) null, r2);
        return false;
    }

    public static void A00(String str, Map map) {
        AnonymousClass7Kz.A07().A07.Bb8(str, Collections.unmodifiableMap(map));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-659800980);
        Context A0A = C18240wQ.A0A(this, layoutInflater, 0);
        AnonymousClass7Kz.A0G();
        View inflate = C86154wM.A0E(A0A, layoutInflater, R.style.FBPayUIWidget).inflate(R.layout.auth_three_ds_fragment, viewGroup, false);
        C14030oh.A09(1737338465, A02);
        return inflate;
    }
}
