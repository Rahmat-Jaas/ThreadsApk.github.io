package X;

/* renamed from: X.8bd  reason: invalid class name and case insensitive filesystem */
public final class C141448bd extends C141478bg implements C145648kq {
    public final String A00;
    public final Throwable A01;

    public static final void A02(C141448bd r4) {
        String str;
        Throwable th = r4.A01;
        if (th != null) {
            String str2 = r4.A00;
            if (str2 == null || (str = AnonymousClass00U.A0L(". ", str2)) == null) {
                str = "";
            }
            throw new IllegalStateException(AnonymousClass00U.A0L("Module with the Main dispatcher had failed to initialize", str), th);
        }
        throw C18180wK.A0a("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public final String toString() {
        String str;
        Throwable th = this.A01;
        if (th != null) {
            str = AnonymousClass0wJ.A0t(", cause=", th);
        } else {
            str = "";
        }
        return AnonymousClass00U.A0M("Dispatchers.Main[missing", str, ']');
    }

    public C141448bd(Throwable th, String str) {
        this.A01 = th;
        this.A00 = str;
    }

    public final boolean A04(C27952Ew2 ew2) {
        A02(this);
        throw null;
    }

    public final /* bridge */ /* synthetic */ void A05(Runnable runnable, C27952Ew2 ew2) {
        A02(this);
        throw null;
    }

    public final Et5 BQx(Runnable runnable, C27952Ew2 ew2, long j) {
        A02(this);
        throw null;
    }

    public final /* bridge */ /* synthetic */ void Cg9(AnonymousClass8s9 r2, long j) {
        A02(this);
        throw null;
    }
}
