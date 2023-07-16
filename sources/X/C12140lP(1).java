package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.0lP  reason: invalid class name and case insensitive filesystem */
public abstract class C12140lP extends AnonymousClass0gG {
    public final String mName;

    public abstract void loggedRun();

    public final void run() {
        if (Systrace.A0F(1)) {
            C13930oX.A01(this.mName, 979945565);
        }
        try {
            loggedRun();
        } finally {
            if (Systrace.A0F(1)) {
                C13930oX.A00(1026774426);
            }
        }
    }

    public C12140lP(String str, int i) {
        super(i);
        this.mName = str;
    }

    public C12140lP(String str, int i, int i2, boolean z, boolean z2) {
        super(i, i2, z, z2);
        this.mName = str;
    }
}
