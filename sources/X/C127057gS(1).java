package X;

import com.facebook.papaya.client.ICallback;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.log.LogSink;
import com.facebook.redex.IDxAFunctionShape269S0200000_2_I2;
import com.facebook.redex.IDxAFunctionShape732S0100000_2_I2;
import com.facebook.redex.IDxFCallbackShape314S0100000_2_I2;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.7gS  reason: invalid class name and case insensitive filesystem */
public final class C127057gS implements C146428mE, AnonymousClass0i1 {
    public C146428mE A00;
    public final C132427ts A01;
    public final List A02;
    public final Map A03;
    public final Callable A04;
    public final ReentrantLock A05 = new ReentrantLock();
    public final boolean A06;
    public final C132217tX A07;

    public C127057gS(C132427ts r2, C132217tX r3, List list, Map map, Callable callable, boolean z) {
        C86104wH.A1P(r3, 5, r2);
        this.A04 = callable;
        this.A06 = z;
        this.A03 = map;
        this.A02 = list;
        this.A07 = r3;
        this.A01 = r2;
    }

    public final ListenableFuture CwR(C146148lj r5) {
        C04220Ms.A0B(r5, 0);
        boolean z = this.A06;
        if (!z || !r5.BTd()) {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(r5.getName());
            A0r.append(" is not submitted (runtime enabled: ");
            A0r.append(z);
            A0r.append(", executor enabled: ");
            A0r.append(r5.BTd());
            AnonymousClass0LU.A0C("Papaya", AnonymousClass0wJ.A0u(A0r));
            return new AnonymousClass5ro(false);
        }
        return C34497IYj.A01(new IDxAFunctionShape269S0200000_2_I2(1, r5, this), A00(), C97356Ba.A01);
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    private final ListenableFuture A00() {
        UserSession userSession;
        C132217tX r2 = this.A07;
        C28979FfK ffK = C28979FfK.PAPAYA;
        SettableFuture settableFuture = new SettableFuture();
        synchronized (r2.A01) {
            userSession = r2.A00;
        }
        if (userSession != null) {
            C37200JmN A002 = C37200JmN.A00();
            ArrayList A0v = AnonymousClass0wJ.A0v();
            C18240wQ.A1Q(A0v, new C28979FfK[]{ffK});
            A002.A02(userSession, new C36813Jf5((C12560m7) null, new C133627w1(settableFuture, userSession), AnonymousClass006.A00, A0v));
        } else {
            AnonymousClass0LU.A0B("Papaya", "Can't load app-module without a valid user-session!");
            settableFuture.set(false);
        }
        return C34497IYj.A01(new IDxAFunctionShape732S0100000_2_I2(this, 0), settableFuture, C97356Ba.A01);
    }

    public static void A01(C127057gS r2, String str, boolean z) {
        AnonymousClass0LU.A0C("Papaya", AnonymousClass00U.A0n(str, ", any executor enabled: ", z, r2.A02()));
    }

    private final boolean A02() {
        List<C146148lj> list = this.A02;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C146148lj BTd : list) {
                if (BTd.BTd()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ListenableFuture CfM(PapayaRestrictions papayaRestrictions) {
        boolean z = this.A06;
        if (!z || !A02()) {
            A01(this, "Papaya would not run (runtime enabled: ", z);
            return AnonymousClass5ro.A01;
        }
        return C34497IYj.A01(new IDxAFunctionShape732S0100000_2_I2(papayaRestrictions, 1), A00(), C97356Ba.A01);
    }

    public final void CiY(ICallback iCallback) {
        boolean z = this.A06;
        if (!z || !A02()) {
            A01(this, "No log sink is added (runtime enabled: ", z);
            return;
        }
        C30954Gc6.A03(new IDxFCallbackShape314S0100000_2_I2(iCallback, 3), A00(), C97356Ba.A01);
    }

    public final ListenableFuture Cvy() {
        boolean z = this.A06;
        if (!z || !A02()) {
            A01(this, "Nothing is stopped (runtime enabled: ", z);
            return AnonymousClass5ro.A01;
        }
        return C34497IYj.A01(C129937ni.A00, A00(), C97356Ba.A01);
    }

    public final ListenableFuture D8A() {
        boolean z = this.A06;
        if (!z || !A02()) {
            A01(this, "Nothing is uninitialized (runtime enabled: ", z);
            return AnonymousClass5ro.A01;
        }
        return C34497IYj.A01(C129947nj.A00, A00(), C97356Ba.A01);
    }

    public final void A6a(LogSink logSink, String str) {
        AnonymousClass0wJ.A1N(str, logSink);
        boolean z = this.A06;
        if (!z || !A02()) {
            A01(this, "No log sink is added (runtime enabled: ", z);
            return;
        }
        C30954Gc6.A03(new C129987no(logSink, str), A00(), C97356Ba.A01);
    }
}
