package X;

import android.os.Handler;
import java.util.Set;

/* renamed from: X.79o  reason: invalid class name and case insensitive filesystem */
public final class C1202879o {
    public final int A00;
    public final Handler A01;
    public final Runnable A02 = new AnonymousClass801(this);
    public final Set A03 = C18200wM.A0u();
    public final Set A04 = C18200wM.A0u();

    public final synchronized void A02(String str) {
        Set set = this.A03;
        set.remove(str);
        if (set.isEmpty() && this.A00 > 0) {
            this.A01.removeCallbacks(this.A02);
        }
        A00(this);
    }

    public static void A00(C1202879o r3) {
        for (C146208lp r1 : r3.A04) {
            if (!r3.A03(r1.B0B())) {
                r1.CfV();
            }
        }
    }

    public final void A01(AnonymousClass0gG r2, C146208lp r3) {
        if (this.A04.contains(r3)) {
            r3.CwS(r2);
            A00(this);
            return;
        }
        throw C18180wK.A0a("Queue not managed");
    }

    public final boolean A03(Integer num) {
        String str;
        if (num == AnonymousClass006.A0C) {
            return !this.A03.isEmpty();
        }
        switch (num.intValue()) {
            case 0:
                str = "15335435";
                break;
            case 1:
                str = "23592980";
                break;
            default:
                str = "all";
                break;
        }
        return this.A03.contains(str);
    }

    public C1202879o(int i) {
        this.A00 = i;
        this.A01 = AnonymousClass0wJ.A0F();
    }
}
