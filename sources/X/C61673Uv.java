package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.Map;

/* renamed from: X.3Uv  reason: invalid class name and case insensitive filesystem */
public final class C61673Uv {
    public static final C16240si A08 = new C36890Jge("IgSecureUriParser").A01;
    public int A00;
    public SpannableStringBuilder A01;
    public String A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final Map A06 = AnonymousClass0wJ.A0y();
    public final boolean A07;

    public final void A00(Context context) {
        if (this.A07) {
            this.A01.append(" ");
            this.A01.setSpan(new F32(C63563ho.A00(context)), this.A01.length() - 1, this.A01.length(), 33);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r6 == 5) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61673Uv(android.content.Context r11, java.lang.String r12) {
        /*
            r10 = this;
            r10.<init>()
            r9 = 0
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            r10.A06 = r0
            java.lang.String r0 = "\\|"
            r7 = 5
            java.lang.String[] r8 = r12.split(r0, r7)
            int r6 = r8.length
            r5 = 4
            r3 = 1
            if (r6 == r5) goto L_0x0019
            r0 = 0
            if (r6 != r7) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            r2 = -1
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = ""
            r10.A05 = r0
            r10.A04 = r0
            r10.A02 = r0
            r10.A03 = r2
            java.lang.String r1 = "NewsfeedEmbeddedText"
            java.lang.String r0 = "Response does not have correct number of fields"
            X.C10450iM.A03(r1, r0)
        L_0x002e:
            return
        L_0x002f:
            r1 = r8[r9]     // Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x003a }
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r1, r0)     // Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x003a }
            r10.A02 = r0     // Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x003a }
            goto L_0x004c
        L_0x003a:
            r4 = move-exception
            java.lang.String r1 = "Failed to decode embedded text: "
            r0 = r8[r9]
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.String r0 = "Couldn't decode embedded text"
            X.C10450iM.A06(r0, r1, r4)
            r0 = r8[r9]
            r10.A02 = r0
        L_0x004c:
            java.lang.String r1 = "#"
            r0 = r8[r3]     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ NumberFormatException -> 0x0059 }
            int r2 = android.graphics.Color.parseColor(r0)     // Catch:{ NumberFormatException -> 0x0059 }
            goto L_0x0066
        L_0x0059:
            java.lang.String r1 = "Failed to parse the color string: "
            r0 = r8[r3]
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.String r0 = "NewsfeedEmbeddedText_Color"
            X.C10450iM.A03(r0, r1)
        L_0x0066:
            boolean r0 = X.C34822La.A00(r11)
            if (r0 == 0) goto L_0x0075
            r0 = -1
            int r0 = X.C09760gd.A08(r2, r0)
            r10.A03 = r0
        L_0x0073:
            r4 = 2
            goto L_0x0078
        L_0x0075:
            r10.A03 = r2
            goto L_0x0073
        L_0x0078:
            r0 = r8[r4]     // Catch:{ NumberFormatException -> 0x0081 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0081 }
            r10.A00 = r0     // Catch:{ NumberFormatException -> 0x0081 }
            goto L_0x009b
        L_0x0081:
            r2 = move-exception
            java.lang.String r0 = "Failed to parse style info: "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r0 = r8[r4]
            r1.append(r0)
            java.lang.String r0 = ", Exception: "
            r1.append(r0)
            java.lang.String r1 = X.C18200wM.A0m(r2, r1)
            java.lang.String r0 = "NewsfeedEmbeddedText_Style"
            X.C10450iM.A03(r0, r1)
        L_0x009b:
            r0 = 3
            r2 = r8[r0]
            r10.A04 = r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00d6
            java.lang.String r0 = "ig://"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r2)
            X.0si r0 = A08
            android.net.Uri r4 = X.C15430rJ.A00(r0, r1, r3)
            if (r4 == 0) goto L_0x00d6
            java.lang.String r0 = r4.getHost()
            r10.A05 = r0
            java.util.Set r0 = r4.getQueryParameterNames()
            java.util.Iterator r3 = r0.iterator()
        L_0x00c2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.String r2 = X.C18180wK.A0k(r3)
            java.util.Map r1 = r10.A06
            java.lang.String r0 = r4.getQueryParameter(r2)
            r1.put(r2, r0)
            goto L_0x00c2
        L_0x00d6:
            r10.A05 = r2
        L_0x00d8:
            if (r6 != r7) goto L_0x002e
            r1 = r8[r5]
            java.lang.String r0 = "verified"
            boolean r0 = r0.equals(r1)
            r10.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61673Uv.<init>(android.content.Context, java.lang.String):void");
    }
}
