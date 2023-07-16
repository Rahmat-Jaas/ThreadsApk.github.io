package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.05X  reason: invalid class name */
public final class AnonymousClass05X implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass05Y A01;
    public final /* synthetic */ ArrayList A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;
    public final /* synthetic */ ArrayList A05;

    public final void run() {
        for (int i = 0; i < this.A00; i++) {
            ((View) this.A04.get(i)).setTransitionName((String) this.A02.get(i));
            ((View) this.A05.get(i)).setTransitionName((String) this.A03.get(i));
        }
    }

    public AnonymousClass05X(AnonymousClass05Y r1, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A04 = arrayList;
        this.A02 = arrayList2;
        this.A05 = arrayList3;
        this.A03 = arrayList4;
    }
}
