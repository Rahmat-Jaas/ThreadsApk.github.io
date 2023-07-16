package X;

/* renamed from: X.1nR  reason: invalid class name */
public final class AnonymousClass1nR extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nR(C697249u r7) {
        super("FxStoreFamilyDeviceIdInSharedPrefs", 668963102, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        String str;
        C697249u r2 = this.A00;
        C31152Gh4 A002 = C60833Qr.A00(r2.A05).A00("FX_CACHE_FDID_STORE");
        AnonymousClass3FH A0N = C18220wO.A0N(r2.A06);
        if (A0N != null) {
            str = A0N.A01;
        } else {
            str = "";
        }
        C31029Gdw A09 = A002.A09();
        A09.A0A("fdid", str);
        A09.A05();
    }
}
