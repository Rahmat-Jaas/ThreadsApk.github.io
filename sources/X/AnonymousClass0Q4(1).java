package X;

import android.os.SystemClock;
import com.facebook.redex.IDxComparatorShape93S0000000_I2;
import com.facebook.redex.IDxFFilterShape2S1000000_I2;
import com.facebook.redex.IDxFFilterShape519S0100000_I2;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0Q4  reason: invalid class name */
public final class AnonymousClass0Q4 {
    public static Object A08 = new Object();
    public static AnonymousClass0Q4 A09;
    public static final List A0A = new ArrayList();
    public long A00;
    public long A01;
    public C04320Nd A02;
    public final C06040Xk A03;
    public final File A04;
    public final File A05;
    public final String A06;
    public final String A07;

    public final File A01() {
        File file = this.A04;
        C002801h.A02(file, "Did you call SessionManager.init()?");
        return file;
    }

    public final Set A03() {
        HashSet hashSet = new HashSet();
        File[] listFiles = this.A05.listFiles(new IDxFFilterShape519S0100000_I2(this, 7));
        if (listFiles != null) {
            for (File name : listFiles) {
                String replaceFirst = name.getName().replaceFirst("session_", "").replaceFirst("sess_", "");
                int lastIndexOf = replaceFirst.lastIndexOf("_");
                if (lastIndexOf != -1) {
                    hashSet.add(replaceFirst.substring(0, lastIndexOf));
                }
            }
        }
        return hashSet;
    }

    public final File[] A04(String str) {
        File[] listFiles = this.A05.listFiles(new IDxFFilterShape2S1000000_I2(str, 1));
        if (listFiles == null) {
            return new File[0];
        }
        Arrays.sort(listFiles, new IDxComparatorShape93S0000000_I2(6));
        return listFiles;
    }

    public AnonymousClass0Q4(C04320Nd r8, C04420Nn r9, File file, String str, String str2) {
        this.A06 = str2;
        this.A05 = file;
        this.A07 = str;
        String A0V = AnonymousClass00U.A0V("sess_", str2, "_");
        File[] listFiles = file.listFiles(new IDxFFilterShape2S1000000_I2(str2, 1));
        if (listFiles == null) {
            listFiles = new File[0];
        } else {
            Arrays.sort(listFiles, new IDxComparatorShape93S0000000_I2(6));
        }
        int length = listFiles.length;
        String valueOf = String.valueOf(length >= 1 ? 1 + A00(listFiles[length - 1], str2) : 1);
        StringBuffer stringBuffer = new StringBuffer(AnonymousClass00U.A0L("000000000", valueOf).substring(valueOf.length()));
        stringBuffer.append("-");
        stringBuffer.append(str);
        File file2 = new File(file, AnonymousClass00U.A0L(A0V, stringBuffer.toString()));
        this.A04 = file2;
        file2.mkdirs();
        this.A02 = r8;
        File file3 = new File(file2, "state.txt");
        C06160Xx AEw = r9.AEw(file3, 4096);
        this.A03 = new C06040Xk(AEw == null ? new C06160Xx(file3, 4096) : AEw);
        long uptimeMillis = SystemClock.uptimeMillis();
        this.A01 = uptimeMillis;
        this.A00 = uptimeMillis;
        AnonymousClass0Z2 r2 = AnonymousClass0MI.A04;
        if (r2 != null) {
            r2.A04 = str;
            r2.A00 = this.A01;
            r2.A09 = file2;
        }
        List list = A0A;
        synchronized (list) {
            A09 = this;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onSetInstance");
            }
            list.clear();
        }
    }

    public static long A00(File file, String str) {
        String replace = file.getName().replace(AnonymousClass00U.A0V("sess_", str, "_"), "");
        int indexOf = replace.indexOf(45);
        if (indexOf != -1) {
            replace = replace.substring(0, indexOf);
        }
        try {
            return Long.parseLong(replace);
        } catch (NumberFormatException unused) {
            C04790Pd.A00();
            return 0;
        }
    }

    public final File A02(String str) {
        File[] A042 = A04(str);
        int length = A042.length;
        if (length < 2) {
            return null;
        }
        return A042[length - 2];
    }
}
