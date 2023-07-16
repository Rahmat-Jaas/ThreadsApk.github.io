package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import com.instagram.react.activity.IgReactActivity;

/* renamed from: X.4Ja  reason: invalid class name and case insensitive filesystem */
public final class C71494Ja implements AnonymousClass4u1 {
    public int A00 = 1;
    public C39522Kv6 A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = false;
    public Bundle A0B;
    public final C10300i6 A0C;

    public final boolean BaN(Context context) {
        Intent A042 = C18250wR.A04(context, IgReactActivity.class);
        Integer num = this.A02;
        if (num != null) {
            A042.addFlags(num.intValue());
        }
        A042.putExtras(ABD());
        if (this.A08 && AnonymousClass2B9.A00) {
            A042.putExtra("IgReactActivity.EXTRA_ACTIVITY_ANIMATION", new int[]{R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit});
        }
        AnonymousClass05L A072 = C10650ih.A00.A07();
        C16980u6 r3 = A072.A00;
        Intent A082 = r3.A08(context, A042, A072.A01);
        if (A082 == null) {
            return false;
        }
        if (A082.hasExtra("_ci_")) {
            A082.removeExtra("_ci_");
        }
        AnonymousClass0EO.A00(context, A072);
        if (C16660tW.A02(context, A082)) {
            r3.A02.Ccv("Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
        }
        context.startActivity(A082);
        return true;
    }

    public final AnonymousClass4u1 Cod(Bundle bundle) {
        if (this.A05 != null) {
            this.A0B.putBundle("params", bundle);
            return this;
        }
        this.A0B = bundle;
        return this;
    }

    public final AnonymousClass4u1 CpK(String str) {
        AnonymousClass7Ko.A0D(C18220wO.A1U(this.A04), "Route name and app key cannot be both set");
        this.A05 = str;
        Bundle A062 = C18180wK.A06();
        A062.putString("routeName", str);
        A062.putBundle("params", this.A0B);
        this.A04 = "FacebookAppRouteHandler";
        this.A0B = A062;
        return this;
    }

    public C71494Ja(C10300i6 r2) {
        this.A0C = r2;
    }

    public final Bundle ABD() {
        Bundle A062 = C18180wK.A06();
        C18180wK.A0w(A062, this.A0C);
        String str = this.A07;
        if (str != null) {
            A062.putString(I17.A00(HttpStatus.SC_EXPECTATION_FAILED), str);
        }
        String str2 = this.A06;
        if (str2 != null) {
            A062.putString("IgReactFragment.TTI_EVENT_NAME", str2);
        }
        A062.putBoolean("IgReactFragment.ARGUMENT_LOGO_AS_TITLE", this.A0A);
        A062.putString(I17.A00(171), this.A04);
        A062.putBoolean(I17.A00(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE), this.A09);
        A062.putBoolean("IgReactFragment.ARGUMENT_IS_MODAL", false);
        Bundle bundle = this.A0B;
        if (bundle != null) {
            A062.putBundle("IgReactFragment.ARGUMENT_INITIAL_PROPS", bundle);
        }
        if (!TextUtils.isEmpty(this.A03)) {
            A062.putString("IgReactFragment.ARGUMENT_ANALYTICS_MODULE", this.A03);
        }
        A062.putBoolean("IgReactFragment.ARGUMENT_SHOULD_HIDE_MAIN_TAB", false);
        A062.putInt("IgReactFragment.ARGUMENT_ORIENTATION", this.A00);
        A062.putBoolean("IgReactFragment.ARGUMENT_IS_INLINE_NAV_BAR_ENABLED", false);
        return A062;
    }

    public final C25786Drz CxN(FragmentActivity fragmentActivity) {
        C63343hJ.getInstance().getFragmentFactory();
        Bundle ABD = ABD();
        C34611Ibh ibh = new C34611Ibh();
        ibh.setArguments(ABD);
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, this.A0C);
        A0Q.A03 = ibh;
        A0Q.A04 = this.A01;
        String str = this.A05;
        if (str == null) {
            str = this.A04;
        }
        A0Q.A09 = str;
        return A0Q;
    }

    public C71494Ja(C10300i6 r2, String str) {
        this.A0C = r2;
        this.A04 = str;
    }
}
