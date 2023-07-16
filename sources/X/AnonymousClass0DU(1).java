package X;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;

/* renamed from: X.0DU  reason: invalid class name */
public final class AnonymousClass0DU {
    public char A00;
    public char A01;
    public int A02;
    public int A03 = -1;
    public RandomAccessFile A04;
    public boolean A05 = true;
    public boolean A06 = false;
    public final byte[] A07 = new byte[512];

    public final void A01() {
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.A04 = null;
                throw th;
            }
            this.A04 = null;
        }
    }

    public final void A02() {
        boolean z = false;
        while (A03()) {
            A00(this);
            if (this.A00 == ' ') {
                z = true;
            } else if (z) {
                if (!this.A06) {
                    this.A03--;
                    this.A00 = this.A01;
                    this.A06 = true;
                    return;
                }
                throw new AnonymousClass0DT("Can only rewind one step!");
            }
        }
    }

    public final boolean A03() {
        RandomAccessFile randomAccessFile;
        if (this.A05 && (randomAccessFile = this.A04) != null) {
            int i = this.A03;
            int i2 = this.A02;
            if (i <= i2 - 1) {
                if (i < i2 - 1) {
                    return true;
                }
                try {
                    this.A02 = randomAccessFile.read(this.A07);
                    this.A03 = -1;
                } catch (IOException unused) {
                    this.A05 = false;
                    A01();
                }
                return A03();
            }
        }
        return false;
    }

    public static void A00(AnonymousClass0DU r2) {
        if (r2.A03()) {
            int i = r2.A03 + 1;
            r2.A03 = i;
            r2.A01 = r2.A00;
            r2.A00 = (char) r2.A07[i];
            r2.A06 = false;
            return;
        }
        throw new NoSuchElementException();
    }

    public final void finalize() {
        A01();
    }
}
