package X;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: X.0q6  reason: invalid class name and case insensitive filesystem */
public final class C14760q6 implements HostnameVerifier {
    public static final Pattern A00 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        r2 = r2 - r1.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = 0
            if (r8 == 0) goto L_0x0090
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0090
            java.lang.String r2 = "."
            boolean r0 = r8.startsWith(r2)
            if (r0 != 0) goto L_0x0090
            java.lang.String r1 = ".."
            boolean r0 = r8.endsWith(r1)
            if (r0 != 0) goto L_0x0090
            if (r9 == 0) goto L_0x0090
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0090
            boolean r0 = r9.startsWith(r2)
            if (r0 != 0) goto L_0x0090
            boolean r0 = r9.endsWith(r1)
            if (r0 != 0) goto L_0x0090
            boolean r0 = r8.endsWith(r2)
            r5 = 46
            if (r0 != 0) goto L_0x0039
            java.lang.String r8 = X.AnonymousClass00U.A0A(r8, r5)
        L_0x0039:
            boolean r0 = r9.endsWith(r2)
            if (r0 != 0) goto L_0x0043
            java.lang.String r9 = X.AnonymousClass00U.A0A(r9, r5)
        L_0x0043:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r9.toLowerCase(r0)
            java.lang.String r0 = "*"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x0056
            boolean r4 = r8.equals(r6)
        L_0x0055:
            return r4
        L_0x0056:
            java.lang.String r1 = "*."
            boolean r0 = r6.startsWith(r1)
            if (r0 == 0) goto L_0x0090
            r0 = 42
            r4 = 1
            int r0 = r6.indexOf(r0, r4)
            r3 = -1
            if (r0 != r3) goto L_0x0090
            int r2 = r8.length()
            int r0 = r6.length()
            if (r2 < r0) goto L_0x0090
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x0090
            java.lang.String r1 = r6.substring(r4)
            boolean r0 = r8.endsWith(r1)
            if (r0 == 0) goto L_0x0090
            int r0 = r1.length()
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x0055
            int r2 = r2 - r4
            int r0 = r8.lastIndexOf(r5, r2)
            if (r0 == r3) goto L_0x0055
        L_0x0090:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14760q6.A01(java.lang.String, java.lang.String):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return A02(str, (X509Certificate) sSLSession.getPeerCertificates()[0]).A01;
        } catch (SSLException unused) {
            return false;
        }
    }

    public static List A00(X509Certificate x509Certificate, int i) {
        Number number;
        Object obj;
        ArrayList arrayList = new ArrayList();
        Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        if (subjectAlternativeNames == null) {
            return Collections.emptyList();
        }
        for (List next : subjectAlternativeNames) {
            if (!(next == null || next.size() < 2 || (number = (Number) next.get(0)) == null || number.intValue() != i || (obj = next.get(1)) == null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01aa, code lost:
        if (A01(r3, r4) != false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        r13 = r13 - r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C14730q2 A02(java.lang.String r19, java.security.cert.X509Certificate r20) {
        /*
            r18 = this;
            java.util.regex.Pattern r0 = A00
            r3 = r19
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
            r17 = r20
            if (r0 == 0) goto L_0x0019
            r1 = 7
            r0 = r17
            java.util.List r0 = A00(r0, r1)     // Catch:{ CertificateParsingException -> 0x01af }
            goto L_0x01b9
        L_0x0019:
            javax.security.auth.x500.X500Principal r0 = r17.getSubjectX500Principal()
            X.0q7 r8 = new X.0q7
            r8.<init>(r0)
            java.lang.String r16 = "cn"
            r6 = 0
            r8.A00 = r6
            java.lang.String r2 = X.C14770q7.A02(r8)
            r4 = 0
            if (r2 != 0) goto L_0x0031
        L_0x002e:
            r1 = 2
            goto L_0x016c
        L_0x0031:
            int r12 = r8.A00
            int r11 = r8.A02
            if (r12 == r11) goto L_0x002e
            char[] r10 = r8.A01
            char r1 = r10[r12]
            r13 = 34
            r9 = 59
            r7 = 44
            r5 = 43
            if (r1 == r13) goto L_0x00e8
            r0 = 35
            if (r1 == r0) goto L_0x009c
            if (r1 == r5) goto L_0x0098
            if (r1 == r7) goto L_0x0098
            if (r1 == r9) goto L_0x0098
            r1 = r12
            r13 = r12
        L_0x0051:
            if (r1 >= r11) goto L_0x0095
            char r15 = r10[r1]
            r14 = 32
            if (r15 == r14) goto L_0x007b
            if (r15 == r9) goto L_0x0095
            r0 = 92
            if (r15 == r0) goto L_0x006d
            if (r15 == r5) goto L_0x0095
            if (r15 == r7) goto L_0x0095
            r0 = r13
            int r13 = r13 + 1
            r10[r0] = r15
            int r1 = r1 + 1
        L_0x006a:
            r8.A00 = r1
            goto L_0x0051
        L_0x006d:
            r1 = r13
            int r13 = r13 + 1
            char r0 = X.C14770q7.A00(r8)
            r10[r1] = r0
            int r0 = r8.A00
            int r1 = r0 + 1
            goto L_0x006a
        L_0x007b:
            r0 = r13
            r15 = r13
            int r1 = r1 + 1
            r8.A00 = r1
            int r13 = r13 + 1
            r10[r0] = r14
        L_0x0085:
            if (r1 >= r11) goto L_0x0120
            char r0 = r10[r1]
            if (r0 != r14) goto L_0x0120
            r0 = r13
            int r13 = r13 + 1
            r10[r0] = r14
            int r1 = r1 + 1
            r8.A00 = r1
            goto L_0x0085
        L_0x0095:
            int r13 = r13 - r12
            goto L_0x012c
        L_0x0098:
            java.lang.String r14 = ""
            goto L_0x0131
        L_0x009c:
            int r0 = r12 + 4
            java.lang.String r1 = "Unexpected end of DN: "
            if (r0 >= r11) goto L_0x01e6
            int r13 = r12 + 1
        L_0x00a4:
            r8.A00 = r13
            if (r13 == r11) goto L_0x00d1
            char r14 = r10[r13]
            if (r14 == r5) goto L_0x00d1
            if (r14 == r7) goto L_0x00d1
            if (r14 == r9) goto L_0x00d1
            r15 = 32
            if (r14 != r15) goto L_0x00c1
            int r14 = r13 + 1
        L_0x00b6:
            r8.A00 = r14
            if (r14 >= r11) goto L_0x00d1
            char r0 = r10[r14]
            if (r0 != r15) goto L_0x00d1
            int r14 = r14 + 1
            goto L_0x00b6
        L_0x00c1:
            r0 = 65
            if (r14 < r0) goto L_0x00ce
            r0 = 70
            if (r14 > r0) goto L_0x00ce
            int r0 = r14 + 32
            char r0 = (char) r0
            r10[r13] = r0
        L_0x00ce:
            int r13 = r13 + 1
            goto L_0x00a4
        L_0x00d1:
            int r13 = r13 - r12
            r0 = 5
            if (r13 < r0) goto L_0x01da
            r0 = r13 & 1
            if (r0 == 0) goto L_0x01da
            int r14 = r13 >> 1
            r1 = 0
            int r0 = r12 + 1
        L_0x00de:
            if (r1 >= r14) goto L_0x012c
            X.C14770q7.A01(r8, r0)
            int r0 = r0 + 2
            int r1 = r1 + 1
            goto L_0x00de
        L_0x00e8:
            int r12 = r12 + 1
            r8.A00 = r12
            r0 = r12
            r1 = r12
        L_0x00ee:
            if (r0 == r11) goto L_0x01f2
            char r14 = r10[r0]
            if (r14 != r13) goto L_0x0103
            int r14 = r0 + 1
        L_0x00f6:
            r8.A00 = r14
            if (r14 >= r11) goto L_0x0119
            char r13 = r10[r14]
            r0 = 32
            if (r13 != r0) goto L_0x0119
            int r14 = r14 + 1
            goto L_0x00f6
        L_0x0103:
            r0 = 92
            if (r14 != r0) goto L_0x0116
            char r0 = X.C14770q7.A00(r8)
            r10[r12] = r0
        L_0x010d:
            int r0 = r8.A00
            int r0 = r0 + 1
            r8.A00 = r0
            int r12 = r12 + 1
            goto L_0x00ee
        L_0x0116:
            r10[r12] = r14
            goto L_0x010d
        L_0x0119:
            int r12 = r12 - r1
            java.lang.String r14 = new java.lang.String
            r14.<init>(r10, r1, r12)
            goto L_0x0131
        L_0x0120:
            if (r1 == r11) goto L_0x012a
            char r0 = r10[r1]
            if (r0 == r7) goto L_0x012a
            if (r0 == r5) goto L_0x012a
            if (r0 != r9) goto L_0x0051
        L_0x012a:
            int r13 = r15 - r12
        L_0x012c:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r10, r12, r13)
        L_0x0131:
            r0 = r16
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x013c
            r4 = r14
            goto L_0x002e
        L_0x013c:
            int r2 = r8.A00
            if (r2 >= r11) goto L_0x002e
            char r0 = r10[r2]
            java.lang.String r1 = "Malformed DN: "
            if (r0 == r7) goto L_0x0156
            if (r0 == r9) goto L_0x0156
            if (r0 == r5) goto L_0x0156
            java.lang.String r0 = r8.A03
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0156:
            int r0 = r2 + 1
            r8.A00 = r0
            java.lang.String r2 = X.C14770q7.A02(r8)
            if (r2 != 0) goto L_0x0031
            java.lang.String r0 = r8.A03
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x016c:
            r0 = r17
            java.util.List r1 = A00(r0, r1)     // Catch:{ CertificateParsingException -> 0x0173 }
            goto L_0x017c
        L_0x0173:
            r0 = move-exception
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            r0.getMessage()
        L_0x017c:
            X.0q2 r5 = new X.0q2
            r5.<init>()
            r5.A00 = r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.util.Iterator r2 = r1.iterator()
            r1 = 0
        L_0x018e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a2
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = A01(r3, r0)
            if (r0 != 0) goto L_0x01d6
            r1 = 1
            goto L_0x018e
        L_0x01a2:
            if (r1 != 0) goto L_0x01ad
            if (r4 == 0) goto L_0x01ad
            boolean r0 = A01(r3, r4)
            if (r0 == 0) goto L_0x01ad
            goto L_0x01d6
        L_0x01ad:
            r0 = 0
            goto L_0x01d7
        L_0x01af:
            r2 = move-exception
            r1 = 0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.getMessage()
        L_0x01b9:
            X.0q2 r5 = new X.0q2
            r5.<init>()
            r5.A00 = r0
            java.util.Iterator r1 = r0.iterator()
        L_0x01c4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ad
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x01c4
        L_0x01d6:
            r0 = 1
        L_0x01d7:
            r5.A01 = r0
            return r5
        L_0x01da:
            java.lang.String r0 = r8.A03
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01e6:
            java.lang.String r0 = r8.A03
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01f2:
            java.lang.String r1 = "Unexpected end of DN: "
            java.lang.String r0 = r8.A03
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14760q6.A02(java.lang.String, java.security.cert.X509Certificate):X.0q2");
    }
}
