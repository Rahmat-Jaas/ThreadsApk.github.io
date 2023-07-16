package X;

/* renamed from: X.41X  reason: invalid class name */
public final class AnonymousClass41X implements C143978hc {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public AnonymousClass41X(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        GXN gxn = new GXN();
        gxn.A05("upload_id", this.A01);
        gxn.A05(AnonymousClass000.A00(899), this.A00);
        gxn.A05("use_fbuploader", "true");
        return gxn;
    }
}
