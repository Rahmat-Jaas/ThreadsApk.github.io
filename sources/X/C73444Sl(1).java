package X;

import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;

/* renamed from: X.4Sl  reason: invalid class name and case insensitive filesystem */
public final class C73444Sl implements Runnable {
    public final /* synthetic */ C84454tA A00;
    public final /* synthetic */ C696349j A01;
    public final /* synthetic */ String A02;

    public final void run() {
        int i;
        int i2;
        long j;
        Object[] objArr;
        FragmentActivity fragmentActivity = null;
        try {
            fragmentActivity = H5O.A01().A06();
        } catch (ClassCastException | IndexOutOfBoundsException unused) {
        }
        if (fragmentActivity != null) {
            C84454tA r2 = this.A00;
            if (r2.Akw() != null && r2.AcN() != null) {
                C696349j r12 = this.A01;
                Integer Akw = r2.Akw();
                String AcN = r2.AcN();
                C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
                C18230wP.A11(fragmentActivity, A0W, R.drawable.ig_illustrations_illo_clock_refresh);
                long intValue = (long) Akw.intValue();
                if (intValue == SandboxRepository.CACHE_TTL) {
                    i = 2131828142;
                    objArr = new Object[]{AcN};
                } else {
                    i = 2131828139;
                    Resources resources = fragmentActivity.getResources();
                    C04220Ms.A0B(resources, 0);
                    if (C06750aI.A17(900L, 1800L, 2700L).contains(Long.valueOf(intValue))) {
                        i2 = R.plurals.granted_extension_time_minutes;
                        j = 60;
                    } else {
                        i2 = R.plurals.granted_extension_time_hours;
                        j = 3600;
                    }
                    long j2 = intValue / j;
                    String A0j = C18230wP.A0j(resources, Long.valueOf(j2), i2, (int) j2);
                    C04220Ms.A06(A0j);
                    objArr = new Object[]{AcN, A0j};
                }
                A0W.A02 = fragmentActivity.getString(i, objArr);
                int i3 = 2131828138;
                if (intValue == SandboxRepository.CACHE_TTL) {
                    i3 = 2131828141;
                }
                C18220wO.A14(fragmentActivity, A0W, i3);
                A0W.A0r(false);
                C18180wK.A1O(A0W, r12, 192, 2131831976);
                AnonymousClass0wJ.A1K(A0W);
                AnonymousClass0wJ.A13(C62803am.A00(C63043bN.A01, r12.A02), AnonymousClass00U.A0L("TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", this.A02), true);
            }
        }
    }

    public C73444Sl(C84454tA r1, C696349j r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }
}
