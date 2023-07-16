package X;

import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: X.0qt  reason: invalid class name and case insensitive filesystem */
public final class C15190qt extends AnonymousClass06E {
    public final AnonymousClass066 A00;
    public final AnonymousClass06G A01;

    private AnonymousClass06K A01(AnonymousClass06D r5, AnonymousClass06K r6, int i) {
        try {
            AnonymousClass06G r3 = this.A01;
            r3.A04();
            AnonymousClass06K BsQ = r5.BsQ((Bundle) null, i);
            Class<?> cls = BsQ.getClass();
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                C14980qV r1 = new C14980qV(BsQ, r6, i);
                r3.A06(r1, i);
                r3.A02();
                return r1.A0J(this.A00, r5);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
            sb.append(BsQ);
            throw new IllegalArgumentException(sb.toString());
        } catch (Throwable th) {
            this.A01.A02();
            throw th;
        }
    }

    public final AnonymousClass06K A02(Bundle bundle, AnonymousClass06D r5, int i) {
        AnonymousClass06G r2 = this.A01;
        if (r2.A08()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C14980qV A012 = r2.A01(i);
            if (A012 == null) {
                return A01(r5, (AnonymousClass06K) null, i);
            }
            return A012.A0J(this.A00, r5);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public final AnonymousClass06K A03(Bundle bundle, AnonymousClass06D r5, int i) {
        AnonymousClass06G r2 = this.A01;
        if (r2.A08()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C14980qV A012 = r2.A01(i);
            AnonymousClass06K r0 = null;
            if (A012 != null) {
                r0 = A012.A0K(false);
            }
            return A01(r5, r0, i);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    public final void A04() {
        this.A01.A03();
    }

    public final void A05(int i) {
        AnonymousClass06G r2 = this.A01;
        if (r2.A08()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C14980qV A012 = r2.A01(i);
            if (A012 != null) {
                A012.A0K(true);
                r2.A05(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    public final void A06(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.A01.A07(str, fileDescriptor, printWriter, strArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.A00.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }

    public C15190qt(AnonymousClass066 r2, AnonymousClass06B r3) {
        this.A00 = r2;
        this.A01 = AnonymousClass06G.A00(r3);
    }
}
