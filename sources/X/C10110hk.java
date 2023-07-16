package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import java.util.List;

/* renamed from: X.0hk  reason: invalid class name and case insensitive filesystem */
public final class C10110hk {
    public static Integer A05;
    public static Integer A06;
    public Handler A00;
    public LayoutInflater A01;
    public C10130hm A02;
    public Context A03;
    public final Handler.Callback A04;

    public final void A00(C10120hl r2, int i) {
        A01(r2, (List) null, i);
    }

    public final void A01(C10120hl r4, List list, int i) {
        C10130hm r2 = this.A02;
        C10140hn r1 = (C10140hn) r2.A00.A54();
        if (r1 == null) {
            r1 = new C10140hn();
        }
        r1.A04 = this;
        r1.A01 = i;
        r1.A00 = list;
        r1.A03 = r4;
        try {
            r2.A01.put(r1);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }
    }

    public C10110hk(Context context) {
        int intValue;
        C10160hp r3 = new C10160hp(this);
        this.A04 = r3;
        F0J f0j = new F0J(context.getApplicationContext(), context.getTheme());
        this.A03 = f0j;
        this.A01 = new C10150ho(f0j);
        this.A00 = new Handler(Looper.getMainLooper(), r3);
        C10130hm r1 = C10130hm.A02;
        this.A02 = r1;
        if (A06 != null && r1.getPriority() != (intValue = A06.intValue())) {
            this.A02.setPriority(intValue);
        }
    }
}
