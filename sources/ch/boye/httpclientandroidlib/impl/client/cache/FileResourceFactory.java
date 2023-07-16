package ch.boye.httpclientandroidlib.impl.client.cache;

import X.C18200wM;
import X.C86154wM;
import ch.boye.httpclientandroidlib.client.cache.InputLimit;
import ch.boye.httpclientandroidlib.client.cache.Resource;
import ch.boye.httpclientandroidlib.client.cache.ResourceFactory;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileResourceFactory implements ResourceFactory {
    public final File cacheDir;
    public final BasicIdGenerator idgen = new BasicIdGenerator();

    public FileResourceFactory(File file) {
        this.cacheDir = file;
    }

    private File generateUniqueCacheFile(String str) {
        StringBuilder A0r = C18200wM.A0r();
        this.idgen.generate(A0r);
        A0r.append('.');
        int min = Math.min(str.length(), 100);
        for (int i = 0; i < min; i++) {
            char charAt = str.charAt(i);
            if (!Character.isLetterOrDigit(charAt) && charAt != '.') {
                charAt = Rfc3492Idn.delimiter;
            }
            A0r.append(charAt);
        }
        return C86154wM.A0U(this.cacheDir, A0r.toString());
    }

    public Resource copy(String str, Resource resource) {
        File generateUniqueCacheFile = generateUniqueCacheFile(str);
        if (resource instanceof FileResource) {
            IOUtils.copyFile(((FileResource) resource).getFile(), generateUniqueCacheFile);
        } else {
            IOUtils.copyAndClose(resource.getInputStream(), new FileOutputStream(generateUniqueCacheFile));
        }
        return new FileResource(generateUniqueCacheFile);
    }

    /* JADX INFO: finally extract failed */
    public Resource generate(String str, InputStream inputStream, InputLimit inputLimit) {
        File generateUniqueCacheFile = generateUniqueCacheFile(str);
        FileOutputStream fileOutputStream = new FileOutputStream(generateUniqueCacheFile);
        try {
            byte[] bArr = new byte[2048];
            long j = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                j += (long) read;
                if (inputLimit != null && j > inputLimit.value) {
                    inputLimit.reached = true;
                    break;
                }
            }
            fileOutputStream.close();
            return new FileResource(generateUniqueCacheFile);
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }
}
