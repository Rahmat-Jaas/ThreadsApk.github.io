package X;

import android.content.Context;

/* renamed from: X.3zg  reason: invalid class name and case insensitive filesystem */
public final class C67513zg implements C07720by {
    public Context A00;
    public AnonymousClass0SL A01;
    public final int A02;
    public volatile Object A03;

    public final Object get() {
        AnonymousClass0SL r0;
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    Context context = this.A00;
                    if (context == null && (r0 = this.A01) != null && (context = ((C41029Luq) r0).A00.getContext()) == null) {
                        throw C18180wK.A0a("Trying to inject an object without a valid context.  If this is in a fragment, you might be trying to inject stuff before the context is set!");
                    }
                    this.A03 = M0Y.A00(context, this.A02);
                }
            }
        }
        return this.A03;
    }

    public C67513zg(AnonymousClass0SL r3, int i) {
        this.A02 = i;
        try {
            this.A00 = ((C41029Luq) r3).A00.getContext();
        } catch (NullPointerException unused) {
        }
        this.A01 = this.A00 != null ? null : r3;
    }
}
