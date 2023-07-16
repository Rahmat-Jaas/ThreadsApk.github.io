package X;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.2CK  reason: invalid class name */
public final class AnonymousClass2CK {
    public static File A00(Context context, String str, String str2) {
        FileOutputStream fileOutputStream;
        File cacheDir = context.getCacheDir();
        AssetManager assets = context.getAssets();
        File file = new File(cacheDir, str2);
        try {
            InputStream open = assets.open(str);
            try {
                fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1048576];
                while (true) {
                    int read = open.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        open.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                open.close();
                throw th;
            }
        } catch (IOException e) {
            throw new IOException(AnonymousClass00U.A0L("Could not open ", str), e);
        }
    }
}
