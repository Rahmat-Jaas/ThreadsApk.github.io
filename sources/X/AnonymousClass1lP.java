package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape39S0100000_I2_19;

/* renamed from: X.1lP  reason: invalid class name */
public final class AnonymousClass1lP extends Lu6 implements C10420iJ, AnonymousClass0i4 {
    public Activity A00;
    public String A01;
    public final Context A02;
    public final C60763Qk A03;
    public final C38039KHq A04;
    public final C82394pY A05 = C18220wO.A0P(this, 7);
    public final UserSession A06;
    public final Set A07;
    public final C58533Ga A08;

    public final boolean A04() {
        String str;
        String str2;
        AnonymousClass1wA r10;
        C37383Jqm jqm;
        UserSession userSession;
        String A0S;
        AnonymousClass1lP r0;
        AnonymousClass0LU.A0C("RageShakeSensorHelper", "displayRageShakeDialog started");
        if (this.A00 == null || this.A02 == null) {
            AnonymousClass0LU.A0C("RageShakeSensorHelper", "displayRageShakeDialog | no activity or context");
            String str3 = "";
            if (this.A00 == null) {
                str = "Activity is null. ";
            } else {
                str = str3;
            }
            if (this.A02 == null) {
                str3 = "Context is null. ";
            }
            C10450iM.A04("RageShakeSensorHelper", AnonymousClass00U.A0h("Cannot displayRageShakeDialog. ", str, str3, " for module ", AnonymousClass4WE.A00().A00), 1);
            return false;
        }
        AnonymousClass0LU.A0C("RageShakeSensorHelper", "displayRageShakeDialog | bottom sheet will open");
        Activity activity = this.A00;
        if (activity != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            Window window = this.A00.getWindow();
            if (window != null) {
                IBinder windowToken = window.getDecorView().getRootView().getWindowToken();
                if (!(inputMethodManager == null || windowToken == null)) {
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                }
            }
        }
        for (C568938y r2 : this.A07) {
            C3T c3t = r2.A00;
            BKH AbP = c3t.AbP();
            if (!(AbP == null || !AbP.BYi() || (A0S = AbP.A0S((userSession = r2.A01))) == null || (r0 = (AnonymousClass1lP) userSession.A00(AnonymousClass1lP.class)) == null)) {
                r0.A01 = A0S;
            }
            c3t.CeE("rage_shake_dialog");
        }
        C60763Qk r9 = this.A03;
        UserSession userSession2 = this.A06;
        Activity activity2 = this.A00;
        String str4 = this.A01;
        AnonymousClass4Le r1 = new AnonymousClass4Le(this);
        AnonymousClass0LU.A0C("RageShakeDialogProviderImpl", "openBottomSheet start");
        C25745DrH A0b = C18220wO.A0b(activity2);
        C37032Jj9 A0L = C18210wN.A0L(userSession2);
        A0L.A0I = r1;
        C37383Jqm A002 = A0L.A00();
        boolean z = false;
        if (activity2 instanceof FragmentActivity) {
            List A042 = ((FragmentActivity) activity2).getSupportFragmentManager().A0T.A04();
            C04220Ms.A06(A042);
            int size = A042.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    Fragment fragment = (Fragment) A042.get(size);
                    if (fragment instanceof AnonymousClass099) {
                        AnonymousClass099 r12 = (AnonymousClass099) fragment;
                        if (r12.A0A) {
                            r12.A06();
                            z = true;
                        }
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
        }
        if (A0b != null) {
            C35189Ipf ipf = (C35189Ipf) A0b;
            if (ipf.A0M) {
                C21660By6 by6 = ipf.A0B;
                if (!(A0b.A08() == null || !(A0b.A08() instanceof BottomSheetFragment) || (jqm = ((BottomSheetFragment) A0b.A08()).A02) == null || jqm.A01.A0I() == null)) {
                    BottomSheetFragment bottomSheetFragment = jqm.A01;
                    if (bottomSheetFragment.A0I() instanceof AnonymousClass1wA) {
                        r10 = (AnonymousClass1wA) bottomSheetFragment.A0I();
                        ipf.A0B = new C72024Lt(activity2, r9, r10, A002, userSession2, by6, str4);
                        A0b.A0C();
                        str2 = "openBottomSheet | navigator dismissed";
                        AnonymousClass0LU.A0C("RageShakeDialogProviderImpl", str2);
                        return true;
                    }
                }
                r10 = null;
                ipf.A0B = new C72024Lt(activity2, r9, r10, A002, userSession2, by6, str4);
                A0b.A0C();
                str2 = "openBottomSheet | navigator dismissed";
                AnonymousClass0LU.A0C("RageShakeDialogProviderImpl", str2);
                return true;
            }
        }
        AnonymousClass0LU.A0C("RageShakeDialogProviderImpl", "openBottomSheet | open with no previous bottom sheet navigator showing");
        C37383Jqm.A00(activity2, C34412Jl.A00(activity2, AnonymousClass25S.RAGE_SHAKE, userSession2, str4, KK7.A02(userSession2), C103066Xr.A00.A02.A00, false, z), A002);
        str2 = "openBottomSheet presented from rage shake";
        AnonymousClass0LU.A0C("RageShakeDialogProviderImpl", str2);
        return true;
    }

    public final void BjV(Activity activity) {
    }

    public final void BjW(Activity activity) {
    }

    public final void BjX(Activity activity) {
    }

    public final void Bjc(Activity activity) {
    }

    public final void Bjd(Activity activity) {
    }

    public static boolean A00(AnonymousClass1lP r3) {
        String str;
        String str2;
        UserSession userSession = r3.A06;
        C04220Ms.A0B(userSession, 0);
        Activity activity = r3.A00;
        UserSession userSession2 = ((AnonymousClass33X) userSession.A01(AnonymousClass33X.class, new KtLambdaShape39S0100000_I2_19(userSession, 37))).A00;
        if (activity == null) {
            str = "User not logged in or null activity or disable shake experiment";
        } else if (C34442Jo.A00()) {
            AnonymousClass0LU.A0O("RageShakeEligibilityHelper", "DeviceExclusion | model=%s | build=%s", Build.MODEL, Build.MANUFACTURER);
            return false;
        } else {
            if (C19573AyZ.A03(userSession2)) {
                str2 = "Enabling rageshake for employee";
            } else if (!C28161tl.A04(userSession2).getBoolean("rageshake_v2_enabled", true) || C34442Jo.A00()) {
                str = "Disabling rageshake.";
            } else {
                str2 = "Showing public rageshake flow";
            }
            AnonymousClass0LU.A0C("RageShakeEligibilityHelper", str2);
            return true;
        }
        AnonymousClass0LU.A0C("RageShakeEligibilityHelper", str);
        return false;
    }

    public final void BjY(Activity activity) {
        C25745DrH A0b;
        AnonymousClass0LU.A0C("RageShakeSensorHelper", "onActivityPause");
        A03();
        if (this.A02 && (A0b = C18220wO.A0b(activity)) != null && ((C35189Ipf) A0b).A0M) {
            A0b.A0C();
        }
        this.A00 = null;
    }

    public final void Bjb(Activity activity) {
        AnonymousClass0LU.A0C("RageShakeSensorHelper", "onActivityResume");
        if (activity instanceof FragmentActivity) {
            this.A00 = activity;
            if (A00(this)) {
                A02();
            }
        }
    }

    public AnonymousClass1lP(Context context, UserSession userSession) {
        super(context);
        this.A02 = context;
        this.A06 = userSession;
        this.A04 = AnonymousClass3LY.A00(userSession);
        this.A07 = C18200wM.A0u();
        this.A03 = new C60763Qk();
        this.A08 = new C58533Ga(userSession, (String) null);
    }

    public final void onSessionWillEnd() {
        A03();
        C10410iI.A00.A01(this);
        this.A04.A02(this.A05, C688045n.class);
        this.A00 = null;
    }
}
