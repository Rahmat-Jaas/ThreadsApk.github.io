package X;

import android.widget.TextView;

/* renamed from: X.81h  reason: invalid class name and case insensitive filesystem */
public final class C1360681h implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ String A01;

    public C1360681h(TextView textView, String str) {
        this.A00 = textView;
        this.A01 = str;
    }

    public final void run() {
        this.A00.append(AnonymousClass00U.A0A(this.A01, 10));
    }
}
