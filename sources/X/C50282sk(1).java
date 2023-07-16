package X;

import android.widget.Button;

/* renamed from: X.2sk  reason: invalid class name and case insensitive filesystem */
public final class C50282sk {
    public static void A00(C63063bP r3, AnonymousClass12R r4) {
        int i = r3.A02;
        Button button = r4.A00;
        if (i != 0) {
            button.setText(i);
        } else {
            button.setText(r3.A03);
        }
        button.setOnClickListener(r3.A06);
        C18180wK.A0s(C18240wQ.A0B(r4), button, r3.A05);
        button.setAlpha(r3.A04);
    }
}
