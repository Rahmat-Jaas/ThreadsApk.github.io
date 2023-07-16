package ch.boye.httpclientandroidlib.impl.client.cache;

import X.C18180wK;
import ch.boye.httpclientandroidlib.client.cache.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileResource implements Resource {
    public static final long serialVersionUID = 4132244415919043397L;
    public volatile boolean disposed = false;
    public final File file;

    public synchronized void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.file.delete();
        }
    }

    public synchronized File getFile() {
        ensureValid();
        return this.file;
    }

    public synchronized InputStream getInputStream() {
        ensureValid();
        return new FileInputStream(this.file);
    }

    public synchronized long length() {
        ensureValid();
        return this.file.length();
    }

    private void ensureValid() {
        if (this.disposed) {
            throw C18180wK.A0a("Resource has been deallocated");
        }
    }

    public FileResource(File file2) {
        this.file = file2;
    }
}
