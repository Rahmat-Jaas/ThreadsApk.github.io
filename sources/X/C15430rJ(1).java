package X;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URI;
import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: X.0rJ  reason: invalid class name and case insensitive filesystem */
public final class C15430rJ {
    public static Uri A00(C16240si r4, String str, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("Url string is null");
        } else if (r4 != null) {
            try {
                return A01(str);
            } catch (SecurityException e) {
                r4.Ccw("UriParser", String.format(Locale.US, "Parse uri <sanitized \"%s\"> failed. Fail open: %b", new Object[]{A02(str), Boolean.valueOf(z)}), e);
                if (z) {
                    return Uri.parse(str);
                }
                return null;
            }
        } else {
            throw new IllegalArgumentException("reporter is null");
        }
    }

    public static boolean A05(String str, String str2) {
        if (str != null && !str.equals("")) {
            return str.equals(str2);
        }
        if (str2 == null || str2.equals("")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:25|26|27|28|(1:(1:31))|41|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f6, code lost:
        if (r1.contains("_") != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f8, code lost:
        r1 = r3.getHost();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0100, code lost:
        if (r4.getHost() != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0102, code lost:
        if (r1 == null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0104, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010b, code lost:
        if (r1.contains("_") != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010d, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010e, code lost:
        A04(r3, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
        return r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00db */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ee A[Catch:{ URISyntaxException -> 0x0112 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri A01(java.lang.String r12) {
        /*
            android.net.Uri r3 = android.net.Uri.parse(r12)
            java.lang.String r0 = r3.getScheme()
            if (r0 != 0) goto L_0x000e
            r0 = 1
        L_0x000b:
            if (r0 != 0) goto L_0x0088
            goto L_0x0019
        L_0x000e:
            java.lang.String r1 = r3.getScheme()
            java.lang.String r0 = "([a-zA-Z][a-zA-Z0-9+.-]*)?"
            boolean r0 = r1.matches(r0)
            goto L_0x000b
        L_0x0019:
            java.net.URI r2 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0072 }
            r2.<init>(r12)     // Catch:{ URISyntaxException -> 0x0072 }
            boolean r3 = r2.isOpaque()
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = r2.getScheme()
            android.net.Uri$Builder r1 = r1.scheme(r0)
            if (r3 == 0) goto L_0x0049
            java.lang.String r0 = r2.getRawSchemeSpecificPart()
            android.net.Uri$Builder r1 = r1.encodedOpaquePart(r0)
            java.lang.String r0 = r2.getRawFragment()
            android.net.Uri$Builder r0 = r1.encodedFragment(r0)
            android.net.Uri r3 = r0.build()
            A03(r3, r12, r2)
            return r3
        L_0x0049:
            java.lang.String r0 = r2.getRawAuthority()
            android.net.Uri$Builder r1 = r1.encodedAuthority(r0)
            java.lang.String r0 = r2.getRawPath()
            android.net.Uri$Builder r1 = r1.encodedPath(r0)
            java.lang.String r0 = r2.getRawQuery()
            android.net.Uri$Builder r1 = r1.encodedQuery(r0)
            java.lang.String r0 = r2.getRawFragment()
            android.net.Uri$Builder r0 = r1.encodedFragment(r0)
            android.net.Uri r3 = r0.build()
            r0 = 0
            A04(r3, r2, r0)
            return r3
        L_0x0072:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = A02(r12)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Parsing url <sanitized \"%s\"> caused exception"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x0088:
            boolean r0 = r3.isOpaque()
            if (r0 == 0) goto L_0x00b9
            java.lang.String r4 = r3.getScheme()     // Catch:{ URISyntaxException -> 0x00a3 }
            java.lang.String r2 = r3.getSchemeSpecificPart()     // Catch:{ URISyntaxException -> 0x00a3 }
            java.lang.String r1 = r3.getFragment()     // Catch:{ URISyntaxException -> 0x00a3 }
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00a3 }
            r0.<init>(r4, r2, r1)     // Catch:{ URISyntaxException -> 0x00a3 }
            A03(r3, r12, r0)
            return r3
        L_0x00a3:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = A02(r12)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Parsing url <sanitized \"%s\"> caused exception"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00b9:
            java.lang.String r5 = r3.getScheme()     // Catch:{ URISyntaxException -> 0x00db }
            java.lang.String r6 = r3.getUserInfo()     // Catch:{ URISyntaxException -> 0x00db }
            java.lang.String r7 = r3.getHost()     // Catch:{ URISyntaxException -> 0x00db }
            int r8 = r3.getPort()     // Catch:{ URISyntaxException -> 0x00db }
            java.lang.String r9 = r3.getPath()     // Catch:{ URISyntaxException -> 0x00db }
            java.lang.String r10 = r3.getQuery()     // Catch:{ URISyntaxException -> 0x00db }
            java.lang.String r11 = r3.getFragment()     // Catch:{ URISyntaxException -> 0x00db }
            java.net.URI r4 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00db }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ URISyntaxException -> 0x00db }
            goto L_0x00f8
        L_0x00db:
            java.lang.String r0 = r3.toString()     // Catch:{ URISyntaxException -> 0x0112 }
            java.net.URI r4 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0112 }
            r4.<init>(r0)     // Catch:{ URISyntaxException -> 0x0112 }
            java.lang.String r1 = r3.getHost()     // Catch:{ URISyntaxException -> 0x0112 }
            java.lang.String r0 = r4.getHost()     // Catch:{ URISyntaxException -> 0x0112 }
            if (r0 != 0) goto L_0x0112
            if (r1 == 0) goto L_0x0112
            java.lang.String r0 = "_"
            boolean r0 = r1.contains(r0)     // Catch:{ URISyntaxException -> 0x0112 }
            if (r0 == 0) goto L_0x0112
        L_0x00f8:
            java.lang.String r1 = r3.getHost()
            java.lang.String r0 = r4.getHost()
            if (r0 != 0) goto L_0x010d
            if (r1 == 0) goto L_0x010d
            java.lang.String r0 = "_"
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x010e
        L_0x010d:
            r0 = 0
        L_0x010e:
            A04(r3, r4, r0)
            return r3
        L_0x0112:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = A02(r12)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Parsing url <sanitized \"%s\"> caused exception"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15430rJ.A01(java.lang.String):android.net.Uri");
    }

    public static String A02(String str) {
        C15390rF r0;
        C15420rI r02;
        IllegalArgumentException illegalArgumentException;
        boolean z;
        int next;
        int codePointAt;
        int i;
        try {
            if (!TextUtils.isEmpty(str)) {
                BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.US);
                int indexOf = str.indexOf(58);
                int length = str.length();
                int A00 = C15420rI.A00(new int[]{str.indexOf(47, 0), str.indexOf(63, 0), str.indexOf(35, 0)}, length);
                if (indexOf < 0 || indexOf > A00) {
                    r02 = C15420rI.A01(str, (String) null, characterInstance, 0, length);
                } else {
                    String substring = str.substring(0, indexOf);
                    try {
                        if (!TextUtils.isEmpty(substring)) {
                            characterInstance.setText(substring);
                            int length2 = substring.length();
                            int current = characterInstance.current();
                            int codePointAt2 = substring.codePointAt(current);
                            if (codePointAt2 < 65 || (codePointAt2 > 90 && (codePointAt2 < 97 || codePointAt2 > 122))) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                illegalArgumentException = new IllegalArgumentException(AnonymousClass00U.A05(current, "Scheme contains illegal character ", new String(new int[]{codePointAt2}, 0, 1), " at string index "));
                            } else {
                                while (true) {
                                    next = characterInstance.next();
                                    if (next != -1 && next < length2) {
                                        codePointAt = substring.codePointAt(next);
                                        if (codePointAt < 65) {
                                            if (codePointAt < 48) {
                                                if (!(codePointAt == 43 || codePointAt == 45)) {
                                                    if (codePointAt != 46) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                i = 57;
                                            }
                                        } else if (codePointAt > 90) {
                                            if (codePointAt < 97) {
                                                break;
                                            }
                                            i = 122;
                                        } else {
                                            continue;
                                        }
                                        if (codePointAt > i) {
                                            break;
                                        }
                                    } else {
                                        r02 = C15420rI.A01(str, substring, characterInstance, indexOf + 1, length);
                                    }
                                }
                                illegalArgumentException = new IllegalArgumentException(AnonymousClass00U.A05(next - 1, "Scheme contains illegal character ", new String(new int[]{codePointAt}, 0, 1), " at code point offset "));
                            }
                        } else {
                            illegalArgumentException = new IllegalArgumentException("Scheme cannot be empty");
                        }
                        throw illegalArgumentException;
                    } catch (IllegalArgumentException e) {
                        r0 = new C15390rF(new C15420rI((C15410rH) null, substring, (String) null, (String) null, (String) null), "Uri contained an invalid scheme", e);
                    }
                }
                return r02.toString();
            }
            r0 = new C15390rF(new C15420rI((C15410rH) null, (String) null, (String) null, (String) null, (String) null));
            throw r0;
        } catch (C15390rF e2) {
            return e2.A00.A02();
        }
    }

    public static void A03(Uri uri, String str, URI uri2) {
        boolean A05 = A05(uri2.getScheme(), uri.getScheme());
        boolean A052 = A05(uri2.getSchemeSpecificPart(), uri.getSchemeSpecificPart());
        if (!A05 || !A052) {
            throw new SecurityException(String.format(Locale.US, "java uri <sanitized \"%s\"> not equal to android uri <sanitized \"%s\"> from original <sanitized \"%s\">", new Object[]{A02(uri2.toString()), A02(uri.toString()), A02(str)}));
        }
    }

    public static void A04(Uri uri, URI uri2, boolean z) {
        boolean A05 = A05(uri2.getScheme(), uri.getScheme());
        boolean A052 = A05(uri2.getAuthority(), uri.getAuthority());
        boolean A053 = A05(uri2.getPath(), uri.getPath());
        if (!A05 || !A052 || !A053) {
            String str = "";
            if (!A05) {
                str = AnonymousClass00U.A0L(str, String.format(Locale.US, "javaUri scheme: \"%s\". androidUri scheme: \"%s\".", new Object[]{uri2.getScheme(), uri.getScheme()}));
            }
            if (!z && !A052) {
                str = AnonymousClass00U.A0L(str, String.format(Locale.US, "javaUri authority: \"%s\". androidUri authority: \"%s\".", new Object[]{uri2.getAuthority(), uri.getAuthority()}));
            }
            if (!A053) {
                str = AnonymousClass00U.A0L(str, String.format(Locale.US, "javaUri path: \"%s\". androidUri path: \"%s\".", new Object[]{uri2.getPath(), uri.getPath()}));
            }
            throw new SecurityException(String.format(Locale.US, "java uri <sanitized \"%s\"> not equal to android uri <sanitized \"%s\">. Debug info %s.", new Object[]{A02(uri2.toString()), A02(uri.toString()), str}));
        }
    }
}
