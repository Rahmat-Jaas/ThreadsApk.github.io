package X;

import android.webkit.WebView;

/* renamed from: X.76k  reason: invalid class name and case insensitive filesystem */
public final class C1196776k {
    public static final int[] A05 = new int[2];
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public C1196776k(WebView webView) {
        this.A04 = String.format("%s{%s}", new Object[]{C18220wO.A0q(webView), Integer.toHexString(webView.hashCode())});
        int[] iArr = A05;
        webView.getLocationOnScreen(iArr);
        this.A01 = iArr[0];
        this.A02 = iArr[1];
        this.A03 = webView.getWidth();
        this.A00 = webView.getHeight();
    }
}
