package X;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.7gu  reason: invalid class name and case insensitive filesystem */
public final class C127307gu implements C27927Evd {
    public static final C25757DrU A07 = C25757DrU.A00(6.0d, 8.0d);
    public static final C25757DrU A08 = C25757DrU.A00(6.0d, 9.0d);
    public static final C25757DrU A09 = C25757DrU.A01(60.0d, 5.0d);
    public int A00 = -1;
    public C144998jd A01;
    public WeakReference A02;
    public final C25812DsR A03;
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public final Handler A05;
    public final C25812DsR A06;

    public final void CLf(C25812DsR dsR) {
    }

    public final void CLh(C25812DsR dsR) {
    }

    public final void A00() {
        C25812DsR dsR = this.A06;
        dsR.A0D(A09);
        C86124wJ.A1M(dsR);
    }

    public final void A01(C144998jd r3) {
        this.A01 = r3;
        C25812DsR dsR = this.A03;
        if (!dsR.A0G()) {
            CLi(dsR);
        }
    }

    public final void A02(WeakReference weakReference) {
        this.A02 = weakReference;
        C25812DsR dsR = this.A06;
        if (!dsR.A0G()) {
            CLi(dsR);
        }
    }

    public final void CLg(C25812DsR dsR) {
        C25812DsR dsR2 = this.A03;
        if (dsR == dsR2 && dsR2.A05 == A08 && dsR2.A0I(1.0d)) {
            this.A05.postDelayed(new AnonymousClass80H(this), 300);
        } else if (dsR == dsR2 && dsR2.A05 == A07 && dsR2.A0I(0.0d)) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                ((C144988jc) it.next()).CBb(this.A00);
            }
            this.A00 = -1;
        }
    }

    public final void CLi(C25812DsR dsR) {
        C144998jd r1;
        C25757DrU drU;
        WeakReference weakReference;
        C25757DrU drU2 = dsR.A05;
        float f = (float) dsR.A09.A00;
        boolean z = true;
        if (dsR == this.A06 && (weakReference = this.A02) != null) {
            r1 = (C144998jd) weakReference.get();
            if (r1 != null) {
                drU = A09;
            } else {
                return;
            }
        } else if (dsR == this.A03 && (r1 = this.A01) != null) {
            drU = A08;
        } else {
            return;
        }
        if (drU2 != drU) {
            z = false;
        }
        r1.Bki(f, z);
    }

    public C127307gu() {
        COK A002 = AnonymousClass0hJ.A00();
        C25812DsR A022 = A002.A02();
        A022.A0E(this);
        this.A06 = A022;
        C25812DsR A023 = A002.A02();
        A023.A0E(this);
        this.A03 = A023;
        this.A05 = new Handler();
    }
}
