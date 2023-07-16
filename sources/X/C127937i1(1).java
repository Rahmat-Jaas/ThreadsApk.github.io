package X;

import com.facebook.stash.core.FileStash;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.7i1  reason: invalid class name and case insensitive filesystem */
public final class C127937i1 implements FileStash {
    public int A00 = -1;
    public boolean A01 = false;
    public final C03700Kj A02;
    public final C37041JjM A03;
    public final File A04;

    public final InputStream CZ1(String str) {
        try {
            File file = getFile(str);
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            if (!this.A01) {
                return fileInputStream;
            }
            int i = this.A00;
            if (i > 0) {
                return new BufferedInputStream(fileInputStream, i);
            }
            return new BufferedInputStream(fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public C127937i1(C37041JjM jjM, File file) {
        AnonymousClass0IY r1 = AnonymousClass0IY.A00;
        this.A04 = file;
        this.A03 = jjM;
        this.A02 = r1;
    }

    public final Set getAllKeys() {
        int length;
        String[] list = this.A04.list();
        if (list == null || (length = list.length) == 0) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(length);
        for (String str : list) {
            char[] charArray = str.toCharArray();
            StringBuilder A0r = C18200wM.A0r();
            int i = 0;
            while (i < charArray.length) {
                char c = charArray[i];
                if (c == '%') {
                    try {
                        A0r.append((char) Integer.parseInt(new String(charArray, i + 1, 2), 16));
                        i += 2;
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    A0r.append(c);
                }
                i++;
            }
            str = A0r.toString();
            linkedHashSet.add(str);
        }
        return linkedHashSet;
    }

    public final File getBaseStoragePath_ForInternalUse() {
        return this.A04;
    }

    public final File getFilePath(String str) {
        File file = this.A04;
        char[] charArray = str.toCharArray();
        StringBuilder A0r = C18200wM.A0r();
        for (char c : charArray) {
            if (c == '%' || AnonymousClass73A.A00.contains(Character.valueOf(c))) {
                A0r.append('%');
                A0r.append(Integer.toHexString(c));
            } else {
                A0r.append(c);
            }
        }
        return C86154wM.A0U(file, A0r.toString());
    }

    public final int getItemCount() {
        String[] list = this.A04.list();
        if (list != null) {
            return list.length;
        }
        return 0;
    }

    public final long getSizeBytes() {
        return C121707Ho.A00(this.A04);
    }

    public final File insertFile(String str) {
        this.A04.mkdirs();
        File filePath = getFilePath(str);
        filePath.setLastModified(System.currentTimeMillis());
        return filePath;
    }

    public final boolean removeAll() {
        C37041JjM jjM = this.A03;
        File file = this.A04;
        if (!jjM.A07.A01(file)) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    public final long AqP(String str) {
        return C121707Ho.A00(getFilePath(str));
    }

    public final long BaH(String str) {
        return getFilePath(str).lastModified();
    }

    public final byte[] CZA(String str) {
        InputStream CZ1 = CZ1(str);
        if (CZ1 == null) {
            return null;
        }
        try {
            long length = getFilePath(str).length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                for (int i2 = 0; ((long) i2) < length; i2 += CZ1.read(bArr, i2, i)) {
                }
                CZ1.close();
                return bArr;
            }
            throw C18190wL.A0a(AnonymousClass00U.A08(length, "Trying to read too big resource, size (b): "));
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final OutputStream DBH(String str) {
        FileOutputStream fileOutputStream;
        File filePath = getFilePath(str);
        filePath.setLastModified(System.currentTimeMillis());
        try {
            fileOutputStream = new FileOutputStream(filePath);
        } catch (FileNotFoundException unused) {
            this.A04.mkdirs();
            fileOutputStream = new FileOutputStream(filePath);
        }
        if (this.A01) {
            return new BufferedOutputStream(fileOutputStream);
        }
        return fileOutputStream;
    }

    public final void DBJ(String str, byte[] bArr) {
        OutputStream DBH = DBH(str);
        try {
            DBH.write(bArr);
            DBH.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final File getFile(String str) {
        File filePath = getFilePath(str);
        if (!filePath.exists()) {
            return null;
        }
        filePath.setLastModified(System.currentTimeMillis());
        return filePath;
    }

    public final long[] getItemInformation(String str) {
        File filePath = getFilePath(str);
        return new long[]{filePath.lastModified(), C121707Ho.A00(filePath)};
    }

    public final boolean hasKey(String str) {
        return getFilePath(str).exists();
    }

    public final boolean remove(String str, int i) {
        return remove(str);
    }

    public final boolean remove(String str) {
        C37041JjM jjM = this.A03;
        return jjM.A07.A01(getFilePath(str));
    }
}
