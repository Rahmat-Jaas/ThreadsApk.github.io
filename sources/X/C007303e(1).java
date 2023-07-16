package X;

import android.content.Context;
import android.os.Parcel;
import java.io.File;
import java.io.IOException;

/* renamed from: X.03e  reason: invalid class name and case insensitive filesystem */
public final class C007303e extends AnonymousClass0EA {
    public AnonymousClass0q9 A00;
    public final File A01;
    public final File A02;
    public final String A03;

    public final C14910qO A09(byte b) {
        return new AnonymousClass0NH(this, this);
    }

    public final byte[] A0A() {
        File file = this.A01;
        Parcel obtain = Parcel.obtain();
        file.getCanonicalFile();
        try {
            obtain.writeLong((long) AnonymousClass0FX.A01());
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        String str;
        try {
            str = String.valueOf(this.A00.getCanonicalPath());
        } catch (IOException unused) {
            str = this.A00.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.A01);
        sb.append(" zipSource = ");
        sb.append(this.A02.getPath());
        sb.append(" compressedPath = ");
        sb.append(this.A03);
        sb.append(']');
        return sb.toString();
    }

    public C007303e(Context context, AnonymousClass0q9 r4) {
        super(context, C14630pr.A00(context, 114712842));
        File file = new File(this.A03.getApplicationInfo().sourceDir);
        this.A01 = file;
        this.A02 = file;
        this.A00 = r4;
        this.A03 = r4.A00;
    }
}
