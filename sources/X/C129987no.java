package X;

import com.facebook.papaya.log.LogSink;

/* renamed from: X.7no  reason: invalid class name and case insensitive filesystem */
public final class C129987no implements C83334rD {
    public final /* synthetic */ LogSink A00;
    public final /* synthetic */ String A01;

    public final void onFailure(Throwable th) {
    }

    public C129987no(LogSink logSink, String str) {
        this.A01 = str;
        this.A00 = logSink;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C146428mE r3 = (C146428mE) obj;
        if (r3 != null) {
            r3.A6a(this.A00, this.A01);
        }
    }
}
