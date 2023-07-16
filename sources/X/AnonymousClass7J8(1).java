package X;

import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* renamed from: X.7J8  reason: invalid class name */
public final class AnonymousClass7J8 {
    public long A00;
    public final File A01;
    public final InputStream A02;
    public final String A03;
    public final String A04;
    public final Map A05;

    public static String A01(String str, String str2, String str3, long j) {
        String str4;
        try {
            StringBuilder A0r = C18200wM.A0r();
            byte[] digest = MessageDigest.getInstance("MD5").digest(AnonymousClass00U.A0L(str, str2).getBytes(Charset.forName("UTF-8")));
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            A0r.append(stringBuffer.toString());
            A0r.append("-");
            A0r.append(0);
            A0r.append("-");
            A0r.append(j);
            A0r.append("-");
            A0r.append(str3);
            if (!TextUtils.isEmpty((CharSequence) null)) {
                str4 = AnonymousClass00U.A0L("-", (String) null);
            } else {
                str4 = "";
            }
            A0r.append(str4);
            return A0r.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public AnonymousClass7J8(File file, String str, long j) {
        String str2;
        this.A05 = AnonymousClass0wJ.A0y();
        this.A01 = file;
        this.A02 = null;
        if (file != null) {
            str2 = file.getAbsolutePath();
        } else {
            str2 = "";
        }
        String A002 = A00(file);
        this.A00 = j;
        this.A04 = str;
        this.A03 = A01(AnonymousClass00U.A0L(str2, ""), str, A002, j);
    }

    private String A00(File file) {
        long j;
        try {
            j = Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
        } catch (Exception unused) {
            j = 0;
        }
        String l = Long.toString(j);
        long lastModified = this.A01.lastModified();
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(l);
        A0r.append("-");
        return C86154wM.A0n(A0r, lastModified);
    }

    public AnonymousClass7J8(InputStream inputStream) {
        this.A05 = AnonymousClass0wJ.A0y();
        this.A01 = null;
        this.A02 = inputStream;
        String A0J = AnonymousClass00U.A0J("stream-", inputStream.hashCode());
        this.A00 = -1;
        this.A04 = "application/json";
        this.A03 = A01(AnonymousClass00U.A0L(A0J, ""), "application/json", "stream", -1);
    }

    public AnonymousClass7J8(File file, String str) {
        this.A05 = AnonymousClass0wJ.A0y();
        this.A01 = file;
        this.A02 = null;
        String absolutePath = file.getAbsolutePath();
        this.A00 = file.length();
        this.A04 = str;
        this.A03 = A01(absolutePath, str, A00(file), this.A00);
    }

    public AnonymousClass7J8(File file, String str, String str2) {
        this.A05 = AnonymousClass0wJ.A0y();
        this.A01 = file;
        this.A02 = null;
        file.getAbsolutePath();
        this.A00 = file.length();
        this.A04 = str;
        this.A03 = str2;
    }
}
