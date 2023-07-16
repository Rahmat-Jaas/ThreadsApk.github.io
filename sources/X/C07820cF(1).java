package X;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.0cF  reason: invalid class name and case insensitive filesystem */
public class C07820cF extends C14910qO {
    public C05740Vo[] A00;
    public final ZipFile A01;
    public final AnonymousClass0EA A02;
    public final /* synthetic */ C007803j A03;

    public boolean A02(String str, ZipEntry zipEntry) {
        return true;
    }

    public C07820cF(C007803j r3, AnonymousClass0EA r4) {
        this.A03 = r3;
        this.A01 = new ZipFile(r3.A00);
        this.A02 = r4;
    }

    public final C14920qP A01() {
        return new C07030am(this);
    }

    public final C05740Vo[] A03() {
        C05740Vo[] r4 = this.A00;
        if (r4 == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap hashMap = new HashMap();
            Pattern compile = Pattern.compile(this.A03.A01);
            String[] A002 = C15000qX.A00();
            Enumeration<? extends ZipEntry> entries = this.A01.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                Matcher matcher = compile.matcher(zipEntry.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    int i = 0;
                    while (true) {
                        if (i >= A002.length) {
                            break;
                        } else if (A002[i] == null || !group.equals(A002[i])) {
                            i++;
                        } else if (i >= 0) {
                            linkedHashSet.add(group);
                            C05740Vo r0 = (C05740Vo) hashMap.get(group2);
                            if (r0 == null || i < r0.A00) {
                                hashMap.put(group2, new C05740Vo(group2, zipEntry, i));
                            }
                        }
                    }
                }
            }
            this.A02.A01 = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
            C05740Vo[] r6 = (C05740Vo[]) hashMap.values().toArray(new C05740Vo[hashMap.size()]);
            Arrays.sort(r6);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= r3) {
                    break;
                }
                C05740Vo r02 = r6[i2];
                if (A02(r02.A01, r02.A01)) {
                    i3++;
                } else {
                    r6[i2] = null;
                }
                i2++;
            }
            r4 = new C05740Vo[i3];
            int i4 = 0;
            for (C05740Vo r1 : r6) {
                if (r1 != null) {
                    r4[i4] = r1;
                    i4++;
                }
            }
            this.A00 = r4;
        }
        return r4;
    }

    public final void close() {
        this.A01.close();
    }

    public final C14950qS A00() {
        return new C14950qS(A03());
    }
}
