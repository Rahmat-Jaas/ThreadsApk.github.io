package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.0Q0  reason: invalid class name */
public final class AnonymousClass0Q0 extends FilterInputStream {
    public int A00;
    public String A01;
    public final AnonymousClass0Q1 A02;

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public AnonymousClass0Q0(AnonymousClass0Q1 r1, InputStream inputStream) {
        super(inputStream);
        this.A02 = r1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            int read = read();
            if (read == -1) {
                return -1;
            }
            bArr[i] = (byte) read;
            int i3 = 1;
            while (i3 < i2) {
                int read2 = read();
                if (read2 == -1) {
                    break;
                }
                bArr[i + i3] = (byte) read2;
                i3++;
            }
            return i3;
        }
    }

    public final int read() {
        String str = this.A01;
        if (str == null || this.A00 >= str.length()) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i != -1 && sb.length() < 5000 && (i = super.read()) != -1) {
                sb.append((char) i);
                if (i == 10) {
                    break;
                }
            }
            String obj = sb.toString();
            this.A01 = obj;
            if (obj.length() == 0) {
                str = null;
            } else {
                this.A00 = 0;
                str = this.A02.A00(obj);
            }
            this.A01 = str;
        }
        if (str == null) {
            return -1;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        return str.charAt(i2);
    }
}
