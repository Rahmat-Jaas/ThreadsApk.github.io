package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.instagram.barcelona.R;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.service.session.UserSession;
import java.util.Arrays;

/* renamed from: X.3iT  reason: invalid class name and case insensitive filesystem */
public final class C63863iT {
    public static final int[] A0L;
    public static final int[] A0M;
    public static final int[] A0N;
    public C39522Kv6 A00;
    public C11630kW A01;
    public AnonymousClass9V2 A02;
    public Integer A03;
    public Integer A04;
    public String A05 = "button";
    public String A06 = null;
    public boolean A07 = true;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D = true;
    public boolean A0E;
    public int[] A0F;
    public final Activity A0G;
    public final String A0H;
    public final Bundle A0I;
    public final C10300i6 A0J;
    public final Class A0K;

    static {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        boolean z = AnonymousClass2B9.A00;
        if (z) {
            iArr = new int[]{R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit};
        } else {
            iArr = ModalActivity.A06;
        }
        A0N = iArr;
        if (z) {
            iArr2 = new int[]{R.anim.modal_slide_up_enter, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.modal_slide_down_exit};
        } else {
            iArr2 = ModalActivity.A06;
        }
        A0M = iArr2;
        if (z) {
            iArr3 = new int[]{R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out};
        } else {
            iArr3 = ModalActivity.A06;
        }
        A0L = iArr3;
    }

    private Intent A00(Context context) {
        Intent putExtra = C18250wR.A04(context, this.A0K).putExtra("fragment_name", this.A0H).putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, this.A0I);
        String str = this.A06;
        if (str != null) {
            putExtra.putExtra("initial_fragment_backstack_name", str);
        }
        int[] iArr = this.A0F;
        if (iArr != null) {
            putExtra.putExtra("fragment_animation", iArr);
            if (Arrays.equals(this.A0F, ModalActivity.A06)) {
                putExtra.addFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
            }
        }
        putExtra.putExtra("translucent_navigation_bar", this.A0C);
        putExtra.putExtra("will_hide_system_ui", this.A0E);
        if (this.A0B) {
            putExtra.addFlags(805306368);
        }
        if (!this.A07) {
            putExtra.addFlags(1073741824);
        }
        if (this.A08) {
            putExtra.addFlags(335544320);
        }
        putExtra.putExtra("will_fit_system_windows", this.A0D);
        putExtra.putExtra("will_hide_navigation_bar", this.A09);
        Integer num = this.A04;
        if (num != null) {
            putExtra.putExtra("status_bar_color", num);
        }
        Integer num2 = this.A03;
        if (num2 != null) {
            putExtra.putExtra("navigation_bar_color", num2);
        }
        return putExtra;
    }

    public static C63863iT A01(Activity activity, Bundle bundle, C10300i6 r3, Class cls) {
        C63863iT A042 = A04(activity, bundle, r3, cls, "reel_viewer");
        if (!(r3 instanceof UserSession)) {
            C10450iM.A03("ModalActivityLauncher", AnonymousClass0wJ.A0t("session is not instance of UserSession ", r3));
            return A042;
        }
        A042.A03 = -16777216;
        return A042;
    }

    public static C63863iT A02(Activity activity, Bundle bundle, C10300i6 r3, Class cls, String str) {
        return new C63863iT(activity, bundle, r3, cls, str);
    }

    public static C63863iT A04(Activity activity, Bundle bundle, C10300i6 r4, Class cls, String str) {
        C63863iT r1 = new C63863iT(activity, bundle, r4, cls, str);
        r1.A0F = ModalActivity.A06;
        return r1;
    }

    public static C63863iT A05(Activity activity, Bundle bundle, C10300i6 r3, Class cls, String str) {
        C63863iT r0 = new C63863iT(activity, bundle, r3, cls, str);
        r0.A0G();
        return r0;
    }

    private void A07() {
        C11630kW r1 = this.A01;
        KK7 A002 = KK7.A00(this.A0J);
        if (r1 != null) {
            C11630kW r3 = this.A01;
            int backStackEntryCount = this.A0G.getFragmentManager().getBackStackEntryCount();
            A002.A0B(this.A00, r3, this.A05, backStackEntryCount);
            return;
        }
        A002.A06(this.A0G, this.A00, this.A05);
    }

    public static void A08(Activity activity, Bundle bundle, C10300i6 r3, Class cls, String str) {
        new C63863iT(activity, bundle, r3, cls, str).A0I(activity);
    }

    public static void A09(Activity activity, Bundle bundle, C10300i6 r3, Class cls, String str) {
        C63863iT r0 = new C63863iT(activity, bundle, r3, cls, str);
        r0.A0F();
        r0.A0I(activity);
    }

    public static void A0A(Activity activity, Bundle bundle, C10300i6 r7, String str) {
        Activity activity2 = activity;
        C63863iT r0 = new C63863iT(activity2, bundle, r7, ModalActivity.class, str);
        r0.A0G();
        r0.A0I(activity2);
    }

    public static void A0C(Bundle bundle, Fragment fragment, C10300i6 r9) {
        C63863iT r1 = new C63863iT(fragment.requireActivity(), bundle, r9, ModalActivity.class, "bloks");
        r1.A0F();
        r1.A0I(fragment.requireActivity());
    }

    public final void A0F() {
        this.A0F = A0M;
    }

    public final void A0G() {
        this.A0F = A0N;
    }

    public C63863iT(Activity activity, Bundle bundle, C10300i6 r5, Class cls, String str) {
        this.A0J = r5;
        this.A0K = cls;
        this.A0H = str;
        this.A0I = bundle;
        this.A0G = activity;
        C05050Qq.A00(bundle, r5);
    }

    public static C63863iT A03(Activity activity, Bundle bundle, C10300i6 r2, Class cls, String str) {
        C63863iT A062 = A06(activity, bundle, r2, cls, str);
        A062.A0F();
        return A062;
    }

    public static C63863iT A06(Activity activity, Bundle bundle, C10300i6 r5, Class cls, String str) {
        C63863iT A022 = A02(activity, bundle, r5, cls, str);
        if (!(r5 instanceof UserSession)) {
            C10450iM.A03("ModalActivityLauncher", AnonymousClass0wJ.A0t("session is not instance of UserSession ", r5));
            return A022;
        }
        A022.A0A = true;
        A022.A0D = false;
        A022.A09 = true;
        A022.A04 = 0;
        A022.A03 = Integer.valueOf(activity.getColor(R.color.igds_transparent_navigation_bar));
        return A022;
    }

    public static void A0B(Context context, Bundle bundle, Class cls, String str) {
        Intent putExtra = C18250wR.A04(context, cls).putExtra("fragment_name", str).putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, bundle);
        putExtra.setFlags(268435456);
        C10650ih.A02(context, putExtra);
    }

    public static void A0D(Fragment fragment, C63863iT r1) {
        r1.A0I(fragment.requireContext());
    }

    public static void A0E(C63863iT r4) {
        r4.A0F = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
    }

    public final void A0H(Activity activity, int i) {
        Intent A002 = A00(activity);
        A07();
        AnonymousClass9V2 r0 = this.A02;
        if (r0 != null) {
            AnonymousClass9V2.A00(r0);
        }
        C10650ih.A08(activity, A002, i);
    }

    public final void A0I(Context context) {
        Intent A002 = A00(context);
        if (C10050he.A00(context, Activity.class) == null) {
            A002.addFlags(268435456);
        } else {
            Activity activity = (Activity) context;
            if (activity.getParent() != null) {
                context = activity.getParent();
            }
        }
        A07();
        AnonymousClass9V2 r0 = this.A02;
        if (r0 != null) {
            AnonymousClass9V2.A00(r0);
        }
        if (this.A0A) {
            C31156GhE.A05(this.A0G, new C73174Rf(A002, this));
        } else {
            C10650ih.A02(context, A002);
        }
    }

    public final void A0J(Fragment fragment, int i) {
        Intent A002 = A00(fragment.getContext());
        if (C10050he.A00(fragment.getContext(), FragmentActivity.class) != null) {
            A07();
            AnonymousClass9V2 r0 = this.A02;
            if (r0 != null) {
                AnonymousClass9V2.A00(r0);
            }
            C10650ih.A0E(A002, fragment, i);
            return;
        }
        throw C18180wK.A0a("Trying to start an activity from a fragment not hosted in a FragmentActivity");
    }
}
