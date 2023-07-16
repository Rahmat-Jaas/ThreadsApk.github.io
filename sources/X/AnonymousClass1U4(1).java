package X;

import java.util.ArrayList;

/* renamed from: X.1U4  reason: invalid class name */
public class AnonymousClass1U4 extends AnonymousClass1j3 {
    public String A00;
    public String A01;
    public String A02;
    public ArrayList A03;
    public boolean A04;

    public String getErrorMessage() {
        return this.A00;
    }

    public final boolean isOk() {
        boolean z;
        if (super.isOk()) {
            if (this instanceof C26661r0) {
                z = true;
            } else {
                z = this.A04;
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }
}
