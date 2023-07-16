package X;

import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0qV  reason: invalid class name and case insensitive filesystem */
public final class C14980qV extends C880856r implements AnonymousClass06J {
    public AnonymousClass066 A00;
    public AnonymousClass06F A01;
    public AnonymousClass06K A02;
    public final int A03;
    public final AnonymousClass06K A04;

    public final void A09() {
        AnonymousClass06K r1 = this.A04;
        r1.A06 = true;
        r1.A05 = false;
        r1.A02 = false;
        r1.A03();
    }

    public final void A0A() {
        this.A04.A06 = false;
    }

    public final AnonymousClass06K A0J(AnonymousClass066 r4, AnonymousClass06D r5) {
        AnonymousClass06K r2 = this.A04;
        AnonymousClass06F r1 = new AnonymousClass06F(r5, r2);
        A0C(r4, r1);
        AnonymousClass06F r0 = this.A01;
        if (r0 != null) {
            A0F(r0);
        }
        this.A00 = r4;
        this.A01 = r1;
        return r2;
    }

    public final AnonymousClass06K A0K(boolean z) {
        AnonymousClass06K r3 = this.A04;
        r3.A06();
        r3.A02 = true;
        r3.A00();
        AnonymousClass06F r1 = this.A01;
        if (r1 != null) {
            A0F(r1);
        }
        AnonymousClass06J r0 = r3.A01;
        if (r0 == null) {
            throw new IllegalStateException("No listener register");
        } else if (r0 == this) {
            r3.A01 = null;
            if ((r1 == null || r1.A01()) && !z) {
                return r3;
            }
            r3.A01();
            r3.A05 = true;
            r3.A06 = false;
            r3.A02 = false;
            r3.A03 = false;
            r3.A04 = false;
            return this.A02;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public final void A0L() {
        AnonymousClass066 r1 = this.A00;
        AnonymousClass06F r0 = this.A01;
        if (r1 != null && r0 != null) {
            super.A0F(r0);
            A0C(r1, r0);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.A03);
        sb.append(" : ");
        Class<?> cls = this.A04.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }

    public C14980qV(AnonymousClass06K r3, AnonymousClass06K r4, int i) {
        this.A03 = i;
        this.A04 = r3;
        this.A02 = r4;
        if (r3.A01 == null) {
            r3.A01 = this;
            r3.A00 = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public final void A0F(C143158gC r2) {
        super.A0F(r2);
        this.A00 = null;
        this.A01 = null;
    }

    public final void A0H(Object obj) {
        super.A0H(obj);
        AnonymousClass06K r1 = this.A02;
        if (r1 != null) {
            r1.A01();
            r1.A05 = true;
            r1.A06 = false;
            r1.A02 = false;
            r1.A03 = false;
            r1.A04 = false;
            this.A02 = null;
        }
    }

    public final void A0M(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.A03);
        printWriter.print(" mArgs=");
        printWriter.println((Object) null);
        printWriter.print(str);
        printWriter.print("mLoader=");
        AnonymousClass06K r1 = this.A04;
        printWriter.println(r1);
        r1.A05(AnonymousClass00U.A0L(str, "  "), fileDescriptor, printWriter, strArr);
        if (this.A01 != null) {
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.A01);
            this.A01.A00(printWriter, AnonymousClass00U.A0L(str, "  "));
        }
        printWriter.print(str);
        printWriter.print("mData=");
        Object A08 = A08();
        StringBuilder sb = new StringBuilder(64);
        if (A08 == null) {
            str2 = "null";
        } else {
            Class<?> cls = A08.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            str2 = "}";
        }
        sb.append(str2);
        printWriter.println(sb.toString());
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.println(A0I());
    }

    public final void C4x(AnonymousClass06K r3, Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            A0H(obj);
        } else {
            A0G(obj);
        }
    }
}
