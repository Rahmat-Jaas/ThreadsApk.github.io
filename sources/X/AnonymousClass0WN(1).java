package X;

import java.util.ArrayList;

/* renamed from: X.0WN  reason: invalid class name */
public final class AnonymousClass0WN {
    public ArrayList A00 = new ArrayList();
    public ArrayList A01 = new ArrayList();

    public final void A00(AnonymousClass0WM r8) {
        ArrayList arrayList = this.A01;
        int size = arrayList.size() - 1;
        if (size >= 0 && arrayList.get(size) != null) {
            arrayList.remove(size);
        }
        int size2 = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) arrayList.get(i2);
            if (str != null) {
                r8.DAm(str);
            } else {
                ArrayList arrayList2 = this.A00;
                int i3 = i + 1;
                String str2 = (String) arrayList2.get(i);
                i = i3 + 1;
                Object obj = arrayList2.get(i3);
                if (obj instanceof String) {
                    r8.DAg(str2, (String) obj);
                } else if (obj instanceof Integer) {
                    r8.DAe(str2, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    r8.DAf(str2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    r8.DAd(str2, ((Number) obj).doubleValue());
                } else if (obj instanceof Boolean) {
                    r8.DAh(str2, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String[]) {
                    r8.DAk(str2, (String[]) obj);
                } else if (obj instanceof int[]) {
                    r8.DAi(str2, (int[]) obj);
                } else if (obj instanceof long[]) {
                    r8.DAj(str2, (long[]) obj);
                }
            }
        }
    }

    public final void A01(String str) {
        ArrayList arrayList = this.A01;
        int size = arrayList.size() - 1;
        if (size >= 0 && arrayList.get(size) != null) {
            arrayList.remove(size);
        }
        arrayList.add(str);
    }

    public final void A03(String str, Object obj) {
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = this.A00;
            arrayList2.add(str);
            arrayList2.add(obj);
            arrayList.add((Object) null);
            return;
        }
        throw new IllegalStateException("Adding entries can be only done after category is started. Call startCategory first");
    }

    public final void A02(String str, long j) {
        A03(str, Long.valueOf(j));
    }
}
