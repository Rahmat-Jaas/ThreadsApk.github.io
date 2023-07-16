package X;

import android.content.Context;

/* renamed from: X.6qV  reason: invalid class name and case insensitive filesystem */
public final class C112976qV {
    public C40621Lk1 A00;
    public C41190Lyh A01;
    public Object A02;
    public final int A03;
    public final Context A04;
    public final Object A05;
    public final M4z[] A06;

    public final C41190Lyh A00() {
        C41190Lyh lyh = this.A01;
        if (lyh != null) {
            return lyh;
        }
        throw C18180wK.A0a("Trying to access the LayoutCache from outside a layout call");
    }

    public C112976qV(Context context, C41190Lyh lyh, Object obj, M4z[] m4zArr, int i) {
        this.A04 = context;
        this.A03 = i;
        this.A01 = lyh;
        this.A05 = obj;
        this.A06 = m4zArr;
    }
}
