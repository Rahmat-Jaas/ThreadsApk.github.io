package X;

/* renamed from: X.265  reason: invalid class name */
public enum AnonymousClass265 {
    ONE_PAGE_V2("one_page_v2", "password"),
    SET_PASSWORD("add_password", "password"),
    DONE("done", "registration"),
    ACCESS_DIALOG("access_dialog", "login"),
    ONE_TAP("sso", "one_tap");
    
    public final String A00;
    public final String A01;

    public static AnonymousClass265 A00(String str, String str2, int i) {
        return new AnonymousClass265(str, i, str2);
    }

    /* access modifiers changed from: public */
    AnonymousClass265(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    /* access modifiers changed from: public */
    AnonymousClass265(String str) {
        this.A01 = str;
        this.A00 = str;
    }
}
