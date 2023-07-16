package X;

/* renamed from: X.68W  reason: invalid class name */
public enum AnonymousClass68W {
    RESPONSE_CODE_UNSPECIFIED(-999);
    
    public static final AnonymousClass84U A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C113696rz r4 = new C113696rz();
        for (AnonymousClass68W r1 : values()) {
            r4.A01(Integer.valueOf(r1.A00), r1);
        }
        A01 = r4.A00();
    }

    public static AnonymousClass68W A00(int i) {
        AnonymousClass84U r2 = A01;
        Integer valueOf = Integer.valueOf(i);
        if (!r2.containsKey(valueOf)) {
            return RESPONSE_CODE_UNSPECIFIED;
        }
        return (AnonymousClass68W) r2.get(valueOf);
    }

    /* access modifiers changed from: public */
    AnonymousClass68W(int i) {
        this.A00 = i;
    }
}
