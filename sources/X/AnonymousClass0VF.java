package X;

import android.content.Context;
import com.facebook.redex.IDxComparatorShape301S0100000_I2;
import com.facebook.redex.IDxFFilterShape158S0000000_I2;
import com.facebook.redex.IDxFFilterShape519S0100000_I2;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0VF  reason: invalid class name */
public final class AnonymousClass0VF {
    public static final FilenameFilter A07 = new IDxFFilterShape158S0000000_I2(0);
    public static final FilenameFilter A08 = new IDxFFilterShape158S0000000_I2(1);
    public int A00 = 0;
    public long A01 = 0;
    public AnonymousClass0VE A02 = new AnonymousClass0VE();
    public File A03;
    public File A04;
    public File A05;
    public final File A06;

    public static void A01(AnonymousClass0VF r7, File file, File file2, FilenameFilter[] filenameFilterArr, long j) {
        List asList;
        if (r3 == 0) {
            return;
        }
        if (file.exists() || file.isDirectory()) {
            ArrayList arrayList = new ArrayList();
            for (FilenameFilter listFiles : filenameFilterArr) {
                File[] listFiles2 = file.listFiles(listFiles);
                if (listFiles2 == null) {
                    asList = Collections.EMPTY_LIST;
                } else {
                    asList = Arrays.asList(listFiles2);
                }
                arrayList.addAll(asList);
            }
            long currentTimeMillis = System.currentTimeMillis() - j;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file3 = (File) it.next();
                if (file3.lastModified() < currentTimeMillis) {
                    boolean A032 = A03(r7, file3, new File(file2, file3.getName()));
                    AnonymousClass0VE r1 = r7.A02;
                    if (A032) {
                        r1.A05++;
                    } else {
                        r1.A04++;
                    }
                }
            }
        }
    }

    public static void A02(AnonymousClass0VF r5, File file, FilenameFilter[] filenameFilterArr, int i) {
        List asList;
        if (r4 == 0) {
            return;
        }
        if (file.exists() || file.isDirectory()) {
            ArrayList arrayList = new ArrayList();
            for (FilenameFilter listFiles : filenameFilterArr) {
                File[] listFiles2 = file.listFiles(listFiles);
                if (listFiles2 == null) {
                    asList = Collections.EMPTY_LIST;
                } else {
                    asList = Arrays.asList(listFiles2);
                }
                arrayList.addAll(asList);
            }
            if (arrayList.size() > i) {
                Collections.sort(arrayList, new IDxComparatorShape301S0100000_I2(r5, 3));
                for (File delete : arrayList.subList(0, arrayList.size() - i)) {
                    boolean delete2 = delete.delete();
                    AnonymousClass0VE r1 = r5.A02;
                    if (delete2) {
                        r1.A06++;
                    } else {
                        r1.A04++;
                    }
                }
            }
        }
    }

    public static boolean A03(AnonymousClass0VF r2, File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        r2.A02.A03++;
        if (file.exists() && !file.delete()) {
            r2.A02.A02++;
        }
        return false;
    }

    public static List A00(AnonymousClass0VF r2, File file) {
        File[] listFiles = file.listFiles(new IDxFFilterShape519S0100000_I2(r2, 8));
        if (listFiles == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(listFiles);
    }

    public AnonymousClass0VF(Context context) {
        File file = new File(context.getFilesDir(), "profilo");
        this.A06 = file;
        if (file.exists() || file.mkdirs()) {
            this.A05 = new File(this.A06, "upload");
            this.A03 = new File(this.A06, "crash_dumps");
            this.A04 = new File(this.A06, "mmap_buffer");
            return;
        }
        throw new IllegalStateException("Unable to initialize Profilo folder");
    }

    public final void A04(File file, boolean z) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            name = name.substring(0, lastIndexOf);
        }
        String A0L = AnonymousClass00U.A0L(name, ".log");
        if (z) {
            A0L = AnonymousClass00U.A0L("override-", A0L);
        }
        File file2 = this.A05;
        if (file2.isDirectory() || file2.mkdirs()) {
            boolean renameTo = file.renameTo(new File(file2, A0L));
            AnonymousClass0VE r1 = this.A02;
            if (renameTo) {
                r1.A00++;
            } else {
                r1.A03++;
            }
            File file3 = this.A06;
            long j = this.A01;
            FilenameFilter filenameFilter = A07;
            FilenameFilter filenameFilter2 = A08;
            A01(this, file2, file3, new FilenameFilter[]{filenameFilter, filenameFilter2}, j);
            A02(this, file3, new FilenameFilter[]{filenameFilter, filenameFilter2}, this.A00);
            return;
        }
        this.A02.A01++;
    }
}
