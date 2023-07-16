package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.1vs  reason: invalid class name and case insensitive filesystem */
public final class C28981vs extends C34608Ibe implements C82424pb {
    public static final String __redex_internal_original_name = "FundraiserDonationWebViewFragment";
    public WebView A00;

    public final boolean onBackPressed() {
        if (this.A00.getUrl() != null) {
            Uri A01 = C15430rJ.A01(this.A00.getUrl());
            String host = A01.getHost();
            String path = A01.getPath();
            String queryParameter = A01.getQueryParameter("currentStep");
            if (host != null && path != null && queryParameter != null && host.equals("www.instagram.com") && path.equals("/donate/checkout/") && queryParameter.equals("confirmation")) {
                A00(false);
            } else if (!super.onBackPressed()) {
                FragmentActivity requireActivity = requireActivity();
                Intent A0B = C18230wP.A0B();
                A0B.putExtra("DONATION_RESULT_KEY", "DONATION_INCOMPLETE");
                C18200wM.A10(requireActivity, A0B);
                return true;
            }
        }
        return true;
    }

    private void A00(boolean z) {
        FragmentActivity requireActivity = requireActivity();
        if (z) {
            C10300i6 r2 = this.A03;
            r2.getClass();
            C63863iT.A0A(requireActivity, C18180wK.A06(), r2, "fbpay_hub");
        }
        Intent A0B = C18230wP.A0B();
        A0B.putExtra("DONATION_RESULT_KEY", "DONATION_COMPLETE");
        A0B.putExtra("IS_REDIRECTED_KEY", z);
        C18200wM.A10(requireActivity, A0B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        if (r2.equals("cancel") != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(android.net.Uri r8, android.webkit.WebView r9) {
        /*
            r7 = this;
            java.lang.String r3 = r8.getScheme()
            java.lang.String r5 = r8.getHost()
            java.lang.String r0 = "event"
            java.lang.String r2 = r8.getQueryParameter(r0)
            java.lang.String r0 = "currentStep"
            java.lang.String r1 = r8.getQueryParameter(r0)
            if (r3 == 0) goto L_0x008f
            if (r5 == 0) goto L_0x008f
            java.lang.String r0 = "instagram"
            boolean r6 = r3.equals(r0)
            r4 = 1
            if (r6 == 0) goto L_0x002d
            java.lang.String r0 = "fbpay_hub"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002d
            r7.A00(r4)
            return r4
        L_0x002d:
            r3 = 0
            if (r1 == 0) goto L_0x0042
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "confirmation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0042
        L_0x003e:
            r7.A00(r3)
            return r4
        L_0x0042:
            java.lang.String r0 = "www.instagram.com"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = r8.getPath()
            if (r0 == 0) goto L_0x006f
            java.lang.String r1 = r8.getPath()
            java.lang.String r0 = "/browser/closeWindow"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006f
        L_0x005c:
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            android.content.Intent r2 = X.C18230wP.A0B()
            java.lang.String r1 = "DONATION_RESULT_KEY"
            java.lang.String r0 = "DONATION_INCOMPLETE"
            r2.putExtra(r1, r0)
            X.C18200wM.A10(r3, r2)
            return r4
        L_0x006f:
            if (r2 == 0) goto L_0x008f
            java.lang.String r0 = "resume"
            if (r6 == 0) goto L_0x008f
            boolean r1 = r5.equals(r0)
            if (r1 == 0) goto L_0x0084
            java.lang.String r0 = "done"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0084
            goto L_0x003e
        L_0x0084:
            if (r1 == 0) goto L_0x008f
            java.lang.String r0 = "cancel"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008f
            goto L_0x005c
        L_0x008f:
            boolean r4 = super.A02(r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28981vs.A02(android.net.Uri, android.webkit.WebView):boolean");
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1290289225);
        super.onCreate(bundle);
        C18190wL.A0F(this).setSoftInputMode(16);
        C14030oh.A09(332852573, A02);
    }

    public final void A01(WebView webView) {
        this.A00 = webView;
    }
}
