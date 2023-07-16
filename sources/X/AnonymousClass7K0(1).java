package X;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import ch.boye.httpclientandroidlib.HttpHost;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: X.7K0  reason: invalid class name */
public final class AnonymousClass7K0 {
    public static final C16120sW A00;
    public static final List A01 = Arrays.asList(new String[]{"dialog/share", "share.php", "dialog/share_open_graph", "dialog/feed", "sharer.php"});
    public static final Set A02 = C86114wI.A0t(new String[]{"www.facebook.com", "m.facebook.com", "facebook.com", "fb.watch", "m.alpha.facebook.com", "www.alpha.facebook.com"});
    public static final List A03 = Arrays.asList(new String[]{"/home.php", "/login.php"});
    public static final Set A04 = C86114wI.A0t(new String[]{"https", HttpHost.DEFAULT_SCHEME_NAME});
    public static final Pattern A05 = Pattern.compile("(?:w{2,3}[0-9]*?\\.)?(([a-z0-9-]+\\.)+([a-z]{2,}))");

    static {
        List emptyList = Collections.emptyList();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        A0v2.add(Pattern.compile(".*"));
        A0v2.add(Pattern.compile(".*"));
        A0v2.add(Pattern.compile(".*"));
        A0v.add(A0v2);
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = 1;
        String[][] strArr = (String[][]) Array.newInstance(String.class, iArr);
        strArr[0] = new String[]{new String[]{"fbclid"}[0], ".*"};
        int length = strArr.length;
        if (length != 0) {
            try {
                emptyList = C18240wQ.A0k(length);
                int i = 0;
                while (true) {
                    String[] strArr2 = strArr[i];
                    ArrayList A0k = C18240wQ.A0k(strArr2.length);
                    for (String compile : strArr2) {
                        A0k.add(Pattern.compile(compile));
                    }
                    emptyList.add(A0k);
                    i++;
                    if (i >= length) {
                        break;
                    }
                }
            } catch (PatternSyntaxException unused) {
            }
        }
        if (!emptyList.isEmpty()) {
            A00 = new C16120sW(emptyList, A0v, true, true);
            return;
        }
        throw C18180wK.A0a("Field matchers cannot be empty when we are keeping value baesd on config.");
    }

    public static String A00(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = A05.matcher(str.trim().toLowerCase(Locale.US));
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = r3.getScheme();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(android.net.Uri r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x0016
            java.lang.String r0 = r3.getScheme()
            if (r0 == 0) goto L_0x0016
            java.util.Set r1 = A04
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0016
            r2 = 1
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7K0.A02(android.net.Uri):boolean");
    }

    public static boolean A04(String str) {
        if (str == null) {
            return false;
        }
        if (str.endsWith("/css") || str.endsWith("/javascript")) {
            return true;
        }
        return false;
    }

    public static String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (!TextUtils.isEmpty(fileExtensionFromUrl)) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r4.getPath().startsWith("/linkshim") == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r1.A02.equals("https") == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(android.net.Uri r4) {
        /*
            java.lang.String r1 = r4.getHost()
            r0 = 740(0x2e4, float:1.037E-42)
            java.lang.String r0 = X.I17.A00(r0)
            boolean r3 = r0.equals(r1)
            X.75y r1 = X.C1195775y.A00(r4)
            if (r1 == 0) goto L_0x002b
            r0 = 1167(0x48f, float:1.635E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            boolean r0 = X.AnonymousClass7D2.A01(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r1.A02
            java.lang.String r0 = "https"
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r2 = 1
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r4.getPath()
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "/linkshim"
            boolean r0 = r1.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            boolean r0 = X.AnonymousClass74M.A00(r4)
            if (r3 != 0) goto L_0x004e
            if (r1 != 0) goto L_0x004e
            if (r0 != 0) goto L_0x004e
            r2 = 0
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7K0.A03(android.net.Uri):boolean");
    }

    public static boolean A05(String str, String str2) {
        int length = str.length() - str2.length();
        if (!str.endsWith(str2)) {
            return false;
        }
        if (length == 0 || str.codePointAt(length - 1) == 46) {
            return true;
        }
        return false;
    }
}
