package X;

import android.content.Intent;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0w1  reason: invalid class name and case insensitive filesystem */
public abstract class C18040w1 implements C03640Kc {
    public boolean A00 = false;
    public final C18080w5 A01;

    public abstract int A07(Intent intent, int i, int i2);

    public final synchronized void A08() {
        if (!this.A00) {
            this.A00 = true;
            this.A01.A01();
        }
    }

    public IBinder A0B(Intent intent) {
        return null;
    }

    public void A09(Intent intent, int i) {
        this.A01.A05(intent, i);
    }

    public void A0A(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.A01.A06(fileDescriptor, printWriter, strArr);
    }

    public void A0D(Intent intent) {
        this.A01.A04(intent);
    }

    public boolean A0E(Intent intent) {
        return this.A01.A07(intent);
    }

    public void A0F() {
        this.A01.A02();
    }

    public C18040w1(C18080w5 r2) {
        this.A01 = r2;
    }

    public void A0C() {
        A08();
    }
}
