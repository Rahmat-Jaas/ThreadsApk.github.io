package X;

import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6le  reason: invalid class name and case insensitive filesystem */
public final class C110416le {
    public int A00;
    public int A01;
    public C107946hZ A02;
    public List A03;
    public List A04;

    public C110416le(AnonymousClass3HX r11, C127397h3 r12) {
        C127397h3 A0K = r12.A0K(35);
        AnonymousClass7Ko.A07(A0K, "Canvas model not supplied for LineChart node");
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        Iterator it = A0K.A0R(35).iterator();
        while (it.hasNext()) {
            A0v.add(C86114wI.A0m(C86144wL.A0V(it).A04, 35));
        }
        this.A01 = Integer.MAX_VALUE;
        this.A00 = Process.WAIT_RESULT_TIMEOUT;
        List A0R = A0K.A0R(36);
        int size = A0R.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C127397h3 A0Q = C86154wM.A0Q(A0R, size);
            A0v2.add(C86114wI.A0m(A0Q.A04, 35));
            this.A01 = Math.min(this.A01, A0Q.A0H(36, 0));
            this.A00 = Math.max(this.A00, A0Q.A0H(36, 0));
        }
        this.A02 = new C107946hZ((String[]) C86144wL.A1b(A0v2), (String[]) C86144wL.A1b(A0v));
        this.A03 = AnonymousClass0wJ.A0v();
        Iterator it2 = r12.A0R(38).iterator();
        while (it2.hasNext()) {
            this.A03.add(C117966zX.A01(r11, C86144wL.A0V(it2), this.A01, this.A00, A0v.size()));
        }
        List A0R2 = r12.A0R(40);
        this.A04 = AnonymousClass0wJ.A0v();
        Iterator it3 = A0R2.iterator();
        while (it3.hasNext()) {
            this.A04.add(C117966zX.A01(r11, C86144wL.A0V(it3), this.A01, this.A00, A0v.size()));
        }
    }
}
