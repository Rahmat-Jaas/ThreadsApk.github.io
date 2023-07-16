package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.client.cache.Resource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class HeapResource implements Resource {
    public static final long serialVersionUID = -2078599905620463394L;
    public final byte[] b;

    public void dispose() {
    }

    public byte[] getByteArray() {
        return this.b;
    }

    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.b);
    }

    public long length() {
        return (long) this.b.length;
    }

    public HeapResource(byte[] bArr) {
        this.b = bArr;
    }
}
