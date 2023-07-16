package X;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7i7  reason: invalid class name and case insensitive filesystem */
public final class C127957i7 implements C145298kG {
    public final C112986qW A00;

    private C91295fy A00(File file, String str, Map map, int i) {
        boolean z;
        long j;
        long j2;
        int length;
        C91295fy r2;
        List list;
        String name;
        C112986qW r7 = this.A00;
        if (r7.A02 == null) {
            File parentFile = r7.A04.getDatabasePath("ignore").getParentFile();
            if (parentFile == null) {
                name = "/databases";
            } else {
                name = parentFile.getName();
            }
            r7.A02 = name;
        }
        File file2 = file;
        int i2 = i;
        if (!file2.getPath().contains(r7.A02)) {
            String A0L = AnonymousClass00U.A0L(file2.getPath(), "/");
            if (i2 != 1) {
                list = Collections.emptyList();
            } else {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                list = A0v;
                if (r7.A06) {
                    A0v.add(r7.A01);
                    list = A0v;
                }
            }
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (A0L.contains(C18180wK.A0k(it))) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            z = true;
        } else {
            z = true;
        }
        int i3 = i + 1;
        File[] A04 = C121707Ho.A04(file2);
        long j3 = 0;
        String str2 = str;
        Map map2 = map;
        if (A04 == null || (length = A04.length) <= 0) {
            j = 0;
            j2 = 0;
        } else {
            j = 0;
            j2 = 0;
            int i4 = 0;
            do {
                File file3 = A04[i4];
                if (!C121707Ho.A03(file3)) {
                    if (!file3.isDirectory()) {
                        r2 = new C91295fy(C121707Ho.A01(file3));
                        if (z) {
                            A01(r2, AnonymousClass00U.A0L(str2, r7.A00(file3)), map2);
                        }
                    } else if (((long) i3) > r7.A00) {
                        String A0L2 = AnonymousClass00U.A0L(file3.getPath(), "/");
                        Iterator it2 = Collections.emptyList().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (A0L2.contains(C18180wK.A0k(it2))) {
                                    break;
                                }
                            } else {
                                r2 = new C91295fy(C121707Ho.A01(file3));
                                break;
                            }
                        }
                        r2 = A00(file3, AnonymousClass00U.A0V(str2, r7.A00(file3), "/"), map2, i3);
                    } else {
                        r2 = A00(file3, AnonymousClass00U.A0V(str2, r7.A00(file3), "/"), map2, i3);
                    }
                    j3 += r2.A00;
                    j += r2.A02;
                    j2 += r2.A01;
                }
                i4++;
            } while (i4 < length);
        }
        C112416pY A02 = C121707Ho.A02(file2, file2.isDirectory());
        C91295fy r0 = new C91295fy(new C112416pY(j3 + A02.A00, A02.A02 + j, 1 + j2));
        A01(r0, str2, map2);
        return r0;
    }

    public final String BaB() {
        return "filetree";
    }

    public C127957i7(C112986qW r1) {
        this.A00 = r1;
    }

    public static void A01(C91295fy r1, String str, Map map) {
        if (!map.containsKey(str)) {
            map.put(str, r1);
            return;
        }
        C112416pY r0 = (C112416pY) map.get(str);
        if (r0 != null) {
            map.put(str, new C91295fy(r1.A00(r0)));
        }
    }

    public final Map CXv() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        C112986qW r1 = this.A00;
        Map map = r1.A03;
        if (map.size() == 0) {
            Context context = r1.A04;
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                map.put("/", cacheDir.getParentFile());
            }
            try {
                map.put("<external_cache>/", context.getExternalCacheDir());
                map.put("<external_files>/", context.getExternalFilesDir((String) null));
            } catch (Exception e) {
                AnonymousClass0JV.A05("DefaultFileTreeProviderConfig", "Failed to report external dirs", e);
            }
            try {
                File[] externalMediaDirs = context.getExternalMediaDirs();
                for (int i = 0; i < externalMediaDirs.length; i++) {
                    map.put(AnonymousClass00U.A0S("<external_media_", ">/", i), externalMediaDirs[i]);
                }
            } catch (Exception unused) {
            }
        }
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            if (A0o.getValue() != null) {
                A00((File) A0o.getValue(), C18200wM.A0p(A0o), A0y, 0);
            }
        }
        return A0y;
    }
}
