package X;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7z2  reason: invalid class name and case insensitive filesystem */
public final class C135197z2 implements Runnable {
    public final /* synthetic */ AnonymousClass770 A00;

    public C135197z2(AnonymousClass770 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass770 r2 = this.A00;
        if (!r2.A07.A0A) {
            r2.A03.removeCallbacks(r2.A08);
        }
        StringBuilder A0r = C18200wM.A0r();
        C110296lR r1 = r2.A06;
        A0r.append(r1.A04.A08());
        A0r.append("  Sweeps Done in ");
        A0r.append(r1.A03.A08());
        String A0i = C18180wK.A0i("  polling.", A0r);
        Map map = AnonymousClass7IZ.A01().A08;
        ArrayList A0k = C18240wQ.A0k(map.size());
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            StringBuilder A0r2 = C18200wM.A0r();
            A0r2.append(C18200wM.A0p(A0o));
            A0r2.append(" : ");
            A0r2.append((int) (C86124wJ.A00(A0o.getValue()) * ((double) 100)));
            A0k.add(C86114wI.A0q(A0r2, '%'));
        }
        List A17 = C06750aI.A17("ViewSweep Info Box", A0i, AnonymousClass00J.A0H("\n", (CharSequence) null, (CharSequence) null, A0k, (AnonymousClass0YY) null, 62));
        TextView textView = r2.A02;
        if (textView != null) {
            textView.setText(AnonymousClass00J.A0H("\n", (CharSequence) null, (CharSequence) null, A17, (AnonymousClass0YY) null, 62));
        }
        r2.A04.postDelayed(this, 200);
    }
}
