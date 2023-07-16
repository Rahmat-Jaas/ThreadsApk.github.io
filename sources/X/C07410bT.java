package X;

import android.app.Application;
import com.facebook.redex.IDxFFilterShape519S0100000_I2;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.0bT  reason: invalid class name and case insensitive filesystem */
public abstract class C07410bT {
    public final Application A00;
    public final C07390bR A01;
    public final C04840Pi A02;

    public abstract C04170Mn A00(AnonymousClass0ND r1);

    public abstract AnonymousClass0PD A01();

    public abstract Integer A02();

    public void A03(AnonymousClass0ND r22, File file, File file2) {
        AnonymousClass0ND r11;
        File[] listFiles;
        File[] listFiles2;
        File[] listFiles3;
        File[] listFiles4;
        File file3 = file;
        File file4 = file3;
        if (A02() == AnonymousClass006.A00) {
            file4 = file2;
        }
        if (file4 != null) {
            C04840Pi r9 = this.A02;
            AnonymousClass0PD A012 = A01();
            Object obj = C04840Pi.A05;
            synchronized (obj) {
                r11 = r22;
                listFiles = file3.listFiles(new C04800Pe(r11, A012));
                if (listFiles == null) {
                    listFiles = C04840Pi.A06;
                }
            }
            if (r6 != 0) {
                for (File file5 : listFiles) {
                    if (!C04840Pi.A02(file3, file5.getName())) {
                        file5.getName();
                        String name = file5.getName();
                        if (C04840Pi.A04 == null) {
                            C04840Pi.A04 = AnonymousClass0M0.A00();
                        }
                        File file6 = new File(r9.A01, AnonymousClass00U.A0L(name.replace("_prop.txt", "_"), C04840Pi.A04));
                        file6.mkdirs();
                        synchronized (obj) {
                            listFiles2 = file4.listFiles(new IDxFFilterShape519S0100000_I2(r11, 4));
                            if (listFiles2 == null) {
                                listFiles2 = C04840Pi.A06;
                            }
                        }
                        C04170Mn A002 = A00(r11);
                        A002.A01(AnonymousClass0MU.A2b, AnonymousClass0FX.A00());
                        A002.A01(AnonymousClass0MU.A2c, AnonymousClass0FX.A01());
                        A002.A00(AnonymousClass0MU.A08, true);
                        Application application = this.A00;
                        String installerPackageName = application.getPackageManager().getInstallerPackageName(application.getPackageName());
                        if (installerPackageName != null) {
                            A002.A03(AnonymousClass0MU.A8C, installerPackageName);
                        }
                        ArrayList arrayList = new ArrayList(Arrays.asList(listFiles2));
                        if (!arrayList.contains(file5)) {
                            arrayList.add(file5);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        synchronized (obj) {
                            listFiles3 = file4.listFiles(new C04810Pf(r11, true));
                            if (listFiles3 == null) {
                                listFiles3 = C04840Pi.A06;
                            }
                        }
                        for (File file7 : listFiles3) {
                            if (!C04840Pi.A02(file3, file7.getName())) {
                                arrayList2.add(file7);
                            }
                        }
                        synchronized (obj) {
                            listFiles4 = file3.listFiles(new C04810Pf(r11, false));
                            if (listFiles4 == null) {
                                listFiles4 = C04840Pi.A06;
                            }
                        }
                        for (File file8 : listFiles4) {
                            if (!C04840Pi.A02(file3, file8.getName())) {
                                arrayList2.add(file8);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            r9.A03((C04170Mn) null, file6, AnonymousClass00U.A0L(r11.A00, AnonymousClass00U.A0L(A012.A00, "_attach.txt")), arrayList2);
                        }
                        arrayList.addAll(arrayList2);
                        r9.A03(A002, file6, AnonymousClass00U.A0L(r11.A00, AnonymousClass00U.A0L(A012.A00, "_report.txt")), arrayList);
                        C04840Pi.A01(file3, file5.getName());
                        C04840Pi.A01(file3, file5.getName().replace("_prop.txt", "_attach.txt"));
                    }
                }
            }
        }
    }

    public C07410bT(Application application, C07390bR r2, C04840Pi r3) {
        this.A00 = application;
        this.A01 = r2;
        this.A02 = r3;
    }
}
