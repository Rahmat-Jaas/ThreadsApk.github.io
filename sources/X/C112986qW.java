package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;

/* renamed from: X.6qW  reason: invalid class name and case insensitive filesystem */
public final class C112986qW {
    public long A00 = 2;
    public String A01;
    public String A02;
    public Map A03 = AnonymousClass0wJ.A0y();
    public final Context A04;
    public final AnonymousClass76W A05;
    public final boolean A06;

    public C112986qW(Context context, UserSession userSession) {
        AnonymousClass76W r2 = new AnonymousClass76W(context);
        this.A04 = context.getApplicationContext();
        this.A05 = r2;
        AnonymousClass0TJ r22 = AnonymousClass0TJ.A05;
        this.A00 = (long) C63803iN.A07(r22, userSession, 36592584491074056L).intValue();
        boolean A0E = C63803iN.A0E(r22, userSession, 36311564780831382L);
        this.A06 = A0E;
        if (A0E) {
            this.A01 = context.getCacheDir().getName();
        }
    }

    public final String A00(File file) {
        String str;
        String str2;
        AnonymousClass76W r4 = this.A05;
        String name = file.getName();
        if (name.matches("\\d+")) {
            name = "__id__";
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (r4.A01 == null) {
                File parentFile2 = r4.A02.getDatabasePath("ignore").getParentFile();
                if (parentFile2 == null) {
                    String str3 = r4.A00;
                    if (str3 == null) {
                        C104786cN r0 = r4.A03;
                        if (r0 != null) {
                            File file2 = r0.A00;
                            try {
                                str3 = file2.getCanonicalPath();
                            } catch (IOException unused) {
                                str3 = file2.getAbsolutePath();
                            }
                            r4.A00 = str3;
                        } else {
                            throw C18180wK.A0a("Sanitizer initialised without a valid path");
                        }
                    }
                    parentFile2 = new File(str3, "databases");
                }
                try {
                    str2 = parentFile2.getCanonicalPath();
                } catch (IOException unused2) {
                    str2 = parentFile2.getAbsolutePath();
                }
                r4.A01 = str2;
            }
            try {
                str = parentFile.getCanonicalPath();
            } catch (IOException unused3) {
                str = parentFile.getAbsolutePath();
            }
            if (str.equals(r4.A01)) {
                for (String str4 : AnonymousClass76W.A05) {
                    if (name.endsWith(str4)) {
                        name = name.replace(str4, "");
                    }
                }
            }
        }
        Matcher matcher = AnonymousClass76W.A04.matcher(name);
        if (matcher.find()) {
            name = matcher.replaceAll("__hash__");
        }
        String replace = name.replaceAll("\\d+", "X").replace(' ', '_');
        if (replace.length() >= 64) {
            return "__hash__";
        }
        return replace;
    }
}
