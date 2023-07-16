package X;

import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.75h  reason: invalid class name and case insensitive filesystem */
public final class C1194275h {
    public final long A00;
    public final byte[] A01;

    public C1194275h(RandomAccessFile randomAccessFile) {
        long filePointer = randomAccessFile.getFilePointer();
        this.A00 = filePointer;
        long readInt = (long) randomAccessFile.readInt();
        if (readInt == 0) {
            readInt = randomAccessFile.length() - filePointer;
        } else if (readInt == 1) {
            readInt = randomAccessFile.readLong();
        }
        byte[] bArr = new byte[4];
        this.A01 = bArr;
        randomAccessFile.readFully(bArr);
        randomAccessFile.seek(filePointer + readInt);
    }

    public static C1194275h A00(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.getFilePointer() >= randomAccessFile.length() - 8) {
            return null;
        }
        byte[] bArr = new byte[4];
        randomAccessFile.skipBytes(4);
        randomAccessFile.readFully(bArr);
        String str = new String(bArr);
        randomAccessFile.seek(randomAccessFile.getFilePointer() - 8);
        Package packageR = C1194275h.class.getPackage();
        packageR.getClass();
        try {
            return (C1194275h) C86134wK.A0h(RandomAccessFile.class, Class.forName(AnonymousClass00U.A0V(packageR.getName(), ".", str.toUpperCase())), randomAccessFile);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return new C1194275h(randomAccessFile);
        }
    }
}
