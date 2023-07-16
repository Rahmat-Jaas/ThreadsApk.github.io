package X;

import android.content.Context;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* renamed from: X.6sI  reason: invalid class name and case insensitive filesystem */
public final class C113866sI {
    public final Context A00;
    public final File A01;
    public final MessageDigest A02;
    public final HashMap A03 = AnonymousClass0wJ.A0y();

    /* JADX INFO: finally extract failed */
    public final String A00(C142518ez r8) {
        HashMap hashMap = this.A03;
        String A0f = C18240wQ.A0f(r8, hashMap);
        if (A0f != null && C86144wL.A0Z(A0f).isFile()) {
            return A0f;
        }
        File createTempFile = File.createTempFile("template_", RealtimeLogsProvider.LOG_SUFFIX, this.A01);
        InputStream openRawResource = this.A00.getResources().openRawResource(((D3W) r8).A02);
        C04220Ms.A06(openRawResource);
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = openRawResource.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    openRawResource.close();
                    fileOutputStream.close();
                    String canonicalPath = createTempFile.getCanonicalPath();
                    C04220Ms.A06(canonicalPath);
                    hashMap.put(r8, canonicalPath);
                    return createTempFile.getCanonicalPath();
                }
            } catch (Throwable th) {
                openRawResource.close();
                fileOutputStream.close();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final String A01(String str) {
        if (str == null) {
            return null;
        }
        byte[] A002 = AnonymousClass74V.A00(str);
        HashMap hashMap = this.A03;
        String A0f = C18240wQ.A0f(this.A02.digest(A002), hashMap);
        if (A0f != null && C86144wL.A0Z(A0f).isFile() && C86144wL.A0Z(A0f).length() == ((long) A002.length)) {
            return A0f;
        }
        File createTempFile = File.createTempFile("beats_", RealtimeLogsProvider.LOG_SUFFIX, this.A01);
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            fileOutputStream.write(A002);
            fileOutputStream.close();
            String canonicalPath = createTempFile.getCanonicalPath();
            C04220Ms.A06(canonicalPath);
            hashMap.put(str, canonicalPath);
            return createTempFile.getCanonicalPath();
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    public C113866sI(Context context) {
        this.A00 = context;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            C04220Ms.A06(instance);
            this.A02 = instance;
            this.A01 = ITF.A00().AOC((C109746kY) null, 610481668);
        } catch (NoSuchAlgorithmException e) {
            throw C86114wI.A0k(e);
        }
    }
}
