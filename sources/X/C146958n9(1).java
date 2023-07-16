package X;

/* renamed from: X.8n9  reason: invalid class name and case insensitive filesystem */
public interface C146958n9 {
    C27952Ew2 getContext();

    void resumeWith(Object obj);

    static void A00(Throwable th, C146958n9 r2) {
        r2.resumeWith(new AnonymousClass0OW(th));
    }
}
