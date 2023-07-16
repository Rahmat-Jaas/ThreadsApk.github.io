package X;

import java.io.File;
import java.util.ArrayList;

/* renamed from: X.0CH  reason: invalid class name */
public final class AnonymousClass0CH {
    public static C002000x A00(ArrayList arrayList, ArrayList arrayList2) {
        File file;
        int size = arrayList.size();
        if (size == arrayList2.size()) {
            C002000x r4 = new C002000x(size);
            for (int i = 0; i < size; i++) {
                String str = (String) arrayList2.get(i);
                Object obj = arrayList.get(i);
                if (str != null) {
                    file = new File(str);
                } else {
                    file = null;
                }
                r4.put(obj, file);
            }
            return r4;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A01(size, arrayList2.size(), "processes has ", "; newestFilesUploaded has "));
    }
}
