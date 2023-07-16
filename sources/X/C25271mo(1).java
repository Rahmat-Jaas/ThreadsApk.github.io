package X;

import com.instagram.quicksand.QuickSandSolverBridge;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* renamed from: X.1mo  reason: invalid class name and case insensitive filesystem */
public final class C25271mo extends AnonymousClass0gG {
    public int A00 = 0;
    public int A01;
    public C58603Gk A02 = new C58603Gk();
    public QuickSandSolverBridge A03;
    public int A04;
    public int A05;
    public String A06;

    public C25271mo(String str, int i, int i2, int i3, int i4) {
        super(179);
        this.A01 = i;
        this.A06 = str;
        this.A04 = i3;
        this.A05 = i2;
        this.A03 = new QuickSandSolverBridge(i2, i4);
    }

    public final void run() {
        String str;
        while (this.A00 < this.A01) {
            QuickSandSolverBridge quickSandSolverBridge = this.A03;
            if (quickSandSolverBridge.A02()) {
                break;
            }
            int i = this.A05;
            if (r2 == i) {
                ArrayList A0k = C18240wQ.A0k(i);
                for (int A1U : quickSandSolverBridge.A03(this.A04, this.A06)) {
                    C18200wM.A1U(A0k, A1U);
                }
                try {
                    String A042 = new C31015GdW("-").A04(A0k);
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    instance.update(A042.getBytes());
                    byte[] digest = instance.digest();
                    str = C18180wK.A0j(AnonymousClass00U.A0S("%0", "x", digest.length << 1), new Object[]{new BigInteger(1, digest)});
                } catch (NoSuchAlgorithmException unused) {
                    str = new String();
                }
                this.A06 = str;
                C58603Gk r2 = this.A02;
                synchronized (r2) {
                    r2.A00.add(new AnonymousClass3V3(A0k));
                }
            } else {
                this.A00--;
            }
            this.A00++;
        }
        this.A03.A00();
    }
}
