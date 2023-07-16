package X;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.06K  reason: invalid class name */
public abstract class AnonymousClass06K {
    public int A00;
    public AnonymousClass06J A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = true;
    public boolean A06 = false;
    public Context A07;

    public void A00() {
    }

    public void A01() {
    }

    public abstract void A02();

    public abstract void A03();

    public abstract boolean A06();

    public void A04(Object obj) {
        AnonymousClass06J r0 = this.A01;
        if (r0 != null) {
            r0.C4x(this, obj);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        sb.append(this.A00);
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass06K(Context context) {
        this.A07 = context.getApplicationContext();
    }

    public void A05(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.A00);
        printWriter.print(" mListener=");
        printWriter.println(this.A01);
        if (this.A06 || this.A03 || this.A04) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.A06);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.A03);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.A04);
        }
        if (this.A02 || this.A05) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.A02);
            printWriter.print(" mReset=");
            printWriter.println(this.A05);
        }
    }
}
