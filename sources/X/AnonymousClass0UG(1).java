package X;

import java.io.File;

/* renamed from: X.0UG  reason: invalid class name */
public final class AnonymousClass0UG {
    public File A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final C08010ca A04 = new AnonymousClass07U(this);

    public final synchronized void A00() {
        File file;
        if (!this.A03) {
            C08000cZ A002 = C08000cZ.A00();
            this.A03 = true;
            if (this.A02 && (file = this.A00) != null) {
                A002.A01.A04(file, true);
                A002.A05();
            }
        }
    }

    public AnonymousClass0UG(String str) {
        this.A01 = str;
    }
}
