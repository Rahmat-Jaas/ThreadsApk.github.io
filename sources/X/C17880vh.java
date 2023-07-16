package X;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* renamed from: X.0vh  reason: invalid class name and case insensitive filesystem */
public final class C17880vh implements Callable {
    public final /* synthetic */ C17870vg A00;
    public final /* synthetic */ String A01;

    public C17880vh(C17870vg r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        int i;
        String str = this.A01;
        C17870vg r6 = this.A00;
        try {
            C17510v2 r8 = new C17510v2(str, Arrays.asList(InetAddress.getAllByName(str)), 0, 0);
            synchronized (r6) {
                C17530v6 r7 = r6.A00;
                TreeSet A012 = r7.A01();
                if (A012.isEmpty()) {
                    i = 0;
                } else {
                    i = ((C17510v2) A012.first()).A01 + 1;
                }
                C17510v2 A002 = r7.A00(r8);
                if (A002 == null) {
                    r7.A03(new C17510v2(r8.A02, r8.A00(), i, 0));
                } else {
                    r7.A04(A002, new C17510v2(r8.A02, r8.A00(), i, A002.A00));
                }
                r7.A02();
            }
            return r8;
        } catch (UnknownHostException unused) {
            throw new C17160uO(C06270Ym.UnknownHost);
        } catch (SecurityException unused2) {
            throw new C17160uO(C06270Ym.SecurityException);
        }
    }
}
