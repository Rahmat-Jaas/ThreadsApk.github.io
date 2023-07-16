package X;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.0N0  reason: invalid class name */
public final class AnonymousClass0N0 implements C15210qv {
    public File A00;
    public FileInputStream A01;
    public FileChannel A02;

    public final int CYz(ByteBuffer byteBuffer, long j) {
        return this.A02.read(byteBuffer, j);
    }

    public final void close() {
        this.A01.close();
    }

    public final boolean isOpen() {
        return this.A02.isOpen();
    }

    public final int read(ByteBuffer byteBuffer) {
        return this.A02.read(byteBuffer);
    }

    public final long size() {
        return this.A02.size();
    }

    public final int write(ByteBuffer byteBuffer) {
        return this.A02.write(byteBuffer);
    }

    public AnonymousClass0N0(File file) {
        this.A00 = file;
        FileInputStream fileInputStream = new FileInputStream(file);
        this.A01 = fileInputStream;
        this.A02 = fileInputStream.getChannel();
    }
}
