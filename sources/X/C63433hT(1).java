package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppControllerWrapper;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: X.3hT  reason: invalid class name and case insensitive filesystem */
public final class C63433hT {
    public static final Set A00 = C18200wM.A0u();

    public static long A00() {
        int[] A02 = AnonymousClass3VQ.A01.A02(AnonymousClass0wJ.A0A() / 1000);
        int length = A02.length;
        if (length > 0) {
            return (long) A02[length - 1];
        }
        return 0;
    }

    public static void A02() {
        for (Fragment fragment : A00) {
            if (fragment.isVisible()) {
                FragmentActivity activity = fragment.getActivity();
                activity.getClass();
                activity.finish();
            }
        }
    }

    public static List A01(boolean z, boolean z2) {
        long j;
        int[] iArr;
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        TimeZone timeZone = TimeZone.getDefault();
        Calendar instance = Calendar.getInstance(timeZone);
        int offset = timeZone.getOffset(instance.getTimeInMillis());
        if (z2) {
            j = (long) (TimeZone.getTimeZone("America/Los_Angeles").getOffset(instance.getTimeInMillis()) - offset);
        } else {
            j = (long) offset;
        }
        long j2 = j / 1000;
        AnonymousClass3VQ r0 = AnonymousClass3VQ.A01;
        if (z) {
            AnonymousClass376 r1 = (AnonymousClass376) r0.A00.get();
            if (r1 != null) {
                synchronized (r1) {
                    timeInAppControllerWrapper = r1.A00;
                }
                if (timeInAppControllerWrapper != null) {
                    iArr = timeInAppControllerWrapper.getDailyTimeInAppUtc(0, j2);
                }
            }
            iArr = new int[0];
        } else {
            iArr = r0.A02(0);
        }
        int[] iArr2 = new int[7];
        int i = 1;
        while (true) {
            int length = iArr.length;
            if (i > length || i > 7) {
                ArrayList A0v = AnonymousClass0wJ.A0v();
            } else {
                iArr2[7 - i] = iArr[length - i];
                i++;
            }
        }
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        for (int i2 = 0; i2 < 7; i2++) {
            A0v2.add(Double.valueOf((double) iArr2[i2]));
        }
        return A0v2;
    }

    public static void A03(FragmentActivity fragmentActivity) {
        C12560m7 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        if (fragmentActivity.findViewById(R.id.layout_container_main) == null) {
            C10450iM.A03("InstagramTimeSpentLogger_getContainerModule", AnonymousClass0wJ.A0t("couldn't find fragment layout id in activity:", fragmentActivity));
        }
        Fragment A0L = supportFragmentManager.A0L(R.id.layout_container_main);
        if (A0L != null && (A0L instanceof C11630kW)) {
            ((C11630kW) A0L).getModuleName();
        }
    }

    public static void A04(FragmentActivity fragmentActivity, UserSession userSession) {
        Object iw0;
        HashMap A0y = AnonymousClass0wJ.A0y();
        K9R k9r = K9R.A00;
        IVw iVw = new IVw(k9r);
        Long A002 = C19591Ayr.A00();
        Map map = iVw.A00;
        if (A002 == null) {
            iw0 = IW7.A00;
        } else {
            iw0 = new IW0(A002.longValue());
        }
        map.put("timezone_offset_seconds_from_gmt", iw0);
        C18200wM.A1T(C18180wK.A0M(k9r, iVw), A0y);
        AnonymousClass1c8 A03 = C62853b1.A03(userSession, "com.bloks.www.yp.familycenter.time_limit_extension_request", A0y);
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        A0Q.A09 = "extension_request_fragment";
        A0Q.A03 = A03;
        A0Q.A07 = "fully_blocking_fragment_backstack";
        A0Q.A05();
        A00.add(A03);
    }

    public static boolean A05(UserSession userSession) {
        C84674tf A0Z = AnonymousClass0wJ.A0Y(userSession).A0Z();
        if (A0Z == null || A0Z.BYw() == null || !A0Z.BYw().booleanValue()) {
            return false;
        }
        return true;
    }
}
