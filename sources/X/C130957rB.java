package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7rB  reason: invalid class name and case insensitive filesystem */
public final class C130957rB implements L34, AnonymousClass0i4 {
    public final C110496lm A00;
    public final ArrayList A01;
    public final Random A02 = new Random();
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();

    public final boolean A00(L5E l5e) {
        C110496lm r1 = this.A00;
        if (!r1.A03) {
            return false;
        }
        if (!r1.A04 || this.A01.contains(l5e.BCp())) {
            return true;
        }
        return false;
    }

    public final int Acl(L5E l5e) {
        C108256i4 r1;
        if (!this.A00.A03 || !A00(l5e) || (r1 = (C108256i4) this.A03.get(l5e.AUt())) == null || !r1.A00.get()) {
            return 0;
        }
        return r1.A01;
    }

    public final void C27(L5E l5e) {
        C110496lm r7 = this.A00;
        if (r7.A03 && A00(l5e)) {
            ConcurrentHashMap concurrentHashMap = this.A03;
            if (!concurrentHashMap.containsKey(l5e.AUt())) {
                int i = 0;
                boolean z = false;
                if (((double) this.A02.nextInt(100)) < r7.A00) {
                    z = true;
                    i = r7.A01;
                }
                concurrentHashMap.put(l5e.AUt(), new C108256i4(i, z));
            }
        }
    }

    public final void CdB(L5E l5e) {
        C108256i4 r0;
        if (this.A00.A03 && A00(l5e) && (r0 = (C108256i4) this.A03.get(l5e.AUt())) != null) {
            r0.A00.set(false);
        }
    }

    public final void onSessionWillEnd() {
        L34 l34 = L34.A00;
        C37744K2e.A0m = l34;
        IgImageView.A0a = l34;
    }

    public C130957rB(C110496lm r3) {
        this.A00 = r3;
        this.A01 = C18200wM.A0s(Arrays.asList(r3.A02.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
    }
}
