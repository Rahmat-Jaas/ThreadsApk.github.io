package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

public abstract class JITProfile {
    public static final byte[] PROFILE_MAGIC = {112, 114, 111, 0};
    public static final String TAG = "JITProfile";

    public static boolean isMagicRight(byte[] bArr) {
        Object[] objArr;
        int length = bArr.length;
        if (length < 4) {
            objArr = new Object[]{": profile header only has %d bytes, too short", Integer.valueOf(length)};
        } else {
            int i = 0;
            while (bArr[i] == PROFILE_MAGIC[i]) {
                i++;
                if (i >= 4) {
                    return true;
                }
            }
            objArr = new Object[]{"JITProfile:Incorrect profile magic"};
        }
        Mlog.w(TAG, objArr);
        return false;
    }

    public static short readShortFromContent(byte[] bArr, int i) {
        short s = 0;
        int i2 = 1;
        do {
            s = (short) (((short) (s << 8)) | (bArr[i + i2] & 255));
            i2--;
        } while (i2 >= 0);
        return s;
    }

    public static int readUInt16FromContent(byte[] bArr, int i) {
        byte b = 0;
        int i2 = 1;
        do {
            b = (b << 8) | (bArr[i + i2] & 255);
            i2--;
        } while (i2 >= 0);
        return b;
    }

    public static int readUnsignedIntFromContent(byte[] bArr, int i) {
        byte b = 0;
        int i2 = 3;
        do {
            b = (b << 8) | (bArr[i + i2] & 255);
            i2--;
        } while (i2 >= 0);
        return b;
    }

    public abstract void change2MegaZipDexLocations(String str);

    public abstract boolean fixDexChecksums(HashMap hashMap);

    public abstract byte[] getVersion();

    public abstract boolean isValid();

    public abstract boolean isVersionRight(byte[] bArr);

    public abstract boolean readFileHeader(InputStream inputStream);

    public abstract boolean writeProfile(FileOutputStream fileOutputStream);

    /* JADX INFO: finally extract failed */
    public static HashMap deserializeCheckSumFile(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try {
            HashMap hashMap = (HashMap) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return hashMap;
        } catch (ClassNotFoundException e) {
            Mlog.w(TAG, "could not read hashmap from %s for reason %s", file.getName(), e);
            objectInputStream.close();
            fileInputStream.close();
            return null;
        } catch (Throwable th) {
            objectInputStream.close();
            fileInputStream.close();
            throw th;
        }
    }

    public static void writeShortToContent(byte[] bArr, int i, short s) {
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    public static void writeUnsignedIntToContent(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.FileOutputStream} */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r3 == 0) goto L_0x0091;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean produceProfileFile(java.io.File r8, java.io.File r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r4 = "JITProfile"
            java.lang.String r0 = r8.getName()
            r7.change2MegaZipDexLocations(r0)
            java.util.HashMap r1 = populateDex2ChecksumMap(r8, r9)
            r6 = 0
            if (r1 == 0) goto L_0x0091
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0091
            r7.fixDexChecksums(r1)
            r5 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0069, all -> 0x008f }
            r3.<init>(r9)     // Catch:{ FileNotFoundException -> 0x0069, all -> 0x008f }
            if (r10 == 0) goto L_0x004b
            java.nio.channels.FileChannel r0 = r3.getChannel()     // Catch:{ IOException -> 0x002c }
            java.nio.channels.FileLock r5 = r0.tryLock()     // Catch:{ IOException -> 0x002c }
            if (r5 != 0) goto L_0x004b
            goto L_0x003a
        L_0x002c:
            r2 = move-exception
            java.lang.String r1 = "io exception %s while locking %"
            java.lang.String r0 = r9.getName()     // Catch:{ FileNotFoundException -> 0x0067 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r0}     // Catch:{ FileNotFoundException -> 0x0067 }
            com.facebook.common.dextricks.Mlog.w(r4, r0)     // Catch:{ FileNotFoundException -> 0x0067 }
        L_0x003a:
            java.lang.String r1 = "cannnot lock profile %s"
            java.lang.String r0 = r9.getName()     // Catch:{ FileNotFoundException -> 0x0067 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ FileNotFoundException -> 0x0067 }
            com.facebook.common.dextricks.Mlog.w(r4, r0)     // Catch:{ FileNotFoundException -> 0x0067 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0067 }
            goto L_0x007f
        L_0x004b:
            boolean r2 = r7.writeProfile(r3)     // Catch:{ FileNotFoundException -> 0x0067 }
            if (r2 != 0) goto L_0x005e
            java.lang.String r1 = "cannnot write to profile %s"
            java.lang.String r0 = r9.getName()     // Catch:{ FileNotFoundException -> 0x0067 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ FileNotFoundException -> 0x0067 }
            com.facebook.common.dextricks.Mlog.w(r4, r0)     // Catch:{ FileNotFoundException -> 0x0067 }
        L_0x005e:
            if (r5 == 0) goto L_0x0063
            r5.release()
        L_0x0063:
            r3.close()
            return r2
        L_0x0067:
            r2 = move-exception
            goto L_0x006b
        L_0x0069:
            r2 = move-exception
            r3 = r5
        L_0x006b:
            java.lang.String r1 = "cannot find profile file %s, exception %s"
            java.lang.String r0 = r9.getName()     // Catch:{ all -> 0x0083 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0, r2}     // Catch:{ all -> 0x0083 }
            com.facebook.common.dextricks.Mlog.w(r4, r0)     // Catch:{ all -> 0x0083 }
            if (r5 == 0) goto L_0x007d
            r5.release()
        L_0x007d:
            if (r3 == 0) goto L_0x0091
        L_0x007f:
            r3.close()
            return r6
        L_0x0083:
            r0 = move-exception
            if (r5 == 0) goto L_0x0089
            r5.release()
        L_0x0089:
            if (r3 == 0) goto L_0x0090
            r3.close()
            throw r0
        L_0x008f:
            r0 = move-exception
        L_0x0090:
            throw r0
        L_0x0091:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.JITProfile.produceProfileFile(java.io.File, java.io.File, boolean):boolean");
    }

    public static HashMap populateDex2ChecksumMap(File file, File file2) {
        File file3 = new File(file2.getParentFile(), AnonymousClass00U.A0L(file.getName(), ".checksum"));
        if (file3.exists()) {
            return deserializeCheckSumFile(file3);
        }
        Mlog.w(TAG, "checksum file %s for mega zip doesn't exist ", file3.getName());
        return null;
    }

    public static void writeStringToContent(byte[] bArr, int i, String str) {
        byte[] bytes = str.getBytes();
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bArr[i + i2] = bytes[i2];
        }
    }
}
