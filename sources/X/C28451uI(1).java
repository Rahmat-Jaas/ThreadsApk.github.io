package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1uI  reason: invalid class name and case insensitive filesystem */
public class C28451uI extends C63873iU {
    public static final C84204sj A0C = new C71634Jo();
    public FragmentActivity A00;
    public C84204sj A01 = A0C;
    public C82964qZ A02;
    public RegFlowExtras A03;
    public AnonymousClass3HF A04;
    public boolean A05;
    public final Context A06;
    public final C07530bf A07;
    public final C313625r A08;
    public final Integer A09;
    public final String A0A;
    public final C82824qK A0B;

    public final void A01(C07530bf r12, User user, AnonymousClass269 r14, boolean z, boolean z2) {
        String str;
        C07530bf r1 = r12;
        User user2 = user;
        if (r14 == AnonymousClass269.LogIn) {
            String id = user.getId();
            String str2 = this.A08.A00;
            Integer num = this.A09;
            if (num != null) {
                str = AnonymousClass2TT.A00(num);
            } else {
                str = null;
            }
            String str3 = this.A0A;
            C04220Ms.A0B(r12, 0);
            C54182z2.A00(r1, (AnonymousClass3V1) null, "done", id, str2, str, str3);
        } else {
            String id2 = user.getId();
            USLEBaseShape0S0000000 A002 = C54252z9.A00(r1, this.A09, this.A08.A00, "consumer", id2, this.A0A);
            this.A01.AHK(A002, AnonymousClass269.RegisterAccountCreated, (C61763Vg) null);
            A002.Bb4();
        }
        C07530bf r7 = this.A07;
        Context context = this.A06;
        UserSession A032 = C67323zM.A03(context, (C11630kW) null, r7, user2, (String) null, false);
        if (!z) {
            C33292Fd.A00(context, A032).A01(C306622k.REGISTRATION);
        }
        if (z2) {
            C31155GhB.A03(new AnonymousClass4A8(this, A032, user, z));
            return;
        }
        AnonymousClass3HF r13 = this.A04;
        if (r13 != null && r13.A00) {
            r13.A00();
        }
        if (z) {
            A02(A032, user);
        } else {
            A03(user);
        }
    }

    public final void A04(String str, Integer num) {
        C82824qK r0 = this.A0B;
        if (r0 != null) {
            r0.Cth(str, num);
        } else {
            C38040KHr.A01.CWx(new AnonymousClass45P(str, num));
        }
    }

    public C28451uI(Fragment fragment, C82824qK r4, RegFlowExtras regFlowExtras, C07530bf r6, C313625r r7, Integer num, String str, boolean z, boolean z2) {
        this.A07 = r6;
        this.A0B = r4;
        this.A06 = fragment.getContext();
        this.A08 = r7;
        this.A09 = num;
        this.A02 = new C71654Jq(this);
        this.A0A = str;
        this.A04 = new AnonymousClass3HF(fragment, new AnonymousClass1w1(z));
        this.A03 = regFlowExtras;
        this.A00 = fragment.getActivity();
        this.A05 = z2;
    }

    public void A00(C22241Ty r9) {
        AnonymousClass269 r5;
        int A032 = C14030oh.A03(1589469580);
        User user = r9.A01;
        user.A2E(r9.A02);
        boolean z = r9.A06;
        boolean z2 = r9.A05;
        if (z2) {
            r5 = AnonymousClass269.LogIn;
        } else {
            r5 = AnonymousClass269.RegisterAccountCreated;
        }
        A01(this.A07, user, r5, z2, z);
        C14030oh.A0A(1740980549, A032);
    }

    public void A02(UserSession userSession, User user) {
        synchronized (AnonymousClass3XU.A00(userSession).A00) {
        }
    }

    public void A03(User user) {
        user.A29(C18220wO.A0d());
        C18210wN.A1K(user);
        synchronized (AnonymousClass3XU.A00(this.A07).A00) {
        }
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A032 = C14030oh.A03(-1716489757);
        this.A02.AAA(r4, new AnonymousClass3EW(this));
        C14030oh.A0A(-1886430695, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(-1784284157);
        C07530bf r1 = this.A07;
        String str = this.A08.A00;
        AnonymousClass0wJ.A1N(r1, str);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r1), "register_account_finished"), 2617);
        AnonymousClass269.A05(A0I);
        C18190wL.A1I(A0I, "done");
        A0I.A0T("source", str);
        A0I.Bb4();
        C14030oh.A0A(2073399336, A032);
    }

    public void onStart() {
        int i;
        int A032 = C14030oh.A03(-463206009);
        AnonymousClass3HF r1 = this.A04;
        if (r1 == null || !r1.A00) {
            r1.A01();
            i = 259848533;
        } else {
            i = 1851793246;
        }
        C14030oh.A0A(i, A032);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-1189645139);
        A00((C22241Ty) obj);
        C14030oh.A0A(2055009702, A032);
    }
}
