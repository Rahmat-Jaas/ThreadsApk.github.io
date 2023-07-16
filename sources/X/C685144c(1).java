package X;

/* renamed from: X.44c  reason: invalid class name and case insensitive filesystem */
public final class C685144c implements C82324pR {
    public final String A00;

    public final void CWV(GXK gxk, String str) {
        String host = gxk.A08.getHost();
        if (host != null && host.equalsIgnoreCase(this.A00)) {
            gxk.A03(I17.A00(179), "android.instagram.com");
        }
    }

    public C685144c() {
        String host = C15430rJ.A01("https://maps.googleapis.com/maps/api/staticmap?").getHost();
        host.getClass();
        this.A00 = host;
    }
}
